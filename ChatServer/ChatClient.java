import java.io.*;
import java.net.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Message implements Serializable {
    String sender;
    String receiver;
    String msg;
};

public class ChatClient {

    // socket related
    Socket sock;
    String user;
    ObjectInputStream inS = null;
    ObjectOutputStream outS = null;

    // GUI related
    JFrame frame;
    JPanel panel;
    JTextArea incoming;
    JTextField outgoing;
    JTextField userT;
    JTextField receiver;

    public static void main(String[] args) {
        ChatClient client = new ChatClient();
        client.go();
    }

    public void go() {
        frame = new JFrame("Chat Client");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setUpNetworking();
        // Show regi Page, that will call sendRegister
        guiRegiPage();
    }

    void guiRegiPage() {
        //GUI
        panel = new JPanel();
        userT = new JTextField(20);
        userT.setToolTipText("user");
        JButton regiButton = new JButton("Register");
        regiButton.addActionListener(new RegiButtonListener());
        panel.add(userT);
        panel.add(regiButton);
        frame.getContentPane().add(BorderLayout.NORTH, panel);
        frame.setSize(450,525);
        frame.setVisible(true);
    }

    void showClient() {
        //GUI
        receiver = new JTextField(15);
        receiver.setToolTipText("receiver");

        incoming = new JTextArea(25,30);
        incoming.setLineWrap(true);
        incoming.setWrapStyleWord(true);
        incoming.setEditable(false);
        JScrollPane qScroller = new JScrollPane(incoming);
        qScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        qScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        outgoing = new JTextField(25);
        outgoing.setToolTipText("write here");

        JButton sendButton = new JButton("send");
        sendButton.addActionListener(new SendButtonListener());

        frame.getContentPane().removeAll();
        panel.removeAll();
        panel.add(receiver);
        panel.add(qScroller);
        panel.add(outgoing);
        panel.add(sendButton);

        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.setSize(450,525);
        frame.setVisible(true);
    }

    void sendRegister(String u) {
        Message m = new Message();
        m.sender = this.user = u; m.receiver = ""; m.msg = "";
        try {
            outS.writeObject(m);
            outS.flush();
        } catch (IOException ex) {
            System.out.print("Exception in sendRegister");
        }
        // show client text page now
        showClient();
        // Now start reading input
        Thread t = new Thread(new IncomingReader());
        t.start();
    }// sendRegister()

    void sendMsg(String recv, String msg) {
        Message m = new Message();
        m.sender = this.user; m.receiver = recv; m.msg = msg;
        try {
            outS.writeObject(m);
            outS.flush();
            // add msg in our window
            incoming.append(m.sender + ":" + m.msg + "\n");
        } catch (IOException ex) {
            System.out.print("Exception in sendMsg");
        }
    }// sendMsg()

    private void setUpNetworking() {
        try {
            sock = new Socket("127.0.0.1", 15222);
            System.out.println("Try to get streams");
            outS = new ObjectOutputStream(sock.getOutputStream());
            System.out.println("networking established");
        } catch(IOException ex) {
            System.out.print("Exception in setUpNetworking");
        }
    } // close setUpNetworking

    public class SendButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent ev) {
            try {
                sendMsg(receiver.getText(), outgoing.getText());
                outgoing.setText("");
                outgoing.requestFocus();
            } catch(Exception ex) {
                System.out.print("Exception in SendButtonListener");
            }
        }
    }
    // close SendButtonListener         

    public class RegiButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent ev) {
            try {
                sendRegister(userT.getText());
            } catch(Exception ex) {
                System.out.print("Exception in regiButtonListener");
            }
        }
    }
    // close regiButtonListener
    
    public class IncomingReader implements Runnable {
        public void run() {
            Object o;
            try {
                inS = new ObjectInputStream(sock.getInputStream());
                while ((o = inS.readObject()) != null) {
                    Message m = (Message) o;
                    System.out.println("READ: " + m.msg + " from " + m.sender);
                    incoming.append(m.sender + ":" + m.msg + "\n");
                }       // close while
            } catch(Exception ex) {
                System.out.print("Exception in run IncomingReader");
            }
        }
        // close run
    }
    // close Inner class IncomingReader
}