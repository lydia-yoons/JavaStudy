/*======================
������� �帧�� ��Ʈ��(���, ���ǹ��� �ݺ���)����
	- if ~ else�� �ǽ�
=========================*/

//����ڷκ��� ������ ������ �Է¹޾�
// �Է¹��� ������ ¦������, Ȧ������, ������
//����� �Ǻ��Ͽ� ����ϴ� ���α׷� ����

//���� ��)
// ������ ���� �Է� : 14
// 14 �� ¦��
// ��� �Ϸ���....

// ������ ���� �Է� : 3
// 14 �� Ȧ��
// ��� �Ϸ���....

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test030{
	public static void main(String[]args) throws IOException {
		//BufferedReader �ν��Ͻ� ����
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
/*[���� Ǭ ����]
		//���� ����
		int num;
		String strResult;

		System.out.print("������ ���� �Է� : ");
		num = Integer.parseInt(br.readLine());

		if(num == 0){
			//0
			strResult = "��";
		}else if ( num % 2 == 0){
			//¦��
			strResult = "¦��";
		}else{
			//Ȧ��
			strResult = "Ȧ��";
		}
	
		
		//���
		System.out.printf("%d �� %s\n", num, strResult);
*/

	//[�Բ� Ǭ ����] ******************************************
		//���� ����
		int n;
		String strResult = "�Ǻ� �Ұ�";

		System.out.print("������ ���� �Է� : ");
		n = Integer.parseInt(br.readLine());

		if(n == 0){
			//0
			strResult = "��";
		}else if ( n % 2 == 0){
			//¦��
			strResult = "¦��";
		}else{
			//Ȧ��
			strResult = "Ȧ��";
		}

		System.out.printf(n + "�� "+ strResult);


	}

}

/*
������ ���� �Է� : 3
3 �� Ȧ��
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

������ ���� �Է� : 0
0 �� ��
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/