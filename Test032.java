/*======================
■■■실행 흐름의 컨트롤(제어문, 조건문과 반복문)■■■
	- if ~ else문 실습
=========================*/

/* 사용자로부터 임의의 두 정수와 연산자를 입력받아
해당 연산자의 연산 처리 결과를 출력하는 프로그램을 구현한다.
단, if조건문을 활용하여 처리할 수 있도록 하며,
연산 결과는 편의상 정수형으로 처리도리 수 있도록 한다.

실행 예)
첫 번째 정수 입력	: 20
두 번째 정수 입력	: 14
연산자 입력[+ - * /]: +

>> 20 + 14 = 34
//계속하려면....

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test032{
	public static void main(String[]args) throws IOException {
		 
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
/* [내가 작성한 코드]
		 //변수 선언
		 int n1, n2;
		 char a;
		 int b;

		 System.out.print("첫 번째 정수 입력 : ");
		 n1 = Integer.parseInt(br.readLine());

		 System.out.print("두 번째 정수 입력 : ");
		 n2 = Integer.parseInt(br.readLine());
		
		 System.out.print("연산자 입력 [+ - * /] : ");
		 a = (char)(br.read());		
		 
		 if (a == '+'){
			b = (n1 + n2);
		 }else if ( a == '-') {
			b = (n1 - n2);
		 }else if ( a == '*') {
			b = (n1 * n2);
		 }else if ( a == '/') {
			b = (n1 / n2);
		 }else{
			System.out.println("연산기호를 바르게 입력하시오.");
			b=0;
		 }

		 //출력
		 System.out.printf("\n>> %d %c %d = %d\n", n1, a, n2, b);
*/
		
		//[함께 푼 코드]********************************************

/*		// 방법 ①
		int a, b;		// 첫 번째, 두 번째 정수
		char op;		// 연산자
	
		System.out.print("첫 번째 정수 입력 : ");
		 a = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());
		
		//Integer.parseInt()
		//"1234" → Integer.parseInt() → 1234
		//"abcd" → Integer.parseInt() → 변환 안됨
 		System.out.print("연산자 입력 [+ - * /] : ");
		//op = Integer.parseInt(System.in.read());  // "+"이기때문에 
		op = (char)System.in.read(); 
		 
		//확인
		//System.out.println("op : "+op);

		if (op == '+') // 43 == 43
		{ 
			System.out.printf("\n>> %d + %d = %d\n",a, b,(a+b));
		}
		else if ( op == '-') // 45 == 45
		{
			System.out.printf("\n>> %d - %d = %d\n",a, b,(a-b));
		}
		else if ( op == '*') // 42 == 42
		{
			System.out.printf("\n>> %d * %d = %d\n",a, b,(a*b));
		}
		else if ( op == '/')  // 47 == 47
		{
			System.out.printf("\n>> %d / %d = %d\n",a, b,(a/b));
		}
		else
		{
			System.out.println("입력과정에 오류가 존재합니다.");
		}
*/

/*
		// 방법 ② 연산자를 int형으로 받는 방법
		int a, b, op;		// 첫 번째, 두 번째 정수, 연산자
	
		System.out.print("첫 번째 정수 입력 : ");
		 a = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());
		
 		System.out.print("연산자 입력 [+ - * /] : ");
		op = System.in.read(); 
		 
		//확인
		if (op == 43) // 43 == 43 
			System.out.printf("\n>> %d + %d = %d\n",a, b,(a+b));
		else if ( op == 45) // 45 == 45
			System.out.printf("\n>> %d - %d = %d\n",a, b,(a-b));
		else if ( op == 42) // 42 == 42
			System.out.printf("\n>> %d * %d = %d\n",a, b,(a*b));
		else if ( op == 47)  // 47 == 47
			System.out.printf("\n>> %d / %d = %d\n",a, b,(a/b));
		else
			System.out.println("입력과정에 오류가 존재합니다.");
*/

		// 방법 ③ 출력구문 하나로 만들기
		int a, b, result = 0;		// 첫 번째, 두 번째 정수, 연산 결과 값
		char op;		//연산자
	
		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());
		
 		System.out.print("연산자 입력 [+ - * /] : ");
		op = (char)System.in.read(); 
		 
		//확인
		//System.out.println("op : "+op);

		if (op == '+')
			result = a + b;
		else if ( op == '-') 
			result = a - b;
		else if ( op == '*')
			result = a * b;
		else if ( op == '/') 
			result = a / b;
		
		System.out.printf("\n %d %c %d = %d\n",a, op, b, result);


	}
}

/*
첫 번째 정수 입력 : 5
두 번째 정수 입력 : 10
연산자 입력 [+ - * /] : +

>> 5 + 10 = 15
계속하려면 아무 키나 누르십시오 . . .

첫 번째 정수 입력 : 15
두 번째 정수 입력 : 5
연산자 입력 [+ - * /] : /

>> 15 / 5 = 3
계속하려면 아무 키나 누르십시오 . . .

*/