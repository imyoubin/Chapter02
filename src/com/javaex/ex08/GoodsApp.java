package com.javaex.ex08;

import com.javaex.ex05.Goods;

public class GoodsApp {

	public static void main(String[] args) {
		//메모리에 올리고
				Goods camera = new Goods();
				camera.setName("니콘");
				camera.setPrice(400000);
				
				camera.showInfo();
				/*
				Goods cup = new Goods("머그컵", 2000);
				cup.showInfo();
				*/
		}

}
