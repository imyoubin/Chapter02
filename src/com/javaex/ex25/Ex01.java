package com.javaex.ex25;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		
		//Point p01 = new Point(3, 3);
				//p01.draw();
								
				Scanner sc = new Scanner(System.in);
				int result = 0;
				
				int num = sc.nextInt();
							
				try {
					result = 100/num;
				
				}catch(ArithmeticException e) {
					//System.out.println(e.toString());
					System.out.println("0으로 나눌수 없습니다.");
				
				}finally {
					System.out.println("공통영역");
				}
								
				System.out.println(result);
				
				
				sc.close();
				
	}
}
