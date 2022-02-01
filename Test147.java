/*===============================
���� ����(Exception) ó�� ����
 ===============================*/

 
// Test146.java���ϰ� ��~~!!


class Demo2
{
	private int value;

	public void setValue(int value){

		if (value <= 0)
		{
			//���� ����
			throw new Exception("value �� 0���� �۰ų� ���� �� �����ϴ�.");
		}
		
		this.value = value;
	}

	public int getValue(){
		return value;
	}

}


public class Test147{
	public static void main(String[]args){

		Demo2 ob = new Demo2();

		try
		{
			ob.setValue(-3);
			int result = ob.getValue();
			System.out.println(result);	
			
		}
		catch (Exception e)
		{
			System.out.println(e.toString());
		}

		


	}
}