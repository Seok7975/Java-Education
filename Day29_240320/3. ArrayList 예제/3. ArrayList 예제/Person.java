
public class Person {
	private String name;
	private int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void showInfo()
	{
		System.out.println("�̸� " + name);
		System.out.println("���� " + age);
	}
}