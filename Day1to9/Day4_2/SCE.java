//논리연산자 &&, ||의 흐름 확인

/*class SCETest1
{
	public static void main(String[] args)
	{
		int num1=0, num2=0;

		if( (num1 = num1 + 10) > 10 && (num2 = num2 +10) > 10) // "10>10, 10>10"가 아니고!!! 자바는 앞에 것이 거짓이면 뒤에것은 실행자체를 안함!!@!!!!!!
		{

			System.out.println("Good");		// num1 = 10, num2 = 0
		}
		if( (num1 = num1 + 10) > 10 || (num2 = num2 + 10) > 10) // "num1 = 20, num2 = 10"이 아니고!!! ||에선 자바가 앞이 참이면 뒤에는 참 거짓 상관없으므로 실행 안함!
		{
			
			System.out.println("Nice");
		}
		
		System.out.println("num1 = " + num1 + " num2 = " +num2); // 20, 0
	}
}
*/

class SCETest2
{
	public static void main(String[] args)
	{
		int i=0, j=0;
		while(i++<10 || j++<10)
		{}
		System.out.println("i = " + i + " j = " + j); // 21, 11
	}
}