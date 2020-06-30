package com.music.demo.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "music")
public class Music {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	@Column(name = "musicName")
	private String musicName;
	
	@Column(name = "artist")
	private String artist;
	
	@Column(name = "rating")
	private int rating;
	
	public Music() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMusicName() {
		return musicName;
	}
	public void setMusicName(String musicName) {
		this.musicName = musicName;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public int getRating() {
		return rating;
	}
	
	
	@Override
	public String toString() {
		return "Music [id=" + id + ", musicName=" + musicName + ", artist=" + artist + ", rating=" + rating + "]";
	}
	
	
	
}
