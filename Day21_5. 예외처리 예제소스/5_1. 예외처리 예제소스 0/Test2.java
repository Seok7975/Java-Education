class Test2
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println(10/0); // throw new ArithmeticException()
		}
		catch(ArithmeticException e)
		{
			System.out.println("0으로 나누면 안돼요.");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}