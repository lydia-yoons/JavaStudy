/*======================================
	���� Ŭ������ �ν��Ͻ� ����
  ======================================*/

// ���簢�� Ŭ���� ����

/*
���簢���� ���̿� �ѷ� ���, Ŭ������ ǥ��

Ŭ������ ��ü�� �� ���簢��
Ŭ������ �Ӽ� �� ����, ����, (����, �ѷ�, ����, ����, ����, ����,...)
Ŭ������ ��� �� ���� ���, �ѷ� ���, ���μ��� �Է�, ��� ���

��ü�� ����		�� ������(�Ӽ�, ����) + ���(����, ����)
	��					 ��					  ��
Ŭ������ ����	��		����		  +		�޼ҵ�

class ���簢��{
	//������(�Ӽ�, ����) �� ����
	int ����, ����;

	//���(����, ����) �� �޼ҵ�
	���μ��� �Է�()
	{

	}

	�ѷ� ���()
	{
	}

	���� ���()
	{
	}

	��� ���()
	{
	}


}

*/

import java.util.Scanner;

class Rect	//���簢�� Ŭ���� ����
{
	//������(�Ӽ�, ����) �� ����
	int w, h;		//����, ����

	//���(����, ����) �� �޼ҵ�
	void input()		//���� ���� �Է� �޼ҵ�
	{	//�Է��� �ޱ⸸ �ϴϱ� ��ȯ �� �ʿ�� ����!

		Scanner sc = new Scanner(System.in);

		System.out.print("���� �Է� : ");
		w = sc.nextInt();

		System.out.print("���� �Է� : ");
		h = sc.nextInt();
	}

	int calLength()	//�ѷ� ��� = (���� + ����) * 2
	{
		// ��������� ��ȯ�ϰ� �� ���� ���� �� �ʱ�ȭ
		int result = 0;

		//������ ������ �� ä���ֱ�
		//result = (���� + ����) * 2
		result = (w + h) * 2;

		// ���� ����� ��ȯ
		return result;
	}

	int	calArea()	//���� ��� = ���� * ����
	{
		int result = 0;

		result = w * h;

		return result;
	}

	void print(int a, int l)	//��� ���()
	{
		//���� : 10
		//���� : 20
		//���� : xxx
		//�ѷ� : xxx

		System.out.println("���� : " + w);
		System.out.println("���� : " + h);
		System.out.println("���� : " + a);
		System.out.println("�ѷ� : " + l);
	}
}


// �� �ϳ��� �ڹ� ����(.java)�� �������� Ŭ����(class)�� ���� �� �ִ�.
//		������, ��public class���� �ϳ��� �� �� �ִ�.
//		������ ������ ���� �̸���
//		�� ��public class���� �̸����� �����ؼ� �����ؾ��ϳ�.
//		�Ϲ������δ� �ϳ��� ���Ͽ� �ϳ��� Ŭ������ �����Ѵ�.
//		����, ���� ���� Ŭ������ ����� ������ �������ϰ� �Ǹ�
//		���ο� ���� �� Ŭ������ �� ��ŭ Ŭ���� ����(.class)�� �Ļ��ȴ�.

public class Test065{

	public static void main(String[]args){
		
		//Rect Ŭ���� �ν��Ͻ� ����
		Rect ob = new Rect();
		
		//������ �ν��Ͻ� ob�� Ȱ���Ͽ� �Է� �޼ҵ� ȣ��
		ob.input();

		//������ �ν��Ͻ� ob�� ���� ���� ���� �޼ҵ� ȣ��
		// �� �޼ҵ� ȣ��� �� ���� ��Ƴ� �غ�
		int area = ob.calArea();
		
		//������ �ν��Ͻ� ob�� ���� �ѷ� ���� �޼ҵ� ȣ��
		// �� �޼ҵ� ȣ��� �� ���� ��Ƴ� �غ�
		int length = ob.calLength();

		//������ �ν��Ͻ� ob�� ���� ��¸޼ҵ� ȣ��
		// �� �޼ҵ� ȣ��� �� ���� ��Ƴ� �غ�
		ob.print(area, length);
	}
}

/*
���� �Է� : 10
���� �Է� : 20
���� : 10
���� : 20
���� : 200
�ѷ� : 60
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/