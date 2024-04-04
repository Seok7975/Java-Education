abstract class PersonalNumberStorage
{
	public abstract void addPersonalInfo(String perNum, String name);
	public abstract String searchName(String perNum);
}

class PersonalNumInfo
{
	String name;
	String number;
	
	PersonalNumInfo(String name, String number)
	{
		this.name=name;
		this.number=number;
	}
	
	String getName(){return name;}
	String getNumber(){return number;}
}

class PersonalNumberStorageImpl extends PersonalNumberStorage
{
	PersonalNumInfo[] perArr;
	int numOfPerInfo;
	
	public PersonalNumberStorageImpl(int sz)
	{
		perArr=new PersonalNumInfo[sz];
		numOfPerInfo=0;
	}
	
	public void addPersonalInfo(String name, String perNum)
	{
		perArr[numOfPerInfo]=new PersonalNumInfo(name, perNum);
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


class AbstractInterface
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