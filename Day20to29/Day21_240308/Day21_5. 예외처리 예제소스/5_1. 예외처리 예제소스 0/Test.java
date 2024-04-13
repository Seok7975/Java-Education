/*
class Test
{
	public static void main(String[] args)
	{
		System.out.println(10/0);
	}
}
*/
/*
class Test
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
		}
	}
}
*/
/*

class Test
{
	public static void main(String[] args)
	{
		hi();
	}
	public static void hi() 
	{
		try
		{
			System.out.println(10/0); // throw new ArithmeticException()
		}
		catch(ArithmeticException e)
		{
			System.out.println("0으로 나누면 안돼요.");
		}
	}
}
*/

/*

class Test
{
	public static void main(String[] args)
	{
		try
		{
			hi();
		}
		catch(ArithmeticException e)
		{
			System.out.println("0으로 나누면 안돼요.");
		}
	}
	public static void hi() throws ArithmeticException
	{
		System.out.println(10/0); // throw new ArithmeticException()
		System.out.println("Good");
	}
}
*/

/*

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
		try
		{
			System.out.println(10/0);	// throw new ArithmeticException()
		}
		catch(ArithmeticException e)
		{
			System.out.println("0으로 나누면 안돼요.");
		}
	}
}
*/

/*

class Test
{
	public static void main(String[] args)
	{
		hi();
	}
	public static void hi() 
	{
		try
		{
			bye();
		}
		catch(ArithmeticException e)
		{
			System.out.println("0으로 나누면 안돼요.");
		}		
	}
	public static void bye() throws ArithmeticException
	{
		System.out.println(10/0);	// throw new ArithmeticException()
	}
}
*/

/*

class Test
{
	public static void main(String[] args)
	{
		try
		{
			hi();
		}
		catch(ArithmeticException e)
		{
			System.out.println("0으로 나누면 안돼요.");
		}
	}
	public static void hi() throws ArithmeticException
	{
		bye();		
	}
	public static void bye() throws ArithmeticException
	{
		System.out.println(10/0);	// throw new ArithmeticException()
	}
}
*/

/*
class Test
{
	public static void main(String[] args) throws ArithmeticException
	{
		hi();
	}
	public static void hi() throws ArithmeticException
	{
		bye();		
	}
	public static void bye() throws ArithmeticException
	{
		System.out.println(10/0);	// throw new ArithmeticException()
	}
}
*/