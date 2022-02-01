/*======================
---[[�ڹٱ⺻ ���α׷���]]---
	- ������ �ڷ���
	- �ڹ��Ǳ⺻ ����� : BufferedReader Ŭ����
=========================*/

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Test011{
	public static void main(String[]args) throws IOException {
		//BufferedReader �ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//�ֿ亯�� ����
		int r;
		final double PI = 3.141592;
		double a, b;

		//���� �� ó��
		//�� ����ڿ��� �ȳ� �޼��� ���
		System.out.print("���� ������ �Է� : ");

		//�� ����ڰ� �Է��� ���� �޾ƿ� ������ ���� r�� ��Ƴ���
		//r = br.readLine();
		//r = "20";

		//Integer.parseInt() ��Ű������� �Ѱܹ��� ���ڿ� �����͸� ���������� ��ȯ
		r = Integer.parseInt(br.readLine());
		// r = Integer.parseInt("20");
		// r = 20;
		/*-- ����ڰ� �Է��� ���� BufferedReader(br)�� ��readLine()��
			�޼ҵ带 Ȱ���Ͽ� ���ڿ� ���·� �о���� ��
			�� ���� ��integer.parseInt()���� ���� ������(������)���� ��ȯ ��
			���� ������ ������ ���� r�� ��Ƴ���
		*/

		//�� ���� �� �ѷ� ����
		a = r * r * PI;
		b = r * 2 * PI;

		// ��� �� ���
		//System.out.println(">>���� :  " + a);
		//System.out.println(">>�ѷ� :  " + b);

		//System.out.printf(">>���� :�� \n", �ۿ� ���� ��);
		//System.out.printf(">>�ѷ� :�� \n  ", �ۿ� ���� ��);
		
		//System.out.printf(">>���� : %f \n", a);
		//System.out.printf(">>�ѷ� :%f \n ", b);

		System.out.printf(">>���� : %.2f \n", a);
		System.out.printf(">>�ѷ� : %.2f \n", b);
	
	}
}

/*
���� ������ �Է� : 100
>>���� : 31415.92
>>�ѷ� : 628.32
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/