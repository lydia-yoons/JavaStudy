/*======================================
	���� �迭 ����
	- �迭�� �迭(2����  �迭)
  ======================================*/

// �۰���
//�迭�� �迭(������ �迭)�� Ȱ���Ͽ�
//������ ���� �����͸� ��ҷ� ���ϴ� �迭(5x5)�� �����ϰ�
//�� ����� ����ϴ� ���α׷��� �����Ѵ�.

//���� ��)
/*
A	
C	B
D	E   F	
J	I	H	G
K	L	M	N	O

����Ϸ��� �ƹ� Ű�� ��������...
*/

/*
00
11	10
20	21	22
33	32	31	30
40	41	42	43	44
*/


public class Test089{
	public static void main(String[]args){
		//�迭�� �迭 ����
		char[][] arr = new char[5][5];
		
		char a = 'A';
		
		//�迭�� �迭 �� ��� �Ҵ�
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr.length; j++)
			{
				if (i>=j)	
				{
					if (i%2==0)		// �� 0 2 4 
					{
						arr[i][j]=a++;
					}else if (i%2!=0)	//�� 1 3
					{
						arr[i][i-j] = a++;	//j�� �ں��� ��Ҹ� ä������
					}
				}
				
			}
		}

		//�迭 ��ü ��� ���
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				System.out.printf("%3c",arr[i][j]);
			}
			System.out.println();
		}
		
	}
	
}

/*
  A
  C  B
  D  E  F
  J  I  H  G
  K  L  M  N  O
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/