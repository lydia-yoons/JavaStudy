/*======================
������� �帧�� ��Ʈ��(���, ���ǹ��� �ݺ���)����
	- �ݺ���(while) �ǽ�
=========================*/

//����ڷκ��� ������ �� ������ �Է¹޾�
//���� �� ���� ū �� ������ ���� ���Ͽ�
//����� ����ϴ� ���α׷��� �����Ѵ�.

//���� ��)
//ù ��° ���� �Է� : 10
//�� ��° ���� �Է� : 20
// >> 10 ~ 20������ �� : xxx
// >> ����Ϸ��� �ƹ�Ű��..

// ù��° ���� �Է� : 10
// �� ��° ���� �Է� : 2
// >> 2 ~ 10������ �� : 54
// >> ����Ϸ��� �ƹ�Ű��..

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test047{
	public static void main(String[]args) throws IOException {
		//BufferedReader �ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
/* ��
		//���� ����
		int a, b;
		int sum=0, temp; 

		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());

		if (a < b)	// ù��° ���� �ι�° ������ ���� ���
		{
			temp = a;

			while (temp <=b)
			{
				sum += temp;
				temp++;
			}
			
		}
		else if (a > b)	//ù��° ���� �ι�° ������ Ŭ ���
		{
			temp = b;

			while ( temp <=a )
			{
				sum += temp;
				temp++;
			}
		}
		else if ( a == b) // �Է��� �� ���� ���� ���
		{
			System.out.println("�� ���� �����ϴ�.");
		}else{
			System.out.println("�Է� ����");
		}

		System.out.printf(">>%d ~ %d������ �� : %d\n", a , b, sum);
*/

/*		//��
		int a, b, sum, temp;

		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());

		if (a > b)	//���������� ���� ����
		{
			a = a^b;
			b = b^a;
			a = a^b;
		}

		temp = a;

		while (temp <= b)
		{
			sum += temp;
			temp ++;
		}

		//��� ���
		System.out.printf(">>%d ~ %d������ �� : %d\n", a , b, sum);
*/


		//[�Բ� Ǭ �ڵ�]*******************************************
		//���ֿ� ���� ����
		int n;				//���� ������ Ȱ���� ����
		int su1, su2;		//ù ��°, �� ��° �Է°��� ���� ����
		int result = 0;		//�������� ���� ����

		//�ۿ��� �� ó��
		System.out.print("ù ��° ���� �Է� : ");
		su1 = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		su2 = Integer.parseInt(br.readLine());

		//�Է¹��� �� ���� ũ�� �� �� �ڸ� �ٲ�
		// ��, su1�� su2���� ū ��� �� ���� �ڸ��� �ٲ� �� �ֵ��� ó��
		if (su1>su2)
		{
			//�ڸ� �ٲ�
			su1 = su1^su2;
			su2=su2^su1;
			su1=su1^su2;
		}

		//�ݺ� ���� ����
		//�ݺ� ������ �����ϱ� ���� �������� ���� �����Ͽ�
		// ���������� Ȱ���ؾ��Ѵ�.
		//(��� �߷� �������� �ʿ��ϱ� ������)
		n = su1;

		while (n<=su2)
		{
			result += n;
			n++;
		}


		//�۰�� ���
		System.out.printf(">> %d ~ %d ������ �� : %d\n", su1, su2, result);

	}
}

/*
ù ��° ���� �Է� : 10
�� ��° ���� �Է� : 2
>>10 ~ 2������ �� : 54
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/