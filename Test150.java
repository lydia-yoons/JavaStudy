/*===============================
■■■ 컬렉션 프레임워크(Collection Framework) ■■■
 ===============================*/

/*
○ 컬렉션 프레임 워크(Collection Framework)
  == 컬렉션(Collection) + 프레임워크(Framework)
  	 ------------------   ---------------------
	 		|			   	환경, 틀, 약속
			|
		  집합 → 수집품, 소장품, (물건 또는 사람들의) 무리, 더미, 수집, 수거
		  		  -----------------------------------------------------------
				  			모아놓은 것들... 모여있는 것들...
	
	==> 자료구조

○ 자료구조
	자료 처리를 위한 자료의 표현, 저장, 관계, 관리 및 
	이용에 관한 방법 등의 개념을 이해하여 프로그램에 사용하고
	컴퓨터에 의해 처리되는 과정에서 적절한 자료의 표현, 구성, 저장 및 
	처리를 위한 알고리즘의 작성 및 선택과 이용 방법을 연구하는 분야.

○ 컬렉션 프레임워크(Collection Framework)
   컬렉션(모아놓은 데이터들)의 표현과 조작을 위한 통일된 아키텍처로
   컬렉션 프레임워크를 구성하는 요소는 다음과 같다. (세가지)

    1. 인터페이스(Interface)
       기본적으로 컬렉션에 필요한 데이터 관리 기능을 제공한다.
       예를 들어 list 는 추가, 삭제, 검색 등의 기능을 제공하는
       컬렉션 인터페이스가 존재하며 
	   각 컬렉션마다 고유의 인터페이스가 정의되어 있다.

    2. 구현(Implementation)
       인터페이스를 구현한 클래스로 
	   각 컬렉션을 실제 어떤 자료구조를 이용하여 표현했느냐에 따라 
	   컬렉션의 종류가 달라진다.

    3. 알고리즘(Algorithms)
	   각 컬렉션들마다 유용하게 사용할 수 있는 메소드를 의미한다.

 ※ 자바 컬렉션은 견고한 컬렉션 프레임워크 기반 위에 정의되어 있으므로
    각 컬렉션 종류마다 제공되는 메소드의 일관성이 있기 때문에
    한 가지 컬렉션을 익혀두면 다른 컬렉션을 사용하는 데 용이하다.
*/

/*
○ 스택(Stack)
	Stack 클래스는 오브젝트 후입선출(LIFO) 구조의 Stack 을 나타낸다.
   이는 벡터(Vector)를 스택으로 처리하는 5개의 메소드로 벡터(Vector) 클래스를 확장하게 된다.
   통상의 push() 메소드와 pop() 메소드가 제공되는 것 외에 스택의 선두 항목으로 peek() 을 실시하는 메소드,
   스택이 비어있는지의 여부를 확인하는 메솓, isEmpty() 스택으로 항목을 찾아서 선두로부터 몇 번째인지를 찾아내는 메소드 등이 제공된다.

	- boolean empty()
	  스택이 비어있는지 확인한다.
	- E Object peek()
	  스택 맨 위의 객체를 스택에서 제거하지 않고 반환한다.
	- E Object pop()
	  스택 맨 위의 객체를 반환하고 제거한다.
	- E Object push(E item)
	  객체를 스택 자료구조에 저장한다.
	- int search(Object o)
	  스택 맨 위에서부터 파라미터 값으로 넘겨받은 객체까지의 거리를 반환한다.
	  맨 위의 객체의 경우 1을 반환하고 그 아래 객체는 2를 반환하는 형식.

*/

// 제네릭, 제네릭 표현식

// <E>	<K, V>


import java.util.Stack;


public class Test150{
	public static void main(String[]args){

		//Statck 자료구조 생성
		Stack<Object> myStack = new Stack<Object>();

		String str1 = "김진희";
		String str2 = "윤유동";
		String str3 = "이다영";
		String str4 = "이찬호";
		
		// myStack이라는 Stack 자료구조 안에 str1 ~ str4까지 담아내기
		// add(), push()
		myStack.add(str1);
		myStack.add(str2);
		myStack.add(str3);
		myStack.add(str4);

		// peek() : 스택 맨 위의 객체 반환. 제거하지 않는다.
		String val1 = (String)myStack.peek();		//-- 형 변환 check~!!
		System.out.println("val1 : "+val1);
		// ==> val1 : 이찬호

		String val2 = (String)myStack.peek();		
		System.out.println("val2 : "+val2);
		// ==> val2 : 이찬호

		String val3 = (String)myStack.peek();		
		System.out.println("val3 : "+val3);
		//==> val3 : 이찬호					// ==> 제거하지않았기때문에 몇번을 하든 이찬호
		

		String value = "";

		// myStack 이라는 이름을 가진 Stack자료구조에
		// 데이터가 비어있는 상황이 아니라면... (즉, 값이 들어있는 상태라면..)
		//  → isEmpty()

		// 이찬호
		// 이다영
		// 윤유동
		// 김진희
		while (!myStack.isEmpty())	// !false → true
		{	
			// pop() : 스택 맨 위의 객체 반환. 제거한다.
			value = (String)myStack.pop();		// 이찬호 이다영 윤유동
			System.out.println("value : " + value);
		}
		/*
		==>
		value : 이찬호
		value : 이다영
		value : 윤유동
		value : 김진희
		*/

		
	}
}