interface PersonalNumberStorage
{
	void addPersonalInfo(String perNum, String name);
	String searchName(String perNum);
}

class PersonalNumInfo
{
	String name;
	String number;
	
	public PersonalNumInfo(String name, String number)
	{
		this.name=name;
		this.number=number;
	}
	
	public String getName(){return name;}
	public String getNumber(){return number;}
}

class PersonalNumberStorageImpl implements PersonalNumberStorage
{
	PersonalNumInfo[] perArr;
	int numOfPerInfo;
	
	public PersonalNumberStorageImpl(int sz)
	{
		perArr=new PersonalNumInfo[sz];
		numOfPerInfo=0;
	}
	
	public void addPersonalInfo(String perNum, String name)
	{
		perArr[numOfPerInfo]=new PersonalNumInfo(perNum, name);
		numOfPerInfo++;
	}
	
	public String searchName(String perNum)
	{
		for(int i=0; i<numOfPerInfo; i++)
		{
			if(perNum.compareTo(perArr[i].getNumber())==0)
				return perArr[i].getName();
		}		
		return null;
	}
}


class InterfaceImplements
{
	public static void main(String[] args)
	{
		PersonalNumberStorage storage=new PersonalNumberStorageImpl(100);
		storage.addPersonalInfo("김기동", "950000-1122333");
		storage.addPersonalInfo("장산길", "970000-1122334");	
		
		System.out.println(storage.searchName("950000-1122333"));
		System.out.println(storage.searchName("970000-1122334"));
	}
}