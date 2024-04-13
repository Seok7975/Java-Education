//7_22.
//아래는 도형을 정의한 shape클래스이다. 이 클래스를 조상으로 하는
//Circle클래스와 Rectangle클래스를 작성하시오. 이 때, 생성자도
//각 클래스에 맞게 적절히 추가해야한다.
/*
(1) 클래스명 : Circle
    조상클래스 : Shape
    멤버변수 : double r - 반지름

(2) 클래스명 : Rectangle
    조상클래스 : Shape
    멤버변수 : double width - 폭
              double height - 높이
    메소드명 : isSquare
    기   능 : 정사각형인지 아닌지 알려준다.
    반환타입 : boolean
    매개변수 : 없음
 */

// 추상클래스는 부모클래스로만 사용(객체화가 불가능)
// 추상메소드가 하나라도 있으면 클래스도 추상화 해야함
// 추상메소드는 반드시 구현부(오버라이딩)해야함
// 추상메소드는 기능은 필요하지만, 구체화 되어야 기능을 구현할 수 있는 경우에 사용
/*
장점
1. 클래스를 설계할 때 변수와 메서드의 이름을 공통적으로 적용시키기 가능
(유사한 특성을 가진 클래스들을 모아 공통 변수나 메서드의 이름을
통일 시켜 각 클래스에 맞게 재정의 가능)
2. 중복소스 줄이기가능 -> 개발시간 단축
3. 다형성의 개념 적용시킬 수 있어, 소스의 수정이나 변경사항이 있을 때,
 전체를 변경하거나 바꾸는 것이 아니라 부품 교체하듯이 특정클래스만
 새 클래스로 바꿔 수정 가능.
 */

abstract class Shape
{
    Point p;

    Shape()
    {
        //Point 클래스의 새 인스턴스 생성->(0,0)
        //새 Point 인스턴스를 인자로 갖는 다른 형태의 Shape생성자 호출
        //Shape클래스의 다른 생성자 중 하나가 호출
        //이 생성자는 주어진 좌표(0,0)으로 Shape클래스의 위치를 초기화
        this(new Point(0,0));
    }
    Shape(Point p)
    {
        this.p = p;
    }

    abstract double calcArea(); // 도형의 면적을 계산해서 반환하는 메서드
    Point getPosition()
    {
        return p;
    }
    void setPosition(Point p)
    {
        this.p = p;
    }
}
////////////////////////////////////////////////////////////////////////////
class Circle extends Shape
{
    private double r;
    final private double PI=3.141592;

    Circle(double r)
    {
        this(new Point(0,0), r);
        //Circle(Porint p, double r)을 호출
    }

    Circle(Point p, double r)
    {
        super(p);  //상위의 멤버는 상위의 생성자가 초기화 하도록
        this.r = r;
    }

    @Override
    double calcArea()
    {
        return PI * r * r;
    }
}

class Rectangle extends Shape
{
    private double width;
    private double height;
    //private boolean DiscriminationOfRectangle;

    Rectangle(double width, double height)
    {
        this(new Point(0,0), width, height);
        //DiscriminationOfRectangle = true;
    }

    Rectangle(Point p, double width, double height)
    {
        super(p);    //상위의 멤버는 상위의 생성자가 초기화 하도록
        this.width = width;
        this.height = height;
    }

    boolean isSquare()  //정사각형 판별
    {
        return (width*height != 0) && (width == height);
        //width나 height가 0이 아니고, width와 height가 같으면 true반환
    }

    @Override
    double calcArea()
    {
            return width * height;
    }
}

////////////////////////////////////////////////////////////////////////////
class Point
{
    int x;
    int y;
    Point()
    {
        this(0,0);
    }
    Point(int x, int y)
    {
        this.x=x;
        this.y=y;
    }
    public String toString()
    {
        return "["+x+","+y+"]";
    }
}

class calculateOfArea
{
    public static double sumArea(Shape[] arr)
    {
        double sum = 0;

        for(int i=0; i<arr.length; i++)
        {
            sum += arr[i].calcArea();
        }
        return sum;
    }
}

class calculateOfArea_Main
{
    public static void main(String[] args)
    {
        Shape[] arr = {new Circle(5.0), new Rectangle(3, 4), new Circle(1)};
        System.out.println("면접의 합 : " + calculateOfArea.sumArea(arr));
    }
}

