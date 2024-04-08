//Person클래스는 기본적으로 나이를 기준으로 정렬하게끔 되어 있다.
//이를 이름을 기준으로 정렬하게끔 바꿔보자.
//주어진 소스코드에서 Person의 코드가 바뀌면 안된다..

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

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
        if(age>p.age)
            return 1;
        else if(age<p.age)
            return -1;
        else
            return 0;
    }

}

class PersonComparator implements Comparator<Person>
{

    public String getName(Person p)
    {
        return p.name;
    }
    public int compare(Person p1, Person p2)
    {
        return getName(p1).compareTo(getName(p2));
    }
}

class ComparablePerson
{
    public static void main(String[] args)
    {
        TreeSet<Person> sTree=new TreeSet<Person>();
        sTree.add(new Person("Lee", 24));
        sTree.add(new Person("Hong", 29));
        sTree.add(new Person("Choi", 21));

        Iterator<Person> itr=sTree.iterator();
        while(itr.hasNext())
            itr.next().showData();
    }
}