package com.javaex.ex20;

public class Point {
	//필드
	/*
	private int x;
	private int y;
	*/
	protected int x;
	protected int y;
	//생성자
	public Point() {
		System.out.println("Point(1)");
		
	}
	
	public Point(int x, int y) {
		
		this.x = x;
		this.y = y;
		System.out.println("Point(2)");
	}

	//메소드gs
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	//메소드 일반
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	

}
