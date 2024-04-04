interface Readable 
{
	public void read();
}

class OuterClass
{
	private String myName;
	
	OuterClass(String name)
	{
		myName=name;
	}
	
	public Readable createLocalClassInst()
	{		
		class LocalClass implements Readable
		{
			public void read()
			{
				System.out.println("Outer inst name: "+myName);
			}
		}
		
		return new LocalClass();
	}
}

class LocalClassTest
{	
	public static void main(String[] args)
	{
		OuterClass out1=new OuterClass("First");
		Readable localInst1=out1.createLocalClassInst();
		localInst1.read();
		
		OuterClass out2=new OuterClass("Second");	
		Readable localInst2=out2.createLocalClassInst();
		localInst2.read();
	}
}