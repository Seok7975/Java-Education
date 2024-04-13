class Friend
{
	String myName;
	public Friend(String name)
	{
		myName=name;
	}
	
	public String toString()
	{
		return "제 이름은 "+myName+"입니다.";
	}	
}

class StringToString
{
	public static void main(String[] args)
	{		
		Friend fnd1=new Friend("이종수");
		Friend fnd2=new Friend("현주은");
		
		System.out.println(fnd1);
		System.out.println(fnd2);
		
		System.out.print("출력이 ");
		System.out.print("종료되었습니다.");
		System.out.println("");
	}
}