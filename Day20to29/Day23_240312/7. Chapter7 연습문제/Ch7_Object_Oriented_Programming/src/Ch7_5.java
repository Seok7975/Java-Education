//다음의 코드는 컴파일하면 에러가 발생한다
// 그 이유를 설명하고 에러를 수정하기 .
//위해서는 코드를 어떻게 바꾸어야 하는가?

/*
class Product
{
    int price; // 제품의 가격
    int bonusPoint; // 제품구매 시 제공하는 보너스점수
    Product(int price)
    {
        this.price = price;
        bonusPoint =(int)(price/10.0);
    }
}
class Tv extends Product
{
    Tv() {}
    public String toString()
    {
        return "Tv";
    }
}
class Exercise7_5
{
    public static void main(String[] args)
    {
        Tv t = new Tv();
    }
}*/
class Products
{

    int price; // 제품의 가격
    int bonusPoint; // 제품구매 시 제공하는 보너스점수

    Products() {}

    Products(int price)
    {
        this.price = price;
        bonusPoint =(int)(price/10.0);
    }
}
class Television extends Products
//상위 클래스인 Product 클래스에는 매개변수를 받는 생성자가 정의
//하위 클래스인 Tv에도 적절한 생성자 호출필요.
{
    Television()
    {
        //상위 클래스의 생성자 호출
    }

    public String toString()
    {
        return "Television";
    }
}
class Exercise7_5
{
    public static void main(String[] args)
    {
        Television t = new Television();
    }
}
