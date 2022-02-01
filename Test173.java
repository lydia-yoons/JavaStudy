/*===============================
���� ��ü ����ȭ(Object Serialization) ����
 ===============================*/

/*
�� ��ü ����ȭ(Object Serialization)��

	�޸𸮿� ������ Ŭ���� ��ü�� ��� ������ ���� ���¸�
	�״�� �����ؼ� ���Ͽ� �����ϰų�
	��Ʈ��ũ�� ���� ������ �� �ִ� �������
	��� ������ ���� �����Ѵٰų�
	�ٸ� ��Ʈ��ũ�� �ִ� ȣ��Ʈ�� ���� ���� ��� ����ϰ� �ȴ�.

	��, ��ü ����ȭ�� ���빰�� ����Ʈ ������ ��ȭ�Ͽ�
	���� �Ǵ� ��Ʈ��ũ�� ���� �ۼ���(��Ʈ��)�� �����ϰ� 
	������ִ� ������ �� ��, ��ü�� ��� ������ �޸𸮸�����
	������ ���� ���Ѵ�.

	����, �޼ҵ�� �����ڴ� ��ü ����ȭ�� ��󿡼� ���ܵȴ�~!! check~!!

�� ��ü ����ȭ�� ����

	��ü ��ü�� ������ ����� ���Ŀ� ���ֹ��� �ʰ�
	��ÿ�� ���Ͽ� ���������ν� ���Ӽ��� ������ �� ������
	��ü ��ü�� ��Ʈ��ũ�� ���� �ս��� ��ȯ�� �� �ְԵȴ�.

	��ü ����ȭ�� �ڹ� 1.1 ���Ŀ� ���ԵǾ��µ�
	�� ������ RMI �� Bean�����̾���.
	RMI�� ���� ��ü ����� �����ؾ� �ϱ� ������
	��ü�� �״�� �̵��� �� �־�� �Ѵ�.
	���� �̸� �����ϱ� ���ؼ��� ��ü ����ȭ�� �ʼ����̾���.

	����, Bean�� ����� ���¿� ���� ������ ������ ��
	�� ��ü ����ȭ�� ����ϸ� ���ϰ� ��ü ���¸� ������ �� �ִ�.


�� RMI(Remote Method Invocation)
	���� �ٸ� ���� ��� ��ġ�� �����ϴ� �Լ���
	ȣ���ϰ� �����ϴ� ����� ����Ѵ�.
	���� �ٸ� ��� ������ ��ġ�� ������ ���� ��ü�� ����
	��� ������ �����ϴ� �������� �����ϸ� ���ڴ�.

�� Bean(��)
	C/S(Client �� Server)������ �𵨿��� ������ ������ �ش��ϸ�
	���� ������ ����Ʈ���� ��ü�� ���� �� �ְ� �ϴ� ������Ʈ ���
	�ۼ��� ��ü�� ������ �����ϸ� ������Ʈ�� ���� ���Խ�ų �� �ֵ��� �Ѵ�.
	Ŭ���̾�Ʈ���� ���̶�� ���α׷� ������Ʈ�� �й��ϴ� ������� ó��


�� Serializable �������̽�
	
	��ü ����ȭ�� �ϱ� ���� ���� ��ü ����ȭ�� �����ϵ���
	java.io.Serializable ������ӽ��� ������ �־�� �Ѵ�.
	�� �������̽��� ��ü ����ȭ�� �����Ǿ�� �Ѵٴ� �����
	JVM���� �˷��ִ� ������ �����Ѵ�.
	����, Serializable �������̽���
	�ٸ� �������̽��� �޸� �����ؾ� �� �޼ҵ尡 ���� ������
	���� ���� ���ָ� �ȴ�.

	����) 
	��
	public class Ŭ������ implements Serializable
	{
		//  ...
	}

	��
	Serializable �������̽��� ������ ��
	ObjectInputStream Ŭ������ ObjectOutputStreamŬ������ �̿��Ͽ�
	��ü ������ ���߷��� �����ϰ� �ȴ�.

	�� ��� ������ static ���� ����� ���
		(��, Ŭ���� ������ ���)
		��ü ����ȭ�� ��󿡼� ���ܵȴ�.

�� Object Stream

	java.io.ObjectInputStream
	ObjectInputStramŬ������ ObjectOuptputStream Ŭ������ ����
	���Ͽ� ����Ǿ� �ִ� ��ü�� ��Ʈ��ũ�� ���� ���޵� ��ü��
	����ȭ�� �����ϴ� ����� �����Ѵ�.
	��, java.io.Serializable �������̽��� �������ִ� ��ü�� ���ؼ���
	����� �����ϴ�.
	��, Serializable �������̽��� Enternalizable �������̽���
	������ ��ü������ ����� �����ϴٴ� ���̴�.
	�� ��, readObject() �޼ҵ带 �̿��Ͽ�
	��Ʈ�����κ��� ����ȭ�� ��ü�� ���� �� ������
	�̷��� ���� ��ü�� �迭, ���ڿ� �Ǵ� �� ��ü ��
	������ ��(Type)���� ĳ���� �� �־�� �Ѵ�.

*/

