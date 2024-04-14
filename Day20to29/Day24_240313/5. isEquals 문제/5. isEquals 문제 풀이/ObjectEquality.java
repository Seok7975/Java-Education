/*
== 연산자는 참조변수의 참조 값을 비교한다. 
따라서 인스턴스에 저장되어 있는 값 자체를 비교하려면 별도의 방법을 사용해야 한다. 
값 자체를 비교할 수 있도록 public boolean isEquals(IntNumber numObj) 메소드를 정의하시오.
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
			System.out.println("num1과 num2는 동일한 정수");
		else
			System.out.println("num1과 num2는 다른 정수");
		
		if(num1.isEquals(num3))
			System.out.println("num1과 num3는 동일한 정수");
		else
			System.out.println("num1과 num3는 다른 정수");
		
	}
}