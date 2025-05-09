package com.javaex.ex26;

import java.io.IOException;

//정우성(강남)
public class MyfileApp {

	public static void main(String[] args) {
	

		/*
		Scanner sc = new Scanner(System.in);
		sc.nextInt()
		*/
		
		/*
		MyFile mf = new MyFile();
		String str = mf.read2("C:\\javaStudy\\java\\노라.txt");
		System.out.println(str);
		*/
		
		
		Myfile mf = new Myfile();
		
		try {
			mf.read3("C:\\javaStudy\\java\\노라.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("파일이 없습니다.");
		}	
		
	}
}
