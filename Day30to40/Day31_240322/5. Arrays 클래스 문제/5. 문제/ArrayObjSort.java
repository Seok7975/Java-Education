import java.util.Arrays;

class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    }
}
/*
실행 결과
Goo: 15
Lee: 29
Soo: 37
*/

