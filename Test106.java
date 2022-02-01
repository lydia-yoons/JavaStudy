/*===============================
■■■ 정렬(sort) 알고리즘 ■■■
  ===============================*/

/*
사용자로부터 여러 학생의 성적 데이터를 입력받아
점수가 높은 순에서 낮은 순으로 등수를 부여하여
결과를 출력하는 프로그램을 구현한다.
단, 배열과 정렬 알고리즘을 활용하여 작성할 수 있도록 한다.

실행 예)
인원 수 입력 : 5
이름 점수 입력(1) : 홍길동 90
이름 점수 입력(2) : 김둘리 80
이름 점수 입력(3) : 고길동 85
이름 점수 입력(4) : 박또치 75
이름 점수 입력(5) : 마이콜 95
-----------------------
1등 마이콜 95
2등 홍길동 90
3등 고길동 85
4등 김둘리 80
5등 박또치 75
*/

import java.util.Scanner;

public class Test106{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		int p; //인원수
		int n=1;
	

		System.out.print("인원 수 입력 : ");
		p = sc.nextInt();

		String[] name = new String[p];	//이름 담기
		int[] score = new int[p];	//점수 담기
		int[] grade = new int[p];	//등수 담기
		
		do
		{
			System.out.printf("이름 점수 입력(%d) : ",n);
			name[n-1] = sc.next();
			score[n-1] = sc.nextInt();

		}
		while (n++<p);
			

	    //버블 정렬
	    boolean flag;
	    int temp;		//자리 담아 둘 변수
		String temp2;	//성적 담아 둘 변수
	    int pass=0;
		

		//향상된 Bubble Srort구현
		do
		{
			flag = false;
			pass++;
			
			for (int i=0; i<score.length-pass; i++)
			{	
								
				if (score[i]<score[i+1])	
				{					
					//점수 자리 바꾸기
					temp = score[i];
					score[i] = score[i+1];
					score[i+1] = temp;

					//이름 자리 바꾸기
					temp2 = name[i];
					name[i] = name[i+1];
					name[i+1] = temp2;

					flag = true;
					//-- 단 한번이라도 스왑(자리바꿈)이 발생하게 되면
					//		flag변수를 flase로 바꿈
				}
			}
			//테스트
			//System.out.println("웅~");

		}
		while (flag);
			
		
		//등수 구하기~~~~
		for (int i=0; i<p; i++)
		{
			grade[i]= 1;

			for (int j=0; j<p; j++ )
			{
				if (score[i]<score[j])

					grade[i] += 1;
			}
			//System.out.println("등수 ~ : "+grade[i]); //test
		}
		

		//출력하기
		System.out.println("\n--------------");
		for (int i=0; i<p; i++){
			System.out.printf("%d등 %s %d\n", grade[i],name[i], score[i]);
		}
		System.out.println("--------------");		

	}
}