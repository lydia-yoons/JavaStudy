/*======================================
	���� Ŭ������ �ν��Ͻ� ����
		- ���� ���а� ��������������
  ======================================*/

import java.util.Scanner;

class CircleTest2
{	
	//���� ����(Information Hiding)
	// ��� ����, �ν��Ͻ� ����, ���� ����
	//��private���̶�� ���������������� ������
	// Ŭ���� ���ο����� ���� �� ������ �����ϰ� �ϰڴٴ� �ǹ�
	// int�� ���� 0���� �ʱ�ȭ ����
	private int r;

	//int r;

	// getter / setter ����
/*	int getR(){
		return r;
	}

	void setR(int r){
		this.r = r;
	}
*/
	void input(){
		Scanner sc = new Scanner(System.in);

		System.out.print("������ �Է� : ");
		r = sc.nextInt();
	}

	double calArea(){
		return r * r * 3.141592;
	}

	void wirte(double a){
		System.out.println("������ : "+ r);
		System.out.println("�� �� : " + a);
	}
}

public class Test093{
	public static void main(String[]args){
		//CircleTest2 �ν��Ͻ� ����
		CircleTest2 ob1 = new CircleTest2();

		//ob1.r = 10;	
		//System.out.println("���� ������ : "+ob1.r);

		//ob1.setR(10);
		//System.out.println("���� ������ : "+ob1.getR());


		ob1.input();
		//-- 5000
		double result = ob1.calArea();

		ob1.wirte(result);
	}
}

/*
������ �Է� : 5000
������ : 5000
�� �� : 7.85398E7
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
