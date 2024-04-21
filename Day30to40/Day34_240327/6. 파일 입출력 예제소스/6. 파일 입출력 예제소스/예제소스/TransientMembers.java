import java.io.*;

class PersonalInfo implements Serializable
{
	String name;
	transient String secretInfo;
	
	int age;
	transient int secretNum;

	public PersonalInfo(String name, String sInfo, int age, int sNum)
	{
		this.name=name;
		secretInfo=sInfo;
		this.age=age;
		secretNum=sNum;
	}
	public void showCirlceInfo()
	{
		System.out.println("name: "+name);
		System.out.println("secret info: "+secretInfo);
		System.out.println("age: "+age);
		System.out.println("secret num: "+secretNum);
		System.out.println("");
	}
}

class TransientMembers
{
	public static void main(String[] args) 
		throws IOException, ClassNotFoundException
	{
		/* 인스턴스 저장 */
		ObjectOutputStream out= 
			new ObjectOutputStream(new FileOutputStream("Personal.ser"));
		
		PersonalInfo info=new PersonalInfo("John", "baby", 3, 42);
		info.showCirlceInfo();
		out.writeObject(info);
		out.close();
		
		/* 인스턴스 복원 */
		ObjectInputStream in=
			new ObjectInputStream(new FileInputStream("Personal.ser"));
		
		PersonalInfo recovInfo=(PersonalInfo)in.readObject();
		in.close();
		
		/* 복원된 정보 출력 */
		recovInfo.showCirlceInfo();
	}
}