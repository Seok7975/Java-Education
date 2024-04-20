enum Person { 
    MAN(29), WOMAN(25);

    int age;
    
    private Person(int age) { 
        this.age = age;
    }

    @Override
    public String toString() {
        return "I am " + age + " years old";
    }
}

class EnumParamConstructor {
    public static void main(String[] args) {
        System.out.println(Person.MAN);
        System.out.println(Person.WOMAN);
    }
}

/*
열거형의 생성자는 다음과 같이 무조건 private으로 선언해야 한다.
private Person(int age) {...}
그리고 열거형 값의 선언에서 다음과 같이 소괄호를 통해서 생성자에
인자를 전달할 수 있다.

enum Person{
	MAN(29), WOMAN(25);
	...
}

결론은 간단하다. 열거형도 Object 클래스를 상속하는 일종의 클래스이다.
따라서 생성자는 물론, 인스턴스 변수와 메소드 둘 다 가질 수 있다. 다만
모든 생성자를 private으로 선언해야 하기 때문에 '열거형 값'이 유일한
인스턴스 생성 방법이라는 차이가 있을 뿐이다.
*/