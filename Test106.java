/*===============================
���� ����(sort) �˰��� ����
  ===============================*/

/*
����ڷκ��� ���� �л��� ���� �����͸� �Է¹޾�
������ ���� ������ ���� ������ ����� �ο��Ͽ�
����� ����ϴ� ���α׷��� �����Ѵ�.
��, �迭�� ���� �˰����� Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

���� ��)
�ο� �� �Է� : 5
�̸� ���� �Է�(1) : ȫ�浿 90
�̸� ���� �Է�(2) : ��Ѹ� 80
�̸� ���� �Է�(3) : ��浿 85
�̸� ���� �Է�(4) : �ڶ�ġ 75
�̸� ���� �Է�(5) : ������ 95
-----------------------
1�� ������ 95
2�� ȫ�浿 90
3�� ��浿 85
4�� ��Ѹ� 80
5�� �ڶ�ġ 75
*/

import java.util.Scanner;

public class Test106{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		int p; //�ο���
		int n=1;
	

		System.out.print("�ο� �� �Է� : ");
		p = sc.nextInt();

		String[] name = new String[p];	//�̸� ���
		int[] score = new int[p];	//���� ���
		int[] grade = new int[p];	//��� ���
		
		do
		{
			System.out.printf("�̸� ���� �Է�(%d) : ",n);
			name[n-1] = sc.next();
			score[n-1] = sc.nextInt();

		}
		while (n++<p);
			

	    //���� ����
	    boolean flag;
	    int temp;		//�ڸ� ��� �� ����
		String temp2;	//���� ��� �� ����
	    int pass=0;
		

		//���� Bubble Srort����
		do
		{
			flag = false;
			pass++;
			
			for (int i=0; i<score.length-pass; i++)
			{	
								
				if (score[i]<score[i+1])	
				{					
					//���� �ڸ� �ٲٱ�
					temp = score[i];
					score[i] = score[i+1];
					score[i+1] = temp;

					//�̸� �ڸ� �ٲٱ�
					temp2 = name[i];
					name[i] = name[i+1];
					name[i+1] = temp2;

					flag = true;
					//-- �� �ѹ��̶� ����(�ڸ��ٲ�)�� �߻��ϰ� �Ǹ�
					//		flag������ flase�� �ٲ�
				}
			}
			//�׽�Ʈ
			//System.out.println("��~");

		}
		while (flag);
			
		
		//��� ���ϱ�~~~~
		for (int i=0; i<p; i++)
		{
			grade[i]= 1;

			for (int j=0; j<p; j++ )
			{
				if (score[i]<score[j])

					grade[i] += 1;
			}
			//System.out.println("��� ~ : "+grade[i]); //test
		}
		

		//����ϱ�
		System.out.println("\n--------------");
		for (int i=0; i<p; i++){
			System.out.printf("%d�� %s %d\n", grade[i],name[i], score[i]);
		}
		System.out.println("--------------");		

	}
}