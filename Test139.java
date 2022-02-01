/*===============================
	■■■ 자바의 주요(중요) 클래스 ■■■
	- Celendar 클래스
  ===============================*/

/*
○ java.util.Calendar 클래스는
	날짜와 시간을 객체 모델링화 한 클래스로
	연, 월, 일, 요일, 시, 분, 초까지의
	시간과 날짜와 관련된 정보를 제공하낟.
	그리고, Calendar클래스는 추상클래스이므로 직접 객체를 생성할 수 없으며
	실제적인 메소드 구현은 Calendar 클래스의 서브 클래스인
	GregorianCalendar클래스에 정의되어 있다.

	시스템으로부터 현재 시스템 시간 정보를 얻어올 때
	getInstance()라는 정적(static)메소드를 이용하여 객체를 생성할 수 있다.
	생성된 Calnedar클래스 객체는 시스템의 현재 날짜와 시간 정보를 가지며,
	이 객체가 생성되면 갖고있는 시간 정보들은
	get()메소드를 이용하여 쉽게 가져올(사용할) 수 있다.

	getInstance()메소드는 내부적으로 GregorianCalendar객체를 생성하여
	돌려주기때문에 GregorianCalendar 객체를 직접 생성하여 시간 정보를
	구할 수도 있다.


*/

// ○ 실습문제
//   사용자로부터 연, 월을 입력받아
//	 달력을 그려주는(출력하는) 프로그램을 구현한다.
//	 단, 만년달력이 아니라 Calendar클래스를 활용하여 작성할 수 있도록 한다.

// 실행 예)
// 연도 입력 : 0
// 연도 입력 : 2021 
// 월 입력 : -2
// 월 입력 : 16
// 월 입력 : 8

 /*
			[2021년 8월]

   일   월   화   수   목   금   토
 ===================================
    1    2    3    4    5    6    7
    8    9   10   11   12   13   14
   15   16   17   18   19   20   21
   22   23   24   25   26   27   28 
   29   30   31
 ===================================
 
 
 */



import java.util.Calendar;
import java.util.Scanner;
import java.util.GregorianCalendar;

public class Test139{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		int y, m;
		
		do
		{
			System.out.print("연도 입력 : ");
			y = sc.nextInt();
		}
		while (y<1);
		
		do
		{
			System.out.print("월 입력 : ");
			m = sc.nextInt();

		}
		while (m<1||m>12);
		
		
		Calendar rightNow = new GregorianCalendar();

		// 달력의 날짜 세팅 → 『set()』메소드 활용
		rightNow.set(y, m-1, 1);	// 월은 -1

		int d = rightNow.get(Calendar.DAY_OF_WEEK);	//시작 요일 셋팅하기
		int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		if (y%4==0 && y%100!=0 || y%400==0)	//윤년
		{
			months[1] = 29;
		}
		

		//출력하기

		System.out.printf("		[%d년 %d월]		\n",y,m);
		System.out.printf("   일   월   화   수   목   금   토\n");
		System.out.printf("====================================\n");
		
		//특정 요일부터 1일이 출발할 수 있도록 공백 발생(지정)
		for (int i=1; i<d; i++)
		{
			System.out.print("   ");	//공백 3칸 발생
		}


		for (int i=1; i<months[d-1]; i++ )
		{
			System.out.printf("%d",i);

			if ((i+d-1)%7==0)  
			{
				System.out.println();
			}

		}

		
		
		System.out.println();
		System.out.printf("====================================\n");

	




		
	}
}