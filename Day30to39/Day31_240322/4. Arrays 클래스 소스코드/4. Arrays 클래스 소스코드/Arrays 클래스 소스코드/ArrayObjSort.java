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

        if(this.age > p.age)
            return 1;
        else if(this.age < p.age)
            return -1;
        else
            return 0;
    }
    
    @Override
    public String toString() {
        return name + ": " + age;
    }
}

class ArrayObjSort {
    public static void main(String[] args) {
        Person[] ar = new Person[3];

        ar[0] = new Person("Lee", 29);
        ar[1] = new Person("Goo", 15);
        ar[2] = new Person("Soo", 37);

        Arrays.sort(ar);

        for(Person p : ar) 
            System.out.println(p);
    }
}
/*
실행 결과
Goo: 15
Lee: 29
Soo: 37
*/

/*
참고 Comparable<T> 인터페이스
Comparable 인터페이스는 자바에 '제네릭(Generic)'이 도입되면서 
Comparable<T> 인터페이스로 수정되었다. 그러나 지금도 기존 코드와의 호환성
유지를 위해 Comparable 인터페이스를 지원하고 있다.
*/