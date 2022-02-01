/*======================
■■■실행 흐름의 컨트롤(제어문, 조건문과 반복문)■■■
	- if ~ else문 실습
=========================*/

//사용자로부터 임의의 정수를 입력받아
// 입력받은 정수가 짝수인지, 홀수인지, 영인지
//결과를 판별하여 출력하는 프로그램 구현

//실행 예)
// 임의의 정수 입력 : 14
// 14 → 짝수
// 계속 하려면....

// 임의의 정수 입력 : 3
// 14 → 홀수
// 계속 하려면....

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test030{
	public static void main(String[]args) throws IOException {
		//BufferedReader 인스턴스 선언
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
/*[내가 푼 문제]
		//변수 선언
		int num;
		String strResult;

		System.out.print("임의의 정수 입력 : ");
		num = Integer.parseInt(br.readLine());

		if(num == 0){
			//0
			strResult = "영";
		}else if ( num % 2 == 0){
			//짝수
			strResult = "짝수";
		}else{
			//홀수
			strResult = "홀수";
		}
	
		
		//출력
		System.out.printf("%d → %s\n", num, strResult);
*/

	//[함께 푼 문제] ******************************************
		//변수 선언
		int n;
		String strResult = "판별 불가";

		System.out.print("임의의 정수 입력 : ");
		n = Integer.parseInt(br.readLine());

		if(n == 0){
			//0
			strResult = "영";
		}else if ( n % 2 == 0){
			//짝수
			strResult = "짝수";
		}else{
			//홀수
			strResult = "홀수";
		}

		System.out.printf(n + "→ "+ strResult);


	}

}

/*
임의의 정수 입력 : 3
3 → 홀수
계속하려면 아무 키나 누르십시오 . . .

임의의 정수 입력 : 0
0 → 영
계속하려면 아무 키나 누르십시오 . . .

*/