/*
---[[자바 기본 프로그래밍]]---
	@@변수와 자료형
*/

public class Test003{
	public static void main(String[] args){

		//변수 선언
		int a;

		// 변수 초기화(변수 a에 10대입)
		a = 10;

		//변수 선언 및 초기화(선언과 대입을 한번에 처리)
		int b = 20;

		//변수 선언
		int c;
		
		//연산 및 처리
		c=a+b; 
		// c = 10 + 20;
		// c = 30;

		//결과 출력 
		System.out.println(c);
		//ㄴ------->30

		//결과출력
		//System.out.println(a b c);
		//ㄴ--------------> 에러발생(컴파일 에러)

		// >>덧셈 연산자(+)
		// 피연산자 중 어느 하나라도 문자열 형태의 데이가 존재한다면
		// 산술연산자로써의 기능을 수행하는 것이 아니라
		// 문자열 결합 연산자로써의 기능을 수행하게 된다.

		//테스트
		System.out.println(1+2);
		// ----> 3

		//테스트
		System.out.println("1" + 2);
		// --->12

		//테스트
		System.out.println(a + " " + b + " " + c);
		// ----> 10 20 30

		System.out.println("a의 값은 "+ a + "입니다.");
		System.out.println("b의 값은 "+ b + "입니다.");
		System.out.println("a와 b를 더한 결과값 : "+c);
		// ----->
		/*
		a의 값은 10입니다.
		b의 값은 20입니다.
		a와 b를 더한 결과값 : 30
		*/
		// [+]연산자를 사용하는 과정에서
		// 피연산자 중 문자열이 포함되어 있을 경우
		// 문자열 결합 연산자로 활용되며
		// 처리결과는 뭊열의 형태로 반환된다.

		System.out.println(1 + 2);		//산술 연산자 +
		System.out.println("1" + 2);	//문자열결합연산자 + 
		System.out.println(1 + "2");	//문자열결합연산자 +
		System.out.println("1" + "2");	//문자열결합연산자 + 
		// --> 
		/*
		3
		12
		12
		12
		*/

	}
}


/*


*/