package com.javaex.ex21;

import com.javaex.ex22.Circle;
import com.javaex.ex22.Rectangle;
import com.javaex.ex22.Triangle;

public class ShapeApp {

	public static void main(String[] args) {
		
		Triangle t01 = new Triangle("주황", "검정", 10, 5);
		//System.out.println(t01.toString());
		t01.draw();
	
		Rectangle r01 = new Rectangle("주황", "검정", 10, 5);
		//System.out.println(r01.toString());
		r01.draw();
		
	
		Circle c01 = new Circle("주황", "검정", 10);
		//System.out.println(r01.toString());
		c01.draw();
		
		
		t01.setLineColor("빨강");
		r01.setLineColor("빨강");
		c01.setLineColor("빨강");
		
		Circle[] cArray = new Circle[3];
		Rectangle[] rArray = new Rectangle[3];
		Triangle[] tArray = new Triangle[3];
		
		
		
	}

}