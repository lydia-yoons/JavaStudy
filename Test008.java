/*======================
---[[������ �ڷ���]]---
	- ������ �ڷ��� �ǽ� �� �׽�Ʈ : char
=========================*/

public class Test008{
	public static void main(String[]args){
		//�ֿ� ���� ����
		char ch1, ch2, ch3;
		int a;				//--check~!

		// ���� �� ó��(���� ����)
		ch1 = 'A';
		ch2 = '\n';	//���๮�� 1��
		ch3 = '��';
		a = (int)ch1;			//--check~! �ڵ�����ȯ ������, �������ε� ����ȯ�� �־�����!

		// ��� ���
		System.out.println("ch1 : " + ch1);
		System.out.println("ch2 : " + ch2);
		System.out.println("ch3 : " + ch3);
		System.out.println("a : " + a); //����ȯ �Ǿ� A�� �ƽ�Ű�ڵ� 65���
	}
}

/*
ch1 : A
ch2 :

ch3 : ��
a : 65
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/