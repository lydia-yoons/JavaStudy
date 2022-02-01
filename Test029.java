/*======================
������� �帧�� ��Ʈ��(���, ���ǹ��� �ݺ���)����
	- if ~ else�� �ǽ�
=========================*/

// ����ڷκ��� �̸�, ����, ����, ���������� �Է¹޾�
// ������ ���� ���·� ����ϴ� ���α׷��� �ۼ��Ѵ�.
// ����� ��� ������ �������� �����Ͽ� ó���Ѵ�.

// 90�� ~ 100�� : A			80�� ~ 89�� : B
// 70�� ~ 79�� : C			60�� ~ 69�� : D
// 60�� �̸� : F

// ��, BufferedReader�� Ȱ���Ͽ� �����͸� �Է¹ް�,
// printf()�޼ҵ带 ���� ���

//���� ��)
// �̸� �Է� : ȫ�浿
// ���� ���� : 90
// ���� ���� : 80
// ���� ���� : 70

// >> ����� �̸��� ȫ�浿�Դϴ�.
// >> ���� ������ 90,
// >> ���� ������ 80,
// >> ���� ������ 70,
// >> ������ 240�̰�, ����� 80�Դϴ�.
// >> ����� B�Դϴ�.
// ����Ϸ��� ...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test029{
	public static void main(String[]args) throws IOException {
	//BuffereReade �ν��Ͻ�
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	

/*[���� Ǭ �ڵ�]*****************************
	//��������
	int kor, eng, mat, sum, avg; ; //������ ,����, ���
	String name, strResult;	//�̸�, ���� ���

	
	System.out.print("�̸� �Է� : ");
	name = br.readLine(); // �̸� �Է�

	System.out.print("���� ���� : ");
	kor = Integer.parseInt(br.readLine());

	System.out.print("���� ���� : ");
	eng = Integer.parseInt(br.readLine());

	System.out.print("���� ���� : ");
	mat = Integer.parseInt(br.readLine());

	//����
	sum = kor + eng + mat;
	//���
	avg = (kor + eng + mat)/3;
	
	System.out.printf(">> ����� �̸��� %s�Դϴ�. \n", name);
	System.out.printf(">> ���������� %d��, \n", kor);
	System.out.printf(">> ���������� %d��, \n", eng);
	System.out.printf(">> ���������� %d��, \n", mat);
	System.out.printf(">> ������ %d�̰�, ����� %d�Դϴ�.\n", sum, avg);

	//���ǹ�
	if(90 <= avg && avg <= 100 ){
		System.out.println("����� A�Դϴ�");
	}else if(80 <=avg)	{
		System.out.println("����� B�Դϴ�");
	}else if(70 <=avg)	{
		System.out.println("����� C�Դϴ�");
	}else if(60 <=avg)	{
		System.out.println("����� D�Դϴ�");
	}else{
		System.out.println("����� F�Դϴ�");
	}
*/

	//[�Բ� Ǭ �ڵ�] ***********************
	String name;
	int kor, eng, mat;
	int tot;			//����
	double avg;			//���
	char grade = 'F';			//���
	
	System.out.print("�̸� �Է� : ");
	name = br.readLine();

	System.out.print("���� ���� : ");
	kor = Integer.parseInt(br.readLine());

	System.out.print("���� ���� : ");
	eng = Integer.parseInt(br.readLine());

	System.out.print("���� ���� : ");
	mat = Integer.parseInt(br.readLine());

	//���� ����
	tot = kor + eng + mat;

	//��� ����
	avg = tot / 3.0;		//check!
	
	//��� ����
	

	//�ص� �� �̻��� ���� ���� �� �� ������
	//����� 90�� �̻� and ����� 100����
	if (avg >=90)
	{
		//����� A
		grade = 'A';
	}
	else if (avg>=80)
	{
		//����� B
		grade = 'B';
	}
	else if (avg>=70)
	{
		//����� C
		grade = 'C';
	}
	else if (avg>=60)
	{
		//����� D
		grade = 'D';
	}
	/*else if (avg<60)
	{
		//����� F
		grade = 'F';
	}
	*/

	//���� ��� ���
	System.out.println();
	System.out.printf(">> ����� �̸��� %s�Դϴ�. \n", name);
	System.out.printf(">> ���������� %d, \n", kor);
	System.out.printf(">> ���������� %d, \n", eng);
	System.out.printf(">> ���������� %d, \n", mat);
	System.out.printf(">> ������ %d�̰�, ����� %.2f�Դϴ�.\n", tot, avg);
	System.out.printf(">> ����� %c�Դϴ�.\n", grade);

	}
}	

/*
//[���� Ǭ ��]
�̸� �Է� : ȫ�浿
���� ���� : 90
���� ���� : 80
���� ���� : 70
���������� 90��,
���������� 80��,
���������� 70��,
������ 240�̰�, ����� 80�Դϴ�.
����� B�Դϴ�
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .


//[�Բ� Ǭ ��]
�̸� �Է� : �質��
���� ���� : 90
���� ���� : 80
���� ���� : 10

>> ����� �̸��� �質���Դϴ�.
>> ���������� 90,
>> ���������� 80,
>> ���������� 10,
>> ������ 180�̰�, ����� 60.00�Դϴ�.
>> ����� D�Դϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/