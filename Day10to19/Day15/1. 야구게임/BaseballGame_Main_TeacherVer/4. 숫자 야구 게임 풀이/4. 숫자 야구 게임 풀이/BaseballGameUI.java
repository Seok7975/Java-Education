import java.util.Scanner;

public class BaseballGameUI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberOfDigits = 0;
		int iNum = 0;
		System.out.println("숫자 야구 게임을 시작합니다.");
		while(true)
		{			
			System.out.println("원하는 자리수를 선택하세요.");
			System.out.println("1~9까지 선택가능");
			numberOfDigits = sc.nextInt();
			if(numberOfDigits >=1 && numberOfDigits <= 9) break;
			System.out.println("잘못 입력하셨습니다.");
		}
		
		BaseballGame bbGame = new BaseballGame(numberOfDigits);		
		
		while(true)
		{
			boolean result;
			System.out.println("자 공격하세요.");
			iNum = sc.nextInt();
			result = bbGame.playBaseballGame(iNum);
			if(result)
			{
				System.out.println("게임을 종료합니다.");
				break;
			}
		}
		sc.close();
	}
}