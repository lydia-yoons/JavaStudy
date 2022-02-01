/*======================
■■■실행 흐름의 컨트롤(제어문, 조건문과 반복문)■■■
	- if ~ else문 실습
=========================*/

/* 사용자로부터 임의의 정수 세 개를 입력받아
작은 수에서 큰 수 순으로 추력하는 프로그램 구현한다.

실행 예)
첫 번째 정수 입력	: 5		//9
두 번째 정수 입력	: 15	//1
세 번째 정수 입력	: 10	//9

>> 정렬 결과 5 10 15		//5 9 9
//계속하려면....

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test033{
	public static void main(String[]args) throws IOException {
		 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//○주요 변수 선언
		int a, b, c; //변수 선언

		//○연산 및 처리
		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("세 번째 정수 입력 : ");
		c = Integer.parseInt(br.readLine());

/*[내가 푼 방법]
		if(a >= b && a >=c){
			if(b >= c){
				System.out.printf("정렬 결과 %d, %d, %d", c, b, a);
			}else{
				System.out.printf("정렬 결과 %d, %d, %d", b, c, a);
			}
		}else if(b >= c && b >= a){
			if(c >= a){
				System.out.printf("정렬 결과 %d, %d, %d", a, c, b);
			}else{
				System.out.printf("정렬 결과 %d, %d, %d", c, a, b);
			}
		}else{
			if(a >= b){
				System.out.printf("정렬 결과 %d, %d, %d", b, a, c);
			}else{
				System.out.printf("정렬 결과 %d, %d, %d", a, b, c);
			}
		}
*/

		//[함께 푼 방법]**********************************
		// 7 8 2	8 6 13
		// ---      ---
		//			6 8 13
		// -   -    -   --
		// 2 8 7    
		//   ---      ----
		// 2 7 8    6 8 13

		if(a>b){//만약 첫 번째 정수(a)가 두 번째 정수(b)보다 크다면..
		//		a와 b 두 정수의 자리를 바꾼다.
			a = a^b;
			b = b^a;
			a = a^b;
		}
		
		if(a>c){//만약 첫 번째 정수(a)가 세 번째 정수(c)보다 크다면..
		//		a와 c 두 정수의 자리를 바꾼다.
			a = a^c;
			c = c^a;
			a = a^c;
		}
		
		if(b>c){//만약 두 번째 정수(b)가 세 번째 정수(c)보다 크다면..
		//		b와 c 두 정수의 자리를 바꾼다.
			b = b^c;
			c = c^b;
			b = b^c;
		}

		//○결과 출력
		System.out.printf("\n>> 정렬 결과 : %d %d %d\n", a, b, c);

	}
}

/*
첫 번째 정수 입력 : 5
두 번째 정수 입력 : 15
세 번째 정수 입력 : 10
정렬 결과 5, 10, 15계속하려면 아무 키나 누르십시오 . . .

첫 번째 정수 입력 : 9
두 번째 정수 입력 : 5
세 번째 정수 입력 : 9
정렬 결과 5, 9, 9계속하려면 아무 키나 누르십시오 . . .

[함께 푼 결과]
첫 번째 정수 입력 : 7
두 번째 정수 입력 : 8
세 번째 정수 입력 : 2

>> 정렬 결과 : 2 7 8
계속하려면 아무 키나 누르십시오 . . .

첫 번째 정수 입력 : 15
두 번째 정수 입력 : 13
세 번째 정수 입력 : 13

>> 정렬 결과 : 13 13 15
계속하려면 아무 키나 누르십시오 . . .
*/