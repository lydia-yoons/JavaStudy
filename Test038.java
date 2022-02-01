/*======================
■■■실행 흐름의 컨트롤(제어문, 조건문과 반복문)■■■
	- switch문 실습
=========================*/

/* 사용자로부터 임의의 두 정수와 연산자를 입력받아
해당 연산자의 연산 처리 결과를 출력하는 프로그램을 구현한다.
단, switch문을 활용하여 처리할 수 있도록 하며,
연산 결과는 편의상 정수형으로 처리도리 수 있도록 한다.

실행 예)
첫 번째 정수 입력	: 20
두 번째 정수 입력	: 14
연산자 입력[+ - * /]: +

>> 20 + 14 = 34
//계속하려면...
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test038{
	public static void main(String[]args) throws IOException {
		//BufferedReader 인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

/*[내가 푼 코드]
		//변수 선언
		int n1, n2;
		char a;
		
		//연산 및 처리
		System.out.print("첫 번째 정수 입력 : ");
		n1 = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		n2 = Integer.parseInt(br.readLine());

		System.out.print("연산자 입력 : ");
		a = (char)System.in.read();			//문자형

		//switch 문 시작
		switch (a)
		{
		case '+':
			System.out.printf("%d %c %d = %d\n", n1, a, n2, (n1+n2));
			break;
		case '-':
			System.out.printf("%d %c %d = %d\n", n1, a, n2, (n1-n2));
			break;
		case '*':
			System.out.printf("%d %c %d = %d\n", n1, a, n2, (n1*n2));
			break;
		case '/':
			System.out.printf("%d %c %d = %d\n", n1, a, n2, (n1/n2));
			break;
		default:
			System.out.println("입력 오류~!!");
			break;		
		}
*/ 

/*		//①[함께 푼 코드] ***********************
		int a, b, result;
		int op;

		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("연산자 입력 : ");
		op = System.in.read();

		// + → 43, - → 45, * → 42, / → 47
		switch (op)
		{
			case 43: result=a+b; break;
			case 45: result=a-b; break;
			case 42: result=a*b; break;
			case 47: result=a/b; break;
			default : return;	//
		}
		
		System.out.println();
		System.out.printf(">> %d %c %d = %d\n", a, op, b, result);
*/

/*		
		//②[함께 푼 코드] ***********************
		int a, b, result;
		char op;

		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("연산자 입력 : ");
		op = (char)System.in.read();

		switch (op)
		{
			case '+': result=a+b; break;
			case '-': result=a-b; break;
			case '*': result=a*b; break;
			case '/': result=a/b; break;
			default : return;	
		}

		System.out.println();
		System.out.printf(">> %d %c %d = %d\n", a, op, b, result);
*/
		
		//③[함께 푼 코드] ***********************
		int a, b, result;
		String op;			//check~~!

		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("연산자 입력 : ");
		op = br.readLine();		//문자열 읽어오기위해서 --check~~!

		switch (op)				//check~~!
		{
			case "+": result=a+b; break;
			case "-": result=a-b; break;
			case "*": result=a*b; break;
			case "/": result=a/b; break;
			default : return;	
		}

		System.out.println();
		System.out.printf(">> %d %s %d = %d\n", a, op, b, result);

	}
}

/*
첫 번째 정수 입력 : 5
두 번째 정수 입력 : 2
연산자 입력 : *
5 * 2 = 10
계속하려면 아무 키나 누르십시오 . . .

첫 번째 정수 입력 : 20
두 번째 정수 입력 : 2
연산자 입력 : /
20 / 2 = 10
계속하려면 아무 키나 누르십시오 . . .
*/