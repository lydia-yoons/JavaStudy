/*======================
������� �帧�� ��Ʈ��(���, ���ǹ��� �ݺ���)����
	- switch�� �ǽ�
=========================*/

/*1���� 3������ ���� �� �ϳ��� ����ڷκ��� �Է¹޾�
  �Է¹��� ������ŭ�� ������(��)�� ��µǴ� ���α׷��� �ۼ��Ѵ�.
  ��, �� ���� ������� �����Ҽ� �ֵ��� �Ѵ�.

  �� switch���� �Ϲ� ���� ����Ͽ� �ذ�
  �� switch���� �⺻ ���� ����ϵ�,
	��break;���� �� �� ���� ����� �� �ֵ��� ����

���� ��)
������ ���� �Է�(1~3) : 3
�ڡڡ�
����Ϸ��� �ƹ�Ű��...

������ ���� �Է�(1~3) : 1
��
����Ϸ��� �ƹ�Ű��...

������ ���� �Է�(1~3) : 7
�Է� ����~!
����Ϸ��� �ƹ�Ű��...

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test037{
	
	public static void main(String[]args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num;
		String star="";
		
		System.out.print("������ �����Է�(1~3) : ");
		num = Integer.parseInt(br.readLine());
		
		//��
		System.out.println("��� ���");
		switch (num){
		case 1:
			star = "��";
			break;
		case 2:
			star = "�ڡ�";
			break;
		case 3:
			star = "�ڡڡ�";
			break;
		default :
			System.out.println("�Է� ���� !");
		    break;
		}


		//��
		System.out.println("��� ���");
		switch(num){
			default :
				System.out.println("�Է� ���� !");
				break;
			case 3 :
				star = "��";
			case 2 :
				star = star+"��";
			case 1 :
				star = star+"��";
			
		}

		System.out.printf("%s", star);
		System.out.println();
	
	}
}

/*
��
������ �����Է�(1~3) : 3
�ڡڡ�
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

������ �����Է�(1~3) : 6
�Է� ���� !
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

��
������ �����Է�(1~3) : 2
�ڡ�
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

������ �����Է�(1~3) : 8
�Է� ���� !

����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/