/*======================
---[[�ڹٱ⺻ ���α׷���]]---
	- �ڹ��� �⺻ ����� : java.util.Scanner
=========================*/

/* �� java.util.Scanner
	�ܶ� ���� ������ ����Ͽ� �Է��� ��ū�� ���� �����ϸ�
	����Ʈ(default)�� ���Ǵ� �ܶ����ڴ� �����̴�.
	�ۼ��� ���� ��ū�� ��next()���޼ҵ带 ���
	�ٸ� ����(�ڷ���)�� ������ ��ȯ�� �� �ִ�.		*/

//�Է� : "��� ���� �ٳ���"

import java.util.Scanner;

public class Test016{
	public static void main(String[]args) //throws IOException
		{
		// �� �ֿ� ���� ����
		//Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);

		String name;		//�̸�
		int kor, eng, mat; //������ ����

		// �� ���� �� ó��
		System.out.print("�̸��� �Է��ϼ��� : ");
		//br.readLine();
		name = sc.next();

		System.out.print("���� ���� �Է� : ");
		// kor = Integer.parseInt(br.readLine());
		//kor = Integer.parseInt(sc.next());
		kor = sc.nextInt();

		System.out.print("���� ���� �Է� : ");
		eng = sc.nextInt();

		System.out.print("���� ���� �Է� : ");
		mat = sc.nextInt();

		// �� ��� ���
		System.out.println();
		System.out.println(">> �̸� : "+ name);
		System.out.println(">> ���� : "+ (kor + eng + mat));
		
	}
}

/*
�̸��� �Է��ϼ��� : ȫ�浿
���� ���� �Է� : 70
���� ���� �Է� : 50
���� ���� �Է� : 80

>> �̸� : ȫ�浿
>> ���� : 200
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/