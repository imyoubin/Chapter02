package com.javaex.ex01;

import java.util.Scanner;

public class GoodsApp {
	
	//시나리오 짜는곳.
	public static void main(String[] args) {
		
		Goods camera = new Goods();
		
		camera.name="니콘";
		camera.price=400000;
		
		System.out.println(camera.name);
		System.out.println(camera.price);
		
		System.out.println("----------------------------");
		
		Goods Cup = new Goods();
		
		Cup.name="머그컵";
		Cup.price=5000;
		
		System.out.println(Cup.name);
		System.out.println(Cup.price);
		
		System.out.println("----------------------------");
		
		Goods computer = new Goods();
		
		computer.name="LG그램";
		computer.price=1000000;
		
		System.out.println(computer.name);
		System.out.println(computer.price);	
		
		System.out.println("----------------------------");
		
		System.out.println(Cup.name);
		System.out.println(camera.price);
	}

}
