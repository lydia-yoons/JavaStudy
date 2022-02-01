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
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Test139_1{
	public static void main(String[]args) throws IOException {
		// Buffered 인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// Calendar 인스턴스 생성
		Calendar cal = Calendar.getInstance();

		// 주요변수 선언
		int y, m;	//-- 년, 월
		int w;		//-- 요일
		int i;		//-- 달력을 그리는 과정에서 ...
		
		do
		{
			System.out.print("연도 입력 : ");
			y = Integer.parseInt(br.readLine());
		}
		while (y<1);
		
		do
		{
			System.out.print("월 입력 : ");
			m = Integer.parseInt(br.readLine());

		}
		while (m<1 || m>12);
		
		
		// 사용자로부터 입력받은 년, 월을 이용하여
		// 달려긔 날짜 세팅

		// 달력의 날짜 세팅 → 『set()』메소드 활용
		cal.set(y, m-1, 1);	// 월은 -1
		//-- 월 구성시 입력값(m)을 그대로 사용하는 것이 아니라
		//	 입력값에서 1을 뺀 값으로 월을 설정해야한다.
		//-- 일 구성 시 입력받은 연, 월에 해당하는 1일로 설정해야한다.
		//	 그 날의 요일 확인을 위해서...

		//요일 가져오기
		w = cal.get(Calendar.DAY_OF_WEEK);	//시작 요일 셋팅하기

		//테스트
		//System.out.println(w);
		// ==> 연도입력 : 2021
		//		월 입력 : 8
		//		1 → 2021년 8월 기준 →  일요일 →  2021년 8월 1일은 일요일~!!
	
		

		//출력하기
		System.out.println();
		System.out.printf("	[%d년 %d월]	\n",y,m);
		System.out.println(" 일  월  화  수  목  금  토");
		System.out.println("============================");
		
		//특정 요일부터 1일이 출발할 수 있도록 공백 발생(지정)
		for (i=1; i<w; i++)
			System.out.print("    ");	//공백 4칸 발생
		
		// ※ Calendar의 getActualMaximum() 메소드
		//System.out.println(cal.getActualMaximum(Calendar.DATE));

		for (i=1; i<cal.getActualMaximum(Calendar.DATE) ; i++)
		{
			System.out.printf("%4d", i);
			w++;			//-- 반복문을 수행하며 날짜가 증가할 때 마다
							//	 요일도 함께 증가할 수 있도록 처리

			if (w%7==1)		//-- 증가한 요일이 일요일이 될 때 마다 개행 후 출력
			{
				System.out.println();		//-- 개행
			}
		}

		if (w%7!=1)
			System.out.println();
		
		System.out.println("============================");

		
	}
}