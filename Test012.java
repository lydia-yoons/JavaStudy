/*======================
---[[�ڹٱ⺻ ���α׷���]]---
	-����
	 �ﰢ���� �غ��� ���̿� ���̸� ����ڷκ��� �Է¹޾�
	 �� �ﰢ���� ���̸� ���ϴ����α׷��� �����Ѵ�.
=========================*/


// ���� ��)
// [[�ﰢ���� ���� ���ϱ�]]
// - �ﰢ���� �غ� �Է� : 3
// - �ﰢ���� ���� �Է� : 5
// >> �غ��� 3, ���̰� 5�� ������� ���� : xxxx

// �ػﰢ���� ���� = �غ� * ���� /2
//					------------ �κ��� ����ڷκ��� 
//								�Է¹޾� ó�� -> BufferedReader Ȱ��

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test012{
	public static void main(String[]args) throws IOException{
		
		/* [���� Ǭ �ڵ�]
		// �Է¹��� �غ�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int a, b;
		double c; //���� ����

		System.out.print("- �ﰢ���� �غ� �Է� : ");
		a = Integer.parseInt(br.readLine()); //�غ� �� �Է¹ޱ�

		System.out.print("- �ﰢ���� ���� �Է� : ");
		b = Integer.parseInt(br.readLine()); //���� �Է� �ޱ�

		c = (double)(a * b) / 2; //�ﰢ�� ���� ���
	
		//System.out.println(">> �غ��� "+ a + ", ���̰� " + b + "�� �ﰢ���� ���� : " + c);
		System.out.printf(">> �غ��� %d, ���̰� %d�� �ﰢ���� ���� : %.2f \n", a,b,c);
		*/

		//[�Բ� Ǯ���� ����]
		
		//���ֿ� ���� ����
		
		//BufferedReader �ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		int bottomLength, height;	//--�غ��� ����
		double area;				//--����		check!

		//�ۿ��� ��ó��
		//�� ����ڿ��� �ȳ� �ż�������ϱ�
		System.out.println("[[�ﰢ���� ���� ���ϱ�]]");
		System.out.print("- �ﰢ���� �غ� �Է� : ");

		//�� ����ڰ� �Է��� �����͸� ���� ���·� ��ȯ�� ��,
		//	���� bottomLength�� ��Ƴ���
		bottomLength = Integer.parseInt(br.readLine());

		//�� �ٽ� ����ڿ��� �ȳ� �޼��� ���
		System.out.print("- �ﰢ���� ���� �Է� : ");

		//�� ����ڰ� �Է��� �����͸� �������·� ��ȯ �� ��,
		//  ���� height�� ��Ƴ���
		height = Integer.parseInt(br.readLine());

		//�� ���� ä����(�����) �������� Ȱ���Ͽ�
		// �ﰢ���� ���̸� ���ϴ� ���� ����
		//area = bottomLength * height / 2;
		//		������		  ������  ������ -> ������� ����

		area = bottomLength * height / 2.0;		// check !
		//		�Ǽ���		  �Ǽ���  �Ǽ��� -> �Ǽ���� ����

		// �ؽǼ� �ڷ����� ��������� ����Ǵ� ��������
		//	�Ǽ� ����� ������ �ʿ��� ��Ȳ�̴�.
		//	������ 2�� �ƴ� �Ǽ��� 2.0���� ������ ������ �����ϰ� �Ǹ�
		// �� ������ �Ǽ� ������� ó���ȴ�.
		
		//�۰�� ���
		System.out.println();	//����
		//System.out.printf();	//�Ű����� ������� �����߻�

		System.out.printf(">> �غ��� %d, ���̰� %d�� �ﰢ���� ���� : %.2f \n"
							, bottomLength,height,area);

	}
}

/*
[�� ���]
- �ﰢ���� �غ� �Է� : 3
- �ﰢ���� ���� �Է� : 5
>> �غ��� 3, ���̰� 5�� �ﰢ���� ���� : 7.50
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

[�Բ��� ���]
[[�ﰢ���� ���� ���ϱ�]]
- �ﰢ���� �غ� �Է� : 15
- �ﰢ���� ���� �Է� : 15

>> �غ��� 15, ���̰� 15�� �ﰢ���� ���� : 112.50
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/