import java.util.Scanner;

class AgeInputException extends Exception
{
	public AgeInputException()
	{
		super("유효하지 않은 나이가 입력되었습니다.");
	}
}

class ProgrammerDefineException
{	
	public static void main(String[] args)
	{
		Scanner keyboard=new Scanner(System.in);
		System.out.print("나이를 입력하세요: ");
		
		try
		{
			int age=keyboard.nextInt();
			if(age<0)
			{
				AgeInputException excpt=new AgeInputException();
				throw excpt;
			}
			System.out.println("당신은 "+age+"세입니다.");
		}
		catch(AgeInputException e)
		{
			System.out.println(e.getMessage());
		}
	}
}