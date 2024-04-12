public class PhoneInfo
{
	private String name;
	private String phone;
	private String birth;

	public PhoneInfo(String name, String phone, String birth)
	{
		this.name = name;
		this.phone = phone;
		this.birth = birth;
	}
	public void showPhoneInfo()
	{
		System.out.println("name : " + name);
		System.out.println("phone : " + phone);
		System.out.println("birth : " + birth);
	}
}