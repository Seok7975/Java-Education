import java.util.Scanner;

class AgeInputException extends Exception
{
	public AgeInputException()
	{
		super("��ȿ���� ���� ���̰� �ԷµǾ����ϴ�.");
	}
}

class ProgrammerDefineException
{	
	public static void main(String[] args)
	{
		System.out.print("���̸� �Է��ϼ���: ");
		
		try
		{
			int age=readAge();
			System.out.println("����� "+age+"���Դϴ�.");
		}
		catch(AgeInputException e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public static int readAge() throws AgeInputException
	{
		Scanner keyboard=new Scanner(System.in);
		int age=keyboard.nextInt();
		if(age<0)
		{
			AgeInputException excpt=new AgeInputException();
			throw excpt;
		}
		
		return age;
	}
}