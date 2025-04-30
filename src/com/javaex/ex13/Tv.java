package com.javaex.ex13;

public class Tv {
	
	//필드
	 private int channel;
	 private int volume;
	 private boolean power;
	 
	 //생성자
	 public Tv() {
		 
	 }
	 public Tv(int channel,int volume,boolean power) {
		 this.channel=channel;
		 this.volume=volume;
		 this.power=power;
		 
	 }
	 //메소드gs
	 public int getChannel() {
		 return channel;
		 
	 }
	 public int getvolume() {
		 return volume;
		 
	 }
	 public boolean getPower() {
		 return power;
		 
	 }
	 
	 public void setPower(boolean power) {
		 this.power = power;
	
	 }
	 
	 public void setChannel(int channel) {
		this.channel =  channel;
	 }
	 
	 
	 
	 public void setVolume(int volume) {
		 this.volume = volume;
	 }
	 
	 
	 
	 
	 //메소드일반
	 public void status() {
		 System.out.println(power);
		 System.out.println("=====================");
		 System.out.println(channel);
		 System.out.println("=====================");
		 System.out.println(volume);
	 }
	 


}
