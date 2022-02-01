/*======================
������� �帧�� ��Ʈ��(���, ���ǹ��� �ݺ���)����
	- switch�� �ǽ�
=========================*/

/*
�� ���� ���ù��̶��ϸ�, switch�� ������ ���� ���� ����
	���� ������ ���� �������� �б��� �� ����ϴ� �����̴�.
�� ���� �� ����
	switch(����)
	{
		case ���1 : ����1; [break;]
		case ���2 : ����2; [break;]
			   :
		 [default : ����n+1; [break;]]
	}

	switch���� �����ġ��� case�� ���������
	byte, short, int, long�̾���Ѵ�.
	
	case�� �ڿ� ��break;���� ���� ������ ���,
	���� case���� ������ ����ؼ�(�̾) �����ϰ� �ȴ�. (�� �⺻��)
*/

//����� �̸��� ȫ�浿 �Դϴ�.
// ������ xx, ����� xx�Դϴ�.
// ����� A�Դϴ�.

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Test036{
	public static void main(String[]args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("�̸� �Է� : ");
		String name = br.readLine();

		System.out.print("�������� �Է� : ");
		int kor = Integer.parseInt(br.readLine());
		
		System.out.print("�������� �Է� : ");
		int eng = Integer.parseInt(br.readLine());
		
		System.out.print("�������� �Է� : ");
		int mat = Integer.parseInt(br.readLine());

		//��� - ���ǻ� ������ ó��
		int avg = (kor + eng + mat)/3 ;
		
		char grade;

		switch(avg/10){
			case 10 : case 9:
				grade = 'A';
				break;
			case 8 :
				grade = 'B';
				break;
			case 7 :
				grade = 'C';
				break;
			case 6 :
				grade = 'D';
				break;
			default :
				grade = 'F';
				break;
		}
		
		System.out.printf("����� �̸��� %s�Դϴ�. \n", name);
		System.out.printf("������ %d, ����� %d�Դϴ�.\n", (avg*3), avg);
		System.out.printf("����� %c�Դϴ�.\n",grade);


	}
}

/*
�̸� �Է� : ȫ�浿
�������� �Է� : 90
�������� �Է� : 85
�������� �Է� : 70
����� �̸��� ȫ�浿�Դϴ�.
������ 243, ����� 81�Դϴ�.
����� B�Դϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

�̸� �Է� : �ƹ���
�������� �Է� : 10
�������� �Է� : 30
�������� �Է� : 20
����� �̸��� �ƹ����Դϴ�.
������ 60, ����� 20�Դϴ�.
����� F�Դϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/