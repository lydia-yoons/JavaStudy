/*======================================
	���� Ŭ������ �ν��Ͻ� ����
  ======================================*/

// ����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
// ��Ģ������ �����ϴ� ���α׷��� �����Ѵ�.
// ��, Ŭ������ �ν��Ͻ��� ������ Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

//���� ��)
// ������ �� ���� �Է�(���� ����) : 10 5
// ������ ������ �Է�(+ - * /) : +
// >> 10 + 5 = 15
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.io.IOException;
import java.util.Scanner;
/*
class Calculate {
	//���� ����
	int i, j;
	char c;

	//�Է¹ޱ�
	void input() throws IOException{

		Scanner sc = new Scanner(System.in);

		System.out.print("������ �� ���� �Է�(���� ����) :");
		i = sc.nextInt();
		j = sc.nextInt();

		System.out.print("������ ������ �Է�(+ - * /) : ");
		c = (char)System.in.read();
	}

		//�����ϱ�
	int add(){
		int result = 0;
		
		if (c==43){ // + �� ��
			result = i + j;
		} else if (c==45){ // -�� ��
			result = i - j;
		} else if (c==42){ // * �� ��
			result = i * j;
		} else if (c==47){ // /�� ��
			result = i / j;
		}

		return result;
	}

	//����ϱ�
	void print(int sum){
		System.out.printf("%d %c %d = %d\n",i,c,j,sum);
	}

}

public class Test068{
	public static void main(String[]args) throws IOException {
		
		Calculate cal = new Calculate();
		
		cal.input();

		int a = cal.add();

		cal.print(a);
	}
}
*/

	class Calculate {
		//�ֿ� ���� ����
		int su1, su2;		//����ڷκ��� �Է¹��� �� ������ ��Ƶ� ����
		char op;			//����ڷκ��� �Է¹��� �����ڸ� ��Ƶ� ����
		
		//�޼ҵ� ����(���: �Է�)
		void input() throws IOException {
			Scanner sc = new Scanner(System.in);

			System.out.print("������ �� ���� �Է�(���� ����) : ") ;
			su1 = sc.nextInt();
			su2 = sc.nextInt();

			System.out.print("������ ������ �Է�(+ - * /) : ");
			op = (char)System.in.read();
		}
		
		//�޼ҵ� ����(��� : ����)
		int cal(){
			int result = 0;
			
			switch(op){
				case '+' :result = su1+su2; break;
				case '-' :result = su1-su2; break;
				case '*' :result = su1*su2; break;
				case '/' :result = su1/su2; break;
			}

			return result;
		}

		//�޼ҵ� ����(��� : ���)
		void print(int s){
			System.out.printf("%d %c %d = %d\n", su1,op,su2,s);
		}
}





public class Test068{
	public static void main(String[]args) throws IOException {
		
		//CalculateŬ���� �ν��Ͻ� ����
		Calculate cal = new Calculate();
		
		cal.input();

		int result = cal.cal();

		cal.print(result);
	}
}

/*
������ �� ���� �Է�(���� ����) :10 5
������ ������ �Է�(+ - * /) : *
10 * 5 = 50
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/