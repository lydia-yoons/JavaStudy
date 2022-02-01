/*======================================
	■■■ 배열 ■■■
	- 배열의 기본적 활용
  ======================================*/

// ○과제
//사용자로부터 학생수를 입력받고
//그 만큼의 점수(정수 형태)를 입력받아
//전체 학생 점수의 합, 평균, 편차를 구하여
//결과를 출력하는 프로그램을 구현한다.
//단, 배열을 활용하여 처리할 수 있도록 한다.

//실행 예)
// 학생 수 입력 : 5
// 1번 학생의 점수 입력 : 90
// 2번 학생의 점수 입력 : 82
// 3번 학생의 점수 입력 : 64
// 4번 학생의 점수 입력 : 36
// 5번 학생의 점수 입력 : 98

//>> 합 : 370
//>> 평균 : 74.0
//>> 편차
// 90 : 16.0
// 82 : 8.0
// 64 : -10.0
// 36 : -38.0
// 98 : 24.0
// 계속하려면 아무키나 누르세요...

import java.util.Scanner;
import java.io.IOException;

public class Test079{
	public static void main(String[]args) throws IOException {
		//Scanner인스턴스 생성
		Scanner sc = new Scanner(System.in);
		
		//변수 선언
		int n; 
		int sum =0;			//합
		double avg = 0;		//평균
		double result = 0;	//편차

		//배열 선언
		int[] arr;


		System.out.print("학생 수 입력 : ");
		n = sc.nextInt();
		arr = new int[n];	//배열 값 지정
		
		for (int i=0; i<n; i++)
		{
			System.out.printf("%d번 학생의 점수 입력 : ", i+1);
			arr[i] = sc.nextInt();
			sum += arr[i]; //합계
		}
		
		avg = sum/n; //평균
		
		//출력하기
		System.out.println(">> 합 :"+sum);
		System.out.println(">> 평균 :"+avg);
		System.out.println(">> 편차 : ");
		for (int i=0; i<n; i++)
		{
			System.out.printf("%d : %2.2f\n",arr[i],(arr[i]-avg));
		}
		
	}
}

/*
학생 수 입력 : 5
1번 학생의 점수 입력 : 90
2번 학생의 점수 입력 : 82
3번 학생의 점수 입력 : 64
4번 학생의 점수 입력 : 36
5번 학생의 점수 입력 : 98
>> 합 :370
>> 평균 :74.0
>> 편차 :
90 : 16.00
82 : 8.00
64 : -10.00
36 : -38.00
98 : 24.00
계속하려면 아무 키나 누르십시오 . . .
*/