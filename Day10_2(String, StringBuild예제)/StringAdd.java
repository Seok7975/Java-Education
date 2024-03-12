class StringAdd
{
	public static void main(String[] args)
	{
		String str1="Lemon"+"ade";	// "Lemonade"
		String str2="Lemon"+'A';	// "Lemon".concat(String.valueOf("A")) // (char ch)
		String str3="Lemon"+3;	// "Lemon".concat(String.valueOf(3))
		String str4=1+"Lemon"+2;	//
		str4+='!';
		
		System.out.println(str1);		
		System.out.println(str2);		
		System.out.println(str3);		
		System.out.println(str4);
	}
}