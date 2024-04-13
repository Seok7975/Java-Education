import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

class MenuChoiceException extends Exception
{
	private int choice;
	MenuChoiceException(int choice)
	{
		super("��ȿ���� ���� �޴� ���Դϴ�.");
		this.choice = choice;
	}
	public void showWrongMenu()
	{
		System.out.println( choice + "�� �ش��ϴ� ������ �������� �ʽ��ϴ�.");
		System.out.println("�޴� ������ ó������ �ٽ� �����մϴ�.");
	}
}

class PhoneInfo
{
	private String name;
	private String phone;

	PhoneInfo(String name, String phone)
	{
		this.name = name;
		this.phone = phone;
	}
	public String getName()
	{
		return name;
	}
	public void showPhoneInfo()
	{
		System.out.println("�̸� : " + name);
		System.out.println("��ȭ��ȣ : " + phone);
	}
}

class PhoneUnivInfo extends PhoneInfo
{
	private String major;
	private int year;

	PhoneUnivInfo(String name ,String phone, String major, int year)
	{
		super(name, phone);
		this.major = major;
		this.year = year; 
	}
	public void showPhoneInfo()
	{
		super.showPhoneInfo();
		System.out.println("���� : " + major);
		System.out.println("�г� : " + year);
	}
}

class PhoneCompanyInfo extends PhoneInfo
{
	private String company;

	PhoneCompanyInfo(String name ,String phone, String company)
	{
		super(name, phone);
		this.company = company;
	}
	public void showPhoneInfo()
	{
		super.showPhoneInfo();
		System.out.println("ȸ�� : " + company);
	}
}

class PhoneBook
{
	private static PhoneBook pb;
	private Vector<PhoneInfo> pInfoVec;
	private PhoneBook(int sizePhoneInfo)
	{
		pInfoVec = new Vector<PhoneInfo>(sizePhoneInfo);
	}
	public static PhoneBook getPhoneBookInst(int sizePhoneInfo)
	{
		if(pb == null)
			pb = new PhoneBook(sizePhoneInfo);
		return pb;
	}
//	public void inputPhoneInfo(PhoneInfo pInfo)
//	{
//		pInfoVec.add(pInfo);
//	}
	public void inputPhoneInfo(PhoneInfo pInfo)
	{
		int i =0;
		int size = pInfoVec.size();
		for(i=0;i<size;i++)
		{
			if(pInfoVec.get(i).getName().compareTo(pInfo.getName()) > 0)
			{
				break;
			}
		}	
		pInfoVec.add(i, pInfo);
	}
	public void searchPhoneInfo(String name)
	{
		int result = search(name);
		if(result != -1)
			pInfoVec.get(result).showPhoneInfo();
		else
			System.out.println("ã���ô� �����Ͱ� �����ϴ�.");
	}
	public void deletePhoneInfo(int idx)
	{
		pInfoVec.remove(idx);
		System.out.println("������ �Ϸ�Ǿ����ϴ�.");
	}


	public int search(String name)
	{
		int cnt = pInfoVec.size();
		for(int i=0;i<cnt;i++)
		{
			if(pInfoVec.get(i).getName().compareTo(name) == 0)
				return i;
		}
		return -1;		
	}

	public void showAllPhoneInfo()
	{
		// 1
//		int cntOfPhone = pInfoVec.size();
//		for(int i=0;i<cntOfPhone;i++)
//			pInfoVec.get(i).showPhoneInfo();
		
		// 2
		for(PhoneInfo pInfo : pInfoVec)
			pInfo.showPhoneInfo();
		
		// 3
//		Iterator<PhoneInfo> itr = pInfoVec.iterator();
//		while(itr.hasNext())
//			itr.next().showPhoneInfo();
	}
}

interface PhoneMenuString
{
	int INPUT_PHONEINFO = 1;
	int SEARCH_PHONEINFO = 2;
	int DELETE_PHONEINFO = 3;
	int SHOW_ALL_PHONEINFO = 4;
	int PROGRAM_QUIT = 5;

	int GENERAL 	= 1;
	int UNIVERCITY 	= 2;
	int COMPANY 	= 3;

	int YES = 1;
	int NO = 2;
}

class PhoneUI
{
	private static final int MAX_CNT=100;
	public static Scanner sc = new Scanner(System.in);
	private static PhoneBook pb = PhoneBook.getPhoneBookInst(MAX_CNT);



	public static void mainMenu()
	{
		System.out.println("�����ϼ���...");
		System.out.println("1. ������ �Է�");
		System.out.println("2. ������ �˻�");
		System.out.println("3. ������ ����");
		System.out.println("4. ��� ������ ����");
		System.out.println("5. ���α׷� ����");
		System.out.print("���� : ");
	}

