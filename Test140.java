/*===============================
	���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
	- Celendar Ŭ����
  ===============================*/

// �� �ǽ�����
//	 ������ �������� �Է¹޴� ��¥��ŭ ���� ��, ��, ��, ������ Ȯ���Ͽ�
//	 ����� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// ���� ��¥ : 2021-8-11 ������
// �� �� ���� ���ڸ� Ȯ���ϰ��� �Ͻʴϱ�? : 200

// =========[Ȯ�ΰ��]=========
//  200�� �� : xxxx-xx-xx x����
// ============================
// ����Ϸ��� �ƹ� Ű�� ��������..

// �� ���� ��¥�� �������� �� ���� ���ϴ� ���� �޼ҵ�
//	 ����ü.add(Calendar.DATE, �� ��);��


import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class Test140{
	public static void main(String[]args){

		Scanner sc = new Scanner(System.in);
		Calendar ob = new GregorianCalendar();

		// ���� ����
		int y, m, d, w, days;

		//����
		String[] week = {"�Ͽ���", "������", "ȭ����", "������", "�����", "�ݿ���", "�����"};


		// ���� ��¥ Ȯ��
		y = ob.get(Calendar.YEAR);
		m = ob.get(Calendar.MONTH)+1;
		d = ob.get(Calendar.DATE);
		w = ob.get(Calendar.DAY_OF_WEEK);
		
		// ���� ��¥ ���
		System.out.println("���� ��¥ : "+y+"-"+m+"-"+d+" "+week[w-1]);	

		do
		{
			System.out.print("�� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : ");
			days = sc.nextInt();
		}while (days<1);

		
		// �� �� �����ֱ�
		ob.add(Calendar.DATE, days);


		// ��¥ ������
		y = ob.get(Calendar.YEAR);
		m = ob.get(Calendar.MONTH)+1;
		d = ob.get(Calendar.DATE);
		w = ob.get(Calendar.DAY_OF_WEEK);


		// ���
		System.out.println("\n===========[Ȯ�ΰ��]===========");
		System.out.printf("%d�� �� : %d-%d-%d %s\n", days, y, m, d, week[w-1]);
		System.out.println("================================");

	}
}