package com.javaex.ex13;

public class TvApp {

	public static void main(String[] args) {
		
		Tv tv = new Tv();
		tv.setChannel(7);
		tv.setVolume(20);
		tv.setPower(false);
		tv.status();
		
		tv.setPower(true);
		tv.setVolume(120); //100으 로유지
		tv.setChannel(0);
		
		tv.setVolume(0);
		tv.status();
		
		tv.setChannel(0);
		tv.status();
		
		tv.setChannel(0);
		tv.setChannel(0);
		tv.setChannel(0);
		tv.status();
		
		tv.setPower(false);
		tv.status();
		
		
		

	}

}
