import java.util.Scanner;

class AgeInputException extends Exception
{
	public AgeInputException()
	{
		super("��ȿ���� ���� ���̰� �ԷµǾ����ϴ�.");
	}
}

class NameLengthException extends Exception
{
	String wrongName;
	
	public NameLengthException(String name)
	{
		super("�߸��� �̸��� ���ԵǾ����ϴ�.");
		wrongName=name;
	}
	
	public void showWrongName()
	{
		System.out.println("�߸� �Էµ� �̸�: "+ wrongName);
	}
}

class PersonalInfo
{
	String name;
	int age;

	public PersonalInfo(String name, int age)
	{
		this.name=name;
		this.age=age;
	}
	public void showPersonalInfo()
	{
		System.out.println("�̸�: "+name);
		System.out.println("����: "+age);
	}
}

class PrintStackTrace
{	
	public static Scanner keyboard=new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		try
		{
			PersonalInfo readInfo=readPersonalInfo();
			readInfo.showPersonalInfo();
		}
		catch(AgeInputException e)
		{
			e.printStackTrace();
		}
		catch(NameLengthException e)
		{
			e.showWrongName();
			e.printStackTrace();
		}
	}
	
	public static PersonalInfo readPersonalInfo() 
			throws AgeInputException, NameLengthException
	{
		String name=readName();
		int age=readAge();		
		PersonalInfo pInfo=new PersonalInfo(name, age);
		return pInfo;
	}
	
	public static String readName() throws NameLengthException
	{
		System.out.print("�̸� �Է�: ");
		String name=keyboard.nextLine();
		if(name.length()<2)
			throw new NameLengthException(name);
		return name;
	}
	
	public static int readAge() throws AgeInputException
	{	
		System.out.print("���� �Է�: ");
		int age=keyboard.nextInt();
		if(age<0)
			throw new AgeInputException();
		return age;	
	}
}