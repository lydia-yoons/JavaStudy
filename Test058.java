/*======================
■■■실행 흐름의 컨트롤(제어문, 조건문과 반복문)■■■
	- 반복문(for문) 실습
	- 다중 for문(반복의 중첩)을 활용한 구구단 출력 실습
=========================*/

//○과제
// 다음과 같은 내용이 추력될 수 있도록
// 반복문의 중첩 구문을 작성하여 프로그램을 구현한다.

//실행 예)
/*
*********
 *******
  *****
   ***
	*

*/

public class Test058{
	public static void main(String[]args){
		
		int i,j,z; //변수선언

		for (i = 1; i<=5; i++ ) {

			for (z=1;z<=(i-1);z++){		 // 0 1 2 3 4 
				System.out.print(" ");
			}

			for (j=1; j<=10-(i*2)+1;j++) // 별 9 7 5 3 1
			{
				System.out.print("*"); //별 출력
			}

		System.out.println(); // 줄 바꿈
			
		}
	}
}

/*
*********
 *******
  *****
   ***
    *
계속하려면 아무 키나 누르십시오 . . .

*/