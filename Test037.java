/*======================
■■■실행 흐름의 컨트롤(제어문, 조건문과 반복문)■■■
	- switch문 실습
=========================*/

/*1부터 3까지의 정수 중 하나를 사용자로부터 입력받아
  입력받은 정수만큼의 별문자(★)가 출력되는 프로그램을 작성한다.
  단, 두 가지 방법으로 구형할수 있도록 한다.

  ① switch문의 일반 모델을 사용하여 해결
  ② switch문의 기본 모델을 사용하되,
	『break;』를 딱 한 번만 사용할 수 있도록 구성

실행 예)
임의의 정수 입력(1~3) : 3
★★★
계속하려면 아무키나...

임의의 정수 입력(1~3) : 1
★
계속하려면 아무키나...

임의의 정수 입력(1~3) : 7
입력 오류~!
계속하려면 아무키나...

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test037{
	
	public static void main(String[]args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num;
		String star="";
		
		System.out.print("임의의 정수입력(1~3) : ");
		num = Integer.parseInt(br.readLine());
		
		//①
		System.out.println("①번 방법");
		switch (num){
		case 1:
			star = "★";
			break;
		case 2:
			star = "★★";
			break;
		case 3:
			star = "★★★";
			break;
		default :
			System.out.println("입력 오류 !");
		    break;
		}


		//②
		System.out.println("②번 방법");
		switch(num){
			default :
				System.out.println("입력 오류 !");
				break;
			case 3 :
				star = "★";
			case 2 :
				star = star+"★";
			case 1 :
				star = star+"★";
			
		}

		System.out.printf("%s", star);
		System.out.println();
	
	}
}

/*
①
임의의 정수입력(1~3) : 3
★★★
계속하려면 아무 키나 누르십시오 . . .

임의의 정수입력(1~3) : 6
입력 오류 !
계속하려면 아무 키나 누르십시오 . . .

②
임의의 정수입력(1~3) : 2
★★
계속하려면 아무 키나 누르십시오 . . .

임의의 정수입력(1~3) : 8
입력 오류 !

계속하려면 아무 키나 누르십시오 . . .

*/