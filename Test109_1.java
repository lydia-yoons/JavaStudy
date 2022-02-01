/*===============================
	���� Ŭ���� ��� ����
	 - ���(Inheritance)
  ===============================*/

// ������ ���� ���α׷��� �����Ѵ�.
// ��, ����� ������ �����Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ �� ���� �Է�(���� ����) : 20 15
// ������ �Է�(+ - * / ) : -
// >> 20 - 15 = 5.00
// ����Ϸ��� �ƹ�Ű�� ��������...

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Aclass
{
	protected int x, y;
	protected char op;

	Aclass(){
		
	}
	
	void write(double result){
		System.out.printf(">> %d %c %d = %.2f\n", x, op, y, result);
	}
}


// sub class �� Aclass�� ��ӹ޴� Ŭ����
class Bclass extends Aclass
{
	/*
	protected int x, y;
	protected char op;
	
	void write(double result){
		System.out.printf(">> %d %c %d = %.2f\n", x, op, y, result);
	}
	*/
	
	/* ���������ʾ����� �ڵ������Ǵ� ������
	Bclass(){
		super();
	}
	*/
	
	//�Է¹޴� �޼ҵ�
	boolean input() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("������ �� ���� �Է�(���� ����) : "); // : 20 15
		String temp = br.readLine();	// "20 15"
		String[] strArr = temp.split("\\s");	// ������ �� ����
		// String[] strArr = {"10", "15"};


		// �� ���ڿ�.split("������")
		//	 ex) "10 20 30 40".split("\\s");
		//			��{"10", "20", "30", "40"} ��ȯ
		
		if (strArr.length != 2)
				return false; 
		//-- false�� ��ȯ�ϸ� input()�޼ҵ� ����
		// �� ������ ������ ���..
		// �� �ڵ��� �Ʒ��� �����ؾ� �� �ڵ尡 �����ִ���
		// ������� ��ȯ�ϸ� �޼ҵ�� ����ȴ�~!
		
		x = Integer.parseInt(strArr[0]);
		y = Integer.parseInt(strArr[1]);

		System.out.print("������ �Է�(+ - * / ) : ");
		op = (char)System.in.read();
		
		/*
		if (op != '+' && op != '-' && op != '*' && op != '/' )
		{
			return false;
		}

		return true;
		*/
		if (op == '+' || op == '-' || op == '*' || op == '/' )
		{
			return true;
		}

		return false;

	} //end input()

	double calc(){
		double result = 0;
		
		switch (op)
		{
		case '+' : result = x + y; break;
		case '-' : result = x - y; break;
		case '*' : result = x * y; break;
		case '/' : result = (double)x / y; break;
		
		}

		return result;
	} 

}//end calc()


// main() �޼ҵ带 �����ϴ� �ܺ��� �ٸ� Ŭ����
public class Test109_1{
	public static void main(String[]args) throws IOException {

		Bclass ob = new Bclass();
		
		if (!ob.input()){
			System.out.println("Error...");
			return; //���α׷� ����
		}
		
		double result = ob.calc();

		ob.write(result);
		
	}
}

/*
������ �� ���� �Է�(���� ����) : 10 20
������ �Է�(+ - * / ) : +
>> 10 + 20 = 30.00
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/