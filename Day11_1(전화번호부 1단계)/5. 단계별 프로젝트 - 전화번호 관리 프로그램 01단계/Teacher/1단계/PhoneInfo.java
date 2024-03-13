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
		if(birthday != null)
			System.out.println("생년월일 : " + birthday);
	}
}