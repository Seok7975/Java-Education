public class PhoneInfoMain
{
	public static void main(String[] args)
	{
		PhoneInfo pInfo1 = new PhoneInfo("ȫ�浿", "01012345678", "19900701");
		PhoneInfo pInfo2 = new PhoneInfo("ȫ���", "01012345679");

		pInfo1.showPhoneInfo();
		pInfo2.showPhoneInfo();
	}
}