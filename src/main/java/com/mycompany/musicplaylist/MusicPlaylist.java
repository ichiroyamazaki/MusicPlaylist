package com.mycompany.MusicPlaylist;

import java.util.LinkedList;

public class MusicPlaylist	{
public static void main(String[] args){

	LinkedList<String> songs = new LinkedList<>();
	LinkedList<String> artists = new LinkedList<>();
	LinkedList<String> playlist = new LinkedList<>();

		songs.add("");
		songs.add("");
		songs.add("");
		songs.add("");
		songs.add("");

		artists.add("");
		artists.add("");
                artists.add("");
                artists.add("");
                artists.add("");

		for(int i=0;i<songs.size();i++)
			playlist.add(songs.get(i) + " - " + artists.get(i));

		System.out.println(songs);
		System.out.println(artists);
		for(String s: playlist)
		System.out.println(s);
	}
}