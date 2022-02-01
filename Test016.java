/*======================
---[[자바기본 프로그래밍]]---
	- 자바의 기본 입출력 : java.util.Scanner
=========================*/

/* ※ java.util.Scanner
	단락 문자 패턴을 사용하여 입력을 토큰에 따라 분할하며
	디폴트(default)로 사용되는 단락문자는 공백이다.
	작성된 다음 토큰은 『next()』메소드를 사용
	다른 형태(자료형)의 값으로 변환할 수 있다.		*/

//입력 : "사과 딸기 바나나"

import java.util.Scanner;

public class Test016{
	public static void main(String[]args) //throws IOException
		{
		// ○ 주요 변수 선언
		//Scanner 인스턴스 생성
		Scanner sc = new Scanner(System.in);

		String name;		//이름
		int kor, eng, mat; //국영수 점수

		// ○ 연산 및 처리
		System.out.print("이름을 입력하세요 : ");
		//br.readLine();
		name = sc.next();

		System.out.print("국어 점수 입력 : ");
		// kor = Integer.parseInt(br.readLine());
		//kor = Integer.parseInt(sc.next());
		kor = sc.nextInt();

		System.out.print("영어 점수 입력 : ");
		eng = sc.nextInt();

		System.out.print("수학 점수 입력 : ");
		mat = sc.nextInt();

		// ○ 결과 출력
		System.out.println();
		System.out.println(">> 이름 : "+ name);
		System.out.println(">> 총점 : "+ (kor + eng + mat));
		
	}
}

/*
이름을 입력하세요 : 홍길동
국어 점수 입력 : 70
영어 점수 입력 : 50
수학 점수 입력 : 80

>> 이름 : 홍길동
>> 총점 : 200
계속하려면 아무 키나 누르십시오 . . .
*/