package org.apex.exercise;

import java.util.HashSet;

public class Song {
    private String name;
    private Song nextSong;

    public Song(String name) {
        this.name = name;
    }

    public void setNextSong(Song nextSong) {
        this.nextSong = nextSong;
    }

    public boolean isRepeatingPlaylist() {
    //    throw new UnsupportedOperationException("Waiting to be implemented.");
        Song s=this;
        HashSet<Song> hset=new HashSet<Song>();
        
        while (s!= null)
        	
        {
        	System.out.println(s +" " +s.name);
            if (hset.contains(s))
            	return true;
            hset.add(s);
            s= s.nextSong;
        }
		return true;
    }
    

    public static void main(String[] args) {
        Song first = new Song("Hello");
        Song second = new Song("Eye of the tiger");

        first.setNextSong(second);
        second.setNextSong(first);

        System.out.println(first.isRepeatingPlaylist());
    }
}