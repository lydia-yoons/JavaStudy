/*======================================
	■■■ 배열 ■■■
	- 배열의 기본적 활용
  ======================================*/

// ○과제
//사용자로부터 임의의 정수를 임의의 갯수만큼 입력받아서
//입력받은 수 중에서 가장 큰 수를 출력하는 프로그램을 작성한다.
//단, 배열을 활용하여 구현할 수 있도록 한다.

//실행 예)
//입력할 데이터의 갯수 : 10
//데이터 입력(공백 구분) : 74 65 13 91 5 67 41 2 50 11
//>> 가장 큰 수 → 91
//계속하려면 아무 키나 누르세요...

import java.util.Scanner;
import java.io.IOException;

public class Test078{
	public static void main(String[]args) throws IOException {
		//Scanner인스턴스 생성
		Scanner sc = new Scanner(System.in);
		
		//변수 선언
		int n;		//데이터 갯수 변수
		int temp;	// 임시로 값 담아둘 변수
		
		System.out.print("입력할 데이터의 갯수 : ");
		n = sc.nextInt();
		
		int arr[] = new int[n];	//배열 선언(입력값 만큼)

		System.out.print("데이터 입력(공백 구분) : ");
		for (int i=0; i<n; i++){
			arr[i] = sc.nextInt();	//배열에 입력값 넣기
		}
		
		// 큰 수 판별하기
		for (int i=(n-1); i>0 ; i--) //배열 맨 뒤의 숫자와 그 앞의 숫자를 비교한다
		{
			if (arr[i-1]<arr[i]) //뒤의 수가 앞에 수보다 크다면
			{
				temp = arr[i];
				arr[i] = arr[i-1];
				arr[i-1] = temp;
			}
		}
		
		/
		System.out.printf(">> 가장 큰 수 → %d\n", arr[0]);
		
	}
}

/*
입력할 데이터의 갯수 : 10
데이터 입력(공백 구분) : 74 65 13 91 5 67 41 2 50 11
>> 가장 큰 수 → 91
계속하려면 아무 키나 누르십시오 . . .

*/