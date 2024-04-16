//Test30_3
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
    public String toString()
    {
        return name + "(" + age + "세)";
    }

    //case 1 -> 이 방법은 1~100살 등 다양한 범위일때 비효율
    // 17%7과 24%7이 값이 같다가 예
/*    @Override
    public int hashCode()
    {
        return name.hashCode() + age%7;
    }*/

    //case2
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
        {
            return true;
        }
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