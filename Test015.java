/*======================
---[[�ڹٱ⺻ ���α׷���]]---
	- �ڹ��� �⺻ ����� : ���Ĺ���
=========================*/

public class Test015{
	public static void main(String[]args){
		System.out.print("AAA");
		System.out.print("BBB");
		//System.out.print("CCC"\n);	//--> �����߻�(������ ����)
		System.out.print("CCC\n");
		//��---->AAABBBCCC

		System.out.println();			//-- ����
		//System.out.print();			//--> �����߻�(������ ����)

		System.out.printf("12345678901234567890");
		System.out.printf("12345678901234567890\n");	//-- ��\n���� ����
		System.out.printf("12345678901234567890%n");	// printf()������ ��%n���� ����

		System.out.printf("%d + %d = %d%n", 10, 20, 30);
		//��------> 10 + 20 = 30

		System.out.printf("%d\n",123);
		System.out.printf("%10d\n",123);
		System.out.printf("%8d\n",1234);
		System.out.printf("%010d\n",123);
		/*
		123
		       123
		    1234
		0000000123
		*/
		
		System.out.printf("%+d\n",365); //������ �̷��Ծ��� ������
		System.out.printf("+%d\n",365);	//������ �̷��� ����.
		/*
		+365
		+365
		*/

		System.out.printf("%d\n", +365);
		//��-------> 365
		
		//System.out.printf("%-d\n",365);
		//��----> ���� �߻�(��Ÿ�� ����)
		System.out.printf("-%d\n",365);
		//��----> -365
		System.out.printf("%d\n", -365);
		//��----> -365

		System.out.printf("%(d\n", -365);
		//��----> (365)
		System.out.printf("%(d\n", 365);
		//��----> 365

		//System.out.printf("%d\n", 'A');
		//��----> ���� �߻�(��Ÿ�� ����) %d�� �������̴ϱ�
		System.out.printf("%c\n", 'A');
		//��---> A

		//System.out.printf("%c\n", "ABCD");
		//��----> ���� �߻�(��Ÿ�� ����) %c�� �������̴ϱ�
		System.out.printf("%s\n", "ABCD");
		//��---> ABCD

		System.out.printf("%h\n", 365);
		//��--->  16d
		System.out.printf("%o\n", 24);
		// ��---> 30  //8������ ǥ��

		System.out.printf("%b\n", true);
		// ��---> true

		System.out.printf("%f\n", 123.23);
		// ��---> 123.230000
		System.out.printf("%.2f\n", 123.23);
		// ��---> 123.23
		System.out.printf("%.2f\n", 123.231);
		// ��---> 123.23
		System.out.printf("%.2f\n", 123.236);
		// ��---> 123.24   �ݿø� �Ͼ
		
		//System.out.printf("%10d\n", 123);
		System.out.printf("%8.2f\n", 123.236);
		// ��--->   123.24   ��ü 8�ڸ� Ȯ��. �Ҽ������� ���ڸ��� ������. ���� �տ����� 2ĭ
		System.out.printf("%2.2f\n", 123.236);
		// ��---> 123.24   ���� ǥ���ϴ� �����ͺ��� ���� �ڸ�Ȯ���� ������.

		}
}

/*
AAABBBCCC

1234567890123456789012345678901234567890
12345678901234567890
10 + 20 = 30
123
       123
    1234
0000000123
+365
+365
365
-365
-365
(365)
365
A
ABCD
16d
30
true
123.230000
123.23
123.23
123.24
  123.24
123.24
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/