/*======================
■■■실행 흐름의 컨트롤(제어문, 조건문과 반복문)■■■
	- 반복문(while) 실습
=========================*/

// 사용자로부터 임의의 정수르 입력받아
// 입력받은 정수가 소수인지 아닌지를 판변하여
//결과를 출력하는 프로그램을 구형

// 실행 예)
// 임의의 정수 입력 : 10
// 10 → 소수 아님
// 계속하려면 아무 키나 누르세요

// 임의의 정수 입력 : 11
// 11 → 소수
// 계속하려면 아무 키나...

// ※소수 : 1 또는 자기 자신의 값 이외의 어떤 수로도 나누어 떨어지지 않는 수.
//			단, 1은 소수아님.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test046{
	public static void main(String[]args) throws IOException{
		//BufferedReader 인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

/*[내가 친 코드]
		int a, b=1; //변수 선언

		System.out.print("임의의 정수 입력 : ");
		a = Integer.parseInt(br.readLine());

		while (b++ <= a){

			System.out.println("test : "+b);
			
			if (a == b){ //자기자신과 나누어 떨어지면
				System.out.printf("%d → 소수\n",a);
				break;
			}
			if (a%b == 0){	//나누어 떨어지면
				System.out.printf("%d → 소수 아님\n",a);
				break;
			}
			if(a == 1){	// 1인 경우는 소수아님
				System.out.printf("%d → 소수 아님\n",a);
				break;
			}
		}
*/

		//[함께 푼 코드]***********************************
		int num;	//사용자 입력값을 담아낼 변수

		//연산 및 처리
		System.out.print("임의의 정수 입력 : ");
		num = Integer.parseInt(br.readLine());

		int n = 2;	//입력값을 대상으로 나눗셈 연산을 수행할 변수
					// (1씩 증가)	5 → 2 3 4

		boolean flag = true;	//소수다~!

		while (n < num){	//num = 5 → n=2~4 // num = 14 → n=2~13

			//입력값(num)이 n으로 나누어 떨어지는지 확인
			if (num%n == 0)
			{
				//num은 소수가 아니다.
				flag = false;	//에이~ 소수 아니었네!
				break;  //if문을 나오는게 아닌, while문을 빠져나오는 것이다.
			}
			
			n++;
		}


		// 결과 출력(추력 전에 수행해야 할 추가 확인 → 1인지 아닌지에 대한 추가 검토)
		if (flag == ture && num !=1)
			System.out.printf("%d → 소수\n", num);
		else
			System.out.printf("%d → 소수 아님\n", num);
			

	}
}

/*
임의의 정수 입력 : 10
10 → 소수 아님
계속하려면 아무 키나 누르십시오 . . .

임의의 정수 입력 : 1
1 → 소수 아님
계속하려면 아무 키나 누르십시오 . . .

임의의 정수 입력 : 3
3 → 소수
계속하려면 아무 키나 누르십시오 . . .
*/