/*===============================
	���� Ŭ���� ��� ����
	 - �������̽�(Interface)
  ===============================*/

// �� �ǽ�����
// ���� ó�� ���α׷��� �����Ѵ�.
// ��, �������̽��� Ȱ���� �� �ֵ��� �Ѵ�.

// ���� ��)
// �ο� �� �Է�(1~10) : 2
// 1��° �л��� �й� �̸� �Է�(���� ����) : 2108006 ȫ�浿
// ���� ���� ���� ���� �Է� (���� ����) : 90 100 85
// 2��° �л��� �й� �̸� �Է�(���� ����) : 2108024 �����
// ���� ���� ���� ���� �Է� (���� ����) : 85 70 65

// 2108006 ȫ�浿 90 100 85		275		91
//				  ��  �� ��
// 2108024 ����� 85 70 65		220		73
//				  �� �� ��

// ����Ϸ��� �ƹ�Ű�� ��������...


// �Ӽ��� �����ϴ� Ŭ���� �� �ڷ��� Ȱ��


import java.util.Scanner;

class Record
{
	String hak, name;		//-- �й�, �̸�
	int kor, eng, mat;		//-- ����, ����, ��������
	int tot, avg;			//-- ����, ���(���ǻ� ���� ó��)
}


//�������̽�
interface Sungjuk
{
	public void set();		//-- �ο� �� ����
	public void input();	//-- �� ������ �Է�
	public void print();	//-- �ܰ� ���
}


// ���� �ذ� �������� �����ؾ� �� Ŭ���� �� Sungjuk �������̽��� �����ϴ� Ŭ����
class SungjukImpl implements Sungjuk
{
	Scanner sc = new Scanner(System.in);

	int num;
	Record[] rc;
	int[][] score;
	char[][] rank;

	
	@Override
	public void set(){		
		do
		{
			System.out.print("�ο� �� �Է�(1~10) : ");
			num = sc.nextInt();
		}
		while (num<1||num>10);


		rc = new Record[num];	
		score = new int[num][3];	// ������ ����
		rank = new char[num][3];	// ����̾簡
	}

	@Override
	public void input(){

		for (int i=0; i<num ; i++){
			rc[i] = new Record();

			System.out.printf("%d��° �л��� �й� �̸� �Է�(���� ����) : ", (i+1));
			rc[i].hak = sc.next();	//�й�
			rc[i].name = sc.next();	//�̸�

			System.out.print("���� ���� ���� ���� �Է� (���� ����) : ");
			score[i][0] = rc[i].kor = sc.nextInt();	//��
			score[i][1] = rc[i].eng = sc.nextInt();	//��
			score[i][2] = rc[i].mat = sc.nextInt();	//�� ���� �ޱ�

			
			rc[i].tot = rc[i].kor + rc[i].eng + rc[i].mat; //�� ��
			rc[i].avg = (rc[i].tot)/3;	//���


			for (int j=0; j<3 ; j++)
			{
				switch (score[i][j] - score[i][j]%10)
				{
					case 10 :case 9 : rank[i][j] = '��';
					case 8 : rank[i][j] = '��'; break;
					case 7 : rank[i][j] = '��'; break;
					case 6 : rank[i][j] = '��'; break;
					default : rank[i][j] = '��'; break;
				
				}
			}//end for(j)
			
		} //end for(i)
	}//end input


	@Override

	public void print(){

		System.out.println();	//����
		
		for (int i = 0; i<num ; i++){
			System.out.printf("%s	%s	%3d  %3d  %3d	%3d	%3d",rc[i].hak,rc[i].name,rc[i].kor,rc[i].eng,rc[i].mat,rc[i].tot,rc[i].avg);
			System.out.printf("\t\t	%3c  %3c  %3c\n", score[i][0],score[i][1],score[i][2]);
		}

	}
		

} //end SungjukImpl()

public class Test117{
	public static void main(String[]args){
		Sungjuk ob;

		// ���� �ذ� �������� �ۼ��ؾ� �� ob����
		ob = new SungjukImpl();

		ob.set();
		ob.input();
		ob.print();
		
	}
}