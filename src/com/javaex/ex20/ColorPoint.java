package com.javaex.ex20;

public class ColorPoint extends Point{

	//필드
	private String color;

	//생성자
	public ColorPoint() {
		System.out.println("ColorPoint()");
	}
	public ColorPoint(String color) {
		
		this.color = color;
		System.out.println("ColorPoint(1)");
	}
	
	 public ColorPoint(int x, int y, String color) {
	        super(x, y);               
	        this.color = color;        
	        System.out.println("ColorPoint(3)");
		
	}
	 //////////////////////////////////////
	//메소드gs
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	//메소드 일반
	@Override
	public String toString() {
		return "ColorPoint [color=" + color + "]";
	}
	
	public void showInfo() {
		System.out.println(super.getX());
		System.out.println();
		System.out.println();
		
	}

	
	
	
	
	
}
