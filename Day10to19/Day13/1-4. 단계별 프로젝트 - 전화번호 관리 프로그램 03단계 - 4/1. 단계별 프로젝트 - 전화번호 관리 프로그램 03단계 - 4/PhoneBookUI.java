import java.util.Scanner;

public class PhoneBookUI
{
	private static PhoneBook pb = PhoneBook.getPhoneBook(100);	//싱글톤 패턴으로 만듬
	public static Scanner sc = new Scanner(System.in);

	private PhoneBookUI(){}

	public static void printMenu()
	{
		System.out.println("선택하세요...");
		System.out.println("1. 데이터 입력");
		System.out.println("2. 데이터 검색");
		System.out.println("3. 데이터 삭제");
		System.out.println("4. 모든 데이터 보기");
		System.out.println("5. 프로그램 종료");
		System.out.print("선택 : ");
	}
	
	public static void inputPhoneInfo()
	{
		boolean result = pb.checkNumOfPhoneInfo();
		if(result == false)
		{
			System.out.println("더이상 데이터를 저장할 수 없습니다.");
			return;
		}

		String name, phoneNumber, birthday;		
		
		System.out.println("데이터 입력을 시작합니다.");
		System.out.print("이름 : ");
		name = sc.nextLine();
		System.out.print("전화번호 : ");
		phoneNumber = sc.nextLine();
		System.out.print("생년월일 : ");
		birthday = sc.nextLine();		
		pb.insertPhoneInfo(name, phoneNumber, birthday);
		System.out.println("데이터 입력이 완료되었습니다.");
	}
	
	public static void searchPhoneInfoByName()
	{
		String name;
		System.out.print("검색하시고자 하는 이름을 입력해 주세요.");
		name = sc.nextLine();
		System.out.println("사용자 검색을 시작합니다. : ");
		if( !pb.searchPhoneInfoByName(name)) System.out.println("찾으시는 사용자가 없습니다.");
	}
	
	public static void deletePhoneInfoByPhoneNumber()
	{
		String phoneNumber;
		System.out.print("삭제하시고자 하는 전화번호를 입력해 주세요. : ");
		phoneNumber = sc.nextLine();
		boolean result = pb.deletePhoneInfoByPhoneNumber(phoneNumber);
		if(result) System.out.println("삭제가 완료되었습니다.");  //true or false
		else System.out.println("삭제하시고자 하는 전화번호 정보가 없습니다.");
	}
	
	public static void printAllPhoneInfo()
	{
		System.out.println("모든 사용자 정보를 출력합니다.");
		pb.printAllPhoneInfo();
	}
	
	public static void quitProgram()
	{
		System.out.println("프로그램을 종료합니다.");
		sc.close();
	}
	public static void wrongNumber()
	{
		System.out.println("잘못 입력하셨습니다.");
	}
}