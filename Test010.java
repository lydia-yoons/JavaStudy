/*======================
---[[변수와 자료형]]---
	- 퀴즈
		사전에 부여된 반지를 정보를 통해
		원의 넓이와 둘레를 구하는프로그램을 구현한다.
		→반지름 : 10
=========================*/

//실행 예)
//넓이 : xxx
//둘레 : xxx
//계속하려면 아무 키나누르세요..

//※원의 넓이 = 반지름 * 반지름 * 3.141592
//※원의 둘레 = 반지름 * 2 * 3.141592

public class Test010{
	public static void main(String[]args){
		
		/*[내가 풀이한 내용]
		double a = 10; //반지름 값
		double b = 3.141592; //파이 값
		
		double c;

		c = a * a * b; //원의 넓이구하기

		System.out.println("원의 넓이 = " + a + " * " + a + " * " + b + " = " + c);

		c = a * 2 * b; //원의 둘레구하기

		System.out.println("원의 둘레 = " + a + " * 2 * " + b + " = " + c);
		*/

		//[함께 풀이한 내용]

		//주요 변수 선언( 반지를, 원주율, 넓이, 둘레)
		int r = 10;					//반지름
		final double PI = 3.141592;	//원주율
		//※『final』 키워드 : 변수의 상수화!
		double area, length;

		//연산 및 처리
		//넓이 연산
		area = r * r * PI;

		//둘레연산
		length = r * 2 * PI;

		//결과 출력
		System.out.println("넓이 : " + area);
		System.out.println("둘레 : "+ length);
	}
}

/*
넓이 : 314.1592
둘레 : 62.83184
계속하려면 아무 키나 누르십시오 . . .
*/