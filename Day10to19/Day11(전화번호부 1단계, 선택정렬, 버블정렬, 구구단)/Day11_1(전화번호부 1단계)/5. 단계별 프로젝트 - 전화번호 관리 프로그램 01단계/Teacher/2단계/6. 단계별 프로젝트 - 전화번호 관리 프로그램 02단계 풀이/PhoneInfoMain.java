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
		System.out.println("�̸� : " + name);
		System.out.println("��ȭ��ȣ : " + phoneNumber);
		System.out.println("���� : " + birthday);
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
			System.out.println("�����ϼ���...");
			System.out.println("1. ������ �Է�");
			System.out.println("2. ���α׷� ����");
			System.out.print("���� : ");
			menu = sc.nextInt();
			sc.nextLine();
			switch(menu)
			{
			case INPUT_PHONEINFO:
				System.out.print("�̸� : ");
				name = sc.nextLine();
				System.out.print("��ȭ��ȣ : ");
				phoneNumber = sc.nextLine();	
				System.out.print("���� : ");
				birthday = sc.nextLine();
				System.out.println("�Է��� �Ϸ�Ǿ����ϴ�.");	
				System.out.println();
				System.out.println("�Էµ� ���� ���...");
				info1 = new PhoneInfo(name, phoneNumber, birthday);
				info1.showPhoneInfo();
				break;
			case PROGRAM_QUIT:
				System.out.println("���α׷��� �����մϴ�.");
				return;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
			
		}
	}
}