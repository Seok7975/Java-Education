class Ch7_20
{
    public static void main(String[] args)
    {
        Parent p = new Child(); // Parent(상위)타입의 참조변수 p, Child인스턴스 참조
        Child c = new Child();  //Child(하위)타입의 참조변수 c, Child인스턴스 참조 //c상위 p하위
        System.out.println("p.x = " + p.x); //100
        p.method(); // Child Method 출력  ->
        System.out.println("c.x = " + c.x); //200
        c.method(); //Child Method 출력
    }
}
class Parent
{
    int x = 100;    //Parent클래스의 멤버변수 x
    void method()
    {
        System.out.println("Parent Method");
    }
}
class Child extends Parent
{
    int x = 200;    //Child클래스의 멤버변수 x
    void method()
    {
        System.out.println("Child Method");
    }
}

//메서드인 method()의 경우 참조변수의 타입에 관계없이 항상 실제 객체의 인스턴스의 타입인
//Child 클래스에 정의된 메서드가 호출되지만, 인스턴스(멤버)변수인 x는 참조변수의 타입에 따라
//서 달라진다.