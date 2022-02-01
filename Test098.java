/*======================================
	���� Ŭ������ �ν��Ͻ� ����
	- Ŭ������ �ν� �Ͻ� Ȱ��
  ======================================*/
/*
1~3 ������ ������ �߻����Ѽ�
����, ����, �� ���� ���α׷��� �����Ѵ�.
��, Ŭ������ ������ Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.
����, �迭�� Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.
���������� RpsGameŬ������ �ϼ��� �� �ֵ��� �Ѵ�.

�� ���� ������ �� 1:����, 2:����, 3:��

���� ��)
1:����, 2:����, 3:�� �� �Է�(1~3) : 4
1:����, 2:����, 3:�� �� �Է�(1~3) : -2
1:����, 2:����, 3:�� �� �Է�(1~3) : 2

- ����	 : ����
- ��ǻ�� : ��

>> �º� ���� ��� : ��ǻ�Ͱ� �̰���ϴ�~!!
����Ϸ��� �ƹ�Ű�� ��������
*/

import java.util.Scanner;
import java.util.Random;

class RpsGame
{
	private int user;
	private int com;

	private void runCome(){
		Random rd = new Random();
		com = rd.nextInt(3)+1;		//-- 0 1 2 �� 1 2 3
	}
	
	public void input(){

		runCome();

		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("1:����, 2:����, 3:�� �� �Է�(1~3) : ");
			user = sc.nextInt();
		}
		while (user<1 || user>3);
		
	}//end input()

	// �߰� ��� ���
	public void middleCalc(){

		String[] str = {"����","����","��"};

		System.out.println();
		System.out.println("- ���� : "+str[user-1]);		// str[1] str[2] str[3] �� str[0] str[1] str[2]
		System.out.println("- ��ǻ�� : "+str[com-1]);		// str[1] str[2] str[3] �� str[0] str[1] str[2]
	}
	

	//�ºο� ���� ��� ����
	public String resultCalc(){

		String result = "���º� ��Ȳ�Դϴ�~!!";
		
		// if((���� ���� && �� ��) || 
		if ((user==1 && com==3 ) || (user==2 && com==1) || (user==3 && com==2) )	//����ڰ� �¸��� ��Ȳ
		{
			result = "����� �̰���ϴ�~!!";
		}else if ((user==1 && com==2) ||(user==2 && com==3) ||(user==3 && com==1))		//��ǻ�Ͱ� �¸��� ��Ȳ
		{
			result = "��ǻ�Ͱ� �̰���ϴ�~!!";
		}

		return result;
	}

	//���� ��� ���
	public void print(String str){
		System.out.printf("\n>> �º� ���� ��� : %s\n",str);
	}


}


//main()�޼ҵ带 �����ϰ� �ִ� �ܺ��� �ٸ� Ŭ����
public class Test098{
	public static void main(String[]args){
		
		RpsGame ob = new RpsGame();
		
		ob.input(); 
		ob.middleCalc();
		String result = ob.resultCalc();
		ob.print(result);
	}
}

/*
1:����, 2:����, 3:�� �� �Է�(1~3) : 22
1:����, 2:����, 3:�� �� �Է�(1~3) : 2

- ���� : ����
- ��ǻ�� : ����

>> �º� ���� ��� : ����� �̰���ϴ�~!!
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

1:����, 2:����, 3:�� �� �Է�(1~3) : 1

- ���� : ����
- ��ǻ�� : ����

>> �º� ���� ��� : ��ǻ�Ͱ� �̰���ϴ�~!!
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

1:����, 2:����, 3:�� �� �Է�(1~3) : -2
1:����, 2:����, 3:�� �� �Է�(1~3) : 3

- ���� : ��
- ��ǻ�� : ����

>> �º� ���� ��� : ��ǻ�Ͱ� �̰���ϴ�~!!
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/