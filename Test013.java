/*======================
---[[�ڹٱ⺻ ���α׷���]]---
	-������ �ڷ���
	- �ڹ��� �⺻ ����� : BufferedReader Ŭ����
=========================*/

//����ڷκ��� �̸�, ��������, ��������, ���������� �Է¹޾�
// �̸��� ������ ����ϴ� ���α׷��� �����Ѵ�.

//���� ��)
//�̸��� �Է��ϼ��� : ������ 
//���� ���� �Է� : 90
//���� ���� �Է� : 80
//���� ���� �Է� : 70

//====[���]====
//�̸� : ������
//���� : 240

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test013{
	public static void main(String[]args) throws IOException{

		/* [�� �ڵ�]
		//BufferedReader�ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//��������
		String name; // �̸�
		int a, b, c, s; // ������, ���� ���� ����
		
		//�̸� �Է¹ޱ�
		System.out.print("�̸��� �Է��ϼ��� : ");
		name = br.readLine(); 

		//���� ���� �Է� �ޱ�
		System.out.print("���� ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		// ���� ���� �Է� �ޱ�
		System.out.print("���� ���� �Է� : ");
		b = Integer.parseInt(br.readLine());

		//���� ���� �Է� �ޱ�
		System.out.print("���� ���� �Է� : ");
		c = Integer.parseInt(br.readLine());

		//���� ���ϱ�
		s = a + b + c;
		
		//��� ���
		System.out.printf("\n====[���]====\n");
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+ s);
		
		*/

		//[�Բ� Ǭ �ڵ�]***************************************

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		String strName;			//�̸� ���� (�밡����ǥ���
		int nKor, nEng, nMat;	//����, ����, ���� ���� ����
		int nTot;				// ��������

		//�߰����� ����
		String strTemp;			//���ڿ� ������ �ӽ� ���� ����

		//�ۿ��� �� ó��
		//-����ڿ��� �ȳ� �޼��� ���(�̸� �Է� �ȳ�)
		System.out.print("�̸��� �Է��ϼ��� : ");

		//-����ڰ� �Է��� ��(�ܺ� ������)�� ������ ��Ƴ���
		strName = br.readLine();

		//-����ڿ��� �ȳ� �޼��� ���(���� ���� �Է� �ȳ�)
		System.out.print("���� ���� �Է� : ");

		//-����ڰ� �Է��� ��(�ܺ� ������)�� ������ ��Ƴ���
		strTemp = br.readLine();		

		//-��Ƴ� ���� �ʿ��� ������ �Ű� ���
		nKor = Integer.parseInt(strTemp);		//90
		//-- �ӽ� ���� ���� strTemp�� ����ִ°��� �� ��ȯ ��, ���� ������ ���

		//-����ڿ��� �ȳ� �޼��� ���(���� ���� �Է� �ȳ�)
		System.out.print("���� ���� �Է� : ");

		//-����ڰ� �Է��� ��(�ܺ� ������)�� ������ ��Ƴ���
		strTemp = br.readLine();		//"80"

		//-��Ƴ� ���� �ʿ��� ������ �Ű� ���
		nEng= Integer.parseInt(strTemp);
		//-- �ӽ� ���� ���� strTemp�� ����ִ°��� �� ��ȯ ��, ���� ������ ���

		//-����ڿ��� �ȳ� �޼��� ���(���� ���� �Է� �ȳ�)
		System.out.print("���� ���� �Է� : ");
		strTemp = br.readLine();	
		nMat= Integer.parseInt(strTemp);
		//-- �ӽ� ���� ���� strTemp�� ����ִ°��� �� ��ȯ ��, ���� ������ ���

		//-�� ���� ������ ����ִ� ������(�Է� ������)���� �����Ͽ� ���� �����ϰ�
		// �� ����� ���� ������ ��Ƴ���
		nTot = nKor + nEng + nMat;

		//�۰�� ���
		System.out.println("\n====[���]====");
		System.out.printf("�̸� : %s\n", strName);
		System.out.printf("���� : %d\n", nTot);
	}
}

/*
[�� �ڵ� ���]
�̸��� �Է��ϼ��� : ������
���� ���� �Է� : 90
���� ���� �Է� : 80
���� ���� �Է� : 70

====[���]====
�̸� : ������
���� : 240
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

[�Բ� Ǭ �ڵ� ���]
�̸��� �Է��ϼ��� : ȫ�浿
���� ���� �Է� : 90
���� ���� �Է� : 80
���� ���� �Է� : 70

====[���]====
�̸� : ȫ�浿
���� : 240
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/