/*======================
---[[������(Operator)]]---
	- ���� ������ == ���� ������
=========================*/

//����ڷκ��� ������ ������ �Է¹޾�
// �Է¹��� ������ �������, ��������, 0���� �����Ͽ�
// �� ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, �Է� �����ʹ�BufferedReader �� readLine()�� ���� �Ѱܹ޵��� �Ѵ�.
// ����, ���ǿ�����(���� ������)�� Ȱ���Ͽ� ����� �����Ѵ�.

//���� ��)
//������ ���� �Է� :-12
// -12 �� ����
//��� �ϰų�....

//������ ���� �Է� : 257
// 257 �� ���
//��� �ϰų�....

//������ ���� �Է� : 0
// 0 �� ��
//��� �ϰų�....

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test027{
	public static void main(String[]args) throws IOException{
		//BufferedReader �ν��Ͻ�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//�ֿ� ���� ����
		int n;					// ����� �Է°��� ���� ����
		String strResult;		// �������� ������� ������ �Ǻ� ����� ���� ����
	
		//���� �� ó��
		System.out.print("������ ���� �Է� : ");
		n = Integer.parseInt(br.readLine());
		/*
		n�� 0���� ũ�� �� true  �� n�� ���
					   �� false �� n�� 0�̴� �� true  �� n�� ��
											 �� false �� n�� ����
		*/

		strResult = (n > 0) ? "���" : (n == 0 ? "��" : "����");
		// 10
		// strResult = 

		//��� ���
		System.out.printf("%d �� %s\n", n, strResult);
		
	}
}