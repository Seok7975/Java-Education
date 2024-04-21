import java.util.Comparator;
import java.util.TreeSet;


class Person implements Comparable<Person> {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() { return name + " : " + age; }

    @Override
    public int compareTo(Person p) {
        return this.age - p.age;
    }
}

class PersonComparator implements Comparator<Person> {
    public int compare(Person p1, Person p2) {
        return p2.age - p1.age; 
    }
}



class ComparatorPerson {
    public static void main(String[] args) {
        TreeSet<Person> tree = new TreeSet<>(new PersonComparator());
        tree.add(new Person("YOON", 37));
        tree.add(new Person("HONG", 53));
        tree.add(new Person("PARK", 22));
	
        for(Person p : tree)
            System.out.println(p);
    }
}

/*
실행 결과

HONG : 53
YOON : 37
PARK : 22

*/

/*
Comparator<T> 인터페이스를 기반으로 TreeSet<E>의 정렬 기준 제시하기

우리는 Person 클래스를 정의하였다. 이때 나이가 적은 사람이 앞쪽에 위치하도록
compareTo 메소드도 구현해 보았다. 그런데 나이가 많은 사람이 앞쪽에 위치하도록
기준을 바꿔야 한다면? 물론 메소드의 구현 내용을 수정하면 된다. 그러나 일시적인
기준 변경이라면 메소드를 수정하는 일은 적절치 않다. 그리고 다행히 이러한 상황을
고려하여 다음 인터페이스가 제공되고 있다.

public interface Comparator<T>
	-> int compare(T o1, T o2)의 구현을 통해 정렬 기준을 결정할 수 있다.
	
public TreeSet(Comparator<? super E> comparator)

그러면 이렇게 생성된 TreeSet<E> 인스턴스는 생성자로 전달된 인스턴스의 compare
메소드 호출결과를 기준으로 정렬을 진행한다. 그리고 compare 메소드의 정의 기준은 
다음과 같다.

int compare(T o1, T o2)
	* o1이 o2보다 크면 양의 정수 반환
	* o1이 o2보다 작으면 음의 정수 반환
	* o1과 o2가 같다면 0반환
	
*/