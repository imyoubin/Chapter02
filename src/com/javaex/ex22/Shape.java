package com.javaex.ex22;

public class Shape {
<<<<<<< HEAD
	//필드
	private String fillColor;
	private String lineColor;
	
	//생성자
	public Shape() {
		
	}


	public Shape(String fillColor, String lineColor) {
		
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}

	//메소드gs
	public String getFillColor() {
		return fillColor;
	}


	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}


	public String getLineColor() {
		return lineColor;
	}


	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	//메소드 일반
	@Override
	public String toString() {
		return "Shape [fillColor=" + fillColor + ", lineColor=" + lineColor + "]";
	}
	
	
	public void draw() {
		//코드쓸게 없어서 억지로 씀
		System.out.println("Shape.draw");
		}
		
	
	//코드를 작성하고 싶어도 못만듬 -->굳이 만들필요 없음
	
	//public abstract void draw(); //내용을 안써도됨		
	
}	


=======
	
	//필드
	private String fillColor;
	private String lineColor;


	//생성자
	public Shape() {
	}
	
	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}

	//메소드 gs
	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	@Override
	public String toString() {
		return "Shape [fillColor=" + fillColor + ", lineColor=" + lineColor + "]";
	}

	public void draw() {
		System.out.println("Shape.draw()");
	}
    	
}
>>>>>>> branch 'master' of https://github.com/imyoubin/Chapter02.git
