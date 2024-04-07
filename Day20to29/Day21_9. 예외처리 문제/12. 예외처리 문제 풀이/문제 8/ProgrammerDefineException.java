//8. 나이를 입력 받았을 때 0보다 작은 값이 입력되면은
// "유효하지 않은 나이가입력되었습니다."라고 출력하도록 예외처리를 만드시오.

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
		System.out.print("나이를 입력하세요: ");
		
		try
		{
			int age=readAge();
			System.out.println("당신은 "+age+"세입니다.");
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