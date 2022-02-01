/*======================================
	■■■ 클래스와 인스턴스 ■■■
  ======================================*/

// 사용자로부터 임의의 두 정수와 연산자를 입력받아
// 사칙연산을 수행하는 프로그램을 구현한다.
// 단, 클래스와 인스턴스의 개념을 활용하여 작성할 수 있도록 한다.

//실행 예)
// 임의의 두 정수 입력(공백 구분) : 10 5
// 임의의 연산자 입력(+ - * /) : +
// >> 10 + 5 = 15
// 계속하려면 아무 키나 누르세요...

import java.io.IOException;
import java.util.Scanner;
/*
class Calculate {
	//변수 선언
	int i, j;
	char c;

	//입력받기
	void input() throws IOException{

		Scanner sc = new Scanner(System.in);

		System.out.print("임의의 두 정수 입력(공백 구분) :");
		i = sc.nextInt();
		j = sc.nextInt();

		System.out.print("임의의 연산자 입력(+ - * /) : ");
		c = (char)System.in.read();
	}

		//연산하기
	int add(){
		int result = 0;
		
		if (c==43){ // + 일 때
			result = i + j;
		} else if (c==45){ // -일 때
			result = i - j;
		} else if (c==42){ // * 일 때
			result = i * j;
		} else if (c==47){ // /일 때
			result = i / j;
		}

		return result;
	}

	//출력하기
	void print(int sum){
		System.out.printf("%d %c %d = %d\n",i,c,j,sum);
	}

}

public class Test068{
	public static void main(String[]args) throws IOException {
		
		Calculate cal = new Calculate();
		
		cal.input();

		int a = cal.add();

		cal.print(a);
	}
}
*/

	class Calculate {
		//주요 변수 선언
		int su1, su2;		//사용자로부터 입력받은 두 정수를 담아둘 변수
		char op;			//사용자로부터 입력받은 연산자를 담아둘 변수
		
		//메소드 정의(기능: 입력)
		void input() throws IOException {
			Scanner sc = new Scanner(System.in);

			System.out.print("임의의 두 정수 입력(공백 구분) : ") ;
			su1 = sc.nextInt();
			su2 = sc.nextInt();

			System.out.print("임의의 연산자 입력(+ - * /) : ");
			op = (char)System.in.read();
		}
		
		//메소드 정의(기능 : 연산)
		int cal(){
			int result = 0;
			
			switch(op){
				case '+' :result = su1+su2; break;
				case '-' :result = su1-su2; break;
				case '*' :result = su1*su2; break;
				case '/' :result = su1/su2; break;
			}

			return result;
		}

		//메소드 정의(기능 : 출력)
		void print(int s){
			System.out.printf("%d %c %d = %d\n", su1,op,su2,s);
		}
}





public class Test068{
	public static void main(String[]args) throws IOException {
		
		//Calculate클래스 인스턴스 생성
		Calculate cal = new Calculate();
		
		cal.input();

		int result = cal.cal();

		cal.print(result);
	}
}

/*
임의의 두 정수 입력(공백 구분) :10 5
임의의 연산자 입력(+ - * /) : *
10 * 5 = 50
계속하려면 아무 키나 누르십시오 . . .

*/