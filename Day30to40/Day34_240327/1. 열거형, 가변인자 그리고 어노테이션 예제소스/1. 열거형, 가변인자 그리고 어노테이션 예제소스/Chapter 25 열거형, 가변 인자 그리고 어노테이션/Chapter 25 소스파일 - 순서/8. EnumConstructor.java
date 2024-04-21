enum Person { 
    MAN, WOMAN;
    
    private Person() { 
        System.out.println("Person constructor called");
    }

    @Override
    public String toString() {
        return "I am a dog person";
    }
}

class EnumConstructor {
    public static void main(String[] args) {
        System.out.println(Person.MAN);
        System.out.println(Person.WOMAN);
    }
}

/*
위 예제에는 두 개의 '열거형 값'이 존재하기에 두 번의 생성자 호출이 이뤄졌다.
따라서 '열거형 값'의 정체는 다음과 같이 표현할 수 있다.

public static final Person MAN = new Person();
public static final Person WOMAN = new Person();
	-> 열거형 값의 실체를 설명하는 문장, 생성자가 private 이라 실제 컴파일은 안됨

*/