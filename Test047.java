/*======================
■■■실행 흐름의 컨트롤(제어문, 조건문과 반복문)■■■
	- 반복문(while) 실습
=========================*/

//사용자로부터 임의의 두 정수를 입력받아
//작은 수 부터 큰 수 까지의 합을 구하여
//결과를 출력하는 프로그램을 구현한다.

//실행 예)
//첫 번째 정수 입력 : 10
//두 번째 정수 입력 : 20
// >> 10 ~ 20까지의 합 : xxx
// >> 계속하려면 아무키나..

// 첫번째 정수 입력 : 10
// 두 번째 정수 입력 : 2
// >> 2 ~ 10까지의 합 : 54
// >> 계속하려면 아무키나..

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test047{
	public static void main(String[]args) throws IOException {
		//BufferedReader 인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
/* ①
		//변수 선언
		int a, b;
		int sum=0, temp; 

		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());

		if (a < b)	// 첫번째 수가 두번째 수보다 작을 경우
		{
			temp = a;

			while (temp <=b)
			{
				sum += temp;
				temp++;
			}
			
		}
		else if (a > b)	//첫번째 수가 두번째 수보다 클 경우
		{
			temp = b;

			while ( temp <=a )
			{
				sum += temp;
				temp++;
			}
		}
		else if ( a == b) // 입력한 두 수가 같을 경우
		{
			System.out.println("두 값이 같습니다.");
		}else{
			System.out.println("입력 오류");
		}

		System.out.printf(">>%d ~ %d까지의 합 : %d\n", a , b, sum);
*/

/*		//②
		int a, b, sum, temp;

		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());

		if (a > b)	//작은순으로 숫자 정렬
		{
			a = a^b;
			b = b^a;
			a = a^b;
		}

		temp = a;

		while (temp <= b)
		{
			sum += temp;
			temp ++;
		}

		//결과 출력
		System.out.printf(">>%d ~ %d까지의 합 : %d\n", a , b, sum);
*/


		//[함께 푼 코드]*******************************************
		//○주요 변수 선언
		int n;				//루프 변수로 활용할 변수
		int su1, su2;		//첫 번째, 두 번째 입력값을 담을 변수
		int result = 0;		//누적합을 담을 변수

		//○연산 및 처리
		System.out.print("첫 번째 정수 입력 : ");
		su1 = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		su2 = Integer.parseInt(br.readLine());

		//입력받은 두 수의 크기 비교 및 자리 바꿈
		// 즉, su1이 su2보다 큰 경우 두 수의 자리를 바꿀 수 있도록 처리
		if (su1>su2)
		{
			//자리 바꿈
			su1 = su1^su2;
			su2=su2^su1;
			su1=su1^su2;
		}

		//반복 연산 수행
		//반복 연산을 수행하기 전에 작은수를 따로 저장하여
		// 루프변수로 활용해야한다.
		//(결과 추력 과정에서 필요하기 때문에)
		n = su1;

		while (n<=su2)
		{
			result += n;
			n++;
		}


		//○결과 출력
		System.out.printf(">> %d ~ %d 까지의 합 : %d\n", su1, su2, result);

	}
}

/*
첫 번째 정수 입력 : 10
두 번째 정수 입력 : 2
>>10 ~ 2까지의 합 : 54
계속하려면 아무 키나 누르십시오 . . .
*/