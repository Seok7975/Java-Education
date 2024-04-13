/*
class TryTest
{
	public static void main(String[] args)
	{
		try{
			System.out.println(10/0);
			// throw new ArithmeticException();
		}
		catch(Throwable e)
		{
			System.out.println("Throwable");
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException");
		}
	}
}
*/

class TryTest
{
	public static void main(String[] args)
	{
		try{
			//System.out.println(10/0);
			int[] arr = new int[-5];
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException");
		}
		catch(Throwable e)
		{
			System.out.println("Throwable");
		}

	}
}
