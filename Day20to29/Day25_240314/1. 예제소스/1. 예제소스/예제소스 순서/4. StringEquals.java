class StringEquals
{	
	public static void main(String[] args)
	{
		
		String str1=new String("Hi my string");
		String str2=new String("Hi my string");
		
		/*
		String str1="Hi my string";		//if -> �����ϴ�, equals -> �����ϴ�
		String str2="Hi my string";
		*/
		
		if(str1==str2)
			System.out.println("���� ����� �����ϴ�.");
		else
			System.out.println("���� ����� �������� �ʴ�.");			
		
		if(str1.equals(str2))	//Object Ŭ������ �޼ҵ带 �������̵�
			System.out.println("�ν��Ͻ� ������ �����ϴ�.");
		else
			System.out.println("�ν��Ͻ� ������ �������� �ʴ�.");		
	}
}