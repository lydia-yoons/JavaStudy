/*
---[[�ڹ� �⺻ ���α׷���]]---
	@@������ �ڷ���
*/

public class Test003{
	public static void main(String[] args){

		//���� ����
		int a;

		// ���� �ʱ�ȭ(���� a�� 10����)
		a = 10;

		//���� ���� �� �ʱ�ȭ(����� ������ �ѹ��� ó��)
		int b = 20;

		//���� ����
		int c;
		
		//���� �� ó��
		c=a+b; 
		// c = 10 + 20;
		// c = 30;

		//��� ��� 
		System.out.println(c);
		//��------->30

		//������
		//System.out.println(a b c);
		//��--------------> �����߻�(������ ����)

		// >>���� ������(+)
		// �ǿ����� �� ��� �ϳ��� ���ڿ� ������ ���̰� �����Ѵٸ�
		// ��������ڷν��� ����� �����ϴ� ���� �ƴ϶�
		// ���ڿ� ���� �����ڷν��� ����� �����ϰ� �ȴ�.

		//�׽�Ʈ
		System.out.println(1+2);
		// ----> 3

		//�׽�Ʈ
		System.out.println("1" + 2);
		// --->12

		//�׽�Ʈ
		System.out.println(a + " " + b + " " + c);
		// ----> 10 20 30

		System.out.println("a�� ���� "+ a + "�Դϴ�.");
		System.out.println("b�� ���� "+ b + "�Դϴ�.");
		System.out.println("a�� b�� ���� ����� : "+c);
		// ----->
		/*
		a�� ���� 10�Դϴ�.
		b�� ���� 20�Դϴ�.
		a�� b�� ���� ����� : 30
		*/
		// [+]�����ڸ� ����ϴ� ��������
		// �ǿ����� �� ���ڿ��� ���ԵǾ� ���� ���
		// ���ڿ� ���� �����ڷ� Ȱ��Ǹ�
		// ó������� �U���� ���·� ��ȯ�ȴ�.

		System.out.println(1 + 2);		//��� ������ +
		System.out.println("1" + 2);	//���ڿ����տ����� + 
		System.out.println(1 + "2");	//���ڿ����տ����� +
		System.out.println("1" + "2");	//���ڿ����տ����� + 
		// --> 
		/*
		3
		12
		12
		12
		*/

	}
}


/*


*/