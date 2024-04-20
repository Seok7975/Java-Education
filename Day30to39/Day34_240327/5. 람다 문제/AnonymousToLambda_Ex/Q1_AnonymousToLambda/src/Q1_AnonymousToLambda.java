//1. LambdaTest.java 소스코드의 익명 클래스를 람다로 바꾸시오.

/*
interface MyFunction
{
    int max(int a, int b);
}

class LambdaTest
{

    public static void main(String[] args)
    {
        MyFunction f = new MyFunction()
        {
            public int max(int a, int b)
            {
                return a > b ? a : b;
            }
        };
        int big = f.max(5, 3);    // 익명 객체의 메소드 호출
        System.out.println(big);
    }
}

*/

interface MyFunction
{
    int max(int a, int b);
}

class LambdaTest
{

    public static void main(String[] args)
    {
        MyFunction f = (a, b) ->
                a > b ? a : b;
        int big = f.max(5, 3); //익명 객체의 메소드 호출
        System.out.println(big);
    }
}



/////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
interface MyFunction
{
    int max(int a, int b);
}

class LambdaTest
{

    public static void main(String[] args)
    {
        MyFunction f = (a, b) -> a>b ? a : b	//중괄호 생략하면 return과 세미콜론도 생략
        int big = f.max(5, 3);    // 익명 객체의 메소드 호출
        System.out.println(big);
    }
}
*/

//////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
class AAA
{
	public void hi(String str)
	{
		System.out.println(str);
	}
}


(String str) ->
{
	System.out.println(str);
}


str -> System.out.println(str)

*/



