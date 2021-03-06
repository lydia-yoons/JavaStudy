/*======================================
	■■■ 배열 ■■■
	- 배열의 배열(2차원  배열)
  ======================================*/

//배열의 배열(다차원 배열)을 활용하여
//다음과 같은 데이터를 요소로 취하는 배열(5x5)을 구성하고
//그 결과를 출력하는 프로그램을 구현한다.

//실행 예)
/*
 1	2  3  4  5 
 5  1  2  3  4
 4  5  1  2  3
 3  4  5  1  2
 2  3  4  5  1
계속하려면 아무 키나 누르세요...
*/

/*
 1	2  3  4  5		→ i=0		n=1		0부터 출발 [0][0] / [0][1] / [0][2] / [0][3] / [0][4]
 5  1  2  3  4		→ i=1		n=1		1부터 출발			[1][1] / [1][2] / [1][3] / [1][4] / [1][0]
 4  5  1  2  3		→ i=2		n=1		2부터 출발					 [2][2] / [2][3] / [2][4] / [2][0] / [2][1]
 3  4  5  1  2		→ i=3		n=1		3부터 출발							  [3][3] / [3][4] / [3][0] / [3][1] / [3][2]
 2  3  4  5  1		→ i=4		n=1		4부터 출발									   [4][4] / [4][0] / [4][1] / [4][2] / [4][3]

*/


//한 칸씩 뒤로 보낸다.

public class Test083{
	public static void main(String[]args){
		//배열의 배열 선언 및 메모리 할당
		int[][] arr = new int[5][5];

/*[내가 푼 코드 => 못 풀었음 ㅜ]
		for (int i=0; i<arr.length ; i++)	//웅 → outer → 0			 1			2		    3		4
		{	
			int n = 1;

			for (int j=i ; j<arr[i].length ; j++)	//쑝 → inner → 0 1 2 3 4 / 0 1 2 3 4 /0 1 2 3 4 / ...
			{
				
				arr[i][j] = n;
				n++;

				if (j==5)
				{
					j=0;
				}
				
				System.out.println(i+", "+j+" : " + arr[i][j]);//test	
				}
				//System.out.println(i+", "+j+" : " + arr[i][j]);//test

			}

			//System.out.println(i+", "+j+" : " + arr[i][j]);	//test

*/

			//함께 푼 코드************************************
			
			//배열의 배열 각 방에 데이터(요소)담아내기
			for (int i=0; i<arr.length ; i++)	//웅 → outer → 0			 1			2		    3		4
			{
				for (int j=i, n=1; n<=5; n++)	//쑝~ → 00
				{
					arr[i][j] = n;			// 00 → 1		11 → 1		22 → 1		33 → 1
											// 01 → 2		12 → 2		23 → 2		34 → 2
											// 02 → 3		13 → 3		24 → 3		30 → 3
											// 03 → 4		14 → 4		20 → 4		31 → 4
											// 04 → 5		15 → 5		21 → 5		32 → 5
											//       (n이 5가 될때까지)
					j++;
					
					if (j==5)				//				 위의 1,5에서 5가 아니라 1,0이 된다
						j=0;				// 04 → 5		10 → 1
				}
				
			}



			//배열의 배열 전체 요소 
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
  1  2  3  4  5
  5  1  2  3  4
  4  5  1  2  3
  3  4  5  1  2
  2  3  4  5  1
계속하려면 아무 키나 누르십시오 . . .*/
