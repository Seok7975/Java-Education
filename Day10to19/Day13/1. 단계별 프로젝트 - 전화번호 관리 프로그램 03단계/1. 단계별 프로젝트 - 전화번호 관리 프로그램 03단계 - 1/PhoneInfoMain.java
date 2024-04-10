import java.util.Scanner;

public class PhoneInfoMain
{
	public static void main(String[] args)
	{
		PhoneInfo info = null;
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		String name = null, phone = null, birth = null;
		PhoneInfo[] infoArr = new PhoneInfo[100];
		int cnt = 0;

		while(true)
		{
			System.out.println("선택하세요.");
			System.out.println("1. 데이터 입력");
			System.out.println("4. 모든 데이터 보기");
			System.out.println("5. 프로그램 종료");
			System.out.print("선택 : ");
			menu = sc.nextInt();		// 1 엔터
			sc.nextLine();		// 버퍼에 있는 엔터키 값을 없앤다.
			switch(menu)
			{
			case 1:
				System.out.print("이름 : ");
				name = sc.nextLine();
				System.out.print("전화번호 : ");
				phone = sc.nextLine();
				System.out.print("생년월일 : ");
				birth = sc.nextLine();
				info = new PhoneInfo(name, phone, birth);
				infoArr[cnt++] = info;
				System.out.println("입력이 완료되었습니다.");				
				break;
			case 4:
				for(int i=0;i<cnt;i++)
					infoArr[i].showPhoneInfo();
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				return;
			}
		}
	}
}