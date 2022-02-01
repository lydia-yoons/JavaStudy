/*======================
■■■실행 흐름의 컨트롤(제어문, 조건문과 반복문)■■■
	- 반복문(for문) 실습
	- 다중 for문(반복의 중첩)을 활용한 구구단 출력 실습
=========================*/

// 실행 예)
/*
[2단]
2 * 1 = 2
2 * 2 = 4
2 * 3 = 6
  :
2 * 9 = 18

[3단]
3 * 1 = 3
3 * 2 = 6
3 * 3 = 9
  :
  :

[9단]
9 * 1 = 9
  :
9 * 9 = 81
계속하려면 아무 키나 누르세요...
*/		  


public class Test054{
	public static void main(String[]args){

		int i, j;

		//웅~ 웅~ 웅~ 아웃터 for문
		for (i = 2; i <=9 ; i++ ){		//단처리				→ 2 3 4 5 6 7 8 9
			System.out.printf("\n====[%d단]====\n", i);
			
			//쑝- 쑝- 쑝-
			for (j = 1 ; j <=9 ; j++){	// 곱해지는 수 처리		→ 1 2 3 4 5 6 7 8 9
				System.out.printf("%d * %d = %d\n", i, j, (i*j));
			}
		}

	}
}