/*======================
������� �帧�� ��Ʈ��(���, ���ǹ��� �ݺ���)����
	- �ݺ���(while) �ǽ�
=========================*/

/*
���� ��)
1���� 100���� ������ �� : 5050
1���� 100���� ¦���� �� : 2550
1���� 100���� Ȧ���� �� : 2550
*/


public class Test042{
	public static void main(String[]args){

/*[���� Ǭ �ڵ�]
		int n = 0 ;
		int sum = 0, even =0, odd= 0;

		while (n<=100)
		{
			if (n%2==0)
			{
				even += n;
			}
			else if(n%2!=0)
			{
				odd += n;	
			}
			else{
				System.out.println("�Է� ����");
				return;
			}
			sum += n;
			n++;
		}

		System.out.println("1���� 100���� ������ �� : "+sum);
		System.out.println("1���� 100���� ¦���� �� : "+even);
		System.out.println("1���� 100���� Ȧ���� �� : "+odd);
*/
		
		//[���� Ǭ �ڵ�]************************************

		//�ֿ� ���� ����
		int n=1,sum, even, odd; 
		sum=even=odd=0;
		
		while (n<=100)
		{
			// ������ ó��
			sum += n; 

			if (n%2==0)
			{
				even += n;
			}
			else if(n%2!=0)
			{
				odd += n;	
			}
			else{
				System.out.println("�Ǻ� �Ұ� ������");
				return;
			}
			
			n++;
		}
		// ��� ���
		System.out.println("1���� 100���� ������ �� : "+sum);
		System.out.println("1���� 100���� ¦���� �� : "+even);
		System.out.println("1���� 100���� Ȧ���� �� : "+odd);
		
	}
}

/*
1���� 100���� ������ �� : 5050
1���� 100���� ¦���� �� : 2550
1���� 100���� Ȧ���� �� : 2500
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/