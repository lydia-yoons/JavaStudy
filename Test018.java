/*======================
---[[�ڹٱ⺻ ���α׷���]]---
	- �ڹ��� �⺻ ����� : java.util.Scanner
=========================*/

/* �� java.util.Scanner
	�ܶ� ���� ������ ����Ͽ� �Է��� ��ū�� ���� �����ϸ�
	����Ʈ(default)�� ���Ǵ� �ܶ����ڴ� �����̴�.
	�ۼ��� ���� ��ū�� ��next()���޼ҵ带 ���
	�ٸ� ����(�ڷ���)�� ������ ��ȯ�� �� �ִ�.		*/

// ȫ�浿, 90, 80, 70

import java.util.Scanner;

public class Test018{
	public static void main(String[]args){
		// �� �ֿ� ���� ����
		Scanner sc = new Scanner(System.in);
		String name;
		int kor, eng, mat, tot;
		
		// �� ���� �� ó��
		System.out.print("�̸�,����,����,���� ���� �Է�(,�� ����) : " );
		sc = new Scanner(sc.next()).useDelimiter("\\s*,\\s*");
		//               ----------
		//				ȫ�浿, 90,80,70

		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();

		tot = kor + eng + mat;

		// �� ��� ���
		System.out.println();
		System.out.println(">> �̸� : "+ name);
		System.out.println(">> ���� : "+ tot);
	}
}

/*
�̸�,����,����,���� ���� �Է�(,�� ����) : ȫ�浿,80,90,70

>> �̸� : ȫ�浿
>> ���� : 240
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
