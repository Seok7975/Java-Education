import java.util.Scanner;

class AgeInputException extends Exception
{
	public AgeInputException()
	{
		super("��ȿ���� ���� ���̰� �ԷµǾ����ϴ�.");
	}
}

class ThrowsFromMain
{	
	public static void main(String[] args) throws AgeInputException
	{
		System.out.print("���̸� �Է��ϼ���: ");
		int age=readAge();
		System.out.println("����� "+age+"���Դϴ�.");
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