import java.util.Random;
import java.util.Scanner;

class Rand
{
	public static void main(String[] args)
	{

		int num=0, cnt=0, i=0 ;

		
		Random rand = new Random();  // 클래스 변수 = 새로운 개체
		int num2 = 0;
		num2 = rand.nextInt(100)+1;		// 1 부터 100까지의 난수 생성
		//System.out.println(num);


		for (i=0; true; i++)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("GAME START!!!");
			System.out.print("숫자 입력 : ");
			num = sc.nextInt();
			cnt++;
			if (num > num2) 
			{
				if(num > 100)
				{
					System.out.println("잘못된 숫자입니다.");
				}
				else System.out.println(num + "보다 작다");
			}
			else if(num < num2) 
			{
				if(num < 1)
				{
					System.out.println("잘못된 숫자입니다.");
				}
				else System.out.println(num + "보다 크다");
			}
			else break;
		}
		System.out.println("당신은 " + cnt + "번만에 정답을 입력하셨습니다.");
	}

}

