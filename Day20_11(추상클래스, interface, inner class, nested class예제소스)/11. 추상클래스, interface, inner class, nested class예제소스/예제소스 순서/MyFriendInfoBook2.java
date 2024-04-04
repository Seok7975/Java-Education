import java.util.Scanner;

abstract class Friend 
{
	String name;
	String phoneNum;
	String addr;
	
	public Friend(String name, String phone, String addr)
	{
		this.name=name;
		this.phoneNum=phone;
		this.addr=addr;
	}
	void showData()
	{
		System.out.println("�̸� : "+name);
		System.out.println("��ȭ : "+phoneNum);
		System.out.println("�ּ� : "+addr);
	}
	abstract void showBasicInfo();
}

class HighFriend extends Friend		// ����â
{
	String work;
	
	public HighFriend(String name, String phone, String addr, String job)
	{
		super(name, phone, addr);
		work=job;		
	}
	void showData()
	{
		super.showData();
		System.out.println("���� : "+work);
	}
	void showBasicInfo()
	{
		System.out.println("�̸� : "+name);
		System.out.println("��ȭ : "+phoneNum);
	}
}

class UnivFriend extends Friend 	// ����ģ��
{
	String major;		// �����а�
	public UnivFriend(String name, String phone, String addr, String major)
	{
		super(name, phone, addr);
		this.major=major;
	}
	void showData()
	{
		super.showData();
		System.out.println("���� : "+major);
	}
	void showBasicInfo()
	{
		System.out.println("�̸� : "+name);
		System.out.println("��ȭ : "+phoneNum);
		System.out.println("���� : "+major);
	}
}

class FriendInfoHandler
{
	Friend[] myFriends;
	int numOfFriends;
	
	public FriendInfoHandler(int num)
	{
		myFriends=new Friend[num];
		numOfFriends=0;
	}
	
	private void addFriendInfo(Friend fren)
	{
		myFriends[numOfFriends++]=fren;
	}
	
	public void addFriend(int choice)
	{
		String name, phoneNum, addr, job, major;
		
		Scanner sc=new Scanner(System.in);		
		System.out.print("�̸� : "); name=sc.nextLine();
		System.out.print("��ȭ : "); phoneNum=sc.nextLine();
		System.out.print("�ּ� : "); addr=sc.nextLine();
		
		if(choice==1)
		{
			System.out.print("���� : "); job=sc.nextLine();
			addFriendInfo(new HighFriend(name, phoneNum, addr, job));
		}
		else	// if(choice==2)
		{
			System.out.print("�а� : "); major=sc.nextLine();
			addFriendInfo(new UnivFriend(name, phoneNum, addr, major));
		}
		System.out.println("�Է� �Ϸ�! \n");
	}
	
	public void showAllData()
	{
		for(int i=0; i<numOfFriends; i++)
		{
			myFriends[i].showData();
			System.out.println("");
		}
	}
	
	public void showAllSimpleData()
	{
		for(int i=0; i<numOfFriends; i++)
		{
			myFriends[i].showBasicInfo();
			System.out.println("");
		}
	}
}

class MyFriendInfoBook2
{
	public static void main(String[] args)
	{
		FriendInfoHandler handler=new FriendInfoHandler(10);
		
		while(true)
		{			
			System.out.println("*** �޴� ���� ***");
			System.out.println("1. �� ���� ����");
			System.out.println("2. ���� ģ�� ����");
			System.out.println("3. ��ü ���� ���");
			System.out.println("4. �⺻ ���� ���");			
			System.out.println("5. ���α׷� ����");
			System.out.print("����>> ");
			
			Scanner sc=new Scanner(System.in);
			int choice=sc.nextInt();

			switch(choice)
			{
			case 1: case 2:
				handler.addFriend(choice);
				break;
			case 3:
				handler.showAllData();
				break;
			case 4:
				handler.showAllSimpleData();
				break;
			case 5:
				System.out.println("���α׷��� �����մϴ�.");
				return;
			}
		}
	}
}