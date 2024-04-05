import java.util.Scanner;

class AgeInputException extends Exception
{
	public AgeInputException()
	{
		super("유효하지 않은 나이가 입력되었습니다.");
	}
}

class ThrowsFromMain
{	
	public static void main(String[] args) throws AgeInputException
	{
		System.out.print("나이를 입력하세요: ");
		int age=readAge();
		System.out.println("당신은 "+age+"세입니다.");
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