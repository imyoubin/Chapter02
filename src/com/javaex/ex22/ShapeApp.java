package com.javaex.ex22;

public class ShapeApp {

	public static void main(String[] args) {
		
<<<<<<< HEAD
		
		Shape s01 = new Shape("빨강", "검정");	//
		System.out.println(s01.toString());
		
		//선, 면의색이 없는 삼각형은 잘못된것임
		//Triangle t01 = new Triangle(5, 10); 
	
		Triangle t01 = new Triangle("빨강", "검정", 5, 10);
		//System.out.println(t01.toString());
		//t01.draw();
		//t01.getWidth();
		//t01.getHeight();
		
		
		Rectangle r01 = new Rectangle("주황", "초록", 10, 20);
		//System.out.println(r01.toString());
		//r01.draw();
		
		
		Circle c01 = new Circle("빨강", "검정", 5);
		//System.out.println(c01.toString());
		//c01.draw();
		
		//*
		Shape st = new Triangle("초록", "초록", 100, 100);
		//st.getFillColor();
		//st.draw();
		//st.getWidth();
		//st.getHeight();
	
	    Shape sc = new Circle("빨강", "빨강", 50);
		//sc.getFillColor();
	    //sc.getRadius();
		//sc.draw();
		
		Shape sr = new Rectangle("노랑", "노랑", 33, 33);
		//sr.draw();
		
		
		//하나의 배열에 모든 도형을 담는다 --> 자식쪽의 기능은 사용할수없다
		//모든 도형을 담을수 있는 배열
		Shape[] sArray = new Shape[3];
		
		//도형담기
		//sArray[0] = t01; //업 캐스팅 자동으로 섞어쓰기 가능
		sArray[0] = st;
		sArray[1] = sc;
		sArray[2] = sr;
		
		
	
		//전체도형을  draw()로출력-->자식쪽의 기능으로 사용할 수없다
		//해결방법-->오버라이딩
		//         :부모쪽에 자식쪽과 똑같은 메소드를 작성해서 덮어쓰도록 만든다
		for(int i=0; i<sArray.length; i++) {
			sArray[i].draw();
		}
		//**다운 캐스팅**
		//명시적으로 타입변환을 하여야 한다.

		//첫번째(삼각형)의 가로값 출력 -->가려져서 못읽음	
		System.out.println(((Triangle)sArray[0]).getWidth());
		//사각형 가로
		System.out.println(((Rectangle)sArray[2]).getWidth());
		//원의 반지름
		System.out.println(((Circle)sArray[1]).getRadius());
		
		//Shape s =new Shape(); 
		//s.draw();
	}
=======
		Shape s01 = new Shape("빨강", "검정");
		System.out.println(s01.toString());
		
		//선, 면의색이 없는 삼각형은 잘못된것임
		//Triangle t01 = new Triangle(5, 10); 
	
		Triangle t01 = new Triangle("빨강", "검정", 5, 10);
		//System.out.println(t01.toString());
		//t01.draw();
		//t01.getWidth();
		//t01.getHeight();
		
		
		Rectangle r01 = new Rectangle("주황", "초록", 10, 20);
		//System.out.println(r01.toString());
		//r01.draw();
		
		
		Circle c01 = new Circle("빨강", "검정", 5);
		//System.out.println(c01.toString());
		//c01.draw();
		
		//*
		Shape st = new Triangle("초록", "초록", 100, 100);
		//st.getFillColor();
		//st.draw();
		//st.getWidth();
		//st.getHeight();
	
	    Shape sc = new Circle("빨강", "빨강", 50);
		//sc.getFillColor();
	    //sc.getRadius();
		//sc.draw();
		
		Shape sr = new Rectangle("노랑", "노랑", 33, 33);
		//sr.draw();
		
		
		//하나의 배열에 모든 도형을 담는다 --> 자식쪽의 기능은 사용할수없다
		//모든 도형을 담을수 있는 배열
		Shape[] sArray = new Shape[3];
		
		//도형담기
		sArray[0] = st;
		sArray[1] = sc;
		sArray[2] = sr;
		
		
	
		//전체도형을  draw()로출력-->자식쪽의 기능으로 사용할 수없다
		//해결방법-->오버라이딩
		//         :부모쪽에 자식쪽과 똑같은 메소드를 작성해서 덮어쓰도록 만든다
		for(int i=0; i<sArray.length; i++) {
			sArray[i].draw();
		}
		

	}	
>>>>>>> branch 'master' of https://github.com/imyoubin/Chapter02.git

}
