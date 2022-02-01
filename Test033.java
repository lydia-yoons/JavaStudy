/*======================
������� �帧�� ��Ʈ��(���, ���ǹ��� �ݺ���)����
	- if ~ else�� �ǽ�
=========================*/

/* ����ڷκ��� ������ ���� �� ���� �Է¹޾�
���� ������ ū �� ������ �߷��ϴ� ���α׷� �����Ѵ�.

���� ��)
ù ��° ���� �Է�	: 5		//9
�� ��° ���� �Է�	: 15	//1
�� ��° ���� �Է�	: 10	//9

>> ���� ��� 5 10 15		//5 9 9
//����Ϸ���....

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test033{
	public static void main(String[]args) throws IOException {
		 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//���ֿ� ���� ����
		int a, b, c; //���� ����

		//�ۿ��� �� ó��
		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		c = Integer.parseInt(br.readLine());

/*[���� Ǭ ���]
		if(a >= b && a >=c){
			if(b >= c){
				System.out.printf("���� ��� %d, %d, %d", c, b, a);
			}else{
				System.out.printf("���� ��� %d, %d, %d", b, c, a);
			}
		}else if(b >= c && b >= a){
			if(c >= a){
				System.out.printf("���� ��� %d, %d, %d", a, c, b);
			}else{
				System.out.printf("���� ��� %d, %d, %d", c, a, b);
			}
		}else{
			if(a >= b){
				System.out.printf("���� ��� %d, %d, %d", b, a, c);
			}else{
				System.out.printf("���� ��� %d, %d, %d", a, b, c);
			}
		}
*/

		//[�Բ� Ǭ ���]**********************************
		// 7 8 2	8 6 13
		// ---      ---
		//			6 8 13
		// -   -    -   --
		// 2 8 7    
		//   ---      ----
		// 2 7 8    6 8 13

		if(a>b){//���� ù ��° ����(a)�� �� ��° ����(b)���� ũ�ٸ�..
		//		a�� b �� ������ �ڸ��� �ٲ۴�.
			a = a^b;
			b = b^a;
			a = a^b;
		}
		
		if(a>c){//���� ù ��° ����(a)�� �� ��° ����(c)���� ũ�ٸ�..
		//		a�� c �� ������ �ڸ��� �ٲ۴�.
			a = a^c;
			c = c^a;
			a = a^c;
		}
		
		if(b>c){//���� �� ��° ����(b)�� �� ��° ����(c)���� ũ�ٸ�..
		//		b�� c �� ������ �ڸ��� �ٲ۴�.
			b = b^c;
			c = c^b;
			b = b^c;
		}

		//�۰�� ���
		System.out.printf("\n>> ���� ��� : %d %d %d\n", a, b, c);

	}
}

/*
ù ��° ���� �Է� : 5
�� ��° ���� �Է� : 15
�� ��° ���� �Է� : 10
���� ��� 5, 10, 15����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

ù ��° ���� �Է� : 9
�� ��° ���� �Է� : 5
�� ��° ���� �Է� : 9
���� ��� 5, 9, 9����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

[�Բ� Ǭ ���]
ù ��° ���� �Է� : 7
�� ��° ���� �Է� : 8
�� ��° ���� �Է� : 2

>> ���� ��� : 2 7 8
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

ù ��° ���� �Է� : 15
�� ��° ���� �Է� : 13
�� ��° ���� �Է� : 13

>> ���� ��� : 13 13 15
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/