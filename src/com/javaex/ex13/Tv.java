package com.javaex.ex13;

public class Tv {

	//필드
	private int channel;
	private int volume;
	private boolean power;
	
	//생성자
	public Tv() {}
	
	public Tv(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	
	//메소드gs
	//파워
	public void setPower(boolean on) {
		if(on == true) {
			power = true;
		}else {
			power = false;
		}
	}
	
	
	//볼륨
	public void setVolume(int volume) {
		if(power == true) { //파워가 true이면 작동
			if(volume < 0) {
				this.volume = 0;		
			
			}else if(volume > 100) {
				this.volume = 100;
			
			}else {
				this.volume = volume;
			}
			
		}else { //파워가 off이면 작동X
			System.out.println("전원이 꺼져있습니다.");
		}

	}
	

	public void setVolume(boolean up) {
		if(power == true) { //파워가 true이면 작동
			//볼륨 올리기/내리기
			if(up == true ) {
				volume = volume + 1; //up이 true이면 채널 +1	
			}else {
				volume = volume - 1; //up이 false이면 채널 -1
			}
			
			//볼륨 최대/최소값 보정
			if(volume < 0) { //현재볼륨이 0보다 작으면 0로
				this.volume = 0;		
			
			}else if(volume > 100) { //현재채널이 100보다 크면 100로
				this.volume = 100;
				
			}
			
		}else { //파워가 off이면 작동X
			System.out.println("전원이 꺼져있습니다.");
		}

	}
	
	
	//채널
	public void setChannel(int channel) {
		if(power == true) { //파워가 true이면 작동
			if(channel < 1) {
				this.channel = 1;		
			
			}else if(channel > 255) {
				this.channel = 255;
			
			}else {
				this.channel = channel;
			}
			
		}else { //파워가 off이면 작동X
			System.out.println("전원이 꺼져있습니다.");
		}

	}

	public void setChannel(boolean up) {
		if(power == true) { //파워가 true이면 작동
			
			//채널 올리기/내리기
			if(up == true ) {
				channel = channel + 1; //up이 true이면 채널 +1	
			}else {
				channel = channel - 1; //up이 false이면 채널 -1
			}
			
			//채널 최대/최소값 보정
			if(channel < 1) { //현재채널이 1보다 작으면 1로
				this.channel = 1;		
			
			}else if(channel > 255) { //현재채널이 255보다 크면 255로
				this.channel = 255;
				
			}
			
		}else { //파워가 off이면 작동X
			System.out.println("전원이 꺼져있습니다.");
		}

	}
	

	//메소드일반
	//status()
	public void status() {
		System.out.println("파워:" + power + " 채널:" + channel + " 볼륨:" + volume );
	}


}