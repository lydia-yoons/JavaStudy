/*======================
---[[연산자(Operator)]]---
	- 삼항 연산자 == 조건 연산자
=========================*/

/*
	피연산자	연산자	피연산자	연산자 피연산자
	--------			--------		   --------
	   1항				   2항				  3항

	피연산자 ? 피연산자 : 피연산자
	--------   --------	  --------
	   1항	     2항		  3항
*/

//사용자로부터 임의의 정수를 입력받아
//입력받은 정수가 짝수인지 홀수인지 판별하는 프로그램을 구현한다.
//단, 조건연산자(삼항연산자)를 활용하려 작성할 수 있도록 한다.

//실행 예)
// 임의의 정수 입력 :10

//==[판별 결과]==
// 10 → 짝수
//===============

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Test026{
	public static void main(String[]args) throws IOException{
		// ○ 주요 변수 선언
		int n;				//사용자로부터 입력받은 데이터를 담아둘 변수
		String strReault;	//홀수인지 짝수인지에 대한 판별 결과를 담아둘 변수

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// ○ 연산 및 처리
		System.out.print("임의의 정수입력 : ");
		n = Integer.parseInt(br.readLine());

		//홀수인지 짝수인지에 대한 판별 연산
		//_____?_____:_____;
		//수식1 수식2 수식3
	
		//수식1 : 참(true) 또는 거짓(false)을 반환할 수 있는 수식 형태로 작성
		//수식2 : 수식1의 처리 결과가 참(true)일 경우수행하는 영역
		//수식3 : 수식1의 처리 결과가 거짓(false)일 경우 수행하는 영역

		//입력받은 정수(n)가 홀수인지 짝수인지 확인하기 위한 연산
		// → n을 2로 나눈 나머지가 0이면.....		→짝수
		//							0이아니면.....	→홀수

		strReault = (n%2==0) ? "짝수" : "홀수";
		// strReasult = (n%2==0) ? "짝수" : "홀수";
		 


		// ○ 결과 출력
		System.out.printf("\n==[판별결과]==");
		System.out.printf("%d → %s\n", n, strReault);
		System.out.printf("================");
		
	}
}

/*
임의의 정수입력 : 10

==[판별결과]==10 → 짝수
================계속하려면 아무 키나 누르십시오 . . .

임의의 정수입력 : 1

==[판별결과]==1 → 홀수
================계속하려면 아무 키나 누르십시오 . . .

*/