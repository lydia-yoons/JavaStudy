/*===============================
	■■■ 자바의 주요(중요) 클래스 ■■■
	- Wrapper 클래스
  ===============================*/

public class Test130{
	public static void main(String[]args){
		byte b = 3;
		int i = 256;

		Byte b2 = new Byte(b);
		Integer i2 = new Integer(i);

		System.out.println(b2);
		System.out.println(i2);
		// ==> 3
		//	  256

		print(b2);
		print(i2);

		//Byte 클래스의 byteValue() 메소드 호출
		byte b3 = b2.byteValue();

		// Integer 클래스의 intValue()메소드 호출
		int i3 = i2.intValue();

		System.out.println(b3);
		System.out.println(i3);
		// ==> 3
		//	   256

		
		// check~~!!
		int i4 = b2.byteValue();
		//
		byte b4 = i2.intValue();

		// check~~!!
		System.out.println(i4);
		
	}
	
	/*
	static void print(Byte b){
		...;
		
	}

	static void print(Integer i){
		...;
		
	}

	static void print(Object o){
		...;
		
	}
	*/
	
	// java.lang.Number 클래스는(추상 클래스)	
	// 모든 Wrapper클래스들의 부모 클래스
	// (슈퍼 클래스, 상위 클래스)이다.
	// b2, i2 자료형이 Number n에 넘어오면서
	// Auto-Boxing이 일어나게 된다.
	public static void print(Number n){
		System.out.println(n);
		System.out.println(n.intValue());


	}


} //end Test130