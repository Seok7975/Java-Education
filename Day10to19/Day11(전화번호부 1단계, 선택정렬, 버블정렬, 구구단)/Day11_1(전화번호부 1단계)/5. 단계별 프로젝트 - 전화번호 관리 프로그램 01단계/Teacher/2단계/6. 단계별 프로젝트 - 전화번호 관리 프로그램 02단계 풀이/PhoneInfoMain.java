import java.util.Scanner;
/*
public class PhoneInfo
{
	private String name;
	private String phoneNumber;
	private String birthday;
	public PhoneInfo(String name, String phoneNumber, String birthday)
	{
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birthday = birthday;
	}
	public PhoneInfo(String name, String phoneNumber)
	{
		this(name, phoneNumber, null);
	}
	public void showPhoneInfo()
	{
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phoneNumber);
		System.out.println("생일 : " + birthday);
	}
	public String toString()
	{
		return name + " " + phoneNumber + " " + birthday;
	}
}
*/
public class PhoneInfoMain
{
	public static final int INPUT_PHONEINFO = 1;
	public static final int PROGRAM_QUIT = 2;
	public static void main(String[] args)
	{
		PhoneInfo info1 = null;
		Scanner sc = new Scanner(System.in);
		//Scanner sc = new Scanner(System.in, "EUC-KR");
		int menu = 0;
		String name, phoneNumber, birthday;
		while(true)
		{
			System.out.println("선택하세요...");
			System.out.println("1. 데이터 입력");
			System.out.println("2. 프로그램 종료");
			System.out.print("선택 : ");
			menu = sc.nextInt();
			sc.nextLine();
			switch(menu)
			{
			case INPUT_PHONEINFO:
				System.out.print("이름 : ");
				name = sc.nextLine();
				System.out.print("전화번호 : ");
				phoneNumber = sc.nextLine();	
				System.out.print("생일 : ");
				birthday = sc.nextLine();
				System.out.println("입력이 완료되었습니다.");	
				System.out.println();
				System.out.println("입력된 정보 출력...");
				info1 = new PhoneInfo(name, phoneNumber, birthday);
				info1.showPhoneInfo();
				break;
			case PROGRAM_QUIT:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다.");
			}
			
		}
	}
}