class OuterClassOne
{
	OuterClassOne()
	{
		NestedClass nst=new NestedClass();
		nst.simpleMethod();
	}
	
	static class NestedClass
	{
		public void simpleMethod()
		{
			System.out.println("Nested Instance Method One");
		}
	}
}

class OuterClassTwo
{
	OuterClassTwo()
	{
		NestedClass nst=new NestedClass();
		nst.simpleMethod();		
	}
	
	private static class NestedClass
	{
		public void simpleMethod()
		{
			System.out.println("Nested Instance Method Two");
		}
	}
}

class NestedClassTest
{	
	public static void main(String[] args)
	{
		OuterClassOne one=new OuterClassOne();
		OuterClassTwo two=new OuterClassTwo();
		
		OuterClassOne.NestedClass nst1=new OuterClassOne.NestedClass();
		nst1.simpleMethod();
		// OuterClassTwo.Nested nst2=new OuterClassTwo.Nested();
		// nst2.simpleMethod();
	}
}