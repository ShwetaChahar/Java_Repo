import java.io.*;
import java.net.*;
import java.util.*;

class Message implements Serializable {
    String sender;
    String receiver;
    String msg;
};

class User {
    String uid;
    Socket sock;
    ObjectOutputStream outS;
    List<Message> msgs = new ArrayList<Message>();

    public User(String id) {
        uid = id; sock = null; outS = null;
    }

    public void setSocket(Socket s) {
        try {
            if (s == null) {
                sock = null; outS = null;
            } else {
                sock = s;
                outS = new ObjectOutputStream(s.getOutputStream());
            }
        } catch (Exception ex) {
            System.out.print("Exception in setSocket");
        }
    }

    public void addMsg(Message m) {
        msgs.add(m);
    }

    public void sendMsg() {
        if (sock != null) {
            try {
                Iterator<Message> it = msgs.iterator();
                while (it.hasNext()) {
                    Message m = it.next();
                    outS.writeObject(m);
                    outS.flush();
                    it.remove();
                }
            } catch (Exception ex) {
                System.out.print("Exception in sendMsg User");
            }
        }
    } // end of sendMsg()
} // end of class User

public class ChatServer {
    HashMap<String, User> userMap = new HashMap<String, User>();

    public class ClientHandler implements Runnable {
        ObjectInputStream reader = null;
        Socket sock;
        User client;

        public ClientHandler(Socket clientSocket) {
            try {
                sock = clientSocket;
                System.out.println("Try to get input stream");
                reader = new ObjectInputStream(sock.getInputStream());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } // close constructor

        public void run() {
            try {
                if (registerUser())
                    keepOnReceiving();
            } catch(Exception ex) {
                System.out.print("Exception in run ClientHandler");
            }
        } // close run

        void keepOnReceiving() {
            try {
                Object o = null;
                while ((o = reader.readObject()) != null) {
                    Message m = (Message) o;
                    System.out.println("READ: " + m.receiver);
                    User recvUser = null;
                    // check is recv exists
                    if (!userMap.containsKey(m.receiver)) {
                        recvUser = new User(m.receiver);
                        userMap.put(recvUser.uid, recvUser);
                    }
                    recvUser = userMap.get(m.receiver);
                    recvUser.addMsg(m);
                    recvUser.sendMsg();
                } // close while
                // connection close
            } catch(Exception ex) {
                System.out.print("Exception in keepOnReceiving");
            }
            client.setSocket(null);
        } // end of keepOnReceiving()

        boolean registerUser() {
            try {
                Object o = null;
                if ((o = reader.readObject()) != null) {
                    Message m = (Message) o;
                    System.out.println("REGI: " + m.sender);
                    if (userMap.containsKey(m.sender)) {
                        // set the connection first
                        client = userMap.get(m.sender);
                        client.setSocket(sock);
                        client.sendMsg();
                    } else { // first time user
                        client = new User(m.sender);
                        client.setSocket(sock);
                        userMap.put(client.uid, client);
                    }
                } // close while
            } catch(Exception ex) {
                System.out.print("Exception in registerUser");
                return false;
            }
            return true;
        } //end of registerUser

    } // close inner class ClientHandler
    public static void main(String[] args) {
        new ChatServer().go();
    }

    public void go() {
        try {
            ServerSocket serverSock = new ServerSocket(15222);
            while(true) {
                Socket clientSocket = serverSock.accept();
                Thread t = new Thread(new ClientHandler(clientSocket));
                System.out.println("Got a new connection");
                t.start();
            }
        } catch(Exception ex) {
            System.out.print("Exception in go");
        }
    } // close go
} // close class