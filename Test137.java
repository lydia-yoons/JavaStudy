/*===============================
	���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
	- ���ڿ� ���� Ŭ����
	- ĳ���� ��(CharacterSet)
  ===============================*/
/*
�� ĳ���� ��(CharacterSet)
	
	�� �����ڵ�(unicode)
		���� ǥ������ ������ 2����Ʈ���� ���� ������ ���� ���ں�ȣü��
		(UCS : Universal Code System)�� ���Ѵ�.
		������ǻ��, IBM, ����ũ�μ���Ʈ ���� ���ҽþ����� ������
		�����ڵ�(Unicode)�� 1990�⿡ ù ������ ��ǥ�Ͽ���,
		ISO/IEC JTC1dptj 1995�� 9�� ���� ǥ������ �����Ͽ���.
		���� ��Ī�� ISO/IEC 10646-1(Universal Multiple_Octet Coded Character Set)dlek.

		�������� ��ȯ�� ��Ȱ�ϰ� �ϱ� ���Ͽ� ���� 1���� �ο��Ǵ� ����
		16������ �����Ͽ���.
		�ڵ��� 1���� �� ����� 7��Ʈ, �񿵾�� 8��Ʈ,
		�ѱ��̳� �Ϻ���� 16��Ʈ�� ���� ������ �Ǵµ�
		�̵��� ��� 16��Ʈ�� ������ ���̴�.

	�� UTF-8 �� UTF-16
	   
	   UTF-8 �� UTF-16�� ���̸� �� ����� ǥ�����ڸ�
	   ���ڸ� ǥ���� ���� ������ �ٸ��ٴ� ���̴�.
	   UTF-8 �� 8��Ʈ�� ������ ��Ƽ����Ʈ���� ���ڸ� ǥ���ϰ�
	   UTF-16�� 16��Ʈ�� ������ ��Ƽ����Ʈ���� ���ڸ� ǥ���Ѵ�.

	   - UTF-8(8bit UCS Transformation Format)
	     ������ �⺻������ ����ϴ� �ڵ�,
		 UCS-2�� ���ǵǴ� ���� ������ �̿��Ͽ�
		 ����� ���ڿ��� ����Ʈ���� ��ȯ�ϴ� ����� 1�� 1���ڸ�
		 1~6����Ʈ ������ ��Ƽ����Ʈ�� ��ȯ�Ѵ�.

	   - UTF-16(16bit UCS Transformation Format)
	     �ڹ��� �⺻ �ڵ�.
		 �ڹٿ����� ���� �ϳ��� �����ϸ� ����Ʈ ���� �������̵�, �ѱ۹����̵� 2����Ʈ�Ѥ� �����ϰ� �ȴ�.
		 UCS-2�� ���ǵǴ� ���� ������ �̿��Ͽ�
		 ����� ���ڿ��� UCS-4�� �Ϻ��� ���ڸ� ä���ֱ� ���� ���ڵ� ���.
		 UTF-8�� ������ �� �ִ�.
		 UCS-2�� �̿��� �� �ִ� ���ڼ��� ���� �ø� �� �ִ�.

		
	�� �ڹٿ����� UTF-16�� ����ϰ� �������� UTF-8�� ����ϱ� ������
	   ��쿡 ���� ��ȯ�ؾ� �ϴ� ��Ȳ�� �߻��� �� �ִ�.


�� ���� �ڵ��� ����
	
	�� KSC5601
		�ѱ� �ϼ��� ǥ��(�ѱ� 2, 350�� ǥ��).
		�ѱ�����ǥ�� ����ó���о�(c)�� 5601�� ǥ�ؾ�.

	�� KSC5636
		�����ڿ� ���� ǥ��.
		�ѱ�����ǥ�� ����ó���о�(c)�� 5636�� ǥ�ؾ�.
		���� ASCII Code���� ��������(\)�� ��(��)ǥ�÷� ��ü.
	
	�� EUC-KR(MS949)
		Bell-Laboratories���� ���н� �󿡼� ������ �̿��� ���ڸ�
		�����ϱ� ���� ������ Ȯ�� �����ڵ�(Extend UNIX Code)��
		�ѱ� ���ڵ� ���.
		������ KSC5636���� ó���ϰ�, �ѱ��� KSC5601�� ó��.
		��, EUC-KR(MS949) = KSC5636 + KSC5601.
	
	�� UTF-8
		������ ���ڴ� 1����Ʈ, �ѱ��� 3����Ʈ�� ǥ��.
		(������ ���� ���. UTF-8�������� JSP�� �ۼ��� ������
		 ���ϵ� UTF-8 �������� �����ؾ��Ѵ�.)

	�� UTF-16
		�ڹ� �⺻ ���� �ڵ�.
		������ ���ڴ� 1����Ʈ, �ѱ��� 2����Ʈ�� ǥ��.
	
	�� ISO-8859-1
		������ ��� ǥ�⿡ �ʿ��� US-ASCII�� ����
		94���� ������ ������ ����
	
	
*/


