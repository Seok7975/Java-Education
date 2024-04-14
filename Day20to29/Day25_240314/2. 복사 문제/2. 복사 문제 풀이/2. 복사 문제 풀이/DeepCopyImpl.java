/*
�������̵��� ����

�ڼ� Ŭ�������� �������̵��ϴ� �޼���� ���� Ŭ������ �޼����
- �̸��� ���ƾ� �Ѵ�.
- �Ű������� ���ƾ� �Ѵ�.
- ��ȯŸ���� ���ƾ� �Ѵ�.

[����] JDK1.5���� '���� ��ȯŸ��(covariant return type)'�� �߰��Ǿ�, ��ȯŸ���� �ڼ� Ŭ������ Ÿ������ �����ϴ� ���� �����ϵ��� ������ ��ȭ�Ǿ���.
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
		System.out.println("ȸ�� : " + company);
		System.out.println("���� : " + work);
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
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
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