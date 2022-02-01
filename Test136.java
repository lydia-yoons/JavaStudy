/*===============================
	���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
	- StringTokenizer Ŭ����
  ===============================*/

/*
�� StringTokenizerŬ������
	���ڿ� �Ľ�(parsing)�� ���� ������ �����ϴ� Ŭ������
	�Ľ�(parsing)�ϰ��� �ϴ� ���ڿ��� ���ڷ� �޾� �����ϴµ�,
	���⿡�� �Ľ�(parsing)�̶� �ϳ��� ���ڿ��� ���� ���ڿ���
	������ �۾��� �ǹ��ϰ� �Ǹ�, �� �� ������ ������ �Ǵ�
	���ڿ��� ��ū(token)�̶�� �Ѵ�.

	StringTokenizerŬ������ ����ϱ� ���ؼ���
	java.util��Ű���� StringTokenizer�� import�ؾ� �Ѵ�.

	StringTokenizerŬ������ ȣȯ���� �����ϴ� ��������
	���� �����ǰ� ������ ���ڿ��� �Ľ�(parsing)�ϱ� ���ؼ���
	String Ŭ������ split()�޼ҵ峪 java.util.regex��Ű����
	����� ���� �����ϰ� �ִ�.

�� ������
	-  ����
	StringTokenizer(String str)
	StringTokenizer(String str, String delim)
	StringTokenizer(String str, String delim, boolean returnDelims)
	�� �־��� ���ڿ� str�� �ܾ�� �и��ϴ� ��ü�� �����ϸ�
		����(����)���ڴ� delim�� ���Ե� ���ڷ� ó���ϰ� �ȴ�.
		���� returnDelims �� true���
		���� ���ڵ� �и��� �����ͷ� ó���ϰ� �ȴ�.
*/

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Test136{
	public static void main(String[]args) throws IOException {
		String strTemp;
		String[] strArr;
		int n;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("�Ľ��� ���ڿ� �Է�(�ĸ�����) : ");	// "���, ����, �ٳ���, �丶��"
		strTemp = br.readLine();

		//StringTokenizer Ŭ���� �ν��Ͻ� ����
		StringTokenizer st = new StringTokenizer(strTemp, ",");
		//-- strTemp�� ��� ���ڿ���...
		//	 ��,���� �����ڷ�...

		strArr = new String[st.countTokens()];		// st.countTokens() �� 4
		//-- int countTokens()
		//	: �Ľ̵� ���ڿ��� ������ ��ȯ(����)�Ѵ�.

		n = 0;

		while(st.hasMoretokens()){
			strArr[n++] = st.nextToken();
		}
		//-- ��hasMoreTokens()��
		//	: ����� �� �ִ� ��ū�� �����ִ� ��� true�� ��ȯ.
		//	  �� �̻� ����� ��ū�� �������� ���� ��� false�� ��ȯ.
		//	  Ȯ�� ����� ��ȯ�� ��...
		//	  ���� ������ �Ͼ���̴� ���()�� �̵���Ű�� �ʴ´�.

		//-- ��nextToken()��
		//	: ���� ��ū�� ���´�.
		//	  ���� ��ū�� ������ ���()�� �̵���Ű�� �ȴ�.
		//	  �����ڸ� �ٲپ��� ��� ���� ȣ�⿡��
		//	  �ٲ� �����ڸ� �̿��Ͽ� ��ū�� �и��Ѵ�.

		System.out.print("�Ľ̵� ��ū(���ڿ�) : ");
		for(String str : strArr)
			System.out.print(str+" ");
		System.out.println();
		
		

	}
}