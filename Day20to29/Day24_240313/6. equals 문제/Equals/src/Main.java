//문제5를 Object 클래스의 equals 라는 메소드를
// 이용하여 구현하시오.(메소드 오버라이딩)

//== : Call by Reference, 주소의 값(자료의 위치값)을 비교
//equals() 메소드 : Call by value, 객체끼리 내용을 비교

class IntNumber
{
    int num;

    public IntNumber(int num)
    {
        this.num=num;
    }

/*    public boolean isEquals(IntNumber numObj)
    {
        return this.num == numObj.num;
    }*/

    public boolean equals(Object numObj)
    {
/*        IntNumber other =(IntNumber)numObj;
        return this.num == other.num;*/
        return this.num == ((IntNumber)numObj).num;
        //주소값이 같은 객체를 비교해야하며,
        // 이는 곧 동일한 객체인지의 여부를 판별하는 것과 상통
    }

    public void showIntNumber(Object numObj)
    {
        System.out.println("멤버변수 num : " + this.num + "   로컬변수 num : " + ((IntNumber)numObj).num);
    }
}

class ObjectEquality
{
    public static void main(String[] args)
    {
        IntNumber num1=new IntNumber(10);
        IntNumber num2=new IntNumber(12);
        IntNumber num3=new IntNumber(10);


        num1.showIntNumber(num2);
        if(num1.equals(num2))
            System.out.println("num1과 num2는 동일한 정수");
        else
            System.out.println("num1과 num2는 다른 정수");

        num1.showIntNumber(num3);
        if(num1.equals(num3))
            System.out.println("num1과 num3는 동일한 정수");
        else
            System.out.println("num1과 num3는 다른 정수");

        num2.showIntNumber(num3);
        if(num2.equals(num3))
            System.out.println("num2과 num3는 동일한 정수");
        else
            System.out.println("num2과 num3는 다른 정수");
    }
}