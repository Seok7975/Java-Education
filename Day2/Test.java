class Test
{
	public static void main(String[] args)
	{
		int num1 = 10, num2 = 10;
		int result1 = 0, result2 =0;

		/*result1 = ++num1;  // result1 : 11   num1 : 11
		result2 = num2++;  // result2 : 10     num2 : 11

		System.out.println(num1 + " " + num2);
		System.out.println(result1 + " " + result2);	
		*/
		
		System.out.println(num1++); // 10을 출력하고 11
		System.out.println(num1);	// 11

		num1 = 10;

		System.out.println(++num1); // 11이 되고 출력
		System.out.println(num1);	// 11

	}


}