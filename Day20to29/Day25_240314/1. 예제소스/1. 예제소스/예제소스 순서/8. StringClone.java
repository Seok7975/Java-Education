class Person implements Cloneable
{
	private String name;
	private int age;
	
	public Person(String name, int age)
	{
		this.name=name;
		this.age=age;
	}
	public void changeName(String name)
	{
		this.name=name;
	}
	public void showPersonInfo()
	{
		System.out.println("ÀÌ¸§: "+ name);
		System.out.println("³ªÀÌ: "+ age);
		System.out.println("");
	}
	public Object clone() throws CloneNotSupportedException
	{
		Person cpy=(Person)super.clone();
		return cpy;
	}
}

class StringClone
{	
	public static void main(String[] args)
	{
		try
		{
			Person p1=new Person("ÀÌ½Â¿ø", 22);
	
			Person p2=(Person)p1.clone();
			p2.changeName("Á¤Çý¿µ");
			
			Person p3=(Person)p2.clone();
			p3.changeName("Á¤½ÂÁÖ");
			
			p1.showPersonInfo();
			p2.showPersonInfo();
			p3.showPersonInfo();			
		}
		catch(CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
	}
}
