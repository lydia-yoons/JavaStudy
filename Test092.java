/*======================================
	���� �迭 ����
	- �迭�� ����
  ======================================*/
//�� �迭������ ���翡�� ������ ����, �ּҰ� ���� �� ���� ���°� �����Ѵ�.
//	�ּҰ� ���� �� ���� ���� �� ������ �����ϸ� ���纻�� ������ ��ġ�� �Ǵ� ���� ���.
//								(�迭 �� �ƴ϶� ��� ������ �����Ϳ� �ش��ϴ� ������)
//	������ ���� �� ���� ���� �� ���� ��ҷ� ����ִ� ���� ���� �����
//								������ �����ص� ���纻�� ������ ��ġ�� �ʴ� ���� ���.

//Test091.java ���ϰ� ��~!!

//������ ����
//-- int  �� �迭�� ���� ���� �ǹ��� ���縦 ó���ϴ�
//	�޼ҵ带 �����ϴ� ���·� �ý��� �����Ѵ�.


public class Test092{
	public static void main(String[]args){

		int[] nums = {10, 20, 30, 40, 50};	//-- �迭 ����
		
		int[] copys1 = nums;				//-- ���� �ǹ��� �迭 ���� ����
											//		(�ּҰ� ����)		
		int[] copys2 = copyArray(nums);		//-- ���� �ǹ��� �迭 ���� ����
											//		(����� ���� �޼ҵ� ȣ��)
						
		int[] copy3 = (int[])nums.clone();	//-- ���� �ǹ��� �迭 ���� ����
											//	(�ڹٰ� ���� �� clone() �޼ҵ�)

		// ���� �迭 ����� ���� �߻� ~!!
		nums[1] = 2;

		// ��� Ȯ��
		for (int i=0; i<nums.length; i++)
			System.out.print(nums[i] + " ");
		System.out.println();
		 //==> 10 2 30 40 50

		for (int i=0; i<nums.length; i++)
			System.out.print(copys1[i] + " ");
		System.out.println();
		 //==> 10 2 30 40 50

		for (int i=0; i<nums.length; i++)
			System.out.print(copys2[i] + " ");
		System.out.println();
		//==> 10 20 30 40 50
		
	}
	
	// �Ű������� int�迭 Ÿ���� �Ѱܹ޾� �̸� ������ ��
	// ������ �迭�� ��ȯ�ϴ� ����� ���� �޼ҵ� ����
	public static int[] copyArray(int[] os){	// {10,20,30,40,50}
		// �Ű������� �Ѱܹ��� �迭(os)
		// ��, ���� �迭 ��ŭ�� �迭��(�޸� ����)�� Ȯ����
		// ������ �迭�� ����
		int[] temp = new int[os.length];	
		//int[] temp = new int[5];				// [ ]-[ ]-[ ]-[ ]-[ ]

		// ���� �迭(os)�� ����ִ� ������ ��ҵ���
		// ���� �迭(temp)�� ��Ƴ���.. �ϳ���. �ϳ���...
		for (int i=0; i<os.length; i++)			// for(int i=0; i<5; i++)	// i �� 0 1 2 3 4
		{
			temp[i] = os[i];					// temp[0]=os[0] / temp[1]=os[1] / ... / temp[4]=os[4]
		}

		//������ �迭(temp)��ȯ
		return temp;

	}
}