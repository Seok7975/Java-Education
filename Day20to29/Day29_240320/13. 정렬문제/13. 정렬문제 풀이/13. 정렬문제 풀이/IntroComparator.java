import java.util.TreeSet;
import java.util.Iterator;
import java.util.Comparator;


class Person implements Comparable<Person>
{
	String name;
	int age;

	public Person(String name, int age)
	{
		this.name=name;
		this.age=age;
	}
	public void showData()
	{
		System.out.printf("%s %d \n", name, age);
	}
	public int compareTo(Person p)
	{
		return age - p.age;
	}
	public String getName() {
		return name;
	}
	
}

class PersonComparator implements Comparator<Person>
{
	public int compare(Person p1, Person p2)
	{
		return p1.getName().compareTo(p2.getName());
	}
}

class IntroComparator
{
	public static void main(String[] args)
	{
		TreeSet<Person> sTree=new TreeSet<Person>(new PersonComparator());
		sTree.add(new Person("Lee", 24));
		sTree.add(new Person("Hong", 29));
		sTree.add(new Person("Choi", 21));
		
		Iterator<Person> itr=sTree.iterator();
		while(itr.hasNext())
			itr.next().showData();
	}
}