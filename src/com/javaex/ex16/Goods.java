package com.javaex.ex16;

public class Goods {
	//필드
	private String name;
	private int price;
	
	
	// 생성자
		public Goods() {
			
		}
	//메소드gs
	public void setName(String name) {
		this.name = name;
	}

	
	public String getName() {
		return name;
	}

	
	public void setPrice(int price) {
		this.price = price;
	}

	
	public int getPrice() {
		return price;
	}


	public String toString() {
		return "Goods [name=" + name + ", price=" + price + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	public void showInfo() {
		System.out.println("==========================");
		System.out.println("이름:" + name);
		System.out.println("가격:" + price);
		System.out.println("==========================");
	}
	
	
}
	

	

	


