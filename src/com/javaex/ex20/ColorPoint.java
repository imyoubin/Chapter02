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
		 /*
		  * 초기화1
	        super(x, y);               
	        this.color = color;        
	        System.out.println("ColorPoint(3)");
		*/
		 /*
		  * 초기화2
		 super();
		 super.setX(x);
		 super.setY(y);
		 this.color = color;
		 */
		 //초기화 3protected 일때 사용
		 super.x=x;
		 super.y=y;
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
		/*
		System.out.println("==========================");
		System.out.println("x="+super.getX());
		System.out.println("y="+super.getY());
		System.out.println("color="+this.color);
		System.out.println("==========================");
		*/
		System.out.println("==========================");
		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("color="+ color);
		System.out.println("==========================");
		
	}

}
