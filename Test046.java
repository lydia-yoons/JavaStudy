/*======================
������� �帧�� ��Ʈ��(���, ���ǹ��� �ݺ���)����
	- �ݺ���(while) �ǽ�
=========================*/

// ����ڷκ��� ������ ������ �Է¹޾�
// �Է¹��� ������ �Ҽ����� �ƴ����� �Ǻ��Ͽ�
//����� ����ϴ� ���α׷��� ����

// ���� ��)
// ������ ���� �Է� : 10
// 10 �� �Ҽ� �ƴ�
// ����Ϸ��� �ƹ� Ű�� ��������

// ������ ���� �Է� : 11
// 11 �� �Ҽ�
// ����Ϸ��� �ƹ� Ű��...

// �ؼҼ� : 1 �Ǵ� �ڱ� �ڽ��� �� �̿��� � ���ε� ������ �������� �ʴ� ��.
//			��, 1�� �Ҽ��ƴ�.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test046{
	public static void main(String[]args) throws IOException{
		//BufferedReader �ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

/*[���� ģ �ڵ�]
		int a, b=1; //���� ����

		System.out.print("������ ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		while (b++ <= a){

			System.out.println("test : "+b);
			
			if (a == b){ //�ڱ��ڽŰ� ������ ��������
				System.out.printf("%d �� �Ҽ�\n",a);
				break;
			}
			if (a%b == 0){	//������ ��������
				System.out.printf("%d �� �Ҽ� �ƴ�\n",a);
				break;
			}
			if(a == 1){	// 1�� ���� �Ҽ��ƴ�
				System.out.printf("%d �� �Ҽ� �ƴ�\n",a);
				break;
			}
		}
*/

		//[�Բ� Ǭ �ڵ�]***********************************
		int num;	//����� �Է°��� ��Ƴ� ����

		//���� �� ó��
		System.out.print("������ ���� �Է� : ");
		num = Integer.parseInt(br.readLine());

		int n = 2;	//�Է°��� ������� ������ ������ ������ ����
					// (1�� ����)	5 �� 2 3 4

		boolean flag = true;	//�Ҽ���~!

		while (n < num){	//num = 5 �� n=2~4 // num = 14 �� n=2~13

			//�Է°�(num)�� n���� ������ ���������� Ȯ��
			if (num%n == 0)
			{
				//num�� �Ҽ��� �ƴϴ�.
				flag = false;	//����~ �Ҽ� �ƴϾ���!
				break;  //if���� �����°� �ƴ�, while���� ���������� ���̴�.
			}
			
			n++;
		}


		// ��� ���(�߷� ���� �����ؾ� �� �߰� Ȯ�� �� 1���� �ƴ����� ���� �߰� ����)
		if (flag == ture && num !=1)
			System.out.printf("%d �� �Ҽ�\n", num);
		else
			System.out.printf("%d �� �Ҽ� �ƴ�\n", num);
			

	}
}

/*
������ ���� �Է� : 10
10 �� �Ҽ� �ƴ�
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

������ ���� �Է� : 1
1 �� �Ҽ� �ƴ�
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

������ ���� �Է� : 3
3 �� �Ҽ�
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/