/*===============================
���� ����(sort) �˰����� ����
 -���� ����(selection sort)
  ===============================*/

/*
�� ����
	: �����͸� Ư���� ��Ģ(����)�� �°� ������� ����(��������, ��������)

�� ������ ����
	: ������ ó�� ������ ���Ǽ��̳� �������� ���̱� ����
	�� ���� ����.. �˻��ϱ� ����

�� ������ ����
	: ���� ����, ���� ����, ���� ����, �� ����, �� ����, �� ����...
*/

// ���� ��)
// Source Data : 52 42 12 62 60
// Source Data : 12 42 52 60 62
// ����Ϸ��� �ƹ�Ű�� ��������..


public class Test103{
	public static void main(String[]args){
		int[] a = {52, 42, 12, 62, 60};
		/*
		42 52 12 62 60		  0		1
		== --
		12 52 42 62 60		  0		2
		==    --
		12 52 42 62 60		  0		3
		==       --
		12 52 42 62 60		  0		4
		==          --
		------------------------------------1ȸ��(��~)

		12 42 52 62 60		  1		2
		   == --
		12 42 52 62 60		  1		3
		   ==    --
		12 42 52 62 60		  1		4
		   ==       -- 
		------------------------------------2ȸ��

		12 42 52 62 60		  2		3
		      == --
	    12 42 52 62 60		  2		4
		      ==    --
	    ------------------------------------3ȸ��

		 12 42 52 60 62		  3		4
		          == --
		------------------------------------ȸ�� ��

		*/
/*	[���� Ǭ �ڵ�]	
		int temp=0;

		for (int i=0; i<a.length ; i++)
		{
			for (int j=0; j<i ; j++)
			{
				if (a[i]<a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}else{
					continue;
				}
				
			}		
			
		}
		
		
		for (int i =0; i<a.length; i++)
		{
			System.out.print(" "+a[i]);
		}
*/ 

		// [�Բ� Ǭ �ڵ�]*****************************
		int i, j;
		
		System.out.print("Source Data : ");
		/*
		for(i=0; i<a.length; i++)
			System.out.print(a[i]+" ");
		System.out.println();
		// ==> Source Data : 52 42 12 62 60
		*/

		// ���� for�� (forEach ��)
		for(int n: a)
			System.out.print(n + " ");
		System.out.println();
		// ==> Source Data : 52 42 12 62 60

		for (i=0; i<a.length-1 ; i++ )	//��~(�񱳱��� ������) ��0    1   2  3
		{
			for (j=i+1; j<a.length ; j++)			//��~ (�񱳴�� ������)��1234 234 34 4
			{
				if(a[i] > a[j]){
					// �ڸ��ٲٱ�
					a[i] = a[i]^a[j];
					a[j] = a[j]^a[i];
					a[i] = a[i]^a[j];

				}
			}
		}


		
		System.out.print("Source Data : ");
		/*
		for(i=0; i<a.length; i++)
			System.out.print(a[i]+" ");
		System.out.println();
		*/
		for(int n : a)
			System.out.print(n + " ");
		System.out.println();
		// ==> Source Data : 52 42 12 62 60



	}
}

/*
Source Data : 52 42 12 62 60
Source Data : 12 42 52 60 62
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/