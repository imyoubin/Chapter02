package com.javaex.ex24;

public class Circle extends Shape implements Drawable{
	//필드
	private int radius;
	
	
	//생성자
	public Circle() {
		super();
	}



	public Circle(String fillColor, String lineColor, int radius) {
		super(fillColor, lineColor);
		this.radius = radius;
	}


	//메소드gs
	public int getRadius() {
		return radius;
	}



	public void setRadius(int radius) {
		this.radius = radius;
	}


	//메소드일반
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", getRadius()=" + getRadius() + "]";
	}
	//인터페이스 implements Drawable
	public void draw() {
		System.out.println("====원형을 그렸습니다=============");
		System.out.println("가로:" + radius);		
		System.out.println("면색:" + super.getFillColor());
		System.out.println("선색:" + super.getLineColor());
		System.out.println("================================");
	}
	//부모 Shape
	public void area() {
		System.out.println("====원형을 그렸습니다=============");
		System.out.println("원의 넒이");
		System.out.println(3.14*radius*radius);
		System.out.println("=============================");
		
	}
}
