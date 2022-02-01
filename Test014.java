/*======================
---[[자바기본 프로그래밍]]---
	- 자바의 기본 입출력 : System.in.read()
=========================*/

//실행 예)
// 한 문자 입력 : A
// 한 자리 정수 입력 : 7

//>> 입력한 문자 : A
//>> 입력한 정수 : 7

/*
『System.out.read()』메소드는 한 문자만 가져온다.
단, 하나의 문자를 입력받아 입력받은 문자의
ASCII Code값을  반환한다.
*/


import java.io.IOException;

public class Test014{
	public static void main(String[]args) throws IOException{
		//주요 변수 선언
		char ch;		//-- 입력받은 문자를 담을 변수
		int n;			//-- 입력받은 정수를 담을 변수

		char temp; 

		// 연산 및 처리
		// - 사용자에게 안내 메세지 출력
		System.out.print("한 문자 입력 : ");
		ch = (char)System.in.read();	// A → 65 (char로 형변환) → A

		//※입력 대기열에 남아있는 \r과 \n(엔터키)을 스킵(건너뛰기)
		System.in.skip(2);
		//-- 매개변수(2)에 의해 두 글자를 읽지 않고 건너 뛴다.(버린다)
		
		//- 사용자에게 안내 메세지 출력 및 입력값 얻어오기
		System.out.print("한 자리 정수 입력 : ");
		n = System.in.read();

		// 1 → 49
		// 2 → 50
		// 3 → 51
		//   :
		// 9 → 57

		// n을 48만큼 감소시켜라
		//① 연산자 쓰는법
		//n -= 48;

		//② 형변환 시켜주는법
		temp = (char)n;

		//결과 출력
		System.out.println();
		System.out.println(">> 입력한 문자 : "+ch);
		//System.out.println(">> 입력한 정수 : "+n); //①
		System.out.println(">> 입력한 정수 : "+ temp); //②

	}
}

/*
한 문자 입력 : c
한 자리 정수 입력 : 6

>> 입력한 문자 : c
>> 입력한 정수 : 6
계속하려면 아무 키나 누르십시오 . . .
*/