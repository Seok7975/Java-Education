class PhoneInfo
{
	private String name;
	private String phoneNumber;

	PhoneInfo(String name, String phoneNumber)
	{
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	public void printCS()
	{
		System.out.println("이름 : " + name);
		System.out.println("전화 번호 : " + phoneNumber);
	}
}

class PhoneUnivInfo extends PhoneInfo
{
	private String major;
	private int year;
	PhoneUnivInfo(String name, String phoneNumber, String major, int year)
	{
		super(name, phoneNumber);
		this.major = major;
		this.year = year;		
	}
	public void printCS()
	{
		super.printCS();
		System.out.println("전공 : " + major);
		System.out.println("학년 : " + year);	
	}
}

class PhoneCompanyInfo extends PhoneInfo
{
	private String company;

	PhoneCompanyInfo(String name, String phoneNumber, String company)
	{
		super(name, phoneNumber);
		this.company = company;
	}
	public void printCS()
	{
		super.printCS();
		System.out.println("회사 : " + company);
	}
}

class PhoneInfoMain
{
	public static void main(String[] args)
	{
		PhoneInfo[] infoArr = new PhoneInfo[100];
		int menu = 0, cnt = 0;
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String name= null, phoneNumber = null, major = null, company = null;
		int year = 0;

		while(true)
		{
			System.out.println("선택하세요...");
			System.out.println("1. 일반 입력");
			System.out.println("2. 대학 입력");
			System.out.println("3. 회사 입력");
			System.out.println("4. 데이터 검색");
			System.out.println("5. 데이터 삭제");
			System.out.println("6. 모든 데이터 보기");
			System.out.println("7. 프로그램 종료");
			System.out.print("선택 :");
			menu = sc.nextInt();
			sc.nextLine();
			switch(menu)
			{
			case 1:
				System.out.print("이름 : ");
				name = sc.nextLine();
				System.out.print("전화번호 : ");
				phoneNumber= sc.nextLine();
				infoArr[cnt] = new PhoneInfo(name, phoneNumber);
				cnt++;
				break;
			case 2:
				System.out.print("이름 : ");
				name = sc.nextLine();
				System.out.print("전화번호 : ");
				phoneNumber= sc.nextLine();
				System.out.print("전공 : ");
				major = sc.nextLine();
				System.out.print("학년 : ");
				year= sc.nextInt();
				infoArr[cnt] = new PhoneUnivInfo(name, phoneNumber, major, year);
				cnt++;
				break;
			case 3:
				System.out.print("이름 : ");
				name = sc.nextLine();
				System.out.print("전화번호 : ");
				phoneNumber= sc.nextLine();
				System.out.print("회사 : ");
				company = sc.nextLine();
				infoArr[cnt] = new PhoneCompanyInfo(name, phoneNumber, company);
				cnt++;
				break;	
			case 6:
				for(int i=0;i<cnt;i++)
					infoArr[i].printCS();
				break;
			}				
		}
	}
}