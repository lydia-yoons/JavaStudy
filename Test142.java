/*===============================
	���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
	- Random Ŭ����
  ===============================*/

/*
�� java.util.Random Ŭ������
   ���� ������ ������ �߻����� �����ϴ� Ŭ�����̴�.
   Math Ŭ������ ���� �޼ҵ��� random() �޼ҵ嵵 ������ �����ϴ� �޼ҵ�������
   0.0 ~ 1.0 ������ �Ǽ� ���¸� �߻��ϰ� �ǹǷ�
   �ʿ��� ���� ������ ������ ������ ���ؼ��� �߰����� ������� �����ؾ� �Ѵ�.
   �׷��� �ڹٴ� ���� ������ ������ �߻������ִ� ���� Ŭ������
   Random Ŭ������ ������ �����ϰ� �ִ�.

*/

// �ζ� ��ȣ ������(���� �߻� ���α׷�)

// ���α׷��� ����Ǹ� �⺻������ �ζǸ�
// 5���� �����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// 3 5 12 24 31 41
// 1 2 9 22 35 38
// 4 9 11 13 22 31
// 5 10 13 15 28 40
// 22 31 32 33 30 45
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.util.Random;
import java.util.Arrays;

class Lotto
{	
	//�迭 ���� ���� �� �޸� �Ҵ� �� �ζ� ��ȣ�� ��Ƶ� �迭�� 6ĭ
	private int[] num = new int[6];
	
	//getter
	public int[] getNum(){
		return num;
	}

	// 6���� ������ �߻���Ű�� �޼ҵ� ����
	public void start(){
		Random rd = new Random();
		
		int n;
		int cnt=0;

		//check~!!
		jump:

		while (cnt<6)	// ��~ �� 0 1 2 3 4 5
		{
			n = rd.nextInt(45);		// 0 ~ 44 �� (+1) �� 1 ~ 45

			for (int i=0 ; i<cnt ; i++ )	// ��! 0 ��	�񱳾��� / 1 �� 0/ 2 �� 01/ 3 �� 012/ 4 ��0123 / 5 �� 01234
			{
				if (num[i]==n)
				{
					// ������ �ٽ� �߻���ų �� �ֵ��� ó��
					continue jump;
				}
			}

			num[cnt++] = n;
		}
		
		//���� �޼ҵ� ȣ��
		sorting();

		
	} // end start()
	

	// ���� �޼ҵ� ����
	private void sorting(){
		Arrays.sort(num);
		
	}


} // end class Lotto

public class Test142{
	public static void main(String[]args){


		//Lotto  Ŭ���� ��� �ν��Ͻ� ����
		Lotto lotto = new Lotto();

		// �⺻ - 5����
		for (int i=1; i<=5 ; i++ )
		{
			lotto.start();

			//��� ��� 
			for (int n : lotto.getNum() )
			{
				System.out.printf("%4d",n);
			}
			System.out.println();
		}
		

	}
}