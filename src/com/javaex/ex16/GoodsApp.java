package com.javaex.ex16;

import com.javaex.ex14.Goods;

public class GoodsApp {

	public static void main(String[] args) {
		/*
		Goods cup = new Goods("머그컵", 2000);
		Goods camera = new Goods("니콘", 400000);
		Goods computer = new Goods("Lg 그램", 100000);
		
		//System.out.println(cup.toString());
		//System.out.println(camera.toString());
		//System.out.println(computer.toString());
		
		cup.showInfo();
		camera.showInfo();
		computer.showInfo();
		*/
		
		//goods를 관리할 3칸을 메모리에 올린다		
		Goods[] goodsArr = new Goods[4];
		
		//상품을 메모리에 넣는다
		Goods cup = new Goods("머그컵", 2000);
		Goods camera = new Goods("니콘", 400000);
		Goods computer = new Goods("Lg 그램", 100000);
		Goods haribo = new Goods("하리보", 50000);
		//배열에 상품의 주소를 대입
		goodsArr[0]=cup;
		goodsArr[1]=camera;
		goodsArr[2]= computer;
		goodsArr[3]= haribo;
		//모든상품에 이름을 출력
		for(int i=0; i<goodsArr.length; i++) {
			System.out.println(goodsArr[i].getName());
			
		}
		//모든상품 전부 출력
		for(int i=0; i<goodsArr.length; i++) {
			goodsArr[i].showInfo();
		}
				

		

		
		
		
	}
}
