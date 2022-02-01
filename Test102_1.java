/*===============================
���� �ֹε�Ϲ�ȣ ��ȿ�� �˻� ����
  ===============================*/
/*
���ֹε�Ϲ�ȣ ���� ����
	
	�� ������ �ڸ��� ������ ���ڸ� ���� ��Ģ�� �°� ���Ѵ�.

	123456-1234567 (�ֹι�ȣ) 
	****** ******  ----------------------- �� �ڸ��� ���ϱ�
	234567 892345  (�� �ڸ��� ������ ��)

	�� ��Ģ�� �°� ���� ������ ������ ����� ��� ���Ѵ�.

	ex) 7 5 0 6 1 5 - 1 8 6 2 1 3 3
		* * * * * *   * * * * * *  
		2 3 4 5 6 7   8 9 2 3 4 5
	  ------------------------------
	�� 14+15+0+30+6+35+8+72+12+6+4+15
	 	== 217
	
	�� ������ ������� 11�� ������ ������������ ���Ѵ�.
		   19
		--------
     11 | 217
	   ----------
	      107
		   99
		 ------
		    8  �� ������
	
	�� 11���� ������(�� 8)�� �� ������� ���Ѵ�.
		11 - 8 = 3

		�� ���� �������� �������� 0�ΰ�� �� 11 �� 1
								  1�ΰ�� �� 10 �� 0
			�̸� �ٽ� 10���� ������ �������� ���Ѵ�.		��, ��������...

	�� ���� ���� ����� �ֹι�ȣ�� �����ϴ� ������ ���ڿ�
	   ��ġ�ϴ� ���� ���θ� Ȯ���Ѵ�.

	   ��ġ	  �� ��ȿ�� �ֹι�ȣ
	   ����ġ �� �߸��� �ֹι�ȣ
*/

//���� ��)
// �ֹι�ȣ �Է�(xxxxxx-xxxxxxx) : 123456-12345678 ���Է°��� �߰�
// >> �Է� ����~!!
// ����Ϸ��� �ƹ�Ű�� ��������...

// �ֹι�ȣ �Է�(xxxxxx-xxxxxxx) : 123456-123456 ���Է°��� �̴�
// >> �Է� ����~!!
// ����Ϸ��� �ƹ�Ű�� ��������...

// �ֹι�ȣ �Է�(xxxxxx-xxxxxxx) : 750615-1252085 ����ȿ�� �ֹι�ȣ
// >> ��Ȯ�� �ֹι�ȣ ~ ^^
// ����Ϸ��� �ƹ�Ű�� ��������...

// �ֹι�ȣ �Է�(xxxxxx-xxxxxxx) : 750615-1252085 ����ȿ�� �ֹι�ȣ
// >> �߸��� �ֹι�ȣ ~!!
// ����Ϸ��� �ƹ�Ű�� ��������...

/*
���߰� ��~!

�迭.length		�� �迭�� ����(�迩���� ����) ��ȯ
���ڿ�.length() �� ���ڿ��� ���� ��ȯ

String str = "abcdefg";
str.length();		�� 7
"abcdefg".length(); �� 7

���ڿ�.substring(); �� ���ڿ� ����


*/

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Test102_1{
	public static void main(String[]args) throws IOException{

		//�׽�Ʈ
		/* 
		String strTemp = "ȫ�浿";
		System.out.println(strTemp.length());
		// ==> 3

		strTemp = "���ع��� ��λ���";
		System.out.println(strTemp.length());
		// ==> 9

		strTemp = "study-hard";
		System.out.println(strTemp.length());
		// ==> 10

		strTemp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(strTemp.substring(3,5));
		// ==> DE
		// ABC DE FGHIJKLMNOPQRSTUVWXYZ
		// 012 34 56789...

		strTemp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(strTemp.substring(13,17));
		// ABCDEFGHIJKLM NOPQ RSTUVWXYZ
		// ==> NOPQ

		//strTemp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		//System.out.println(strTemp.substring(13, 85));
		// ==> �����߻�(������ ����)
		//		StringIndexOutOfBoundsException: String index out of range

		strTemp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(strTemp.substring(5));
		// ==> FGHIJKLMNOPQRSTUVWXYZ

		System.out.println(strTemp.substring(5, strTemp.length()));
		//									    ----------------
		//										strTemp�� ��ü����
		*/

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// �Է¹޴� �ֹι�ȣ(���ڿ� ����)
		String str;
		
		//�ֹι�ȣ�� �� �ڸ����� ���ϰ� �� �� �� �迭 ���·� ����
		int[] chk = {2, 3, 4, 5, 6, 7, 0, 8, 9, 2, 3, 4, 5}; //������ ����
		
		//���� ���� �� ������(��, �� ������ ����� ���� ������ �ֵ��� ó��..)
		int tot = 0;

		System.out.print("�ֹι�ȣ �Է�(xxxxxx-xxxxxxx) : "); //14�ڸ�
		str = br.readLine();
	
		if (str.length()!=14) //14�ڸ��� �ƴϸ� ����
		{
			System.out.println(">> �Է� ����~!!");
			return;		//-- �޼ҵ� ���� �� main() �޼ҵ� ���� �� ���α׷� ����
		}
		
		for (int i = 0; i<13 ; i++)
		{

			tot += chk[i] * Integer.parseInt(str.substring(i, (i+1)));
			//		 0 �� 2
			//		 1 �� 3
		}

		int su = 11 - tot % 11;

		su = su % 10;	// su %= 10;

		//------------------------------������� �����ϸ� ��� �踦 ��� ���� ��Ȳ�̸�
		//								��Ģ�� �°� ���� ������ ������ ����� ��� ���� ����
		//								���� tot�� ����ִ� ��Ȳ�� �ȴ�.

		
		
		if (su==Integer.parseInt(str.substring(13)))
		{
			System.out.println(">> ��Ȯ�� �ֹι�ȣ~!!!");
		}else {
			System.out.println(">> �߸��� �ֹι�ȣ~!!!");
		}


		
	}
}