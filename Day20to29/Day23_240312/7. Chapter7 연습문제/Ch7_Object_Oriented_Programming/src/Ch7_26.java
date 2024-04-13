class Outer2 //외부 클래스
{
    static class Inner2 // 내부 클래스(static클래스)
    {
        int iv=200;
    }
}
class Ch7_26
{
    public static void main(String[] args)
    {
/*        //case1
        Outer2 ou = new Outer2();
        //Outer2.Inner2 ii = ou. new Inner2();   //인스턴스 클래스일때만 가능*/

/*        //case2
        Outer2.Inner2 ii = new Outer2(). new Inner2();  //인스턴스 클래스일때만 가능*/

        // Inner2가 static으로 선언되었기 때문에 불가능
        // 내부 클래스의 인스턴스를 생성할 때에는 외부 클래스의 인스턴스가 필요하지 않다.
        // 대신에 내부 클래스의 인스턴스를 직접 생성할 수 있다.
        // 바른 방법은 다음과 같이 Outer2.Inner2 클래스의 인스턴스를 직접 생성
        Outer2.Inner2 ii = new Outer2.Inner2();
        System.out.println(ii.iv);
    }
}
