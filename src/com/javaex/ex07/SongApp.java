package com.javaex.ex07;

public class SongApp {

	public static void main(String[] args) {		
		
		//아이유
		Song S01 = new Song();
		S01.setArtist("아이유");
		S01.setTitle("좋은날");
		S01.setAlbum("Real");
		S01.setYear("2010");
		S01.setTrack("3번 track");
		S01.setComposer("이민수 작곡");	
		
		//BIGBANG
		Song S02 = new Song();
		S02.setArtist("BIGBANG");
		S02.setTitle("거짓말");
		S02.setAlbum("Always");
		S02.setYear("2007");
		S02.setTrack("2번 track");
		S02.setComposer("G-DRAGON 작곡");
		
		//버스커버스커
		Song S03 = new Song();
		S03.setArtist("버스커버스커");
		S03.setTitle("벚꽃엔딩");
		S03.setAlbum("버스커버스커1집");
		S03.setYear("2012");
		S03.setTrack("4번 track");
		S03.setComposer("장범준 작곡");
		
		S01.showInfo();
		S02.showInfo();
		S03.showInfo();
		
		

	}

}
