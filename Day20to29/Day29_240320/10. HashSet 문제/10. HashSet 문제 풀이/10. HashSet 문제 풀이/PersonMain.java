import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

class Person
{
	String name;
	int age;

	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	public String toString()
	{
		return name + "(" + age + "세)";
	}
//	@Override
//	public int hashCode()
//	{
//		return name.hashCode() + age%7;
//	}
	@Override
	public int hashCode()
	{
		return Objects.hash(name, age);		// 전달 인자 name, age 기반 해쉬 값 반환
	}
	@Override
	public boolean equals(Object obj)
	{
		Person cmp = (Person)obj;
		if(cmp.name.equals(name) && cmp.age == age)
			return true;
		else
			return false;
	}
}

class PersonMain
{
	public static void main(String[] args)
	{
		HashSet<Person> hSet = new HashSet<Person>();
		hSet.add(new Person("이진호", 10));
		hSet.add(new Person("이진호", 20));
		hSet.add(new Person("김명호", 20));
		hSet.add(new Person("김명호", 15));
		hSet.add(new Person("이진호", 20));
		hSet.add(new Person("김명호", 20));

		System.out.println("저장된 데이터 수 : " +  hSet.size());

		Iterator<Person> itr = hSet.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}
}

/*
	그런데 클래스를 정의할 때마다 이렇듯 hashCode 메소드를 정의하는 것은 번거로운 일이다.
	특히 해쉬 알고리즘의 성능적 측면까지 고려하면서 모든 클래스를 정의하기란 쉬운 일이 아니다.
	그래서 자바에서는 다음 메소드를 제공하고 있다.
	
	public static int hash(Object...values)
		-> java.util.Objects에 정의된 메소드, 전달된 인자 기반의 해쉬 값 반환
		
	위 메소드의 매개변수 선언에는 '가변 인자 선언'이 포함되어 있는데, 이는 전달되는 인자의
	수를 메소드 호출 시마다 달리할 수 있는 선언이다.
	
	이렇듯 hash 메소드는 하나 이상의 인자를 조합하여 하나의 해쉬 값을 만들어 반환한다. 따라서
	특별한 경우가 아니라면 직접 해쉬 알고리즘을 만들지 않고 이 메소드에 의존해도 된다.
*/