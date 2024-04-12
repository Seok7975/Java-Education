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
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void printCurrentState()
	{
		System.out.println("이름 : "  + name);
		System.out.println("전화번호 : "  + phoneNumber);
		System.out.println("생일 : "  + birthday);
	}
}