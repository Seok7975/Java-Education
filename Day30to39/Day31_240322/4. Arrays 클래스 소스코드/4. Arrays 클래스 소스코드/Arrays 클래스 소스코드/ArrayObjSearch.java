import java.util.Arrays;

class Person implements Comparable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }    

    @Override
    public int compareTo(Object o) {
        Person p = (Person)o;
        return this.age - p.age;	// 나이가 같으면 0을 반환
    }
    
    @Override
    public String toString() {
        return name + ": " + age;
    }
}


class ArrayObjSearch {
    public static void main(String[] args) {
        Person[] ar = new Person[3];

        ar[0] = new Person("Lee", 29);
        ar[1] = new Person("Goo", 15);
        ar[2] = new Person("Soo", 37);

        Arrays.sort(ar);	// 탐색에 앞서 정렬

        int idx = Arrays.binarySearch(ar, new Person("Who are you?", 37));
        System.out.println(ar[idx]);
    }
}

/*
실행 결과
Soo: 37
*/
/*
public static int binarySearch(Object[] a, Object key)

그렇다면 이 메소드가 key와 동일한 인스턴스를 찾았다고 판단하는 기준은 무어일까?
Comparable 인터페이스의 compareTo 메소드가 그 기준이다. compareTo 메소드의
호출을 통해서 0이 반환되면 key에 해당하는 인스턴스를 찾았다고 판단한다.

예제에선느 다음 문장을 통해 탐색을 진행하고 있다.

int idx = Arrays.binarySearch(ar, new Person("Who are you?", 37));

문장의 내용만 놓고 보면 이름이 "Who are you?" 나이가 37인 Person 인스턴스를
찾는 것으로 보인다. 그러나 탐색의 결과는 이름이 "Soo"이고 나이가 37이다. 이러한
결과의 원인은 다음 메소드 정의에서 찾을 수 있다.

    public int compareTo(Object o) {
        Person p = (Person)o;
        return this.age - p.age;	// 나이가 같으면 0을 반환
    }
    
 정리하면, binarySearch 메소드를 통해 인스턴스를 찾고자 하는 경우, 탐색의 대상이 되는
 인스턴스들의 클래스는 Comparable 인터페이스를 구현한 상태이어야 한다. 이는
 compareTo 메소드의 구현 내용을 토대로 탐색이 진행되기 때문이다. 

*/