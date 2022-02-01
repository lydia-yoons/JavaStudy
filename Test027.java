/*======================
---[[연산자(Operator)]]---
	- 삼항 연산자 == 조건 연산자
=========================*/

//사용자로부터 임의의 정수를 입력받아
// 입력받은 정수가 양수인지, 음수인지, 0인지 구분하여
// 이 결과를 출력하는 프로그램을 구현한다.
// 단, 입력 데이터는BufferedReader 의 readLine()을 통해 넘겨받도록 한다.
// 또한, 조건연산자(삼항 연산자)를 활용하여 기능을 구현한다.

//실행 예)
//임의의 정수 입력 :-12
// -12 → 음수
//계속 하거나....

//임의의 정수 입력 : 257
// 257 → 양수
//계속 하거나....

//임의의 정수 입력 : 0
// 0 → 영
//계속 하거나....

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test027{
	public static void main(String[]args) throws IOException{
		//BufferedReader 인스턴스
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//주요 변수 선언
		int n;					// 사용자 입력값을 담은 변수
		String strResult;		// 음수인지 양수인지 영인지 판별 결과를 담을 변수
	
		//연산 및 처리
		System.out.print("임의의 정수 입력 : ");
		n = Integer.parseInt(br.readLine());
		/*
		n이 0보다 크다 → true  → n은 양수
					   → false → n이 0이다 → true  → n은 영
											 → false → n은 음수
		*/

		strResult = (n > 0) ? "양수" : (n == 0 ? "영" : "음수");
		// 10
		// strResult = 

		//결과 출력
		System.out.printf("%d → %s\n", n, strResult);
		
	}
}