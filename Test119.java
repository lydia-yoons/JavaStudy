/*===============================
	���� Ŭ���� ��� ����
	 - ��øŬ����
  ===============================*/

// outer
class Test2
{
	static int a = 10;	//��������, Test2�� �������, static����(Ŭ���� ����)
	int b = 20;		//��������, Test2�� �������, instance����(�ν��Ͻ� ����)

	void write(){		// �� ù ��°  write() �޼ҵ�
		System.out.println("write...��");
		final int c = 30;	//��������, ���ȭ�� ����(���� ������ �ʴ� ����)
		int d = 40;			//��������, ���� ���÷� ���� �� �ִ� ����
		
		// �޼ҵ� �ȿ� �����ϴ� �Ǵٸ� Ŭ����(���� Ŭ����, ���� Ŭ����, local class)
		// inner
		class LocalTest
		{
			void write(){		// �� �� ��°  write() �޼ҵ�
				System.out.println("write...��");
				System.out.println("a : " + a);
				System.out.println("b : " + b);
				System.out.println("c : " + c);
				//System.out.println("d : " + d);	// ==> ���� �߻�(������ ����)
			}
		}//end class LocalTest

		// �� ���� c�� ���� d�� �� �� �������� ������..
		//	  c�� final �����̱� ������..
	    //	 �� ��° write() �޼ҵ忡�� �����ϴ� ������ �����̴���(��, ���� �����ϴ���)
		//	 30�� ������ ������ ������� �� �ִ�.
		//	 �ݸ鿡, d�� �� ���� ���÷� ������ �� �ִ� ��Ȳ�̹Ƿ�
		//	 LocalTestŬ������ �ν��Ͻ� ���� ������
		//	 ������ Ȯ���� �� ���� ������(��, ������ ��� ������ �� ���� ������)
		//	 d�� �����ϴ� ���� ���ؾ� �Ѵ�.


		LocalTest ob1 = new LocalTest();
		ob1.write();		//-- �ι�° wirte()�޼ҵ� ȣ��

		d+=10;

	}//end write()

}//end Test2



// main()�޼ҵ带 �����ϰ� �ִ� �ܺ��� �ٸ� Ŭ����
public class Test119{
	public static void main(String[]args){
		Test2 ob2 = new Test2();
		ob2.write();

	}
}