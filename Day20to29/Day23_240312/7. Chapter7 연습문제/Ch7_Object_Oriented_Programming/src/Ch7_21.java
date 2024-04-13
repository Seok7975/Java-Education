//인터페이스 및 상속 다형성 개념에 좋은 예제


interface Movable
{
    int i=2;
    int f=0;
    void move(int x, int y);
}

class Movable_Son implements Movable
{
    int x=1;

    @Override
    public void move(int x, int y)
    {
        System.out.println(x + " 이것은 Movable인터페이스의 구현 클래스 " +y);
    }

}

/////////////////////////////////////////////////////////////////////////////////////////////
//attack 메소드에 가능한 매개변수
//null
//Movable인터페이스를 구현한 클래스 또는 그 자손의 인스턴스(Movable인터페이스를 사용 할 수 있는 객체)
////////////////////////////////////////////////////////////////////////////////////////////////


//attack 메소드에 가능한 매개변수1
class Move
{
    void attack()//null //void attack(Movable x) //void attack(Movable_Son x)
    {
        System.out.println("매개변수 없는 Move클래스의 attack메소드1");
    }
}

//attack 메소드에 가능한 매개변수2
class Move2
{
    void attack2(Movable x)
    {
        System.out.println("Movable(상위클래스)형 매개변수를 " +
                "갖는 Move클래스의 attack메소드2"); //Movable인터페이스를 구현한 클래스의 인스턴스
    }
}

//attack 메소드에 가능한 매개변수3
class Move3
{
    void attack3(Movable_Son x) //Movable인터페이스 그 자손의 인스턴스(Movable인터페이스를 사용 할 수 있는 객체)
    {
        System.out.println("Movable_Son(하위클래스)형 매개변수를 " +
                "Move클래스의 attack메소드3");
    }
}

class MoveMain
{
    public static void main(String[] args)
    {
        Move m1 = new Move();   //Move 타입의 참조변수 m1, Move인스턴스 참조(객체생성)
        Movable m2 = new Movable_Son(); //Movable 타입의 참조변수 m2, Movable_Son인스턴스 참조(객체생성)
        Movable_Son m3 = new Movable_Son(); //Movable_Son 타입의 참조변수 m3, Movable_Son인스턴스 참조(객체생성)
        Move2 m4 = new Move2();
        Move3 m5 = new Move3();
        //Moveable_Son m6 = new Movable(); //하위타입의 참조변수로 상위클래스 인스턴스 참조 불가

        m4.attack2(m2); //(참조변수의 타입에 따라서만 상관있음) 따라서 Movalbe형인 m2는 형변환 상관이없다
        m4.attack2(m3); //하위에서 상위로 자동형변환

        m5.attack3((Movable_Son)m2);    //상위에서 하위로 강제형변환 (참조변수의 타입에 따라서만 상관있음)
        m5.attack3(m3);

        m2.move(1,2);   //상위타입인 참조변수로 하위클래스의 메소드 호출
        m3.move(3,4);   //그냥 자기 타입 참조변수로 본인 클래스 메소드 호출

        System.out.println(m2.i);   //각 클래스의 멤버(인스턴스)변수는 각 클래스 !!!타입!!!!!으로만!!! 호출가능
        m2.move(5,6);
        m3.move(7,8);
        m2.move(9,10);
        System.out.println(m3.x);   //각 클래스의 멤버(인스턴스)변수는 각 클래스 타입으로만 호출가능

    }
}

