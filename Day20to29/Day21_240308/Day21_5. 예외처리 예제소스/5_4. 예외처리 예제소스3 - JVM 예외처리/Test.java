class Test
{
	public static void main(String[] args)
	{
		hi();
	}
	public static void hi()
	{
		bye();		
	}
	public static void bye()
	{
		System.out.println(10/0);	// throw new ArithmeticException()
	}
}