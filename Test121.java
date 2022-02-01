/*===============================
	���� Ŭ���� ��� ����
	 - ���� Ŭ����(Annonymous class)
  ===============================*/

/*
�� Annonymous Ŭ���� (�͸��� Ŭ���� : ���� Ŭ����)
	
	- awt�� �ȵ���̵� �̺�Ʈ ó������ �Ϲ������� ���
	- ���� Ŭ���� �޼ҵ带 �ϳ����� �������� �ʿ伺�� ���� �� ���
	- Ŭ������ ��ü�� �ʿ��ϸ� �� �ٽ� Ŭ������ �����ؾ��ϴ�
      ���ŷο� ������ �͸��� Ŭ������ �����Ͽ� ó���Ѵ�.

�� ���� �� ����

	new ����Ŭ������ ������()
	{
		�������������� �ڷ��� �޼ҵ�()
		{
			...;
		}
	};		// �� �����ݷ� check~~!!

*/


// import java.lang.*;

class Test3 //extends Object
{
	/*
	Object Ŭ������ �����
	...
	
	public String toString()
	{
		...;
	}
	
	*/

	public Object getString()
	{	
		/*
		Object result;
		result = new Object;
		return Object;
		*/
			
		/*
		return new Object();
		       -------------Object ��
		*/
		
		return new Object(){
			@Override
			public String toString()
			{
				return "�͸��� Ŭ����...";
			}
		};	//-- �����ݷ� check~!!

	}//end getString()

}// end class Test3

public class Test121 //extends Object 
{
	/*
	Object�� �����ִ� �����...

	*/
	public static void main(String[]args){
		Test3 ob1 = new Test3();
		Test3 ob2 = new Test3();

		System.out.println(ob1.toString());
		// ==> Test3@15db9742

		Test121 ob3 = new Test121();
		System.out.println(ob3.toString());
		// ==> Test121@6d06d69c
		
		System.out.println(ob2.getString());
		// ==> �͸��� Ŭ����...

	}
	
}