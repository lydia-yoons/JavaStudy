/*======================
■■■실행 흐름의 컨트롤(제어문, 조건문과 반복문)■■■
	- break
=========================*/

//아래와 같은 처리가 이루어지는 프고그램을 구현한다.
//단, 입력받는 정수는 1~100범위 안에서만 가능하도록 작성한다.

// 실행 예)

// 임의의 정수 입력 : -20

// 임의의 정수 입력 : 0

// 임의의 정수 입력 : 2021

// 임의의 정수 입력 : 10
// >> 1 ~ 10까지의 합 : 55
// 계속하시겠습니까(Y/N)? : y

// 임의의 정수 입력 : 100
// >> 1 ~ 10까지의 합 : 5050
// 계속하시겠습니까(Y/N)? : n
// 계속하려면 아무키나 누르세요... -> 프로그램 종료

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test060 {
	public static void main(String[]args) throws IOException {
		
/*	[내가 푼 코드]	
		//scanner 인스턴스 생성
		Scanner sc = new Scanner(System.in);
		
		//변수 선언
		int i;
		int sum=0;
		char o;
		
		for (; ; )
		{
			System.out.print("임의의 정수 입력 : ");
		    i = sc.nextInt();
			
			//1~100의 값일 때
			if (i>=1 && i <=100){
				for (int j=1; j<=i ; j++ ){
					sum += j;	// 입력값까지 합 구하기
				}
				System.out.printf(">> 1 ~ %d까지의 합 : %d\n",i,sum);

				System.out.print("계속하시겠습니까(Y/N)? : ");
				o = sc.next().charAt(0);	// y or n 값 받아오기
				if (o=='y'|| o =='Y')	{
					// 계속 하고싶다면
					sum=0;	//sum 값 0으로 만들어주기
					continue; //계속하기
				}else if (o=='n'|| o == 'N'){
					break; //멈추기			
				}else{
					System.out.println("입력 오류 : ");
					break; 
				}
			}
		}
*/
		//[함께 푼 코드]**********************
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n, s=00
			, i;
		// n : 외부로부터 사용자의 입력받을 값 담을 변수
		// s : 누적 연산 결과를 담아둘 변수
		// i : 1 부터 1씩 사용자의 입력값까지 증가할 변수


		char ch;
		//계속 진행할지 말지에 대한 의사표현 결과를 담아둘 변수
		
		//무한 반복을 수행하는 반복문
		while (true)
		{
			do
			{
				System.out.print("\n임의의 정수 입력 : ");
				n = Integer.parseInt(br.readLine());
			}
			while (n<1 || n>100);

			//test
			//System.out.println("유효한 정수 입력 완료!");
			
			s = 0; //누적합 변수의 초기화 위치	check~!!

			//누적합 산출
			for (i=1; i<n ;i++ )
			{
				s += i;
			}

			System.out.printf(">> 1 ~ %d 까지의 합 : %d\n", n, s);
			
			System.out.print("계속하시겠습니까(Y/N)? : ");
			ch = (char)System.in.read();

			//그만할래 의사표현
			// if(ch=='N' || ch=='n')
			if (ch!='Y' && ch!='y')	//논리 연산자 check!
			{
				// 반복문(while)을 빠져나갈 수 있는 코드 작성 필요
				// 위와 같은 의사표현을 했다면
				//그 동안 수행했던 반복문을 멈추고 바져나가야 한다.
				break; //멈춘다(+ 그리고 빠져나간다.) check ~!!!

			}
			
			// Y + 엔터 / y + 엔터

			// 엔터값(\r\n)처리			check~!!

			System.in.skip(2);
				

			} //end while

	} // end main()
} // end class Test060

/*
임의의 정수 입력 : -30
임의의 정수 입력 : 0
임의의 정수 입력 : 2021
임의의 정수 입력 : 10
>> 1 ~ 10까지의 합 : 55
계속하시겠습니까(Y/N)? : y
임의의 정수 입력 : 100
>> 1 ~ 100까지의 합 : 5050
계속하시겠습니까(Y/N)? : n
계속하려면 아무 키나 누르십시오 . . .

*/