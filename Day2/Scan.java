
import java.util.Scanner;
class Scan
{
	public static void main(String[] args)
	{


		int num1 = 0, num2 = 0;
		Scanner a = new Scanner(System.in);  // a는 변수 아무거나 입력가능
		System.out.println("첫 번째 숫자를 입력하세요.");
		num1 = a.nextInt();
		System.out.println("두 번째 숫자를 입력하세요.");
		num2 = a.nextInt();
		System.out.println("당신이 입력한 두 수는 " + num1 + "와/과" + num2 + "입니다.");
		a.close();   

		if(num1>num2)
		{
			System.out.println(num1 + "이 " + num2 + "보다 큽니다.");
		}   
		else if(num1==num2)
		{
			System.out.println("같습니다");

		}
		
		else
		{
			System.out.println(num1 + "이 " + num2 + "보다 작습니다.");
		}


	}

}