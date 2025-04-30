package com.javaex.ex08;

public class Goods {
	
	//필드
		private String name;
		private int price;
		
		//생성자
		public Goods() {/*기본생성자,자동으로 생성
							다른생성자가 있으면 생성안됨
							*/
			//메모리에 올리는작업 해줌
			System.out.println("Goods()");
		}
		
		public Goods(String name ,int price) {
			//메모리에 올리는작업 해줌
			/*
			System.out.println(name);
			System.out.println(price);
			*/
			this.name=name;
			this.price=price;
			
		}
		
		//메소드
		//name 등록
		public void setName(String name) {
			this.name = name;
			}
		
		//name 읽어오기
		public String getName() {
			return name;
		}
		
		//price 등록
		public void setPrice(int price) {
			this.price = price;
		}
		
		//price 읽어오기
		public int getPrice() {
			return price;
		}
		
		//정보출력
		public void showInfo() {
			System.out.println("==========================");
			System.out.println("이름:" + name);
			System.out.println("가격:" + price);
			System.out.println("==========================");
		}
		
}
