/*======================
������� �帧�� ��Ʈ��(���, ���ǹ��� �ݺ���)����
	- break
=========================*/

//�Ʒ��� ���� ó���� �̷������ ����׷��� �����Ѵ�.
//��, �Է¹޴� ������ 1~100���� �ȿ����� �����ϵ��� �ۼ��Ѵ�.

// ���� ��)

// ������ ���� �Է� : -20

// ������ ���� �Է� : 0

// ������ ���� �Է� : 2021

// ������ ���� �Է� : 10
// >> 1 ~ 10������ �� : 55
// ����Ͻðڽ��ϱ�(Y/N)? : y

// ������ ���� �Է� : 100
// >> 1 ~ 10������ �� : 5050
// ����Ͻðڽ��ϱ�(Y/N)? : n
// ����Ϸ��� �ƹ�Ű�� ��������... -> ���α׷� ����

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test060 {
	public static void main(String[]args) throws IOException {
		
/*	[���� Ǭ �ڵ�]	
		//scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);
		
		//���� ����
		int i;
		int sum=0;
		char o;
		
		for (; ; )
		{
			System.out.print("������ ���� �Է� : ");
		    i = sc.nextInt();
			
			//1~100�� ���� ��
			if (i>=1 && i <=100){
				for (int j=1; j<=i ; j++ ){
					sum += j;	// �Է°����� �� ���ϱ�
				}
				System.out.printf(">> 1 ~ %d������ �� : %d\n",i,sum);

				System.out.print("����Ͻðڽ��ϱ�(Y/N)? : ");
				o = sc.next().charAt(0);	// y or n �� �޾ƿ���
				if (o=='y'|| o =='Y')	{
					// ��� �ϰ�ʹٸ�
					sum=0;	//sum �� 0���� ������ֱ�
					continue; //����ϱ�
				}else if (o=='n'|| o == 'N'){
					break; //���߱�			
				}else{
					System.out.println("�Է� ���� : ");
					break; 
				}
			}
		}
*/
		//[�Բ� Ǭ �ڵ�]**********************
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n, s=00
			, i;
		// n : �ܺηκ��� ������� �Է¹��� �� ���� ����
		// s : ���� ���� ����� ��Ƶ� ����
		// i : 1 ���� 1�� ������� �Է°����� ������ ����


		char ch;
		//��� �������� ������ ���� �ǻ�ǥ�� ����� ��Ƶ� ����
		
		//���� �ݺ��� �����ϴ� �ݺ���
		while (true)
		{
			do
			{
				System.out.print("\n������ ���� �Է� : ");
				n = Integer.parseInt(br.readLine());
			}
			while (n<1 || n>100);

			//test
			//System.out.println("��ȿ�� ���� �Է� �Ϸ�!");
			
			s = 0; //������ ������ �ʱ�ȭ ��ġ	check~!!

			//������ ����
			for (i=1; i<n ;i++ )
			{
				s += i;
			}

			System.out.printf(">> 1 ~ %d ������ �� : %d\n", n, s);
			
			System.out.print("����Ͻðڽ��ϱ�(Y/N)? : ");
			ch = (char)System.in.read();

			//�׸��ҷ� �ǻ�ǥ��
			// if(ch=='N' || ch=='n')
			if (ch!='Y' && ch!='y')	//�� ������ check!
			{
				// �ݺ���(while)�� �������� �� �ִ� �ڵ� �ۼ� �ʿ�
				// ���� ���� �ǻ�ǥ���� �ߴٸ�
				//�� ���� �����ߴ� �ݺ����� ���߰� ���������� �Ѵ�.
				break; //�����(+ �׸��� ����������.) check ~!!!

			}
			
			// Y + ���� / y + ����

			// ���Ͱ�(\r\n)ó��			check~!!

			System.in.skip(2);
				

			} //end while

	} // end main()
} // end class Test060

/*
������ ���� �Է� : -30
������ ���� �Է� : 0
������ ���� �Է� : 2021
������ ���� �Է� : 10
>> 1 ~ 10������ �� : 55
����Ͻðڽ��ϱ�(Y/N)? : y
������ ���� �Է� : 100
>> 1 ~ 100������ �� : 5050
����Ͻðڽ��ϱ�(Y/N)? : n
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/