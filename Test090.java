/*======================================
	■■■ 배열 ■■■
	- 배열과 난수 처리
  ======================================*/

// ※ Random 클래스 활용

// 사용자로부터 임의의 정수를 입력받아
// 그 정수만큼의 난수(1~100)를 발생시켜 배열에 담고
// 배열에 담겨있는 데이터들 중
// 가장 큰 값과 가장 작은 값을 선택하여
// 결과를 출력하는 프로그램을 구현한다.

//실행 예)
/* 발생시킬 난수의 갯수 입력 : 6
(53 17 69 45 10 55 → 무작위로 발생한 정수들..)
(int[] arr = {53, 17, 69, 45, 10, 55} → 배열에 담아내기(배열구성))
가장 큰 값 : 69, 가장 작은 값 : 10
계속하려면....
*/

import java.util.Scanner;
import java.util.Random;

public class Test090{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		//안내 메세지 출력
		System.out.print("발생시킬 난수의 갯수 입력 : ");
		int size = sc.nextInt();

		//size 변수에 담아낸 수 만큼의 배열방 만들기
		// (배열 선언 및 메모리 할당)
		int[] arr = new int[size];

		// 무작위숫자(난수)를 발생시키기 위해서는
		// 난수 발생 전용 객체가 필요하다.
		// → 『java.util.Random』
		Random rd = new Random();

		// ※ Random 클래스의 『nextInt(int n)』메소드
		//	0 ~ 매개변수로 넘겨받은 정수 n-1까지의 수 중
		//	무작위 정수(난수) 1개를 발생시킨다.

		//test
		//System.out.println("발생한 난수 :"+rd.nextInt(10));
		//-- 0~10까지의 무작위 정수 한 개 ~!
		//System.out.println("발생한 난수 :"+rd.nextInt(5));
		//-- 0~5까지의 무작위 정수 한 개 ~!

		//1~100까지의 무작위 정수 한 개
		//System.out.println(rd.nextInt(100)+1);
		
		//배열구성
		for (int i=0; i<size; i++)		// size = 6 → 0 1 2 3 4 5
		{
			arr[i] = rd.nextInt(100)+1;
		}
		// rd.nextInt(100) → 0 ~ 99까지의 무작위 정수 한 개 발생
		// rd.nextInt(100)+1 → 1 ~ 100까지의 무작위 정수 한 개 발생

		//테스트 → 구성된 배열의 전체 요소 추력
		// 최종결과 확인 후 주석처리
		//for (int i=0; i<arr.length; i++)
		//	System.out.print(arr[i]+" ");
		//System.out.println();
		// ==> 30 73 27 37 56 89 7 22 41 64		//랜덤으로 10개 출력
		//	   21 49 47 42 1 14 25 67 96 88
	
		// 가장 큰 값, 가장 작은 값 확인
		int max, min;			// 최대값, 최소값
		min=max=arr[0];
		
		for (int i=1; i<arr.length; i++)
		{
			if (max<arr[i])
			{
				max = arr[i];
			}
			if (min>arr[i])
			{
				min = arr[i];
			}
		}

		//결과 추력
		System.out.printf("가장 큰 값 : %d, 가장 작은 값 : %d\n ", max, min);
	
	}
	
}

/*
발생시킬 난수의 갯수 입력 : 10
10 31 35 63 69 94 57 44 54 36
가장 큰 값 : 94, 가장 작은 값 : 10
 계속하려면 아무 키나 누르십시오 . . .

 발생시킬 난수의 갯수 입력 : 10
13 11 22 79 65 60 69 78 42 24
가장 큰 값 : 79, 가장 작은 값 : 11
 계속하려면 아무 키나 누르십시오 . . .
 */