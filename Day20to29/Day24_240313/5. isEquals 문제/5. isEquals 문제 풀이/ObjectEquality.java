/*
== �����ڴ� ���������� ���� ���� ���Ѵ�. 
���� �ν��Ͻ��� ����Ǿ� �ִ� �� ��ü�� ���Ϸ��� ������ ����� ����ؾ� �Ѵ�. 
�� ��ü�� ���� �� �ֵ��� public boolean isEquals(IntNumber numObj) �޼ҵ带 �����Ͻÿ�.
*/

class IntNumber
{
	int num;
	
	public IntNumber(int num)
	{
		this.num=num;
	}
	
	public boolean isEquals(IntNumber numObj)
	{
		return this.num == numObj.num;
	}
}

class ObjectEquality
{
	public static void main(String[] args)
	{
		IntNumber num1=new IntNumber(10);
		IntNumber num2=new IntNumber(12);
		IntNumber num3=new IntNumber(10);
		
		if(num1.isEquals(num2))
			System.out.println("num1�� num2�� ������ ����");
		else
			System.out.println("num1�� num2�� �ٸ� ����");
		
		if(num1.isEquals(num3))
			System.out.println("num1�� num3�� ������ ����");
		else
			System.out.println("num1�� num3�� �ٸ� ����");
		
	}
}