/*===============================
	■■■ 자바의 주요(중요) 클래스 ■■■
	- Celendar 클래스
  ===============================*/

// ○ 실습문제
//	 오늘을 기준으로 입력받는 날짜만큼 후의 년, 월, 일, 요일을 확인하여
//	 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
// 오늘 날짜 : 2021-8-11 수요일
// 몇 일 후의 날자를 확인하고자 하십니까? : 200

// =========[확인결과]=========
//  200일 후 : xxxx-xx-xx x요일
// ============================
// 계속하려면 아무 키나 누르세요..

// ※ 현재 날짜를 기준으로 날 수를 더하는 연산 메소드
//	 『객체.add(Calendar.DATE, 날 수);』


import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class Test140{
	public static void main(String[]args){

		Scanner sc = new Scanner(System.in);
		Calendar ob = new GregorianCalendar();

		// 변수 선언
		int y, m, d, w, days;

		//요일
		String[] week = {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};


		// 현재 날짜 확인
		y = ob.get(Calendar.YEAR);
		m = ob.get(Calendar.MONTH)+1;
		d = ob.get(Calendar.DATE);
		w = ob.get(Calendar.DAY_OF_WEEK);
		
		// 오늘 날짜 출력
		System.out.println("오늘 날짜 : "+y+"-"+m+"-"+d+" "+week[w-1]);	

		do
		{
			System.out.print("몇 일 후의 날짜를 확인하고자 하십니까? : ");
			days = sc.nextInt();
		}while (days<1);

		
		// 날 수 더해주기
		ob.add(Calendar.DATE, days);


		// 날짜 재정의
		y = ob.get(Calendar.YEAR);
		m = ob.get(Calendar.MONTH)+1;
		d = ob.get(Calendar.DATE);
		w = ob.get(Calendar.DAY_OF_WEEK);


		// 출력
		System.out.println("\n===========[확인결과]===========");
		System.out.printf("%d일 후 : %d-%d-%d %s\n", days, y, m, d, week[w-1]);
		System.out.println("================================");

	}
}