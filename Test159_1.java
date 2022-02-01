/*===============================
���� �÷��� �����ӿ�ũ(Collection Framework) ����
 ===============================*/

// �� �ǽ�����
// Test159 Ŭ������ �ϼ��Ͽ� ���� ����� ���� ���α׷��� �����Ѵ�.

/*
���� ��)
	
	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 1

	1��° ��� �Է� : �չ���
	1��° ��� �Է¿� ����~!!
	��� �Է� ���(Y/N)? : Y

	2��° ��� �Է� : ���±�
	2��° ��� �Է¿� ����~!!
	��� �Է� ���(Y/N)? : n

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 2

	[���� ��ü ���]
		�չ���
		���±�
	���� ��ü ��� �Ϸ�~!!
	
	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 3

	�˻��� ��� �Է� : ����ȭ

	[�˻� ��� ���]
	�׸��� �������� �ʽ��ϴ�.

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 3
	
	[�˻� ��� ���]
	�׸��� �����մϴ�.

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 4

	������ ��� �Է� : ���ش�

	[���� ��� ���]
	�׸��� �������� �ʾ� ������ �� �����ϴ�.

	
	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 4

	������ ��� �Է� : ���±�

	[���� ��� ���]
	���±� �׸��� �����Ǿ����ϴ�.


	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 5

	������ ��� �Է� : ������

	[���� ��� ���]
	������ ����� �������� �ʽ��ϴ�.


	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 5

	������ ��� �Է� : �չ���
	������ ���� �Է� : ������

	[���� ��� ���]
	������ �Ϸ�Ǿ����ϴ�.

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 6

	���α׷� ����
	����Ϸ��� �ƹ�Ű�� ��������...

*/

import java.util.Vector;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Iterator;



class Menus		//-- �ϼ�
{
	public static final int E_ADD = 1;		//-- ��� �߰�
	public static final int E_DISP = 2;		//-- ��� ���
	public static final int E_FIND = 3;		//-- ��� �˻�
	public static final int E_DEL = 4;		//-- ��� ����
	public static final int E_CHA= 5;		//-- ��� ����
	public static final int E_EXIT= 6;		//-- ����
}


public class Test159_1{

	//�ֿ� �Ӽ� ����
	private static final Vector<Object> vt;
	private static BufferedReader br;
	private static Integer sel;				//-- ���� ��
	private static String con;				//-- ��� ����

	//static �ʱ�ȭ ��
	static
	{
		//Vector �ڷᱸ�� ����
		vt = new Vector<Object>();

		// BufferedReader �ν��Ͻ� ����
		br = new BufferedReader(new InputStreamReader(System.in));

		//����� �Է� �ʱ�ȭ
		sel = 1;
		con = "Y";

	}

	// �޴� ��� �޼ҵ�
	public static void menuDisp(){

		System.out.println("\n\t[�޴� ����]");
		System.out.println("\t1. ��� �߰�");
		System.out.println("\t2. ��� ���");
		System.out.println("\t3. ��� �˻�");
		System.out.println("\t4. ��� ����");
		System.out.println("\t5. ��� ����");
		System.out.println("\t6. ��		��\n");		
		System.out.println("\t>> �޴� ����(1~6) : ");
	}

	// �޴� ���� �޼ҵ�
	public static void menuSelect() throws IOException {

		sel = Integer.parseInt(br.readLine());
		
	}

	// ���õ� �޴� ���࿡ ���� ��� ȣ�� �޼ҵ�
	public static void menuRun() throws IOException {

		switch (sel)
		{
			case Menus.E_ADD  : addElement();  break;					
			case Menus.E_DISP : dispElement(); break;		
			case Menus.E_FIND : findElement(); break;		
			case Menus.E_DEL  : delElement();  break;		
			case Menus.E_CHA  : chaElement();  break;		
			case Menus.E_EXIT : exit();		   break;
			default: System.out.println("\t>> �޴� ���� ����~!!"); break;
		}
		
	}

	// ��� �߰�(�Է�) �޼ҵ�
	public static void addElement() throws IOException {
			
			do
			{
				System.out.println();
				System.out.printf("%d��° ��� �Է� : ", vt.size()+1);
				vt.add(br.readLine());
				System.out.printf("%d��° ��� �Է� ����~! \n", vt.size());
				System.out.print("��� �Է� ���(Y/N) ? :");
				con = br.readLine();		
			}
			while (con.equals("y") || con.equals("Y"));
		

	}

	// ��� ��� �޼ҵ�
	public static void dispElement() {

		System.out.println();
		System.out.println("\t[���� ��ü ���]");
		for ( Object obj : vt )
			System.out.println("\t" + (String)obj);
		System.out.println("\t���� ��ü ��� �Ϸ�~~");
		
	}

	//��� �˻� �޼ҵ�
	public static void findElement() throws IOException {

		System.out.println();
		System.out.print("�˻��� ��� �Է� : ");
		sel = vt.indexOf(br.readLine());
		System.out.println();
		System.out.println("\t[�˻� ��� ���]");

		if ( sel < 0)
			System.out.println("\t�׸��� �������� �ʽ��ϴ�.");
		else 
			System.out.println("\t�׸��� �����մϴ�.");
		
		
	}

	//��� ���� �޼ҵ�
	public static void delElement() throws IOException {

		System.out.println();
		System.out.print("������ ��� �Է� : ");
		con = br.readLine();
		sel = vt.indexOf(con);
		System.out.println();
		System.out.println("\t[���� ��� ���]");
	
		if ( sel < 0)
			System.out.println("\t�׸��� �������� �ʾ� ������ �� �����ϴ�.");
		else 
		{
			vt.remove(con);
			System.out.printf("\t %s �׸��� �����Ǿ����ϴ�.", con);
		}
		
	}

	//��� ����(����) �޼ҵ�
	public static void chaElement() throws IOException {

		System.out.println();
		System.out.print("������ ��� �Է� : ");
		sel = vt.indexOf(br.readLine());
		
		if (sel<0)
		{
			System.out.println();
			System.out.println("\t[���� ��� ���]");
			System.out.println("\t������ ����� �������� �ʽ��ϴ�.");
		}
		else
		{
			System.out.print("������ ��� �Է� : ");
			vt.set(sel,br.readLine());
			System.out.println("\t[���� ��� ���]");
			System.out.println("\t������ �Ϸ� �Ǿ����ϴ�.");
		}
		
	}

	//��� ���� �޼ҵ�	-- �ϼ�
	public static void exit() {
		System.out.println("\t���α׷� ����~~!!");
		System.exit(-1);
		
	}
	
	
	// main() �޼ҵ� -- �ϼ�
	public static void main(String[]args) throws IOException {

		do
		{
			menuDisp();
			menuSelect();
			menuRun();
		}
		while (true);
		

	}
}