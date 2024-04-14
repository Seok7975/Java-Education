/*
4. 기본자료형의 인스턴스화 문제
때로는 int, double과 같은 기본 자료형 데이터들도 인스턴스로 표현을 해야만 하는 경우가 있다.
예를 들어서 다음과 같이 정의된 메소드가 존재한다고 가정해보자(이 메소드는 이미 정의되어있고,
                                   여러분은 이 메소드를 반드시 활용해야만 하는 상황이라고 가정하자. 기능의 단순함에는 신경 쓰지 말자).

public static void showData(Object obj)
{
    System.out.println(obj);
}

그런데 이 메소드를 통해서 출력해야 할 데이터가 정수 3과 실수 7.15이다.
이러한 상황에서는 정수 3과 실수 7.15가 Object 클래스를 상속하는 인스턴스의 형태가 되어야만
위 메소드의 인자로 전달될 수 있다.
이것이 기본 자료형 데이터가 인스턴스로 표현되어야 하는 상황인데,
이렇듯 인스턴스의 참조 값을 요구하는 자리에 기본 자료형 데이터를 놓아야 하는 경우,
기본 자료형 데이터를 인스턴스로 표현해야 한다.

그러면 위에 있는 메소드를 이용하여 정수 3을 출력하도록 하자.
기본 자료형 데이터를 인스턴스로 표현하기 위해서 여러분이 직접 클래스를 정의해도 된다.*/

/*
class primitiveToInctance
{
    public static void main(String[] args)
    {
        showdata(3);
        showdata(7.15);
    }

    public static void showdata(Object obj)
    {
        System.out.println(obj);
    }
}*/

class IntWrapper
{
    private double num;
    public IntWrapper(double data)
    {
        num = data;
    }

    @Override
    public String toString()
    {
        return "" + num;
    }
}

class WrappingInteger
{
    public static void showData(Object obj)
    {
        System.out.println(obj);
    }

    public static void main(String[] args)
    {
        IntWrapper intInst = new IntWrapper(3);
        showData(intInst);
        showData(new IntWrapper(7.15));

    }
}


