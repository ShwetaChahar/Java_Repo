package org.apex.exercise;

import java.util.ArrayList;

public class Snapshot {
    private ArrayList<Integer> data;

    public Snapshot(ArrayList<Integer> data) {
    	this.data=new ArrayList<Integer>();
    	for(Integer i: data) {
        this.data.add(i);
    	}
    	
    }

    public ArrayList<Integer> restore() {
    	ArrayList<Integer> d = new ArrayList<Integer>();
    	for(Integer i : this.data)
    		d.add(i);
        return d;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        Snapshot snap = new Snapshot(list);
        list.set(0, 3);
        list = snap.restore();
        System.out.println(list); //It should log "[1,2]"
        list.add(4);
        list = snap.restore();
        System.out.println(list); //It should log "[1,2]"
    }
}