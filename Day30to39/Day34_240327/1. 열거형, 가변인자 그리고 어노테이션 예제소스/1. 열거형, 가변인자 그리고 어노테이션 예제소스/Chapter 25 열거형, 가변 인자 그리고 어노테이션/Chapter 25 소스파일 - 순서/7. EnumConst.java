enum Person { 
    MAN, WOMAN;

    @Override
    public String toString() {
        return "I am a dog person";
    }
}

class EnumConst {
    public static void main(String[] args) {
        System.out.println(Person.MAN);
        System.out.println(Person.WOMAN);
    }
}

/*
모든 열거형은 java.lang.Enum<E> 클래스를 상속한다. 그리고 Enum<E>는 Object
클래스를 상속한다. (이런 측면에서 볼 때 열거형은 클래스이다.) 그리고 두 열거형
값은 Person 인스턴스를 참조하는 참조변수이다. 이에 대한 증거로 예제에서는 다음
문장을 통해 toString 메소드가 호출되었음을 보이고 있다.

System.out.println(Person.MAN);

열거형의 정의에도 생성자가 없으면 디폴트 생성자가 삽입된다. 다만 생성자는 
private으로 선언이 되어 직접 인스턴스를 생성하는 것이 불가능할 뿐 이다.
*/