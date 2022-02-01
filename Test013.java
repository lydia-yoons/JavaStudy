/*======================
---[[자바기본 프로그래밍]]---
	-변수와 자료형
	- 자바의 기본 입출력 : BufferedReader 클래스
=========================*/

//사용자로부터 이름, 국어점수, 영어점수, 수학점수를 입력받아
// 이름과 총점을 출력하는 프로그램을 구현한다.

//실행 예)
//이름을 입력하세요 : 이윤서 
//국어 점수 입력 : 90
//영어 점수 입력 : 80
//수학 점수 입력 : 70

//====[결과]====
//이름 : 이윤서
//총점 : 240

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test013{
	public static void main(String[]args) throws IOException{

		/* [내 코드]
		//BufferedReader인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//변수선언
		String name; // 이름
		int a, b, c, s; // 국영수, 총점 각각 변수
		
		//이름 입력받기
		System.out.print("이름을 입력하세요 : ");
		name = br.readLine(); 

		//국어 점수 입력 받기
		System.out.print("국어 점수 입력 : ");
		a = Integer.parseInt(br.readLine());

		// 영어 점수 입력 받기
		System.out.print("영어 점수 입력 : ");
		b = Integer.parseInt(br.readLine());

		//수학 점수 입력 받기
		System.out.print("수학 점수 입력 : ");
		c = Integer.parseInt(br.readLine());

		//총점 구하기
		s = a + b + c;
		
		//결과 출력
		System.out.printf("\n====[결과]====\n");
		System.out.println("이름 : "+name);
		System.out.println("총점 : "+ s);
		
		*/

		//[함께 푼 코드]***************************************

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		String strName;			//이름 변수 (헝가리안표기법
		int nKor, nEng, nMat;	//국어, 영어, 수학 점수 변수
		int nTot;				// 총점변수

		//추가변수 선언
		String strTemp;			//문자열 데이터 임시 저장 변수

		//○연산 및 처리
		//-사용자에게 안내 메세지 출력(이름 입력 안내)
		System.out.print("이름을 입력하세요 : ");

		//-사용자가 입력한 값(외부 데이터)을 변수에 담아내기
		strName = br.readLine();

		//-사용자에게 안내 메세지 출력(국어 점수 입력 안내)
		System.out.print("국어 점수 입력 : ");

		//-사용자가 입력한 값(외부 데이터)을 변수에 담아내기
		strTemp = br.readLine();		

		//-담아낸 값을 필요한 변수에 옮겨 담기
		nKor = Integer.parseInt(strTemp);		//90
		//-- 임시 저장 변수 strTemp에 담겨있는값을 형 변환 후, 국어 변수에 담기

		//-사용자에게 안내 메세지 출력(영어 점수 입력 안내)
		System.out.print("영어 점수 입력 : ");

		//-사용자가 입력한 값(외부 데이터)을 변수에 담아내기
		strTemp = br.readLine();		//"80"

		//-담아낸 값을 필요한 변수에 옮겨 담기
		nEng= Integer.parseInt(strTemp);
		//-- 임시 저장 변수 strTemp에 담겨있는값을 형 변환 후, 영어 변수에 담기

		//-사용자에게 안내 메세지 출력(수학 점수 입력 안내)
		System.out.print("수학 점수 입력 : ");
		strTemp = br.readLine();	
		nMat= Integer.parseInt(strTemp);
		//-- 임시 저장 변수 strTemp에 담겨있는값을 형 변환 후, 수학 변수에 담기

		//-각 점수 변수에 담겨있는 데이터(입력 데이터)들을 종합하여 총점 산출하고
		// 그 결과를 총점 변수에 담아내기
		nTot = nKor + nEng + nMat;

		//○결과 출력
		System.out.println("\n====[결과]====");
		System.out.printf("이름 : %s\n", strName);
		System.out.printf("총점 : %d\n", nTot);
	}
}

/*
[내 코드 결과]
이름을 입력하세요 : 이윤서
국어 점수 입력 : 90
영어 점수 입력 : 80
수학 점수 입력 : 70

====[결과]====
이름 : 이윤서
총점 : 240
계속하려면 아무 키나 누르십시오 . . .

[함께 푼 코드 결과]
이름을 입력하세요 : 홍길동
국어 점수 입력 : 90
영어 점수 입력 : 80
수학 점수 입력 : 70

====[결과]====
이름 : 홍길동
총점 : 240
계속하려면 아무 키나 누르십시오 . . .
*/