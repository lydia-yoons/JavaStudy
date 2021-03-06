/*======================
---[[자바기본 프로그래밍]]---
	- 산술연산자
	- BufferedReader
	- printf()
=========================*/

/* 사용자로부터 임의의 정수를 두 번 입력받아
	사칙연산 및 나머지 연산을 수행하여
	그 결과를 출력하는 프로그램을 구현한다.
	단, 입력받은 과정은 BufferedReader를 활용하고
	출력하는 과정은 print()메소드를 활용한다.
	또한, 나눗셈 연산은 편의상 정수 기반으로 처리한다.	*/

//실행 예)
//첫 번째 정수 입력 : 10
//두 번째 정수 입력 : 2

//======[결과]======
//10 + 2 = 12
//10 - 2 = 8
//10 * 2 = 20
//10 / 2 = 5
//10 % 2 = 0
//==================

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test019{
	public static void main(String[]args) throws IOException {
		//BufferedReader 인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a, b; //변수선언
		
		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine()); 

		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());

		//출력
		System.out.printf("======[결과]======\n");
		System.out.printf("%d + %d = %d\n", a, b, (a+b));
		System.out.printf("%d - %d = %d\n", a, b, (a-b));
		System.out.printf("%d * %d = %d\n", a, b, (a*b));
		System.out.printf("%d / %d = %d\n", a, b, (a/b));
		System.out.printf("%d %% %d = %d\n", a, b, (a%b));
		System.out.printf("==================");

	}
}

/*
첫 번째 정수 입력 : 10
두 번째 정수 입력 : 2
======[결과]======
10 + 2 = 12
10 - 2 = 8
10 * 2 = 20
10 / 2 = 5
10 % 2 = 0
==================계속하려면 아무 키나 누르십시오 . . .
*/