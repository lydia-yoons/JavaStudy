/*===============================
���� �ڹ��� �⺻ �����(I/O) ����
 ===============================*/

// Reader Writer �ý�

import java.io.InputStream;
import java.io.Reader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.io.Writer;


public class Test172{

	public void process(InputStream is){

		int data;

		System.out.println("���ڿ� �Է�(���� : Ctrl+z)");

		try
		{	
			// �Ű����� is��� ����Ʈ ��� ��ü(InputStream)��
			// ���� ��Ʈ������ ��ȯ�Ͽ�
			// (�� InputStreamReader �� ����)
			// Reader Ÿ���� rd���� ������ �� �ֵ��� ó��
			Reader rd = new InputStreamReader(is);

			// ����Ʈ ��� ��Ʈ���� �ڹ� �⺻ ��� ��Ʈ��(System.out)��
			// ���� ��Ʈ������ ��ȯ�Ͽ�
			// (�� OutStreamReader �� ����)
			// Write Ÿ���� wt���� ������ �� �ֵ��� ó��
			Writer wt = new OutputStreamWriter(System.out);

			while ( (data = rd.read()) != -1 )
			{
				wt.write(data);		//-- ��Ʈ�� ���ٱ⿡ ���
				wt.flush();			//-- ����� ��Ʈ���� �о�� ������
			}

		}
		catch (IOException e)
		{
			System.out.println(e.toString());
		}
	}


	public static void main(String[]args){
		
		Test172 ob = new Test172();
		ob.process(System.in);
		
	}
}

/*
���ڿ� �Է�(���� : Ctrl+z)
abc
abc
1234
1234
�����ٶ�
�����ٶ�
^Z
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
