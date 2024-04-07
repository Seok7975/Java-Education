
/*
interface AAA
{
	void hi();
	// public abstract void hi();
	// public void hi();
	// abstract void hi():
}
interface BBB
{
	void bye();
}


class CCC implements AAA, BBB
{
	@Override
	public void hi()
	{
		System.out.println("hi");
	}
	@Override
	public void bye()
	{
		System.out.println("bye");
	}
}
*/

/*
interface AAA
{
	void hi();
}

interface BBB extends AAA
{
	void bye();
}


class CCC implements BBB
{
	@Override
	public void hi()
	{
		System.out.println("hi");
	}
	@Override
	public void bye()
	{
		System.out.println("bye");
	}	
}
*/

/*
interface AAA
{
	void hi();
}

interface BBB
{
	void bye();
}

interface CCC extends AAA, BBB
{
	void good();
}

class DDD implements CCC
{
	@Override
	public void hi()
	{
		System.out.println("hi");
	}
	@Override
	public void bye()
	{
		System.out.println("bye");
	}
	@Override
	public void good()
	{
		System.out.println("good");
	}
}
*/

/*
interface AAA
{
	int MAX = 5;
	// public static final int MAX = 5;
	// public int MAX = 5;
	// public static int MAX = 5;
	// final int MAX = 5;
}


class BBB
{
	public static void main(String[] args)
	{
		System.out.println(AAA.MAX);
	}
}
*/

/*
interface AAA{
	int MAX = 5;
	// public static final int MAX = 5;
}

class MainClass implements AAA
{
	public static void main(String[] args)
	{
		System.out.println(MAX);
	}
}
*/

/*
interface AAA
{
}

class BBB implements AAA
{
}

class CCC
{
	public static void main(String[] args)
	{
		AAA aaa = new BBB();
		if(aaa instanceof BBB)
			System.out.println("AAA 구현");
	}
}
*/