/*======================
■■■실행 흐름의 컨트롤(제어문, 조건문과 반복문)■■■
	- if ~ else문 실습
=========================*/

// 사용자로부터 이름, 국어, 영어, 수학점수를 입력받아
// 다음과 같은 형태로 출력하는 프로그램을 작성한다.
// 등급은 평균 점수를 기준으로 산출하여 처리한다.

// 90점 ~ 100점 : A			80점 ~ 89점 : B
// 70점 ~ 79점 : C			60점 ~ 69점 : D
// 60점 미만 : F

// 단, BufferedReader를 활용하여 데이터를 입력받고,
// printf()메소드를 통해 출력

//실행 예)
// 이름 입력 : 홍길동
// 국어 점수 : 90
// 영어 점수 : 80
// 수학 점수 : 70

// >> 당신의 이름은 홍길동입니다.
// >> 국어 점수는 90,
// >> 영어 점수는 80,
// >> 수학 점수는 70,
// >> 총점은 240이고, 평균은 80입니다.
// >> 등급은 B입니다.
// 계속하려면 ...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test029{
	public static void main(String[]args) throws IOException {
	//BuffereReade 인스턴스
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	

/*[내가 푼 코드]*****************************
	//변수선언
	int kor, eng, mat, sum, avg; ; //국영수 ,총점, 평균
	String name, strResult;	//이름, 최종 결과

	
	System.out.print("이름 입력 : ");
	name = br.readLine(); // 이름 입력

	System.out.print("국어 점수 : ");
	kor = Integer.parseInt(br.readLine());

	System.out.print("영어 점수 : ");
	eng = Integer.parseInt(br.readLine());

	System.out.print("수학 점수 : ");
	mat = Integer.parseInt(br.readLine());

	//총점
	sum = kor + eng + mat;
	//평균
	avg = (kor + eng + mat)/3;
	
	System.out.printf(">> 당신의 이름은 %s입니다. \n", name);
	System.out.printf(">> 국어점수는 %d점, \n", kor);
	System.out.printf(">> 영어점수는 %d점, \n", eng);
	System.out.printf(">> 수학점수는 %d점, \n", mat);
	System.out.printf(">> 총점은 %d이고, 평균은 %d입니다.\n", sum, avg);

	//조건문
	if(90 <= avg && avg <= 100 ){
		System.out.println("등급은 A입니다");
	}else if(80 <=avg)	{
		System.out.println("등급은 B입니다");
	}else if(70 <=avg)	{
		System.out.println("등급은 C입니다");
	}else if(60 <=avg)	{
		System.out.println("등급은 D입니다");
	}else{
		System.out.println("등급은 F입니다");
	}
*/

	//[함께 푼 코드] ***********************
	String name;
	int kor, eng, mat;
	int tot;			//총점
	double avg;			//평균
	char grade = 'F';			//등급
	
	System.out.print("이름 입력 : ");
	name = br.readLine();

	System.out.print("국어 점수 : ");
	kor = Integer.parseInt(br.readLine());

	System.out.print("영어 점수 : ");
	eng = Integer.parseInt(br.readLine());

	System.out.print("수학 점수 : ");
	mat = Integer.parseInt(br.readLine());

	//총점 산출
	tot = kor + eng + mat;

	//평균 산출
	avg = tot / 3.0;		//check!
	
	//등급 산출
	

	//※두 개 이상의 조건 등장 → 논리 연산자
	//평균이 90점 이상 and 평균이 100이하
	if (avg >=90)
	{
		//등급이 A
		grade = 'A';
	}
	else if (avg>=80)
	{
		//등급이 B
		grade = 'B';
	}
	else if (avg>=70)
	{
		//등급이 C
		grade = 'C';
	}
	else if (avg>=60)
	{
		//등급이 D
		grade = 'D';
	}
	/*else if (avg<60)
	{
		//등급이 F
		grade = 'F';
	}
	*/

	//최종 결과 출력
	System.out.println();
	System.out.printf(">> 당신의 이름은 %s입니다. \n", name);
	System.out.printf(">> 국어점수는 %d, \n", kor);
	System.out.printf(">> 영어점수는 %d, \n", eng);
	System.out.printf(">> 수학점수는 %d, \n", mat);
	System.out.printf(">> 총점은 %d이고, 평균은 %.2f입니다.\n", tot, avg);
	System.out.printf(">> 등급은 %c입니다.\n", grade);

	}
}	

/*
//[내가 푼 답]
이름 입력 : 홍길동
국어 점수 : 90
영어 점수 : 80
수학 점수 : 70
국어점수는 90점,
영어점수는 80점,
수학점수는 70점,
총점은 240이고, 평균은 80입니다.
등급은 B입니다
계속하려면 아무 키나 누르십시오 . . .


//[함께 푼 답]
이름 입력 : 김나나
국어 점수 : 90
영어 점수 : 80
수학 점수 : 10

>> 당신의 이름은 김나나입니다.
>> 국어점수는 90,
>> 영어점수는 80,
>> 수학점수는 10,
>> 총점은 180이고, 평균은 60.00입니다.
>> 등급은 D입니다.
계속하려면 아무 키나 누르십시오 . . .
*/