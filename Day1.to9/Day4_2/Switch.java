import java.util.Scanner;

class SwitchTest1
{
	public static void main(String[] args)
	{
		int menu = 0;
		Scanner sc =new Scanner(System.in);

		System.out.println("Menu");
		System.out.println("1. 피자");
		System.out.println("2. 스파게티");
		System.out.println("3. 햄버거");
		System.out.println("4. 스프");
		System.out.print("선택 : ");
		menu = sc.nextInt();

/*		switch(menu)
		{
			case 1 : 
				System.out.println("당신은 피자를 선택하셨습니다.");
				break;
			case 2 : 
				System.out.println("당신은 스파게티를 선택하셨습니다.");
				break;
			case 3 : 
				System.out.println("당신은 햄버거를 선택하셨습니다.");
				break;
			case 4 : 
				System.out.println("당신은 스프를 선택하셨습니다.");	
				break;
			default : 
				System.out.println("당신은 잘못 선택하셨습니다.");
				break;
		}
*/

		if (menu == 1) System.out.println("당신은 피자를 선택하셨습니다.");
		if (menu == 2) System.out.println("당신은 스파게티를 선택하셨습니다.");
		if (menu == 3) System.out.println("당신은 햄버거를 선택하셨습니다.");
		if (menu == 4) System.out.println("당신은 스프를 선택하셨습니다.");
		if (menu <1 || menu >4) System.out.println("당신은 잘못 선택하셨습니다.");

	}
}	