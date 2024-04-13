//Ch7_25. Outer 클래스의 내부 클래스 Inner의 멤버변수 iv의 값을 출력 .

class Outer // 외부 클래스
{
    class Inner  // ( ) 내부 클래스 인스턴스 클래스
    {
        int iv=100;
    }
}
class Ch7_25
{
    public static void main(String[] args)
    {
/*        //case1
        Outer o = new Outer();  // Outer형 참조변수 o, Outer 인스턴스 참조, 객체 생성
        Outer.Inner ii = o.new Inner(); //Outer안의 Inner형 참조변수 ii, Outer 인스턴스 내의 Inner 인스턴스 참조*/

        //case2
        Outer.Inner ii = new Outer().new Inner(); //근데 인스턴스 클래스인데 객체생성을 안하고도 되네?

        System.out.println(ii.iv);
    }
}
