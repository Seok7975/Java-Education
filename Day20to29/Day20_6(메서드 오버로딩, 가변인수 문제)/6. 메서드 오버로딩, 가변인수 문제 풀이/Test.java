/*
class Test
{
	public static int add(int num1)
	{
		return num1;
	}
	public static int add(int num1, int num2)
	{
		return num1 + num2;
	}
	public static int add(int num1, int num2, int num3)
	{
		return num1 + num2 + num3;
	}
	public static void main(String[] args)
	{
		System.out.println(add(5));
		System.out.println(add(5, 10));
		System.out.println(add(5, 10, 15));
	}
}
*/

class Test
{
	public static int add(int ... num)
	{
		int sum = 0;
		for(int i : num)
			sum += i;
		return sum;
	}

	public static void main(String[] args)
	{
		System.out.println(add(5));
		System.out.println(add(5, 10));
		System.out.println(add(5, 10, 15));
	}
}