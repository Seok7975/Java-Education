class Person { 
    public static final Person MAN = new Person();
    public static final Person WOMAN = new Person();

    @Override
    public String toString() {
        return "I am a dog person";
    }
}

class InClassInst {
    public static void main(String[] args) {
        System.out.println(Person.MAN);	//참조 변수 집어넣음 자동 toString()출력
        System.out.println(Person.WOMAN);
    }
}
