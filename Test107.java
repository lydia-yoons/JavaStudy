/*===============================
	■■■ 클래스 고급 ■■■
	 - 상속(Inheritance)

  ===============================*/
/*
○ 상속(Inheritance)이란
	새로 설계(생성)하고자 하는 클래스가
	이미 설계되어 있는 다른 클래스의 기능과 중복되는 경우
	이미 설계된 클래스의 일부분이나 전체 구조를 공유할 수 있도록 하는 기능을 의미한다.

	즉, 상속은 객체를 좀 더 쉽게 만들 수 있는
	고수준의 재사용성(reusability)을 확보하고
	객체간의 관계를 구성함으로써
	객체지향의 또 다른 큰 특징인 『다형성』의 문법적 토대가 된다.
	
	상속은 기존 프로그램의 클래스 내용을 공유함으로써
	중복된 코드들을 재작성할 필요없이
	반복적이고 세부적인 작업을 처리하지 않기 때문에
	프로그램을 작성하는 시간을 절약할 수 있고
	유지보수를 편리하게 할 수 있으며, 프로그램의 길이도 짧아지게 된다.

	또한, 이미 작성된 프로그램들은 앞서 테스트되었기 때문에
	오류를 줄일 수 있어 현재 작성중인 프로그램에만 전념할 수 있다.

※ 주의할 점
	자바는 다.중.상.속.을 지원하지 않기때문에
	두 개 이상의 클래스로부터 상속받을 수 없다.

상위 클래스 == 부모 클래스 == 조상 클래스 == Super 클래스 → 물려 주는 클래스
하위 클래스 == 자식 클래스 == 자손 클래스 == Sub 클래스 → 물려 받는 클래스 (대상결정)

※ 『super』
	static으로 선언되지 않은 메소드에서 사용되며
	현재 클래스가 상속받은 상위 클래스의 객체를 가리키낟.
	super는 상위 크래스의 생성자를 호출하거나,
	상위 클래스의 멤버 변수 또는 메소드를 호출할 때 사용할 수 있다.

	하위 클래스의 생성자에서 상위 클래스의 생성자를 호출할 때에는
	하위 크래스의 생서장 정의 구문에서 맨 처음에만 위치할 수 있다.
	(이건... 상속의 문버비 아니라.. 앞에서 공부한 생서자의 기본적인 문법~!!)

*/

//부모 클래스
class SuperTest107
{
	protected double area;
	
	// 부모 클래스의 생성자
	SuperTest107(){
		System.out.println("Super class...");
	}

	void write(String title){
		System.out.println(title + " - "+ area);
	}

}


// 자식 클래스
// ※ 자바는 단일 상속만 지원되며, 다중상속은 허용하지 않는다. 
public class Test107 extends SuperTest107 //, SuperTest108, SuperTest109 → 이렇게 여러개 상속 안된다!
{
	/*
	protected double area;

	void write(String title){
		System.out.println(title + " - "+ area);
	}
	생성자 제외, 이렇게 복붙한거라고 생각하면 된다.*/


	//double area = 10.1234;

	//자식 클래스의 생성자
	Test107(){
		//부모 클래스 생성자 호출
		// SuperTest107();	// this(); → Test107(); >> 이렇게 쓰면 안됨 ==> super 써야함 → SuperTest107
		// super();

		System.out.println("Sub class...");
	}

	public void circle(){
		int r = 10;
		area = r * r * 3.141592;
		write("원");
	}

	public void rect(){
		int w = 20, h = 5;
		super.area = w * h;
		//-- SuperTest107.area = w * h;
		super.write("사각형");
		//-- SuperTest107.write("사각형");
	}

	public static void main(String[]args){
		//Test107 클래스 기반 인스턴스 생성
		Test107 ob = new Test107();

		ob.circle();
		// ==> 원 - 314.1592

		ob.rect();
		// ==> 사각형 - 100.0
		
	}
}