	public static void inputMenu()
	{
		System.out.println("1. �Ϲ�, 2. ����, 3. ȸ��");
	}
	public static void inputMenuChoice() throws MenuChoiceException
	{
		int choice=0;
		choice = sc.nextInt();
		sc.nextLine();
		if(choice < PhoneMenuString.GENERAL || choice > PhoneMenuString.COMPANY)
			throw new MenuChoiceException(choice);
		switch(choice)
		{
		case PhoneMenuString.GENERAL:
			inputGeneralPhoneInfo();
			break;
		case PhoneMenuString.UNIVERCITY:
			inputUniversityPhoneInfo();
			break;
		case PhoneMenuString.COMPANY:
			inputCompanyPhoneInfo();
			break;
		}
	}

	public static void inputGeneralPhoneInfo()
	{
		String name;
		String phone;

		System.out.println("������ �Է��� �����մϴ�.");
		System.out.print("�̸� : ");
		name = sc.nextLine();
		System.out.print("��ȭ��ȣ : ");
		phone = sc.nextLine();
		System.out.println("������ �Է��� �Ϸ�Ǿ����ϴ�.");
		pb.inputPhoneInfo( new PhoneInfo(name, phone) );
	}

	public static void inputUniversityPhoneInfo()
	{
		String name;
		String phone;
		String major;
		int year;

		System.out.println("������ �Է��� �����մϴ�.");
		System.out.print("�̸� : ");
		name = sc.nextLine();
		System.out.print("��ȭ��ȣ : ");
		phone = sc.nextLine();
		System.out.print("���� : ");
		major = sc.nextLine();
		System.out.print("�г� : ");
		year = sc.nextInt();
		sc.nextLine();
		System.out.println("������ �Է��� �Ϸ�Ǿ����ϴ�.");
		pb.inputPhoneInfo( new PhoneUnivInfo(name, phone, major, year) );
	}

	public static void inputCompanyPhoneInfo()
	{
		String name;
		String phone;
		String company;

		System.out.println("������ �Է��� �����մϴ�.");
		System.out.print("�̸� : ");
		name = sc.nextLine();
		System.out.print("��ȭ��ȣ : ");
		phone = sc.nextLine();
		System.out.print("ȸ�� : ");
		company = sc.nextLine();
		System.out.println("������ �Է��� �Ϸ�Ǿ����ϴ�.");
		pb.inputPhoneInfo( new PhoneCompanyInfo(name, phone, company) );
	}

	public static void searchPhoneInfo()
	{
		String name;
		System.out.println("������ �˻��� �����մϴ�.");
		System.out.println("�˻��Ͻð��� �ϴ� �̸��� �Է��ϼ���.");
		name = sc.nextLine();
		pb.searchPhoneInfo(name);			
	}
	public static void deletePhoneInfo()
	{
		String name;
		int result=0;
		int answer=0;
		System.out.println("�˻��Ͻð��� �ϴ� �̸��� �Է��ϼ���.");		
		name = sc.nextLine();		
		result = pb.search(name);
		if(result != -1)
		{
			System.out.println("���� �����Ͻðڽ��ϱ�? 1. Yes 2. No");
			answer = sc.nextInt();
			sc.nextLine();
			switch(answer)
			{
			case PhoneMenuString.YES:
				pb.deletePhoneInfo(result);
				break;
			case PhoneMenuString.NO:
				break;
			default:
				System.out.println("�߸� �����̽��ϴ�.");
			}
		}
		else
			System.out.println("�����Ͻ÷��� �����Ͱ� �����ϴ�.");
	}
	public static void showAllPhoneInfo()
	{
		pb.showAllPhoneInfo();
	}
}

class PhoneMain
{		
	public static void main(String[] args)
	{
		int choice=0;

		while(true)
		{			
			try
			{
				PhoneUI.mainMenu();
				choice = PhoneUI.sc.nextInt();
				PhoneUI.sc.nextLine();
				if(choice < PhoneMenuString.INPUT_PHONEINFO || choice > PhoneMenuString.PROGRAM_QUIT)
					throw new MenuChoiceException(choice);

				switch(choice)
				{
					case PhoneMenuString.INPUT_PHONEINFO:
						PhoneUI.inputMenu();
						PhoneUI.inputMenuChoice();
						break;
					case PhoneMenuString.SEARCH_PHONEINFO:
						PhoneUI.searchPhoneInfo();
						break;
					case PhoneMenuString.DELETE_PHONEINFO:
						PhoneUI.deletePhoneInfo();
						break;
					case PhoneMenuString.SHOW_ALL_PHONEINFO:
						PhoneUI.showAllPhoneInfo();
						break;
					case PhoneMenuString.PROGRAM_QUIT:
						return;
			
				}
			}
			catch(MenuChoiceException e)
			{
				System.out.println(e.getMessage());
				e.showWrongMenu();
			}					
		}
	}
}