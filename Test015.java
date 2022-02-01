/*======================
---[[자바기본 프로그래밍]]---
	- 자바의 기본 입출력 : 서식문자
=========================*/

public class Test015{
	public static void main(String[]args){
		System.out.print("AAA");
		System.out.print("BBB");
		//System.out.print("CCC"\n);	//--> 에러발생(컴파일 에러)
		System.out.print("CCC\n");
		//ㄴ---->AAABBBCCC

		System.out.println();			//-- 개행
		//System.out.print();			//--> 에러발생(컴파일 에러)

		System.out.printf("12345678901234567890");
		System.out.printf("12345678901234567890\n");	//-- 『\n』은 개행
		System.out.printf("12345678901234567890%n");	// printf()에서는 『%n』도 개행

		System.out.printf("%d + %d = %d%n", 10, 20, 30);
		//ㄴ------> 10 + 20 = 30

		System.out.printf("%d\n",123);
		System.out.printf("%10d\n",123);
		System.out.printf("%8d\n",1234);
		System.out.printf("%010d\n",123);
		/*
		123
		       123
		    1234
		0000000123
		*/
		
		System.out.printf("%+d\n",365); //음수는 이렇게쓰면 에러남
		System.out.printf("+%d\n",365);	//음수는 이렇게 쓰자.
		/*
		+365
		+365
		*/

		System.out.printf("%d\n", +365);
		//ㄴ-------> 365
		
		//System.out.printf("%-d\n",365);
		//ㄴ----> 에러 발생(런타임 에러)
		System.out.printf("-%d\n",365);
		//ㄴ----> -365
		System.out.printf("%d\n", -365);
		//ㄴ----> -365

		System.out.printf("%(d\n", -365);
		//ㄴ----> (365)
		System.out.printf("%(d\n", 365);
		//ㄴ----> 365

		//System.out.printf("%d\n", 'A');
		//ㄴ----> 에러 발생(런타임 에러) %d가 정수형이니까
		System.out.printf("%c\n", 'A');
		//ㄴ---> A

		//System.out.printf("%c\n", "ABCD");
		//ㄴ----> 에러 발생(런타임 에러) %c가 문자형이니까
		System.out.printf("%s\n", "ABCD");
		//ㄴ---> ABCD

		System.out.printf("%h\n", 365);
		//ㄴ--->  16d
		System.out.printf("%o\n", 24);
		// ㄴ---> 30  //8진수로 표현

		System.out.printf("%b\n", true);
		// ㄴ---> true

		System.out.printf("%f\n", 123.23);
		// ㄴ---> 123.230000
		System.out.printf("%.2f\n", 123.23);
		// ㄴ---> 123.23
		System.out.printf("%.2f\n", 123.231);
		// ㄴ---> 123.23
		System.out.printf("%.2f\n", 123.236);
		// ㄴ---> 123.24   반올림 일어남
		
		//System.out.printf("%10d\n", 123);
		System.out.printf("%8.2f\n", 123.236);
		// ㄴ--->   123.24   전체 8자리 확보. 소숫점까지 한자리를 차지함. 따라서 앞에공백 2칸
		System.out.printf("%2.2f\n", 123.236);
		// ㄴ---> 123.24   내가 표현하는 데이터보다 작은 자리확보면 무시함.

		}
}

/*
AAABBBCCC

1234567890123456789012345678901234567890
12345678901234567890
10 + 20 = 30
123
       123
    1234
0000000123
+365
+365
365
-365
-365
(365)
365
A
ABCD
16d
30
true
123.230000
123.23
123.23
123.24
  123.24
123.24
계속하려면 아무 키나 누르십시오 . . .
*/