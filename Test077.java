/*======================================
	■■■ 배열 ■■■
	- 배열의 선언과 초기화
	- 배열의 기본적 활용
  ======================================*/

// 사용자로부터 처음 입력받은 인원 수 만큼의
// 학생 이름과 전화번호를 입력받고
// 입력받은 내용을 전체 출력하는 프로그램을 구현한다.
// 단, 배열을 활용하여 처리할 수 있도록 한다. (이름, 전화번호 배열 따로 처리)

// 실행 예)
// 입력 처리할 학생 수 입력(명, 1~10) : 24
// 입력 처리할 학생 수 입력(명, 1~10) : 3
// 이름 전화번호 입력[1](공백 구분) : 홍길동 010-1111-1111
// 이름 전화번호 입력[2](공백 구분) : 김둘리 010-2222-2222
// 이름 전화번호 입력[3](공백 구분) : 고길동 010-3333-3333

//---------------------
// 전체 학생 수 : 3명
//---------------------
// 이름		전화번호
//홍길동 010-1111-1111
//김둘리 010-2222-2222
//고길동 010-3333-3333
//---------------------
//계속하려면 아무 키나 누르세요...

import java.util.Scanner;

public class Test077{
	public static void main(String[] args){
		//Scanner 인스턴스 생성
		Scanner sc = new Scanner(System.in);

/*[내가 푼 방법]
		//변수 선언
		int a; //사람 수 
		String[] name;	//이름 배열
		String[] num;	//번호 배열

		do
		{
			System.out.print("입력 처리할 학생 수 입력(명, 1~10) : ");
			a = sc.nextInt();
			name = new String[a];	//사람 수 만큼 배열지정
			num = new String[a]; //사람 수 만큼 배열지정
		}
		while (a<1 || 10<a);	// 1~10 사이값만 받는다

		for (int i=0; i<name.length; i++)
		{
			System.out.printf("이름 전화번호 입력[%d](공백 구분) :", i+1);
			name[i] = sc.next(); //이름 받기
			num[i] = sc.next();  // 번호 받기
		}
		System.out.println();
		System.out.println("---------------------");
		System.out.println("전체 학생 수 : "+a+"명");
		System.out.println("---------------------");
		System.out.println(" 이름	전화번호 ");
		for (int i=0; i<name.length; i++)
		{
			System.out.println(name[i]+"  "+num[i]);
		}
		System.out.println("---------------------");
*/

		// 사용자가 입력하는 학생수를 담아 둘 변수
		int memCount = 0;
		
		do
		{
			System.out.print("입력 처리할 학생 수 입력(명, 1~10) : ");
			memCount = sc.nextInt();
		}
		while (memCount<1 || memCount>10); //1보다 작아도 반복, 10보다 커도 반복
		
		//테스트
		//System.out.print("사용자가 입력한 인원수 확인 : "+memCount);

		//배열 생성(이름, 전화번호) - 사용자로부터 입력받은 인원수 만큼의 배열방 구성

		// 이름 저장 배열
		String[] names = new String[memCount];

		//전화번호 저장 배열
		String[] tels = new String[memCount];
		//『String[] tels = new String[names.length];』와 동일한 구문

		for (int i=0; i<memCount; i++)
		{
			System.out.printf("이름 전화번호 입력[%d](공백 구분) :", i+1);
			
			names[i] = sc.next(); //이름 받기
			tels[i] = sc.next();  // 번호 받기

		}

		//최종결과(이름, 전화번호) 출력
		System.out.println();
		System.out.println();
		System.out.println("---------------------");
		System.out.println("전체 학생 수 : "+memCount+"명");
		System.out.println("---------------------");
		System.out.println(" 이름	전화번호 ");
		for (int m=0; m<names.length; m++)
			System.out.printf("%4s, %s\n",names[m], tels[m]);
		System.out.println("---------------------");
		
	}
}

/*
입력 처리할 학생 수 입력(명, 1~10) : 24
입력 처리할 학생 수 입력(명, 1~10) : 3
이름 전화번호 입력[1](공백 구분) :홍길동 010-1111-1111
이름 전화번호 입력[2](공백 구분) :김둘리 010-2222-2222
이름 전화번호 입력[3](공백 구분) :고길동 010-3333-3333

---------------------
전체 학생 수 : 3명
---------------------
 이름   전화번호
홍길동  010-1111-1111
김둘리  010-2222-2222
고길동  010-3333-3333
---------------------
계속하려면 아무 키나 누르십시오 . . .
*/