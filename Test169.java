/*===============================
���� �ڹ��� �⺻ �����(I/O) ����
 ===============================*/

// OutputStream �ǽ�

import java.io.IOException;
import java.io.OutputStream;

public class Test169{
	public static void main(String[]args) throws IOException {
	

	// System.in : �ڹ��� ǥ�� �Է� ��Ʈ��
	// System.out : �ڹ��� ǥ�� ��� ��Ʈ��

	OutputStream out = System.out;

	byte[] ch = new byte[3];

	ch[0] = 65;		// A
	ch[1] = 97;		// a
	ch[2] = 122;	// z

	out.write(ch);	//-- ������ ������ ������(����)�� ��Ʈ���� ���

	out.flush();	//-- ��ϵ� ��Ʈ���� ��������(�о��) ����� ����
					//   ������ Buffer�� Ȱ������ �ʰ� �ִ� ��Ȳ�̱� ������
					//	 ������ ������ �ڵ�
					//	 (Buffered �Ǿ� �ִ� ������(stream)�� ��� ���� �Ұ�)

	out.close();	//-- ��� ��Ʈ��(���ٱ�)�� ���� ���ҽ� �ݳ�
					//   (out ��Ʈ���� (���������� ) �ᰡ���� ��Ȳ)
		
	
	System.out.println("�ŷ��ִ� ����");
	//-- ��out.colse()���� �ۼ��� ���� ��µ��� �ʴ� ����
	//	 ��µǴ� ��Ʈ��(���ٱ�)�� �ݾұ� ������.. ��µ��� �ʴ´�

	}
}