import java.io.File;
import java.util.Hashtable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;



public class Test173{
	public static void main(String[]args){

		String appDir = System.getProperty("user.dir");

		//�׽�Ʈ
		//System.out.println(appDir);
		//==> C:\JavaStudy

		// ���� ��ü ����
		File f0 = new File(appDir, "\\data\\test.ser");
		//-- appDir �� C:\JavaStudy
		//-- appDir ��ġ(���)�� �߽����� "\\data\\test.ser"��
		//	 �����ϰڴٴ� �ǹ�.
		//-- ��������� ��C:\JavaStudy\data\test.ser������

		// �׽�Ʈ(Ȯ��)
		// ��
		//System.out.println(f0.getParentFile().exists());
		//==> false

		
		// �׽�Ʈ(Ȯ��)
		// �� ��C:\JavaStudy�� ��ο� ��data�����͸� ���� �� Ȯ��
		// System.out.println(f0.getParentFile().exists());
		// ==> true

		// ���͸� ������ �������� �ʴ� ��Ȳ�̶��...
		if(!f0.getParentFile().exists())
		{
			// ���͸��� ����ڴ�.
			f0.getParentFile().mkdirs();
		}

		// Hashtable �ڷᱸ��
		Hashtable<String, String> h1 = new HashTable<String, String>();

		// ������ h1�̶�� Hashtable �ڷᱸ���� ��� �߰�
		h1.put("3", "�չ���");
		h1.put("4", "ä����");
		h1.put("2", "������");
		h1.put("5", "�Ǽ���");
		h1.put("1", "�����");

		// �׽�Ʈ(Ȯ��)
		// System.out.println(h1.get("1"));
		// ==> �����

		// ���� ���� ��� ��Ʈ�� ����(�������� ����)
		FileOutputStream fos = FileOutputStream(f0);
		//-- ���� ���� ��� ��Ʈ��(���ٱ�)��
		//	 f0 ��� ���� ��ü�� ���ڴ�.. (��� ������ �� �ֵ���..)
		// InputStreamReader isr = new InputStreamRader(System.in);

		// ��ü ���� ��� ��Ʈ�� ����
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		//-- ��ü ���� ��� ��Ʈ��(���ٱ�)����
		//	 fos ��� ���� ���� ��� ��Ʈ���� ���ΰڴ�.
		// InputStreamReader isr = new InputStreamRader(isr);


		// ���� ������ ������ ����
		//ObjectOutputStream oss = new ObjectOutputStream(new FileOutputStream(f0));

		// ���� ����� ���� ���������� ������ ����
		// BufferedReader br = new BufferedRader(new InputStreamReader(System.in));

		// �� ObejctOutputStram Ŭ������
		//	  ��ü���� ����ϴ� ����� �����ϴ� Ŭ������
		//	  ��� ��Ʈ���� ����ϱ� ����
		//	  ���������� ��ü ����ȭ�� �����ϰ� �ȴ�.
		//	  �ڹ� �⺻�� ������ �Ǵ� ��ü����
		//	  ���Ͽ� �����ϰų� ��Ʈ��ũ�� ���� �����ϱ� ����
		//	  ������ ��ü�� ����ȭ �ϴ� ����� �����ϴ� ���̴�.

		//�������� ��Ʈ���� ������ ��ü�� ���
		oos.writeObject(h1);
		
		oos.close();
		//-- ObjectOutputStream ���ҽ� �ݳ�

		fos.close();
		//-- FileOutputStream ���ҽ� �ݳ�

		//------------------------------------------------- ������� �����ϸ� �о���̴� �۾� ��~!


		// �о���̱� ����~!!

		if (f0.exists())	//-- f0 ���� ��ü�� �����Ѵٸ�
		{
			FileOutputStream fis = new FileInputStream(f0);
			ObjectInputStream ois = new ObjectInputStream(fis);
		
			// ois(ObjectInputStream)�� ���� �о���� ��ü(Object)�� (�� readObject�� ���� ó��)
			//
			Hashtable h2 = ois.readObject();
		}



		while (e.hashMoreElement())
		{
			key = (String)h2.get(key);

			System.out.println(key + " �� " + value);
		}

		



		

	}
}