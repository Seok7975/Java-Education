import java.util.TreeSet;
import java.util.Iterator;


class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " : " + age;
    }

    // 나이가 같으면 저장 하지 않는다.
    @Override
    public int compareTo(Person p) {
        return this.age - p.age;	// 오름차순 정렬
    }

//    @Override
//    public int compareTo(Person p) {
//        return p.age - this.age;	// 내림차순 정렬
//    }
}

class ComparablePerson {
    public static void main(String[] args) {
        TreeSet<Person> tree = new TreeSet<>();
        tree.add(new Person("YOON", 37));
        tree.add(new Person("HONG", 53));
        tree.add(new Person("PARK", 22));
	
        for(Person p : tree)
            System.out.println(p);
    }
}

/*
실행 결과

PARK : 22
YOON : 37
HONG : 53

*/

/*
그런데 오름차순이란, 순서상 작은 것에서부터 큰 것으로의 나열을 의미한다.
그렇다면 다음 클래스의 인스턴스는 무엇이 작은 것이며 무엇이 큰 것이겠는가?

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " : " + age;
    }
}

수의 경우 일반적으로 통용되는 작은 것과 큰 것에 대한 비교 기준이 있지만,
위 클래스의 경우 기준을 어떻게 정하느냐에 따라서 오름차순으로의 나열 결과는
달라지게 된다. 예를 들어서 크고 작음에 대한 기준을 나이로 둘 수 있다. 또는
이름의 가나다 순이 기준이 될 수도 있다. 즉 크고 작음에 대한 기준은 프로그래머가
결정할 일이다. 그래서 위와 같이 클래스를 정의할 때에는 다음 인터페이스의
구현을 통해서 크고 작음에 대한 기준을 정해주어야 한다.

public interface Comparable<T>
	-> 이 인터페이스에 위치한 유일한 추상 메소드 int compareTo(T o)

인스턴스의 비교 기준을 정의하는 Comparable<T> 인터페이스의 구현 기준

Comparable<T> 인터페이스를 구현할 때 정의해야 할 추상 메소드는 다음과 같다.

int compareTo(T o)

그리고 이 메소드의 정의 방법은 다음과 같으며, 이는 자바에서 결정한 일종의
약속이다.
* 인자로 전달된 o가 작다면 양의 정수 반환
* 인자로 전달된 o가 크다면 음의 정수 반환
* 인자로 전달된 o와 같다면 0을 반환

예를 들어서 다음과 같이 compareTo 메소드가 호출되었을 때

my.compareTo(your);

인스턴스 your가 my보다 작다면 양의 정수를, 반대로 your가 my보다 크다면
음의 정수를 반환하도록 메소드를 구현해야 한다. 그러면 TreeSet<E> 
인스턴스는 compareTo 메소드의 호출 결과를 바탕으로, 저장된 인스턴스들이
정렬된 상태를 유지하게 한다.
*/