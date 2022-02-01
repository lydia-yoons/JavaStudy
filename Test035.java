/*======================
■■■실행 흐름의 컨트롤(제어문, 조건문과 반복문)■■■
	- if ~ else문 실습
=========================*/

/* [과제]
사용자로부터 알파벳 한 문자를 입력받아 이를 판별하여
소문자를 입력받았을 경우... 대문자로 변환하고,
대문자를 입력받았을 경우... 소문자로 변환하는 프로그램을 작성한다.
단, 입력은 『System.in.read()』메소드를 활용하여 구현한다

실행 예)
알파벳 한 문자 입력 : A
>>a
계속하려면 아무 키나..

알파벳 한 문자 입력 : c
>>C
계속하려면 아무 키나..

알파벳 한 문자 입력 : 10
>> 입력 오류 ~!! 
계속하려면 아무 키나..

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test035{
	public static void main(String[]args) throws IOException {
		//BufferedReader 인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n;	//변수 선언

		System.out.print("알파벳 한 문자 입력 : ");
		n = System.in.read(); //아스키코드로 읽어오기

		// 65~90 → 대문자 / 97~122 → 소문자
		if (65<=n && n<=90){ // 대문자 알파벳일 때
			n += 32;
			System.out.println(">> "+ (char)n);
		}else if(97<=n && n<=122){ //소문자 알파벳일 때
			n -= 32;
			System.out.println(">> "+ (char)n);
		}else{
			System.out.println("입력 오류");
		}

	}
}

/*
알파벳 한 문자 입력 : E
>> e
계속하려면 아무 키나 누르십시오 . . .

알파벳 한 문자 입력 : 1
입력 오류
계속하려면 아무 키나 누르십시오 . . .
*/