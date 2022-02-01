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
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Test139_1{
	public static void main(String[]args) throws IOException {
		// Buffered �ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// Calendar �ν��Ͻ� ����
		Calendar cal = Calendar.getInstance();

		// �ֿ亯�� ����
		int y, m;	//-- ��, ��
		int w;		//-- ����
		int i;		//-- �޷��� �׸��� �������� ...
		
		do
		{
			System.out.print("���� �Է� : ");
			y = Integer.parseInt(br.readLine());
		}
		while (y<1);
		
		do
		{
			System.out.print("�� �Է� : ");
			m = Integer.parseInt(br.readLine());

		}
		while (m<1 || m>12);
		
		
		// ����ڷκ��� �Է¹��� ��, ���� �̿��Ͽ�
		// �޷��� ��¥ ����

		// �޷��� ��¥ ���� �� ��set()���޼ҵ� Ȱ��
		cal.set(y, m-1, 1);	// ���� -1
		//-- �� ������ �Է°�(m)�� �״�� ����ϴ� ���� �ƴ϶�
		//	 �Է°����� 1�� �� ������ ���� �����ؾ��Ѵ�.
		//-- �� ���� �� �Է¹��� ��, ���� �ش��ϴ� 1�Ϸ� �����ؾ��Ѵ�.
		//	 �� ���� ���� Ȯ���� ���ؼ�...

		//���� ��������
		w = cal.get(Calendar.DAY_OF_WEEK);	//���� ���� �����ϱ�

		//�׽�Ʈ
		//System.out.println(w);
		// ==> �����Է� : 2021
		//		�� �Է� : 8
		//		1 �� 2021�� 8�� ���� ��  �Ͽ��� ��  2021�� 8�� 1���� �Ͽ���~!!
	
		

		//����ϱ�
		System.out.println();
		System.out.printf("	[%d�� %d��]	\n",y,m);
		System.out.println(" ��  ��  ȭ  ��  ��  ��  ��");
		System.out.println("============================");
		
		//Ư�� ���Ϻ��� 1���� ����� �� �ֵ��� ���� �߻�(����)
		for (i=1; i<w; i++)
			System.out.print("    ");	//���� 4ĭ �߻�
		
		// �� Calendar�� getActualMaximum() �޼ҵ�
		//System.out.println(cal.getActualMaximum(Calendar.DATE));

		for (i=1; i<cal.getActualMaximum(Calendar.DATE) ; i++)
		{
			System.out.printf("%4d", i);
			w++;			//-- �ݺ����� �����ϸ� ��¥�� ������ �� ����
							//	 ���ϵ� �Բ� ������ �� �ֵ��� ó��

			if (w%7==1)		//-- ������ ������ �Ͽ����� �� �� ���� ���� �� ���
			{
				System.out.println();		//-- ����
			}
		}

		if (w%7!=1)
			System.out.println();
		
		System.out.println("============================");

		
	}
}