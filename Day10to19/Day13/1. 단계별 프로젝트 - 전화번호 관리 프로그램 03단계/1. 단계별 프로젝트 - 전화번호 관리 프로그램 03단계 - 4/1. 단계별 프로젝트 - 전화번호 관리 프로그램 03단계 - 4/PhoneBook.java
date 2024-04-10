public class PhoneBook {
	
	private static PhoneBook pb;
	private PhoneInfo[] pInfoArr;
	private int numOfPhoneInfo;

	private PhoneBook(int size)	//폰북 사이즈를 받아 만드는 매소드
	{
		pInfoArr = new PhoneInfo[size];	//
	}
	
	public static PhoneBook getPhoneBook(int size)
	{
		if(pb==null)
			pb = new PhoneBook(size);
		return pb;
	}
	
	public boolean checkNumOfPhoneInfo()
	{
		if(numOfPhoneInfo >= pInfoArr.length)
			return false;
		return true;
	}
	public void insertPhoneInfo(String name, String phoneNumber, String birthday)
	{
		pInfoArr[numOfPhoneInfo++] = new PhoneInfo(name, phoneNumber, birthday);
	}
	
	public boolean searchPhoneInfoByName(String name)
	{
		boolean result = false;  //false : 동일인물이 없다
		for(int i=0;i<numOfPhoneInfo;i++)
		{
			if( name.compareTo(pInfoArr[i].getName()) == 0 )  //동명이인이 있을 수 있으니 반복문을 끝까지 돌림
			{
				pInfoArr[i].printCurrentState();
				result = true; // 동일인물이 있다
			}
		}
		return result;
	}
	
	public int searchPhoneInfoByPhoneNumber(String phoneNumber)//검색 메소드
	{
		for(int i=0;i<numOfPhoneInfo;i++)
		{
			if( phoneNumber.compareTo(pInfoArr[i].getPhoneNumber()) == 0 )
			{
				return i;
			}
		}

		return -1;  //찾았는데 있다면 -1
	}

	public boolean deletePhoneInfoByPhoneNumber(String phoneNumber)//삭제 메소드
	{
		boolean deleteResult = false;
		int searchResult = searchPhoneInfoByPhoneNumber(phoneNumber);  //유지를 위해 따로 만듬
		if( searchResult != -1 )
		{
			for(int i=searchResult;i<numOfPhoneInfo-1;i++)
				pInfoArr[i] = pInfoArr[i+1];

			pInfoArr[numOfPhoneInfo-1] = null;
			deleteResult = true;
			numOfPhoneInfo--;
		}

		return deleteResult;
	}
	
	public void printAllPhoneInfo()//모든 정보 출력 메소드
	{
		for(int i=0;i<numOfPhoneInfo;i++)
			pInfoArr[i].printCurrentState();
		System.out.println();
	}
}