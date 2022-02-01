/*======================
■■■실행 흐름의 컨트롤(제어문, 조건문과 반복문)■■■
	- switch문 실습
=========================*/

/*
○ 다중 선택문이라하며, switch문 다음의 수식 값에 따라
	실행 순서를 여러 방향으로 분기할 때 사용하는 문장이다.
○ 형식 및 구조
	switch(수식)
	{
		case 상수1 : 문장1; [break;]
		case 상수2 : 문장2; [break;]
			   :
		 [default : 문장n+1; [break;]]
	}

	switch문의 『수식』과 case의 『상수』는
	byte, short, int, long이어야한다.
	
	case문 뒤에 『break;』가 없는 형태인 경우,
	다음 case문의 문장을 계속해서(이어서) 수행하게 된다. (→ 기본모델)
*/

//당신의 이름은 홍길동 입니다.
// 총점은 xx, 평균은 xx입니다.
// 등급은 A입니다.

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Test036{
	public static void main(String[]args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("이름 입력 : ");
		String name = br.readLine();

		System.out.print("국어점수 입력 : ");
		int kor = Integer.parseInt(br.readLine());
		
		System.out.print("영어점수 입력 : ");
		int eng = Integer.parseInt(br.readLine());
		
		System.out.print("수학점수 입력 : ");
		int mat = Integer.parseInt(br.readLine());

		//평균 - 편의상 정수로 처리
		int avg = (kor + eng + mat)/3 ;
		
		char grade;

		switch(avg/10){
			case 10 : case 9:
				grade = 'A';
				break;
			case 8 :
				grade = 'B';
				break;
			case 7 :
				grade = 'C';
				break;
			case 6 :
				grade = 'D';
				break;
			default :
				grade = 'F';
				break;
		}
		
		System.out.printf("당신의 이름은 %s입니다. \n", name);
		System.out.printf("총점은 %d, 평균은 %d입니다.\n", (avg*3), avg);
		System.out.printf("등급은 %c입니다.\n",grade);


	}
}

/*
이름 입력 : 홍길동
국어점수 입력 : 90
영어점수 입력 : 85
수학점수 입력 : 70
당신의 이름은 홍길동입니다.
총점은 243, 평균은 81입니다.
등급은 B입니다.
계속하려면 아무 키나 누르십시오 . . .

이름 입력 : 아무개
국어점수 입력 : 10
영어점수 입력 : 30
수학점수 입력 : 20
당신의 이름은 아무개입니다.
총점은 60, 평균은 20입니다.
등급은 F입니다.
계속하려면 아무 키나 누르십시오 . . .
*/