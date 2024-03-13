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