/*======================
������� �帧�� ��Ʈ��(���, ���ǹ��� �ݺ���)����
	- if ~ else�� �ǽ�
=========================*/

/* [����]
����ڷκ��� ���ĺ� �� ���ڸ� �Է¹޾� �̸� �Ǻ��Ͽ�
�ҹ��ڸ� �Է¹޾��� ���... �빮�ڷ� ��ȯ�ϰ�,
�빮�ڸ� �Է¹޾��� ���... �ҹ��ڷ� ��ȯ�ϴ� ���α׷��� �ۼ��Ѵ�.
��, �Է��� ��System.in.read()���޼ҵ带 Ȱ���Ͽ� �����Ѵ�

���� ��)
���ĺ� �� ���� �Է� : A
>>a
����Ϸ��� �ƹ� Ű��..

���ĺ� �� ���� �Է� : c
>>C
����Ϸ��� �ƹ� Ű��..

���ĺ� �� ���� �Է� : 10
>> �Է� ���� ~!! 
����Ϸ��� �ƹ� Ű��..

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test035{
	public static void main(String[]args) throws IOException {
		//BufferedReader �ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n;	//���� ����

		System.out.print("���ĺ� �� ���� �Է� : ");
		n = System.in.read(); //�ƽ�Ű�ڵ�� �о����

		// 65~90 �� �빮�� / 97~122 �� �ҹ���
		if (65<=n && n<=90){ // �빮�� ���ĺ��� ��
			n += 32;
			System.out.println(">> "+ (char)n);
		}else if(97<=n && n<=122){ //�ҹ��� ���ĺ��� ��
			n -= 32;
			System.out.println(">> "+ (char)n);
		}else{
			System.out.println("�Է� ����");
		}

	}
}

/*
���ĺ� �� ���� �Է� : E
>> e
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

���ĺ� �� ���� �Է� : 1
�Է� ����
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/