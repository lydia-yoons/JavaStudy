/* ---[[자바의 개요 및 특징]]---*/

//열단위 주석

/*줄 다위
주석*/

//클래스의 이름은 「Test001」
//Java프로그램의 클래스 이름은 첫글자를 대문자로 시작해야한다.
//Java프로그램을 시잘할 때 class와 main()함수를 기본적으로 입력.
//소스 저장 시, 클래스 이름과 동일한 파일이름으로 「.java」확장자로 저장.
public class Test001
{
	//main()이라는 이름은 가진 함수(즉, 메소드)
	// --자바 인터프리터가 처음찾는 메소드
	public static void main(String[] args)
	{
		//앞으로 당분간 우리가 코딩해야하는 영역은 main메소드 안이다.
		System.out.println("홍길동");
		// 한 줄주석
		System.out.println(1+1);
		/*여러 줄을
		쓸 때 
		주석*/

		// 「이름()」형식 => 함수(=메소드)를 호출
		/* ※자바에서의 함수는 독립적으로 존재할 수 없고,
			클래스에서 정의되는 형태로 만들어져야한다.
		*/

		//「println()」
		//정의... 호출
		
		//구급상자.연고.후시딘();
		System.out.println(1004);
		System.out.println(100-30);
		//System도구상자 안에 있는 out상자 안의 println()이라는 도구. 즉,메소드(=함수)
	}
}

//실행결과
/*
홍길동
2
1004
70
*/