import java.io.UnsupportedEncodingException;

public class Test137{
	public static void main(String[]args) //throws UnsupportedEncodingException 
	{
		
		byte[] buf;
		String name = new String("���ش�");

		System.out.println("����Ʈ ĳ���ͼ� : "+System.getProperty("file.encoding"));
		//==> ����Ʈ ĳ���ͼ� : MS949
		

		// ��String.getBytes()��
		// : ����Ʈ ĳ���ͼ����� ����Ʈ �迭�� ��ȯ�ϴ� �޼ҵ�
		buf = name.getBytes();	// �ü���� �⺻ ���ڵ� ��Ŀ� ����...


		System.out.println("Length : "+buf.length);
		// ==> 6

		for (byte b : buf )
		{
			System.out.print("["+ b + "]");
		}
		System.out.println();
		//==> [-68][-37][-57][-40][-76][-10]
		//    --------- ---------- ---------
		//		��			��			��

		try
		{
			// ��utf-8���� ����Ʈ �迭�� ��ȯ�ϴ� �޼ҵ�
			buf = name.getBytes("utf-8");	// �Ѱ��� �Ű����� ���ڵ� ��Ŀ� ����..

			System.out.println("Length : "+buf.length);

			for (byte b : buf)
			{
				System.out.print("["+ b + "]");
			}
			System.out.println();
			//==> [-20][-122][-95][-19][-107][-76][-21][-115][-107]
			

			// utf-8 ���·� ����� ����Ʈ �迭��
			// String ��ü�� �Ķ���� �� utf-8�� �ο��Ͽ� ����
			//	�� utf-8������� buf����Ʈ �迭�� ����
			//	���ڿ� ��ü ������ �� �̸� ���
			System.out.println("Value 1 : " + new String(buf, "utf-8"));
			// ==> Value 1 : ���ش�

			System.out.println();	// ����

			// utf-8 ���·� ����� ����Ʈ �迭��
			// String ��ü�� �Ķ���� �� ���� ����
			//	�� ����Ʈ ĳ���ͼ���(ms949) ������� buf����Ʈ �迭�� ����
			//	���ڿ� ��ü ������ �� �̸� ���
			System.out.println("Value 2 : " + new String(buf));
			// ==> Value 2 :  ?��?��?��


			System.out.println();	//����

			String convert = new String(name.getBytes("euc-kr"),"utf-8");

			System.out.println("Value 3 : "+ convert);
			//==> Value 3 : ?????

			buf = convert.getBytes();
			System.out.println("Length : "+buf.length);
			//==> Length : 5

			buf = convert.getBytes("utf-8");
			System.out.println("Length : "+buf.length);
			//==> Length : 14

			/*
			�� check~!!

				euc-kr�� utf-8�� ��ȯ�ϰڴٴ� �ǵ���
				���Ͱ��� �ڵ��� �ع�����
				�̷��� ��ȯ���� ���� ����Ʈ �迭�� ������
				euc-kr �̵�..  utf-8�̵�..
				��� ����Ʈ �迭�� �о����
				�����ִ� ���� Ȯ���� �� �ִ�.

				�̹� ������ ������ String��ü�� ����Ʈ �迭��
				� ������ε� ������ �Ұ����ϴ�.			
			
			*/
		
			
		}
		catch (UnsupportedEncodingException e)
		{
			System.out.println(e.toString());
		}

	




	}
	
}