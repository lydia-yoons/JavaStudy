/*======================
■■■실행 흐름의 컨트롤(제어문, 조건문과 반복문)■■■
	- if ~ else문 실습
=========================*/

/* [과제]
사용자로부터 알파벳 한 문자를 입력받아
이를 판별하여 입력받은 알파벳이 모음일 경우만
결과를 출력하는 프로그램을 구현한다.
단, 대소문자를 모두 적용할 수 있도록 처리한다.
또한, 알파벳 이외의 문자가 입력되었을 경우
입력 오류에 대한 내용을 사용자에게 안내해 줄 수 있도록 한다.

실행 예)
알파벳 한 문자 입력 : A
>> 모음 OK~!!
계속하려면 아무 키나 누르세요...

알파벳 한 문자 입력 : e
>> 모음 OK~!!
계속하려면 아무 키나 누르세요...

알파벳 한 문자 입력 : B
계속하려면 아무 키나 누르세요...

알파벳 한 문자 입력 : t
계속하려면 아무 키나 누르세요...

알파벳 한 문자 입력 : 1
>> 입력 오류~!!!
계속하려면 아무 키나 누르세요...
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test034{
	public static void main(String[]args) throws IOException {
		//BufferedReader 인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int e ; //알파벳 받을 변수 선언

		System.out.print("알파벳 한 문자 입력 : "); 
		e = System.in.read(); 
		

		// 65, 69, 74, 79, 85 >> 대문자 모음 아스키 코드
		// 97, 101, 105, 111, 117 >> 소문자 모음 아스키 코드
		// 65~90 → 대문자 / 97~122 → 소문자
		if (e==65 || e==69|| e==74|| e==79|| e==85|| e==97|| e==101|| e==105|| e==111|| e==117) {
			System.out.println("모음 OK~~!");
		}
		else if (65<=e && e<=90 || 97<=e && e<=122){
			return;
		}else{
			System.out.println("입력 오류~~!");
		}
		
	}
}

/*
알파벳 한 문자 입력 : A
모음 OK~~!
계속하려면 아무 키나 누르십시오 . . .

알파벳 한 문자 입력 : e
모음 OK~~!
계속하려면 아무 키나 누르십시오 . . .

알파벳 한 문자 입력 : 7
입력 오류~~!
계속하려면 아무 키나 누르십시오 . . .

알파벳 한 문자 입력 : h
계속하려면 아무 키나 누르십시오 . . .
*/
