/*======================================
	���� Ŭ������ �ν��Ͻ� ����
  ======================================*/

/*	����ڷκ��� ������ ������ �Է¹޾�
1���� �Է¹��� �� ������ ���� �����Ͽ�
������� ����ϴ� ���α׷��� �����Ѵ�.

��, Ŭ������ �ν��Ͻ��� ������ Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.
����, �Է�ó�� �������� BufferedReader�� Ȱ���ϸ�,
�Է� �����Ͱ� 1���� �۰ų� 1000���� ū ���
�ٽ� �Է¹��� �� �ִ� ó���� �����Ͽ� ���α׷��� ������ �� �ֵ��� �Ѵ�.

���� ��)
������ ���� �Է�(1~1000) : 1022
������ ���� �Է�(1~1000) : -20
������ ���� �Է�(1~1000) : 100
>> 1 ~ 100������ �� : 5050
����Ϸ��� �ƹ� Ű�� ��������

*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
class Hap
{
	//���� ����
	int n;

	//�Է� �ޱ�
	void input() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		do { //1~1000 ������ ���� �ƴҽ� �ݺ�

			System.out.print("������ ���� �Է�(1~1000) : ");
			n = Integer.parseInt(br.readLine());
		}
		while (n<1 || n>100);
				
	}

	//�����ϱ�
	int numSum(){
		int sum = 0;
		
		for (int i=1 ; i<=n ; i++){
			sum += i;
		}
		return sum;
	}

	//����ϱ�
	void print(int a){
		System.out.printf("1 ~ %d������ �� : %d\n", n, a);
	}

}

*/

class Hap
{
	//�ֿ� ���� ����(������� �Է°��� ��Ƶ� ����)	
	int su;

	//�Է� �޼ҵ� ����
	void input(){
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		do
		{
			System.out.print("������ ���� �Է�(1~1000) : ");
			su = Integer.parseInt(br.readLine());
		}
		while (su<1 || su>1000);
		
	}

	// ���� ó�� �޼ҵ� ����
	int calculate(){
		int result = 0;
		
		for (int i=1 ; i<=su ; i++){
			result += i;
		}

		return result;
	}


	//��� �߷� �޼ҵ� ����
	void print(int sum){
		System.out.printf("1 ~ %d������ �� : %d\n", su, sum);
	}
}

public class Test067{
	public static void main(String[]args) throws IOException {
		//Hap �ν��Ͻ� ����
		Hap ob = new Hap();
		
		//h �ν��Ͻ��� ���� �Է� �޼ҵ� ȣ��
		ob.input();
		
		//h �ν��Ͻ��� ���� ���� �޼ҵ� ȣ��
		int o = ob.numSum();
		
		//h �ν��Ͻ��� ���� ��� �޼ҵ� ȣ��
		ob.print(o);

	}
}

/*
������ ���� �Է�(1~1000) : 1022
������ ���� �Է�(1~1000) : -20
������ ���� �Է�(1~1000) : 100
1 ~ 100������ �� : 5050
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/