package com.javaex.ex26;

import java.io.IOError;
import java.io.IOException;

//구글(미국)
//하드 디스크에 있는 파일을 읽어는 클래스
public class Myfile {
	
	//필드
	
	//생성자
	//public MyFile() {}
	
	//메소드gs
	
	//메소드일반
	//정상적일때
	public String read(String path) {
		//path 의 파일을 찾는다  C:\javaStudy\java\노래.txt
		//파일의 내용일 읽어서 변수에 담는다
		String result ="학교종이 땡땡땡 어서모이자";
		
		return result;
	}
	
	
	//파일이 없어서 못읽었을때 예외처리까지 진행
	public String read2(String path) {
		//path 의 파일을 찾는다  C:\javaStudy\java\노래.txt
		//파일의 내용일 읽어서 변수에 담는다
		//정상적이면 리턴
		
		
		//**파일이 없는경우
		try {
			//path 의 파일을 찾는다  C:\javaStudy\java\노래.txt
			//파일의 내용일 읽어서 변수에 담는다
			//정상적이면 진행
			throw new IOException();  //파일이 없는 상황을 강제로 만듬
			//!!!!!!!!!!!!!!!!!!!!!!!!!!
			//예외발생 (파일이 없다)
			
		}catch (IOException e) {
			System.out.println("no file");
		}
		
		return "";
	}
	
	
	//파일이 없어서 목읽었을때 예외처리를 하지 않음-->알려만 준다
	public void read3(String path) throws IOException{
		
		
		throw new IOException();  //파일이 없는 상황을 강제로 만듬
		
	}
	
}