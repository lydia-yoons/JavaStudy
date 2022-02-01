/*======================
---[[변수와 자료형]]---
	- 변수와 자료형 실습 및 테스트 : double
	- 나눗셈 연산 실습
=========================*/

public class Test009{
	public static void main(String[]args){
		//정수와 정수의 나눗셈
		double a = 1/2;
		System.out.println("double a : " + a);
		//ㄴ--------> double a = 0.0

		double b = 1/2 + 1/2;
		//			0 + 0 = 0
		System.out.println("double b : "+ b);
		//ㄴ--------> double b = 0.0

		double c = 1 / 2.0;
		//			0.5
		System.out.println("double c : "+ c) ;
		//ㄴ--------> double c = 0.5

		/* ※나눗셈 연산과 관련하여
			피연산자 중 실수가 포함되어 있다면
			연산은 실수 기반의 연산이 수행되어
			결과값 또한 실수 형태로 반환 된다. */

		double d = 3/2 + 1/2;
		//			1 + 0 = 1
		System.out.println("double d : " + d);

		double e = 3/2 + 1/2.0;
		//			1 + 0.5 = 1.5
		System.out.println("double e : " + e);
	}
}

/*
double a : 0.0
double b : 0.0
double c : 0.5
double d : 1.0
double e : 1.5
계속하려면 아무 키나 누르십시오 . . .
*/