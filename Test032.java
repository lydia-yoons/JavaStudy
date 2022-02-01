/*======================
������� �帧�� ��Ʈ��(���, ���ǹ��� �ݺ���)����
	- if ~ else�� �ǽ�
=========================*/

/* ����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
�ش� �������� ���� ó�� ����� ����ϴ� ���α׷��� �����Ѵ�.
��, if���ǹ��� Ȱ���Ͽ� ó���� �� �ֵ��� �ϸ�,
���� ����� ���ǻ� ���������� ó������ �� �ֵ��� �Ѵ�.

���� ��)
ù ��° ���� �Է�	: 20
�� ��° ���� �Է�	: 14
������ �Է�[+ - * /]: +

>> 20 + 14 = 34
//����Ϸ���....

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test032{
	public static void main(String[]args) throws IOException {
		 
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
/* [���� �ۼ��� �ڵ�]
		 //���� ����
		 int n1, n2;
		 char a;
		 int b;

		 System.out.print("ù ��° ���� �Է� : ");
		 n1 = Integer.parseInt(br.readLine());

		 System.out.print("�� ��° ���� �Է� : ");
		 n2 = Integer.parseInt(br.readLine());
		
		 System.out.print("������ �Է� [+ - * /] : ");
		 a = (char)(br.read());		
		 
		 if (a == '+'){
			b = (n1 + n2);
		 }else if ( a == '-') {
			b = (n1 - n2);
		 }else if ( a == '*') {
			b = (n1 * n2);
		 }else if ( a == '/') {
			b = (n1 / n2);
		 }else{
			System.out.println("�����ȣ�� �ٸ��� �Է��Ͻÿ�.");
			b=0;
		 }

		 //���
		 System.out.printf("\n>> %d %c %d = %d\n", n1, a, n2, b);
*/
		
		//[�Բ� Ǭ �ڵ�]********************************************

/*		// ��� ��
		int a, b;		// ù ��°, �� ��° ����
		char op;		// ������
	
		System.out.print("ù ��° ���� �Է� : ");
		 a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());
		
		//Integer.parseInt()
		//"1234" �� Integer.parseInt() �� 1234
		//"abcd" �� Integer.parseInt() �� ��ȯ �ȵ�
 		System.out.print("������ �Է� [+ - * /] : ");
		//op = Integer.parseInt(System.in.read());  // "+"�̱⶧���� 
		op = (char)System.in.read(); 
		 
		//Ȯ��
		//System.out.println("op : "+op);

		if (op == '+') // 43 == 43
		{ 
			System.out.printf("\n>> %d + %d = %d\n",a, b,(a+b));
		}
		else if ( op == '-') // 45 == 45
		{
			System.out.printf("\n>> %d - %d = %d\n",a, b,(a-b));
		}
		else if ( op == '*') // 42 == 42
		{
			System.out.printf("\n>> %d * %d = %d\n",a, b,(a*b));
		}
		else if ( op == '/')  // 47 == 47
		{
			System.out.printf("\n>> %d / %d = %d\n",a, b,(a/b));
		}
		else
		{
			System.out.println("�Է°����� ������ �����մϴ�.");
		}
*/

/*
		// ��� �� �����ڸ� int������ �޴� ���
		int a, b, op;		// ù ��°, �� ��° ����, ������
	
		System.out.print("ù ��° ���� �Է� : ");
		 a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());
		
 		System.out.print("������ �Է� [+ - * /] : ");
		op = System.in.read(); 
		 
		//Ȯ��
		if (op == 43) // 43 == 43 
			System.out.printf("\n>> %d + %d = %d\n",a, b,(a+b));
		else if ( op == 45) // 45 == 45
			System.out.printf("\n>> %d - %d = %d\n",a, b,(a-b));
		else if ( op == 42) // 42 == 42
			System.out.printf("\n>> %d * %d = %d\n",a, b,(a*b));
		else if ( op == 47)  // 47 == 47
			System.out.printf("\n>> %d / %d = %d\n",a, b,(a/b));
		else
			System.out.println("�Է°����� ������ �����մϴ�.");
*/

		// ��� �� ��±��� �ϳ��� �����
		int a, b, result = 0;		// ù ��°, �� ��° ����, ���� ��� ��
		char op;		//������
	
		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());
		
 		System.out.print("������ �Է� [+ - * /] : ");
		op = (char)System.in.read(); 
		 
		//Ȯ��
		//System.out.println("op : "+op);

		if (op == '+')
			result = a + b;
		else if ( op == '-') 
			result = a - b;
		else if ( op == '*')
			result = a * b;
		else if ( op == '/') 
			result = a / b;
		
		System.out.printf("\n %d %c %d = %d\n",a, op, b, result);


	}
}

/*
ù ��° ���� �Է� : 5
�� ��° ���� �Է� : 10
������ �Է� [+ - * /] : +

>> 5 + 10 = 15
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

ù ��° ���� �Է� : 15
�� ��° ���� �Է� : 5
������ �Է� [+ - * /] : /

>> 15 / 5 = 3
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/