/*
오버라이딩의 조건

자손 클래스에서 오버라이딩하는 메서드는 조상 클래스의 메서드와
- 이름이 같아야 한다.
- 매개변수가 같아야 한다.
- 반환타입이 같아야 한다.

[참고] JDK1.5부터 '공변 반환타입(covariant return type)'이 추가되어, 반환타입을 자손 클래스의 타입으로 변경하는 것이 가능하도록 조건이 완화되었다.
*/
class Business implements Cloneable
{
	private String company;
	private String work;

	public Business(String company, String work)
	{
		this.company = company;
		this.work = work;
	}
	public void showBusinessInfo()
	{
		System.out.println("회사 : " + company);
		System.out.println("업무 : " + work);
	}
	public void changeWork(String work)
	{
		this.work=work;
	}
	/*
	public Object clone() throws CloneNotSupportedException
	{
		Business copy = (Business)super.clone();
		return copy;
	}
	*/
	public Business clone() throws CloneNotSupportedException
	{
		Business copy = (Business)super.clone();
		return copy;
	}
}

class PersonalInfo implements Cloneable
{
	private String name;
	private int age;
	private Business bness;

	public PersonalInfo(String name, int age, String company, String work)
	{
		this.name = name;
		this.age = age;
		bness = new Business(company, work);
	}
	public void showPersonalInfo()
	{
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		bness.showBusinessInfo();
		System.out.println("");
	}
	public void changeWork(String work)
	{
		bness.changeWork(work);
	}
	/*
	public Object clone() throws CloneNotSupportedException
	{
		PersonalInfo copy = (PersonalInfo)super.clone();
		copy.bness = (Business)bness.clone();
		return copy;
	}
	*/
	public PersonalInfo clone() throws CloneNotSupportedException
	{
		PersonalInfo copy = (PersonalInfo)super.clone();
		//copy.bness = (Business)bness.clone();
		copy.bness = bness.clone();
		return copy;
	}
}

class DeepCopyImpl
{
	public static void main(String[] args)
	{
		try
		{
			PersonalInfo pInfo = new PersonalInfo("James", 22, "HiMedia", "encoding");
			// PersonalInfo pCopy = (PersonalInfo)pInfo.clone();
			PersonalInfo pCopy = pInfo.clone();
			pCopy.changeWork("decoding");

			pInfo.showPersonalInfo();
			pCopy.showPersonalInfo();
		}
		catch(CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
	}
}