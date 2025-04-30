package com.javaex.ex04;

public class Goods {

	//필드
	private String name;
	private int price;
	
	//생성자
	/*
	메모리에 올려주는 역할함
	  코드를 따로 짤 필요가 없음
	  (기본 생성자)
	  Goods(클래스명)
	  */
	public  Goods() {

	}
	
	//메소드
	//name 등록
	public void setName(String n) {
		name = n;
	}
	
	//name 읽어오기
	public String getName() {
		return name;
	}
	
	//price 등록
	public void setPrice(int p) {
		price = p;
	}
	
	//price 읽어오기
	public int getPrice() {
		return price;
	}
	
	
	
	
	
}