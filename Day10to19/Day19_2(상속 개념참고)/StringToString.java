class Friend
{
	String myName;
	public Friend(String name)
	{
		myName=name;
	}
	
	public String toString()
	{
		return "�� �̸��� "+myName+"�Դϴ�.";
	}	
}

class StringToString
{
	public static void main(String[] args)
	{		
		Friend fnd1=new Friend("������");
		Friend fnd2=new Friend("������");
		
		System.out.println(fnd1);
		System.out.println(fnd2);
		
		System.out.print("����� ");
		System.out.print("����Ǿ����ϴ�.");
		System.out.println("");
	}
}