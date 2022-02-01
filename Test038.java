/*======================
������� �帧�� ��Ʈ��(���, ���ǹ��� �ݺ���)����
	- switch�� �ǽ�
=========================*/

/* ����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
�ش� �������� ���� ó�� ����� ����ϴ� ���α׷��� �����Ѵ�.
��, switch���� Ȱ���Ͽ� ó���� �� �ֵ��� �ϸ�,
���� ����� ���ǻ� ���������� ó������ �� �ֵ��� �Ѵ�.

���� ��)
ù ��° ���� �Է�	: 20
�� ��° ���� �Է�	: 14
������ �Է�[+ - * /]: +

>> 20 + 14 = 34
//����Ϸ���...
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test038{
	public static void main(String[]args) throws IOException {
		//BufferedReader �ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

/*[���� Ǭ �ڵ�]
		//���� ����
		int n1, n2;
		char a;
		
		//���� �� ó��
		System.out.print("ù ��° ���� �Է� : ");
		n1 = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		n2 = Integer.parseInt(br.readLine());

		System.out.print("������ �Է� : ");
		a = (char)System.in.read();			//������

		//switch �� ����
		switch (a)
		{
		case '+':
			System.out.printf("%d %c %d = %d\n", n1, a, n2, (n1+n2));
			break;
		case '-':
			System.out.printf("%d %c %d = %d\n", n1, a, n2, (n1-n2));
			break;
		case '*':
			System.out.printf("%d %c %d = %d\n", n1, a, n2, (n1*n2));
			break;
		case '/':
			System.out.printf("%d %c %d = %d\n", n1, a, n2, (n1/n2));
			break;
		default:
			System.out.println("�Է� ����~!!");
			break;		
		}
*/ 

/*		//��[�Բ� Ǭ �ڵ�] ***********************
		int a, b, result;
		int op;

		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("������ �Է� : ");
		op = System.in.read();

		// + �� 43, - �� 45, * �� 42, / �� 47
		switch (op)
		{
			case 43: result=a+b; break;
			case 45: result=a-b; break;
			case 42: result=a*b; break;
			case 47: result=a/b; break;
			default : return;	//
		}
		
		System.out.println();
		System.out.printf(">> %d %c %d = %d\n", a, op, b, result);
*/

/*		
		//��[�Բ� Ǭ �ڵ�] ***********************
		int a, b, result;
		char op;

		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("������ �Է� : ");
		op = (char)System.in.read();

		switch (op)
		{
			case '+': result=a+b; break;
			case '-': result=a-b; break;
			case '*': result=a*b; break;
			case '/': result=a/b; break;
			default : return;	
		}

		System.out.println();
		System.out.printf(">> %d %c %d = %d\n", a, op, b, result);
*/
		
		//��[�Բ� Ǭ �ڵ�] ***********************
		int a, b, result;
		String op;			//check~~!

		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("������ �Է� : ");
		op = br.readLine();		//���ڿ� �о�������ؼ� --check~~!

		switch (op)				//check~~!
		{
			case "+": result=a+b; break;
			case "-": result=a-b; break;
			case "*": result=a*b; break;
			case "/": result=a/b; break;
			default : return;	
		}

		System.out.println();
		System.out.printf(">> %d %s %d = %d\n", a, op, b, result);

	}
}

/*
ù ��° ���� �Է� : 5
�� ��° ���� �Է� : 2
������ �Է� : *
5 * 2 = 10
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

ù ��° ���� �Է� : 20
�� ��° ���� �Է� : 2
������ �Է� : /
20 / 2 = 10
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/