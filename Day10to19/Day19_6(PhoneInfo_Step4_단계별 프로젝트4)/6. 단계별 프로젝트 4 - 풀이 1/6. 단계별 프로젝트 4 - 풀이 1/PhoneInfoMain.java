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
		System.out.println("�̸� : " + name);
		System.out.println("��ȭ ��ȣ : " + phoneNumber);
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
		System.out.println("���� : " + major);
		System.out.println("�г� : " + year);	
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
		System.out.println("ȸ�� : " + company);
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
			System.out.println("�����ϼ���...");
			System.out.println("1. �Ϲ� �Է�");
			System.out.println("2. ���� �Է�");
			System.out.println("3. ȸ�� �Է�");
			System.out.println("4. ������ �˻�");
			System.out.println("5. ������ ����");
			System.out.println("6. ��� ������ ����");
			System.out.println("7. ���α׷� ����");
			System.out.print("���� :");
			menu = sc.nextInt();
			sc.nextLine();
			switch(menu)
			{
			case 1:
				System.out.print("�̸� : ");
				name = sc.nextLine();
				System.out.print("��ȭ��ȣ : ");
				phoneNumber= sc.nextLine();
				infoArr[cnt] = new PhoneInfo(name, phoneNumber);
				cnt++;
				break;
			case 2:
				System.out.print("�̸� : ");
				name = sc.nextLine();
				System.out.print("��ȭ��ȣ : ");
				phoneNumber= sc.nextLine();
				System.out.print("���� : ");
				major = sc.nextLine();
				System.out.print("�г� : ");
				year= sc.nextInt();
				infoArr[cnt] = new PhoneUnivInfo(name, phoneNumber, major, year);
				cnt++;
				break;
			case 3:
				System.out.print("�̸� : ");
				name = sc.nextLine();
				System.out.print("��ȭ��ȣ : ");
				phoneNumber= sc.nextLine();
				System.out.print("ȸ�� : ");
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