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
 2  3  4  5  6
 3  4  5  6  7
 4  5  6  7  8
 5  6  7  8  9
계속하려면 아무 키나 누르세요...
*/

/*
n
↓
1 2 3 4 5		i = 0 → n이 1부터 시작 → n=i+1
2 3 4 5 6		i = 1 → n이 2부터 시작 → n=i+1
3 4 5 6	7		i = 2 → n이 3부터 시작 → n=i+1
4 5 6 7 8		i = 3 → n이 4부터 시작 → n=i+1
5 6	7 8 9		i = 4 → n이 5부터 시작 → n=i+1
*/

public class Test082{
	public static void main(String[]args) {
		int[][] arr = new int[5][5];
	

		for (int i = 0 ; i<arr.length ; i++) //웅 → outer → 0			 1			2		    3		4
		{
			int n = i+1;

			//System.out.println("n의 값 >> "+n); //test

			for (int j = 0; j<arr[i].length ; j++) //쑝 → inner → 0 1 2 3 4 / 0 1 2 3 4 /0 1 2 3 4 / ...
			{
				arr[i][j] = n;
				//System.out.println(i+", "+j+" : "+"= "+n); //test
				n++;
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
  2  3  4  5  6
  3  4  5  6  7
  4  5  6  7  8
  5  6  7  8  9
계속하려면 아무 키나 누르십시오 . . .
*/