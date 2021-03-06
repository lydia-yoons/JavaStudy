/*======================
---[[자바기본 프로그래밍]]---
	- 자바의 기본 입출력 : java.util.Scanner
=========================*/

/* ※ java.util.Scanner
	단락 문자 패턴을 사용하여 입력을 토큰에 따라 분할하며
	디폴트(default)로 사용되는 단락문자는 공백이다.
	작성된 다음 토큰은 『next()』메소드를 사용
	다른 형태(자료형)의 값으로 변환할 수 있다.		*/

// 홍길동, 90, 80, 70

import java.util.Scanner;

public class Test018{
	public static void main(String[]args){
		// ○ 주요 변수 선언
		Scanner sc = new Scanner(System.in);
		String name;
		int kor, eng, mat, tot;
		
		// ○ 연산 및 처리
		System.out.print("이름,국어,영어,수학 점수 입력(,로 구분) : " );
		sc = new Scanner(sc.next()).useDelimiter("\\s*,\\s*");
		//               ----------
		//				홍길동, 90,80,70

		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();

		tot = kor + eng + mat;

		// ○ 결과 출력
		System.out.println();
		System.out.println(">> 이름 : "+ name);
		System.out.println(">> 총점 : "+ tot);
	}
}

/*
이름,국어,영어,수학 점수 입력(,로 구분) : 홍길동,80,90,70

>> 이름 : 홍길동
>> 총점 : 240
계속하려면 아무 키나 누르십시오 . . .
*/
