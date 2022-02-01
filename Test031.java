/*======================
■■■실행 흐름의 컨트롤(제어문, 조건문과 반복문)■■■
	- if ~ else문 실습
=========================*/

// <<과제>>

// 사용자로부터 임의의 연도를 입력받아
// 입력받은 연도가... 윤년인지 평년인지 판별하여
// 그 결과를 출력하는 프로그램을 구현한다.
// 단, 입력은 BufferedReader 를 활용하고
//처리 과정은 if 조건문을 활용하여 수행할 수 있도록한다.

//실행 예)
// 임의의 연도 입력 : 2021
// 2021년 → 평년
// 계속하려면...

//임의의 연도 입력 : 2020
// 2020년 → 윤년

//임의의 연도 입력 : 2012
// 2012년 → 윤년

// ※ 2월이 28일까지 있는 해 → 평년
//			29일까지 있는 해 → 윤년

// ※  윤년의 판별 조건
//		연도가 4의 배수이면서 100의 배수가 아니거나,
//		400의 배수이면 윤년
//		그렇지 않으면 평년!

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test031{
	public static void main(String[]args) throws IOException {
		//BufferedReader 인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//변수 선언
		int year;	//연도 

		//값 입력 받기
		System.out.print("임의의 연도 입력 : ");
		year = Integer.parseInt(br.readLine());
		

		// 조건문 작성
		if(year%4==0 && year%100!=0 || year%400==0){
			//윤년
			System.out.printf("%d년 → 윤년\n", year);
		}else{
			//평년
			System.out.printf("%d년 → 평년\n", year);
		}

	}
}

/*
임의의 연도 입력 : 2021
2021년 → 평년
계속하려면 아무 키나 누르십시오 . . .

임의의 연도 입력 : 2012
2012년 → 윤년
계속하려면 아무 키나 누르십시오 . . .

임의의 연도 입력 : 2012
2012년 → 윤년
계속하려면 아무 키나 누르십시오 . . .
*/
		