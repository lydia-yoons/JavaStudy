/*======================
---[[자바기본 프로그래밍]]---
	-퀴즈
	 삼각형의 밑변의 길이와 높이를 사용자로부터 입력받아
	 이 삼각형의 넓이를 구하는프로그램을 구현한다.
=========================*/


// 실행 예)
// [[삼각형의 넓이 구하기]]
// - 삼각형의 밑변 입력 : 3
// - 삼각형의 높이 입력 : 5
// >> 밑변이 3, 높이가 5인 삼격형의 넓이 : xxxx

// ※삼각형의 넓이 = 밑변 * 높이 /2
//					------------ 부분을 사용자로부터 
//								입력받아 처리 -> BufferedReader 활용

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test012{
	public static void main(String[]args) throws IOException{
		
		/* [내가 푼 코드]
		// 입력받을 준비
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int a, b;
		double c; //변수 선언

		System.out.print("- 삼각형의 밑변 입력 : ");
		a = Integer.parseInt(br.readLine()); //밑변 값 입력받기

		System.out.print("- 삼각형의 높이 입력 : ");
		b = Integer.parseInt(br.readLine()); //높이 입력 받기

		c = (double)(a * b) / 2; //삼각형 넓이 계산
	
		//System.out.println(">> 밑변이 "+ a + ", 높이가 " + b + "인 삼각형의 넓이 : " + c);
		System.out.printf(">> 밑변이 %d, 높이가 %d인 삼각형의 넓이 : %.2f \n", a,b,c);
		*/

		//[함께 풀이한 내용]
		
		//○주요 변수 선언
		
		//BufferedReader 인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		int bottomLength, height;	//--밑변과 높이
		double area;				//--넓이		check!

		//○연산 및처리
		//① 사용자에게 안내 매세지출력하기
		System.out.println("[[삼각형의 넓이 구하기]]");
		System.out.print("- 삼각형의 밑변 입력 : ");

		//② 사용자가 입력한 데이터를 정수 형태로 변환한 후,
		//	변수 bottomLength에 담아내기
		bottomLength = Integer.parseInt(br.readLine());

		//③ 다시 사용자에게 안내 메세지 출력
		System.out.print("- 삼각형의 높이 입력 : ");

		//④ 사용자가 입력한 데이터를 정수형태로 변환 한 후,
		//  변수 height에 담아내기
		height = Integer.parseInt(br.readLine());

		//⑤ 값이 채워진(담겨진) 변수들을 활용하여
		// 삼각형의 넓이를 구하는 연산 수행
		//area = bottomLength * height / 2;
		//		정수형		  정수형  정수형 -> 정수기반 연산

		area = bottomLength * height / 2.0;		// check !
		//		실수형		  실수형  실수형 -> 실수기반 연산

		// ※실수 자료형이 결과값으로 산출되는 과정에서
		//	실수 기반의 연산이 필요한 상황이다.
		//	정수형 2가 아닌 실수형 2.0으로 나눗셈 연산을 수행하게 되면
		// 이 연산은 실수 기반으로 처리된다.
		
		//○결과 출력
		System.out.println();	//개행
		//System.out.printf();	//매개변수 없을경우 에러발생

		System.out.printf(">> 밑변이 %d, 높이가 %d인 삼각형의 넓이 : %.2f \n"
							, bottomLength,height,area);

	}
}

/*
[내 결과]
- 삼각형의 밑변 입력 : 3
- 삼각형의 높이 입력 : 5
>> 밑변이 3, 높이가 5인 삼각형의 넓이 : 7.50
계속하려면 아무 키나 누르십시오 . . .

[함께한 결과]
[[삼각형의 넓이 구하기]]
- 삼각형의 밑변 입력 : 15
- 삼각형의 높이 입력 : 15

>> 밑변이 15, 높이가 15인 삼각형의 넓이 : 112.50
계속하려면 아무 키나 누르십시오 . . .
*/