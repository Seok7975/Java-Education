import java.util.Scanner;

public class BaseballGameUI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberOfDigits = 0;
		int iNum = 0;
		System.out.println("���� �߱� ������ �����մϴ�.");
		while(true)
		{			
			System.out.println("���ϴ� �ڸ����� �����ϼ���.");
			System.out.println("1~9���� ���ð���");
			numberOfDigits = sc.nextInt();
			if(numberOfDigits >=1 && numberOfDigits <= 9) break;
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
		
		BaseballGame bbGame = new BaseballGame(numberOfDigits);		
		
		while(true)
		{
			boolean result;
			System.out.println("�� �����ϼ���.");
			iNum = sc.nextInt();
			result = bbGame.playBaseballGame(iNum);
			if(result)
			{
				System.out.println("������ �����մϴ�.");
				break;
			}
		}
		sc.close();
	}
}