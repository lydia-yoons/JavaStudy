/*===============================
■■■ 정렬(sort) 알고리즘 ■■■
 -선택 정렬(selection sort)
  ===============================*/

/*
○ 정렬
	: 데이터를 특정한 규칙(기준)에 맞게 순서대로 나열(오름차순, 내림차순)

○ 정렬의 목적
	: 데이터 처리 과정의 편의성이나 가독성을 높이기 위함
	→ 보기 좋게.. 검색하기 위함

○ 정렬의 종류
	: 선택 정렬, 버블 정렬, 삽입 정렬, 힙 정렬, 퀵 정렬, 쉘 정렬...
*/

// 실행 예)
// Source Data : 52 42 12 62 60
// Source Data : 12 42 52 60 62
// 계속하려면 아무키나 누르세요..


public class Test103{
	public static void main(String[]args){
		int[] a = {52, 42, 12, 62, 60};
		/*
		42 52 12 62 60		  0		1
		== --
		12 52 42 62 60		  0		2
		==    --
		12 52 42 62 60		  0		3
		==       --
		12 52 42 62 60		  0		4
		==          --
		------------------------------------1회전(웅~)

		12 42 52 62 60		  1		2
		   == --
		12 42 52 62 60		  1		3
		   ==    --
		12 42 52 62 60		  1		4
		   ==       -- 
		------------------------------------2회전

		12 42 52 62 60		  2		3
		      == --
	    12 42 52 62 60		  2		4
		      ==    --
	    ------------------------------------3회전

		 12 42 52 60 62		  3		4
		          == --
		------------------------------------회전 끝

		*/
/*	[내가 푼 코드]	
		int temp=0;

		for (int i=0; i<a.length ; i++)
		{
			for (int j=0; j<i ; j++)
			{
				if (a[i]<a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}else{
					continue;
				}
				
			}		
			
		}
		
		
		for (int i =0; i<a.length; i++)
		{
			System.out.print(" "+a[i]);
		}
*/ 

		// [함께 푼 코드]*****************************
		int i, j;
		
		System.out.print("Source Data : ");
		/*
		for(i=0; i<a.length; i++)
			System.out.print(a[i]+" ");
		System.out.println();
		// ==> Source Data : 52 42 12 62 60
		*/

		// 향상된 for문 (forEach 문)
		for(int n: a)
			System.out.print(n + " ");
		System.out.println();
		// ==> Source Data : 52 42 12 62 60

		for (i=0; i<a.length-1 ; i++ )	//웅~(비교기준 데이터) →0    1   2  3
		{
			for (j=i+1; j<a.length ; j++)			//쑝~ (비교대상 데이터)→1234 234 34 4
			{
				if(a[i] > a[j]){
					// 자리바꾸기
					a[i] = a[i]^a[j];
					a[j] = a[j]^a[i];
					a[i] = a[i]^a[j];

				}
			}
		}


		
		System.out.print("Source Data : ");
		/*
		for(i=0; i<a.length; i++)
			System.out.print(a[i]+" ");
		System.out.println();
		*/
		for(int n : a)
			System.out.print(n + " ");
		System.out.println();
		// ==> Source Data : 52 42 12 62 60



	}
}

/*
Source Data : 52 42 12 62 60
Source Data : 12 42 52 60 62
계속하려면 아무 키나 누르십시오 . . .
*/