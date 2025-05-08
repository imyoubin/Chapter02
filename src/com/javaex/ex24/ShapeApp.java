package com.javaex.ex24;

public class ShapeApp {

	public static void main(String[] args) {
		
		
		Drawable[] dArray = new Drawable[4];
		
		Drawable p = new Point(5,5);
		/*
		p.draw();
		((Point)p).getX();
		*/
		
		Drawable n= new Triangle("빨강","빨강",10,20);
		/*
		n.draw();		
		((Triangle)n).getLineColor();
		((Triangle)n).getFillColor();
		*/
		
		Drawable r = new Rectangle("주황","주황"10,10);
		Drawable c = new Circle("노랑","노랑",5);
		
		dArray[0]=n;
		dArray[1]=r;
		dArray[2]=c;		
		dArray[3]=p;
		
		for(int i = 0; i<dArray.length; i++) {
			dArray[i].draw();
		
			
			}
		for(i=0;i<dArray.length;i++) {
			dArray[i].area();
			
		}
		
	}
	
}