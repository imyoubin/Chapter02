package com.javaex.ex20;

public class PointApp {
	
	public static void main(String[] args) {
		
		Point p = new Point(4,4);
		ColorPoint cp1 = new ColorPoint("red");
		ColorPoint cp2 = new ColorPoint(10,10,"blue");
		System.out.println("====================");
		System.out.println(p.getX()+p.getY());		
		System.out.println(cp1.getColor());
		System.out.println(cp2.getColor());
		System.out.println("====================");
		
	}
}
