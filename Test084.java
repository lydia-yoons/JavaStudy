/*======================================
	■■■ 배열 ■■■
	- 배열의 배열(2차원  배열)
  ======================================*/

//배열의 배열(다차원 배열)을 활용하여
//다음과 같은 데이터를 요소로 취하는 배열(5x5)을 구성하고
//그 결과를 출력하는 프로그램을 구현한다.

//실행 예)
/*
 1	8   9  16  17		00	01	02	03	04	
 2	7  10  15  18		10	11	12	13	14
 3  6  11  14  19		20	21	22	23	24
 4  5  12  13  20		30	31	32	33	34
계속하려면 아무 키나 누르세요...
*/
	
	
public class Test084{
	public static void main(String[]args){
		//배열의 배열 선언 및 메모리 할당
		int[][] arr = new int[4][5];	

		// 배열의 배열 각 요소에 값 담아내기
		int n=0;
		for (int i=0; i<5 ; i++)	// i(열) → 0 1 2 3 4
		{
			for (int j=0; j<4 ; j++) // j(행) → 0 1 2 3
			{
				n++;
				if (i%2==0) //i(열) → 0 2 4 일때
				{
					arr[j][i] = n;		// 00 → 1				02 → 9			04 → 17
										// 10 → 2				12 → 10		14 → 18
										// 20 → 3				22 → 11		24 → 29
										// 30 → 4				32 → 12		34 → 20

				}else{		//i(열) → 1 3 일때
					arr[3-j][i] = n;	//	(3-j)
										//	(3-0)1 → 3,1 → 5				(3-0)3 → 3,3 → 13
										//  (3-1)1 → 21 → 6				(3-1)3 → 23 → 14
										//  (3-2)1 → 11 → 7				(3-1)3 → 23 → 15
										//  (3-3)1 → 01 → 8				(3-1)3 → 23 → 16

				}
			}
		}


		// 배열의 배열 전체 요소 출력
		for (int i = 0; i<arr.length ; i++)
			{
				for (int j=0; j<arr[i].length ; j++)
				{
					System.out.printf("%3d",arr[i][j]);
				}
				System.out.println();
			}
	
	}
}

/*
  1  8  9 16 17
  2  7 10 15 18
  3  6 11 14 19
  4  5 12 13 20
계속하려면 아무 키나 누르십시오 . . .
*/