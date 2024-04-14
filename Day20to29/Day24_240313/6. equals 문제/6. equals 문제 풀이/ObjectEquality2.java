//문제5를 Object 클래스의 equals 라는 메소드를
// 이용하여 구현하시오.(메소드 오버라이딩)

//== : Call by Reference, 주소의 값(자료의 위치값)을 비교
//equals() 메소드 : Call by value, 객체끼리 내용을 비교

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
			System.out.println("num1과 num2는 동일한 정수");
		else
			System.out.println("num1과 num2는 다른 정수");
		
		if(num1.equals(num3))
			System.out.println("num1과 num3는 동일한 정수");
		else
			System.out.println("num1과 num3는 다른 정수");
	}
}


num1 IntNumber 10    -> this.num=num=10
num2 IntNumber 12   -> this.num=num=12
num3 IntNumber 10  -> this.num=num=10

this.num = 10, ((IntNumber)numObj).num = 12

this.num = 10, ((IntNumber)numObj).num = 10
