//1. ArrayObjSort.java 파일안에 있는 배열을 다음의 실행 결과가 나오도록 정렬하여 출력하시오.
//실행 결과
//Goo: 15
//Lee: 29
//Soo: 37

//나이별로 오름차순  -> Interface Comparable, Object.compareTo()

import java.util.Arrays;

class Person implements Comparable
{
    private String name;
    private int age;
    int count = 0;
   // private int count = 0;

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString()
    {
        return name + ": " + age;
    }

    @Override
    public int compareTo(Object o) //sort-comapreTo
    {
        Person p =(Person) o;
        if(this.age > p.age)
        {
            return 1;
        }
        else if(this.age <p.age)
        {
            return -1;
        }
        else
        {
            return 0;
        }

    }
}
//this Goo : 15,  p Lee : 29  return -1       Lee -> Goo
//this Soo : 37,  p Goo : 15  return 1        Soo -> Goo
//this Soo : 37,  p Lee : 29  return 1        Soo -> Lee -> Goo
//this Kim : 23,  p Lee : 29  return -1       kim -> Lee -> Goo
//this Kim : 23,  p Goo : 15  return 1        kim -> Goo
//이거 랜덤임..

class ArrayObjSort
{
    public static void main(String[] args)
    {
        Person[] ar = new Person[4];

        ar[0] = new Person("Lee", 29);
        ar[1] = new Person("Goo", 15);
        ar[2] = new Person("Soo", 37);
        ar[3] = new Person("Kim", 23);

        Arrays.sort(ar);    //배열을 오름차순으로 정렬을 먼저하고 스타트
        for(Person i :  ar)
        {
            System.out.println(i);
        }

    }
}

