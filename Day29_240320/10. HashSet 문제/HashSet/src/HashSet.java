//문제
//다음 클래스의 두 인스턴스를 HashSet<E>에 저장할 때,
//두 인스턴스의 데이터(name & age)가 완전히 동일하다면,
//하나만 저장되도록 hashCode 메소드와 equals  메소드를 오버라이딩 하자.

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

    @Override
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
        return Objects.hash(name, age);
    }

    @Override
    public boolean equals(Object obj)
    {
        Person comp = (Person) obj;
        if(comp.name.equals(name) && comp.age == age)
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

//인스턴스의 내용비교가 되도록 적절히 오버라이딩 되었다면, 다음의 실행결과를 보여야 한다.
//단 이름과 나이 정보가 출력되는 순서는 hashCode 메소드의 구현에 따라 다를 수 있다. 아니 대부분 다를 것이다.
//
//저장된 데이터 수 : 4
//김명호(20세)
//김명호(15세)
//이진호(10세)
//이진호(20세)