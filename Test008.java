/*======================
---[[변수와 자료형]]---
	- 변수와 자료형 실습 및 테스트 : char
=========================*/

public class Test008{
	public static void main(String[]args){
		//주요 변수 선언
		char ch1, ch2, ch3;
		int a;				//--check~!

		// 연산 및 처리(대입 연산)
		ch1 = 'A';
		ch2 = '\n';	//개행문자 1개
		ch3 = '대';
		a = (int)ch1;			//--check~! 자동형변환 되지만, 수동으로도 형변환을 넣어주자!

		// 결과 출력
		System.out.println("ch1 : " + ch1);
		System.out.println("ch2 : " + ch2);
		System.out.println("ch3 : " + ch3);
		System.out.println("a : " + a); //형변환 되어 A의 아스키코드 65출력
	}
}

/*
ch1 : A
ch2 :

ch3 : 대
a : 65
계속하려면 아무 키나 누르십시오 . . .
*/