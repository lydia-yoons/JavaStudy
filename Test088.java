/*======================================
	■■■ 배열 ■■■
	- 배열의 배열(2차원  배열)
  ======================================*/

// ○과제
//배열의 배열(다차원 배열)을 활용하여
//다음과 같은 데이터를 요소로 취하는 배열(5x5)을 구성하고
//그 결과를 출력하는 프로그램을 구현한다.

//실행 예)
/*
A	
B	C	
D	E   F	
G	H	I	J
K	L	M	N	O

계속하려면 아무 키나 누르세요...
*/

/*
00
10	11
20	21	22
30	31	32	33
40	41	42	43	44
*/


public class Test088{
	public static void main(String[]args){
		//배열의 배열 선언 및 메모리 할당
		char[][] arr = new char[5][5];

		char a = 'A';

		//배열의 배열 각 방에 요소 채워 넣기
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				if (i>=j)
				{
					arr[i][j] = a++;
				}
			}
			
		}

		//배열 전체 요소 출력
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				System.out.printf("%3c",arr[i][j]);
			}
			System.out.println();
		}

	}
	
}

/*
  A
  B  C
  D  E  F
  G  H  I  J
  K  L  M  N  O
계속하려면 아무 키나 누르십시오 . . .

*/