public class PhoneInfoMain
{
	public static void main(String[] args)
	{
		PhoneInfo pInfo1 = new PhoneInfo("È«±æµ¿", "01012345678", "19900701");
		PhoneInfo pInfo2 = new PhoneInfo("È«±æ¼ø", "01012345679");

		pInfo1.showPhoneInfo();
		pInfo2.showPhoneInfo();
	}
}