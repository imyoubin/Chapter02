package com.javaex.ex07;

public class Song {

	//필드
	
	private String artist;
	private String title;
	private String album;
	private String year;
	private String track;
	private String composer;
	
	//생성자
			
	//메소드
	//artist 출력
	public void setArtist(String artist) {
		this.artist = artist;
	}
	//artist 읽기
	public String getArtist() {
		return artist;
	}
	//title 출력
	public void setTitle(String title) {
		this.title =title;
	}
	//title 읽기
	public String getTitle() {
		return  title;
	}
	//album 출력
	public void setAlbum(String album) {
		this.album = album;
	}
	//album 읽기
	public String getAlbum() {
		return album;
	}
	//year 출력	
	public void setYear(String year) {
		this.year = year;
	}
	//year 읽기
	public String getYear() {
		return year;
	}
	//track 출력
	public void setTrack(String track) {
		this.track = track;
	}
	//track 읽기
	public String getTrack() {
		return track;
	}
	
	//composer 출력
	public void setComposer(String composer) {
		this.composer = composer;
	}
		//composer 읽기
	public String getComposer() {
		return composer;
	}
	//정보 출력
	public void showInfo() {
		
		System.out.println(artist + "," + title + "," + "(" + album + "," + year + "," + track + "," + composer + ")");
		
		
	}


}
