class IntNumber
{
	int num;
	
	public IntNumber(int num)
	{
		this.num=num;
	}
	
	public boolean equals(Object obj)
	{
		if(this.num==((IntNumber)obj).num)
			return true;
		else
			return false;
	}
}

class ObjectEquality2
{
	public static void main(String[] args)
	{
		IntNumber num1=new IntNumber(10);
		IntNumber num2=new IntNumber(12);
		IntNumber num3=new IntNumber(10);
		
		if(num1.equals(num2))
			System.out.println("num1�� num2�� ������ ����");
		else
			System.out.println("num1�� num2�� �ٸ� ����");
		
		if(num1.equals(num3))
			System.out.println("num1�� num3�� ������ ����");
		else
			System.out.println("num1�� num3�� �ٸ� ����");
	}
}