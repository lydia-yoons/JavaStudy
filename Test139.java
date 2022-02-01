/*===============================
	���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
	- Celendar Ŭ����
  ===============================*/

/*
�� java.util.Calendar Ŭ������
	��¥�� �ð��� ��ü �𵨸�ȭ �� Ŭ������
	��, ��, ��, ����, ��, ��, �ʱ�����
	�ð��� ��¥�� ���õ� ������ �����ϳ�.
	�׸���, CalendarŬ������ �߻�Ŭ�����̹Ƿ� ���� ��ü�� ������ �� ������
	�������� �޼ҵ� ������ Calendar Ŭ������ ���� Ŭ������
	GregorianCalendarŬ������ ���ǵǾ� �ִ�.

	�ý������κ��� ���� �ý��� �ð� ������ ���� ��
	getInstance()��� ����(static)�޼ҵ带 �̿��Ͽ� ��ü�� ������ �� �ִ�.
	������ CalnedarŬ���� ��ü�� �ý����� ���� ��¥�� �ð� ������ ������,
	�� ��ü�� �����Ǹ� �����ִ� �ð� ��������
	get()�޼ҵ带 �̿��Ͽ� ���� ������(�����) �� �ִ�.

	getInstance()�޼ҵ�� ���������� GregorianCalendar��ü�� �����Ͽ�
	�����ֱ⶧���� GregorianCalendar ��ü�� ���� �����Ͽ� �ð� ������
	���� ���� �ִ�.


*/

// �� �ǽ�����
//   ����ڷκ��� ��, ���� �Է¹޾�
//	 �޷��� �׷��ִ�(����ϴ�) ���α׷��� �����Ѵ�.
//	 ��, ����޷��� �ƴ϶� CalendarŬ������ Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

// ���� ��)
// ���� �Է� : 0
// ���� �Է� : 2021 
// �� �Է� : -2
// �� �Է� : 16
// �� �Է� : 8

 /*
			[2021�� 8��]

   ��   ��   ȭ   ��   ��   ��   ��
 ===================================
    1    2    3    4    5    6    7
    8    9   10   11   12   13   14
   15   16   17   18   19   20   21
   22   23   24   25   26   27   28 
   29   30   31
 ===================================
 
 
 */



import java.util.Calendar;
import java.util.Scanner;
import java.util.GregorianCalendar;

public class Test139{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		int y, m;
		
		do
		{
			System.out.print("���� �Է� : ");
			y = sc.nextInt();
		}
		while (y<1);
		
		do
		{
			System.out.print("�� �Է� : ");
			m = sc.nextInt();

		}
		while (m<1||m>12);
		
		
		Calendar rightNow = new GregorianCalendar();

		// �޷��� ��¥ ���� �� ��set()���޼ҵ� Ȱ��
		rightNow.set(y, m-1, 1);	// ���� -1

		int d = rightNow.get(Calendar.DAY_OF_WEEK);	//���� ���� �����ϱ�
		int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		if (y%4==0 && y%100!=0 || y%400==0)	//����
		{
			months[1] = 29;
		}
		

		//����ϱ�

		System.out.printf("		[%d�� %d��]		\n",y,m);
		System.out.printf("   ��   ��   ȭ   ��   ��   ��   ��\n");
		System.out.printf("====================================\n");
		
		//Ư�� ���Ϻ��� 1���� ����� �� �ֵ��� ���� �߻�(����)
		for (int i=1; i<d; i++)
		{
			System.out.print("   ");	//���� 3ĭ �߻�
		}


		for (int i=1; i<months[d-1]; i++ )
		{
			System.out.printf("%d",i);

			if ((i+d-1)%7==0)  
			{
				System.out.println();
			}

		}

		
		
		System.out.println();
		System.out.printf("====================================\n");

	




		
	}
}