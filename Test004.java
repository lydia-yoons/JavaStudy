/*=========================
---[[자바 개요 및 특징]]---
	- 변수와 자료형
	-키워드 및 식별자
===========================*/

public class Test004
{
	public static void main(String[] args)
	{
		double height = 172.8;
		int age = 25;
		char degree = 'A';

		String name = "이윤서";
		//String name = "김진령";
		// ※ 스코프 영역({}괄호) 안에서 변수명은 식별자!

		//String #name = "최수지";
		/*"$"와 "_"를 제외한 다른특수문자는
		변수의이름으로 활용할 수 없다.
		하지만, 그나마 사용가능한 이 특수문자들도
		함부로 사용하는것은 안되고 고려하여 사용해야한다.*/

		//int t =01012342345; //전화번호
		String t = "01012341234"; //전화번호, 학번과 같은것은 String으로!
		String _t = "010-1234-1234";

		String 주소 = "경기도 부천시";
		/*문법적으로 한글 단어를 변수명으로 사용할 수 있지만
		실무적인 측면에서 접근한다면
		절대로 한글을 쓰면 안된다*/

		//결과출력
		System.out.println("name :" + name);
		System.out.println("tel :" + t);
		System.out.println("tel2 :" + _t);
		System.out.println("주소:" + 주소);
	}
}

/*
name :이윤서
tel :01012341234
tel2 :010-1234-1234
주소:경기도 부천시
계속하려면 아무 키나 누르십시오 . . .

*/