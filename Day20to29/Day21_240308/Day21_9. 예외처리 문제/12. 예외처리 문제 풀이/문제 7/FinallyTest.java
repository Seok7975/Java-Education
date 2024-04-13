/*
7. 예외 상황의 발생여부와 상관없이 항상 실행되는 영역에 쓰는 키워드는 무엇이고, 
그것을 이용하여 소스코드를 작성해 보시오.
*/

class FinallyTest
{	
	public static void main(String[] args)
	{
		boolean divOK=divider(4, 2);
		if(divOK)
			System.out.println("연산 성공");
		else
			System.out.println("연산 실패");
		
		divOK=divider(4, 0);
		if(divOK)
			System.out.println("연산 성공");
		else
			System.out.println("연산 실패");
	}
	
	public static boolean divider(int num1, int num2)
	{
		try
		{
			int result=num1/num2;
			System.out.println("나눗셈 결과는 "+result);
			return true;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
			return false;
		}
		finally
		{
			System.out.println("finally 영역 실행");
		}
	}
}