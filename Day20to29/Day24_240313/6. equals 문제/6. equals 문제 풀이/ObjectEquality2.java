//����5�� Object Ŭ������ equals ��� �޼ҵ带
// �̿��Ͽ� �����Ͻÿ�.(�޼ҵ� �������̵�)

//== : Call by Reference, �ּ��� ��(�ڷ��� ��ġ��)�� ��
//equals() �޼ҵ� : Call by value, ��ü���� ������ ��

class IntNumber
{
	int num;
	
	public IntNumber(int num)
	{
		this.num=num;
	}
	
	public boolean equals(Object obj)
	{
		IntNumber other = (IntNumber)obj;
		return this.num == other.num;
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


num1 IntNumber 10    -> this.num=num=10
num2 IntNumber 12   -> this.num=num=12
num3 IntNumber 10  -> this.num=num=10

this.num = 10, ((IntNumber)numObj).num = 12

this.num = 10, ((IntNumber)numObj).num = 10
