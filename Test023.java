/*======================
---[[연산자(Operator)]]---
	- 비트 단위 연산자
	- 비트 shift 연산
=========================*/

public class Test023{
	public static void main(String[]args){

							//							  |
		int x = 128;		// 00000000 00000000 00000000 10000000
							// 00000000 00000000 00000100 00000000
							//						  |

		System.out.printf("x << 3 : %d\n", x << 3);
		System.out.printf("x * 8 : %d\n", x * 8);
		//ㄴ---> x << 3 : 1024
		//		 x * 8 : 1024
		
		System.out.printf("x << 3 : %d\n", x >> 3);
		System.out.printf("x * 8 : %d\n", x / 8);
		//ㄴ---> x << 3 : 16
		//		 x * 8 : 16

		//                            |
		// 00000000 00000000 00000000 10000000
		// 00000000 00000000 00000100 00000000
		//						  |

		// >>	→ 비트열 이동 시 빈 자리에 양수 → 0 / 음수 → 1 ==> 부호유지

		// >>>	→ 비트열 이동 시 빈자리에 0
		

		System.out.printf("x << 24 : %d\n", x << 24);
		// ㄴ---> x << 24 : -2147483648
		// 10000000 00000000 00000000 00000000
		// |		
		
		System.out.printf("x << 25 : %d\n", x << 25);
		System.out.printf("x << 26 : %d\n", x << 26);
		System.out.printf("x << 31 : %d\n", x << 31);
		// ㄴ---> x << 25 : 0
		//	   	  x << 26 : 0
		//        x << 31 : 0

		System.out.printf("x << 32 : %d\n", x << 32);
		// ㄴ---> x << 32 : 128
	}
}

/*
x << 3 : 1024
x * 8 : 1024
x << 3 : 16
x * 8 : 16
x << 24 : -2147483648
x << 25 : 0
x << 26 : 0
x << 31 : 0
x << 32 : 128
계속하려면 아무 키나 누르십시오 . . .
*/