package com.javaex.ex06;

public class Point {

	//필드
	private int x;
	private int y;
	
	
	//생성자
			
	//메소드
	//X값 출력 this(필수).x = x;
	public void setX(int x) {
		this.x = x;
	}
	//X값 읽기 this(굳이 안써도됨).x;
	public int getX() {
		return x;
	}
	//y값 출력 this(필수).y = y;
	public void setY(int y) {
		this.y = y;
	}
	//y값 읽기 this(굳이 안써도됨).y;
	public int getY() {
		return  y;
	}
	public void drow() {
	System.out.println("점[x=" +x+",y=" +y + "]을 그렸습니다.");
	}
		
}
