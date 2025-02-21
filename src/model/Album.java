package model;

import java.util.ArrayList;

public class Album {
	private String album;
	private String artist;
	private ArrayList<Song> songList;

	
	// Regular Constructor
	public Album(String album, String artist, ArrayList<Song> songList) {
		this.album = album;
		this.artist = artist;
		this.songList = songList;
	}
	
	// COPY CONSRUCTOR
	public Album(Album other, ArrayList<Song> copySongList) {
		this.album = other.album;
		this.artist = other.artist;
		this.songList = copySongList;
	}

	public String getArtist() {
		return artist;
	}
	
	public String getAlbumName() {
		return album;
	}
	
	public void addSong(Song song) {
		songList.add(song);
	}

	// returns a copy of songList
	public ArrayList<Song> getSongList() {
		ArrayList<Song> copy = new ArrayList<>();
		for (Song song: songList) {
			copy.add(new Song(song));
		}
		return copy;
	}

	
}