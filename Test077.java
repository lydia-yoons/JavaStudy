/*======================================
	���� �迭 ����
	- �迭�� ����� �ʱ�ȭ
	- �迭�� �⺻�� Ȱ��
  ======================================*/

// ����ڷκ��� ó�� �Է¹��� �ο� �� ��ŭ��
// �л� �̸��� ��ȭ��ȣ�� �Է¹ް�
// �Է¹��� ������ ��ü ����ϴ� ���α׷��� �����Ѵ�.
// ��, �迭�� Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�. (�̸�, ��ȭ��ȣ �迭 ���� ó��)

// ���� ��)
// �Է� ó���� �л� �� �Է�(��, 1~10) : 24
// �Է� ó���� �л� �� �Է�(��, 1~10) : 3
// �̸� ��ȭ��ȣ �Է�[1](���� ����) : ȫ�浿 010-1111-1111
// �̸� ��ȭ��ȣ �Է�[2](���� ����) : ��Ѹ� 010-2222-2222
// �̸� ��ȭ��ȣ �Է�[3](���� ����) : ���浿 010-3333-3333

//---------------------
// ��ü �л� �� : 3��
//---------------------
// �̸�		��ȭ��ȣ
//ȫ�浿 010-1111-1111
//��Ѹ� 010-2222-2222
//���浿 010-3333-3333
//---------------------
//����Ϸ��� �ƹ� Ű�� ��������...

import java.util.Scanner;

public class Test077{
	public static void main(String[] args){
		//Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);

/*[���� Ǭ ���]
		//���� ����
		int a; //��� �� 
		String[] name;	//�̸� �迭
		String[] num;	//��ȣ �迭

		do
		{
			System.out.print("�Է� ó���� �л� �� �Է�(��, 1~10) : ");
			a = sc.nextInt();
			name = new String[a];	//��� �� ��ŭ �迭����
			num = new String[a]; //��� �� ��ŭ �迭����
		}
		while (a<1 || 10<a);	// 1~10 ���̰��� �޴´�

		for (int i=0; i<name.length; i++)
		{
			System.out.printf("�̸� ��ȭ��ȣ �Է�[%d](���� ����) :", i+1);
			name[i] = sc.next(); //�̸� �ޱ�
			num[i] = sc.next();  // ��ȣ �ޱ�
		}
		System.out.println();
		System.out.println("---------------------");
		System.out.println("��ü �л� �� : "+a+"��");
		System.out.println("---------------------");
		System.out.println(" �̸�	��ȭ��ȣ ");
		for (int i=0; i<name.length; i++)
		{
			System.out.println(name[i]+"  "+num[i]);
		}
		System.out.println("---------------------");
*/

		// ����ڰ� �Է��ϴ� �л����� ��� �� ����
		int memCount = 0;
		
		do
		{
			System.out.print("�Է� ó���� �л� �� �Է�(��, 1~10) : ");
			memCount = sc.nextInt();
		}
		while (memCount<1 || memCount>10); //1���� �۾Ƶ� �ݺ�, 10���� Ŀ�� �ݺ�
		
		//�׽�Ʈ
		//System.out.print("����ڰ� �Է��� �ο��� Ȯ�� : "+memCount);

		//�迭 ����(�̸�, ��ȭ��ȣ) - ����ڷκ��� �Է¹��� �ο��� ��ŭ�� �迭�� ����

		// �̸� ���� �迭
		String[] names = new String[memCount];

		//��ȭ��ȣ ���� �迭
		String[] tels = new String[memCount];
		//��String[] tels = new String[names.length];���� ������ ����

		for (int i=0; i<memCount; i++)
		{
			System.out.printf("�̸� ��ȭ��ȣ �Է�[%d](���� ����) :", i+1);
			
			names[i] = sc.next(); //�̸� �ޱ�
			tels[i] = sc.next();  // ��ȣ �ޱ�

		}

		//�������(�̸�, ��ȭ��ȣ) ���
		System.out.println();
		System.out.println();
		System.out.println("---------------------");
		System.out.println("��ü �л� �� : "+memCount+"��");
		System.out.println("---------------------");
		System.out.println(" �̸�	��ȭ��ȣ ");
		for (int m=0; m<names.length; m++)
			System.out.printf("%4s, %s\n",names[m], tels[m]);
		System.out.println("---------------------");
		
	}
}

/*
�Է� ó���� �л� �� �Է�(��, 1~10) : 24
�Է� ó���� �л� �� �Է�(��, 1~10) : 3
�̸� ��ȭ��ȣ �Է�[1](���� ����) :ȫ�浿 010-1111-1111
�̸� ��ȭ��ȣ �Է�[2](���� ����) :��Ѹ� 010-2222-2222
�̸� ��ȭ��ȣ �Է�[3](���� ����) :���浿 010-3333-3333

---------------------
��ü �л� �� : 3��
---------------------
 �̸�   ��ȭ��ȣ
ȫ�浿  010-1111-1111
��Ѹ�  010-2222-2222
���浿  010-3333-3333
---------------------
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/