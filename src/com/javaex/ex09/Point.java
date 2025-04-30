package com.javaex.ex09;

public class Point {
	
	//필드
	private int x;
	private int y;
			
	//생성자
	public Point() {
		
	}
	
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
		
	}	
	//메소드
	public void setX(int x) {
		this.x = x;
	}
	public int getX() {
		return x;
		
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getY(int y) {
		return y;
	}
	//name 등록
			
	//정보출력
		public void drow() {
			System.out.println("점[x=" +x+",y=" +y + "]을 그렸습니다.");
			
			
	}


}
