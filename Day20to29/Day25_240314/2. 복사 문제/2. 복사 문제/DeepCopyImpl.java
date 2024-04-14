class Business
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
		System.out.println("ȸ�� : " + company);
		System.out.println("���� : " + work);
	}
	public void changeWork(String work)
	{
		this.work=work;
	}
}

class PersonalInfo
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
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		bness.showBusinessInfo();
		System.out.println("");
	}
	public void changeWork(String work)
	{
		bness.changeWork(work);
	}
}

class DeepCopyImpl
{
	public static void main(String[] args)
	{

			PersonalInfo pInfo = new PersonalInfo("James", 22, "HiMedia", "encoding");
			PersonalInfo pCopy = (PersonalInfo)pInfo.clone();
			pCopy.changeWork("decoding");

			pInfo.showPersonalInfo();
			pCopy.showPersonalInfo();
	}
}