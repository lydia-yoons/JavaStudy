/*======================================
	■■■ 클래스와 인스턴스 ■■■
  ======================================*/

/*	사용자로부터 임의의 정수를 입력받아
1부터 입력받은 수 까지의 합을 연산하여
결과값을 출력하는 프로그램을 구현한다.

단, 클래스의 인스턴스의 개념을 활용하여 처리할 수 있도록 한다.
또한, 입력처리 과정에서 BufferedReader를 활용하며,
입력 데이터가 1보다 작거나 1000보다 큰 경우
다시 입력받을 수 있는 처리를 포함하여 프로그램을 구현할 수 있도록 한다.

실행 예)
임의의 정수 입력(1~1000) : 1022
임의의 정수 입력(1~1000) : -20
임의의 정수 입력(1~1000) : 100
>> 1 ~ 100까지의 합 : 5050
계속하려면 아무 키나 누르세요

*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
class Hap
{
	//변수 선언
	int n;

	//입력 받기
	void input() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		do { //1~1000 사이의 정수 아닐시 반복

			System.out.print("임의의 정수 입력(1~1000) : ");
			n = Integer.parseInt(br.readLine());
		}
		while (n<1 || n>100);
				
	}

	//연산하기
	int numSum(){
		int sum = 0;
		
		for (int i=1 ; i<=n ; i++){
			sum += i;
		}
		return sum;
	}

	//출력하기
	void print(int a){
		System.out.printf("1 ~ %d까지의 합 : %d\n", n, a);
	}

}

*/

class Hap
{
	//주요 변수 선언(사용자의 입력값을 담아둘 변수)	
	int su;

	//입력 메소드 정의
	void input(){
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		do
		{
			System.out.print("임의의 정수 입력(1~1000) : ");
			su = Integer.parseInt(br.readLine());
		}
		while (su<1 || su>1000);
		
	}

	// 연산 처리 메소드 정의
	int calculate(){
		int result = 0;
		
		for (int i=1 ; i<=su ; i++){
			result += i;
		}

		return result;
	}


	//결과 추력 메소드 정의
	void print(int sum){
		System.out.printf("1 ~ %d까지의 합 : %d\n", su, sum);
	}
}

public class Test067{
	public static void main(String[]args) throws IOException {
		//Hap 인스턴스 생성
		Hap ob = new Hap();
		
		//h 인스턴스를 통해 입력 메소드 호출
		ob.input();
		
		//h 인스턴스를 통해 연산 메소드 호출
		int o = ob.numSum();
		
		//h 인스턴스를 통해 출력 메소드 호출
		ob.print(o);

	}
}

/*
임의의 정수 입력(1~1000) : 1022
임의의 정수 입력(1~1000) : -20
임의의 정수 입력(1~1000) : 100
1 ~ 100까지의 합 : 5050
계속하려면 아무 키나 누르십시오 . . .
*/