/*===============================
	■■■ 자바의 주요(중요) 클래스 ■■■
	- String 클래스
  ===============================*/



public class Test133{
	public static void main(String[]args){

		String s = "seoul korea";
		System.out.println(s);
		// ==> seoul korea

		// ○ 문자열 추출
		System.out.println(s.substring(6, 9));
		// ==> kor
		//-- 『String.substring(s,e)』
		//	 String문자열을 대상으로
		//   s번째에서... e-1번째까지
		//	 (단, 인덱스는 0부터 시작)

		System.out.println(s.substring(7));
		// ==> orea
		//-- 『String.substring(s)』
		//	 String문자열을 대상으로
		//   s번째에서 끝까지...(즉, 문자열이 가진 길이 만큼...)

		// ○문자열의 데이터(값) 비교
		System.out.println(s.equals("seoul korea"));
		System.out.println(s.equals("Seoul Korea"));
		// ==> true
		//	   flase
		//-- 대소문자 구분

		System.out.println(s.equalsIgnoreCase("Seoul KOrea"));
		//==> true
		//-- 대소문자 구분 안함
		
		// ○ 찾고자하는 대상 문자열(s)에
		//	  『kor』문자열이 존재할까?
		//	  존재한다면.. 그 위치는 어떻게 될까?

		// "seoul korea"
		System.out.println(s.indexOf("kor"));
		// ==> 6	(6번째에 값이 들어있다)

	
		System.out.println(s.indexOf("ea"));
		// ==> 9

		System.out.println(s.indexOf("e"));
		// ==> 1	('e'가 2개지만, 앞에서부터 스캐닝 하기때문에 1개 스캔하면 끝남)

		System.out.println(s.indexOf("tt"));
		// ==> -1	(해당 문자가 없으므로 음수가 나온다.)
		//-- 찾고자 하는 문자열이 대상 문자열에 존재하는 경우
		//	 그 문자열의 인덱스를 반환하지만
		//	 존재하지 않을 경우 음수를 반환하게 된다. (-1)

		// ○ 대상 문자열(s)이 『rea』로 끝나는지 여부 확인
		//		(true / false)
		System.out.println(s.endsWith("rea"));
		// ==> true

		System.out.println(s.endsWith("oul"));
		// ==> false

		// ○ 찾고자하는 대상 문자열(s)에
		//	  『e』문자열이 존재할까?
		//	  존재한다면 그 위치는 어떻게 될까?
		//	  (단, 뒤에서부터 검사)

		// seoul korea
		System.out.println(s.indexOf("e"));
		//==> 1			(seoul에 있는 e를 찾아줌)

		System.out.println(s.indexOf("o"));
		//==> 2			(seoul에 있는 o를 찾아줌)

		System.out.println(s.lastIndexOf("e"));
		//==> 9

		System.out.println(s.lastIndexOf("o"));
		//==> 7


		// ○ 대상 문자열(s)중
		//	  『6』번째 인덱스 위치의 문자는?

		// seoul korea
		System.out.println(s.charAt(6));
		//==> k

		System.out.println(s.charAt(10));
		//==> a

		//System.out.println(s.charAt(22));
		//==> 에러발생(런타임 에러)
		//		→ StringIndexOutOfBoundsException


		// ○ 대상 문자열(s)과 비교문자열 『seoul corea』중
		//	  어떤 문자열이 더 큰가?
		//	  두 문자열이 다르다면 차이를 확인 (→ 사전식 배열)

		System.out.println(s.compareTo("seoul korea"));
		//==> 0
		
		System.out.println(s.compareTo("seoul corea"));
		//==> 8 (c ~ k → defghijk)


		// ○ 대상 문자열(s) 중
		//	  해당 문자열을 찾아서 원하는 형태로 수정
		s = "우리나라 대한민국 대한독립 만세";
		s = s.replaceAll("대한", "자주");
		System.out.println(s);
		//==> 우리나라 자주민국 자주독립 만세


		// ○ 공백 제거
		s = "		사		랑		";
		System.out.println(":"+s+":"); // :은 양쪽 공백을 알기위해서..
		//==> :               사              랑              :

		System.out.println(":"+s.trim()+":");
		//==> :사             랑:
		//-- 양쪽 가장자리 공백제거

		System.out.println(":"+s.replaceAll("\t","")+":");
		//==> :사랑:		(space바 공백은 " " 라고 넣어주면 됨)

		//int n = Integer.parseInt("30");
		s = Integer.toString(30);
		System.out.println(s);
		//==> 30

		int n = 2345678;
		System.out.printf("%d",n);
		System.out.format("%d",n);
		//==> 23456782345678

		 s = String.format("%d",n);
		 System.out.println(s);
		 //==> 2345678

		 s = String.format("%,d",n);
		 System.out.println(s);
		 //==> 2,345,678

		 System.out.printf("%.2f",3.141592);
		 System.out.println();

		 s = String.format("%.2f",3.141592);	//"3.14"  문자열로 반환한다.
		 System.out.println("s출력 : " +s);
		 //==> s출력 : 3.14


		 String[] sArray = "기본,열정,배려".split(",");
		
		 for (String str : sArray )
		 {
			System.out.print(str+"  ");
		 }
		 System.out.println();
		 //==> 기본  열정  배려
		
	}
}