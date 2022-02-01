/*===============================
	■■■ 클래스 고급 ■■■
	 - 상속(Inheritance)

  ===============================*/

/*
  ※ 생성자와 클래스 상속간의 관계
  	
	하위 클래스는 상위 클래스의 멤버를 상속받지만,
	생성자는 상속 대상에서 제외된다.
	그리고, 하위 클래스의 생서자가 호출될 때
	자동으로 상위 클래스의 생성자가 호출된다.
	이 때, 호출되는 상위 클래스의 생성자는
	인수가 없는 생성자(default 생성자 형태)가 된다.

	상위 클래스 및 하위 클래스를 설계하는 과정에서
	상위 클래스의 생성자를 정의하지(작성하지) 않거나
	인수가 없는 생성자만을 정의한(작성한) 경우
	명시적으로 하위 클래스에서 상위 클래스의 생서자를 호출하지 않아도
	아무런 문제가 발생하지 않지만
	상위 클래스에 인자가 있는 생성자만 존재하는 경우에는 
	주의해야한다.

	예를 들어... 다음에서...

class A_class
{
	A_class(int n){
	
	}
}

class B_calss extends A_class
{
	B_class(){
		super();
	}
	
}

// 하위 클래스인 B_class의 생성자에서
// 명시적으로 A_class의 생성자를 호출하지 않으면
// 자동으로 인자 없는 생성자를 호출한다.
// 하지만, A_class에는 인자가 있는 생성자만 존재하고
// 인자가 없는 생성자는 존재하지 않기 떄문에 에러 발생한다.
// 따라서, B_class생성자의 선두에 다음처럼 명시적으로 
// 상위 클래스의 생성자 호출 구문을 작성해야한다.

class A_class
{
	A_class(int n){
	
	}
}

class B_calss extends A_class
{
	B_class(){
		super(10);
		...
		...
	}
	
}

*/
/*
=======================================================================================
 상위 클래스	|   하위 클래스	     |  결과
---------------------------------------------------------------------------------------
생성자를		| 생성자 정의 안함	 | → 가능하다.
정의하지 않음	| 인수가 없는 생성자 | → 가능하다.
				| 인수가 있는 생성자 | → 가능하다.
---------------------------------------------------------------------------------------
인수가 없는		| 생성자 정의 안함	 | → 가능하다.
생성자만 정의	| 인수가 없는 생성자 | → 가능하다.
				| 인수가 있는 생성자 | → 가능하다.
---------------------------------------------------------------------------------------
인수가 있는		| 생성자 정의 안함	 | → 에러발생. (불가능, 생성자르 반드시 정의 해야함) 
생성자만 정의	| 인수가 없는 생성자 | → 상위 클래스의 해당 생성자를 호출하지 않으면 에러 발생. (직접 작성 해야함)
				| 인수가 있는 생성자 | → 상위 클래스의 해당 생성자를 호출하지 않으면 에러 발생. (직접 작성 해야함) 
=======================================================================================

*/



// Rect108 클래스와 Circle108 클래스의 부모 클래스
class SuperTest108
{
	protected double area;	//멤버변수 protected를 썻다면 상속을 염두하고 썼다고 생각해도 된다. 
	private String title;	//멤버변수, 상속을 못받는다고 이해하는게 더 편하다
	
	// 부모클래스의 인자없는 사용자 정의 생성자
	public SuperTest108(){
		System.out.println("SuperTest108... 인자 없는 생성자");
	}

	// 부모클래스의 문자열을 인자로 받는 사용자 정의 생성자
	public SuperTest108(String title){
		this.title = title;
		System.out.println("SuperTest108... 문자열을 인자로 받는 생성자");
	}

	public void write(){
		System.out.println(title + " - "+ area);	
	}

}

// SuperTest108 클래스를 상속받는 자식 클래스
class Rect108 extends SuperTest108
{
	/*
	protected double area;	

	public void write(){
		System.out.println(title + " - "+ area);	
	}
	*/
	private int w,h;
	

	//자식 클래스의 사용자 정의 생성자
	public Rect108(){
		//자동으로 삽입
		//super(); → SuperTest108(); 
	}

	public void calc(int w, int h){
		this.w = w;
		this.h = h;
		area = (double)this.w * this.h;
		//	super.area = (double)this.w * this.h;
		//	this.area = (double)this.w * this.h;

		write();
	}
	
	@Override		//-- 어노테이션(주석;annotation) - matadata
	public void write(){
		System.out.println("w : " + w + ", h : " + h);
		System.out.println("사각형 - "+area);
	}

	//※ 메소드 오버라이딩(Method Overriding)
	//	상위 크래스(부모 클래스)를 상속받은 하위 클래스(자식 클래스)에서
	//	상위 클래스에 정의 된 메소드를 다시 정의하는 것으로(재정의)
	//	객체 지향 프로그래밍의 특징인 다형성을 나타낸다.
	//	재정의(Overriding)는 반드시 상속 관계에 있어야 하며,
	//	메소드의 이름, 리턴 타입, 매개변수의 갯수나 타입이 완전히 일치해야 한다.
}

// SuperTest108 클래스를 상속받는 자식 클래스
class Circle108 extends SuperTest108
{
	/*
	protected double area;	

	public void write(){
		System.out.println(title + " - "+ area);	
	}
	*/
	
	//default 생성자 → 아래의 사용자 정의 생성자가 있기때문에 
	public Circle108(){
		
	}
	
	// 자식 클래스의 문자열을 인자로 받는 사용자 정의 생성자
	public Circle108(String title){
		//super();
		super(title);
	}

	
	public void calc(int r){
		area = r * r * 3.141592;
		write();
	}
}


// main()메소드를 포함하고 있는 외부의 다른 클래스
public class Test108
{
	public static void main(String[]args){

		Rect108 ob1 = new Rect108();
		// ==> SuperTest108... 인자 없는 생성자
		
		//Circle108 ob2 = new Circle108();
		// ==> 에러발생(컴파일 에러)
		// -- 현재 Circle108 클래스에는
		//		매개변수를 필요로하는 사용자 정의 생성자가 만들어져 있으며
		//		이로 인해 default생성자가 자동으로 삽입되지 않은 상황.

		Circle108 ob2 = new Circle108("원");
		// ==> SuperTest108... 문자열을 인자로 받는 생성자


	}
}