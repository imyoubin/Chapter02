package com.javaex.ex22;

<<<<<<< HEAD
public class Triangle extends Shape{
	//필드
	private int width;
	private int height;
	
	//생성자
	public Triangle() {
		super();
	}

	public Triangle(String fillColor,String lineColor,int width, int height) {
		super(fillColor,lineColor);
		this.width = width;
		this.height = height;
	}
	//메소드 gs
	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}

	//매소드일반
	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + ", getWidth()=" + getWidth() + ", getHeight()="
				+ getHeight() + "]";
	}
	
	
	public void draw() {
		System.out.println("====삼각형을 그렸습니다=============");
		System.out.println("가로:" + width);
		System.out.println("세로:" + height);
		System.out.println("면색:" + super.getFillColor());
		System.out.println("선색:" + super.getLineColor());
		System.out.println("================================");
	
	
	}

=======
public class Triangle extends Shape{ 

	//필드
	private int width;
	private int height;
	
	//생성자
	public Triangle() {
	}
	
	/*
	public Triangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	*/


	public Triangle(String fillColor, String lineColor, int width, int height) {
		super(fillColor, lineColor);
		this.width = width;
		this.height = height;
	}

	//메소드 gs
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}


	
	//메소드 일반
	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + ", getFillColor()=" + getFillColor()
				+ ", getLineColor()=" + getLineColor() + "]";
	}


	public void draw() {
		System.out.println("===삼각형을 그렸습니다.================================");
		System.out.println("면색:" + super.getFillColor() );
		System.out.println("선색:" + super.getLineColor());
		System.out.println("가로:" + this.width);
		System.out.println("세로:" + this.height);
		System.out.println("===================================================");
	}
>>>>>>> branch 'master' of https://github.com/imyoubin/Chapter02.git
	
}
