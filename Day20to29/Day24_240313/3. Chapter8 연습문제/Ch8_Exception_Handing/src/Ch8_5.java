
//[8-5] 아래의 코드가 수행되었을 때의 실행결과를 적으시오.

class Ch8_5 {
    static void method(boolean b)
    {
        try
        {
            System.out.println(1);  //1
            if (b) throw new ArithmeticException();  //(1)던지고
            System.out.println(2);
        }
        catch (RuntimeException r)  //(1)받고!
        {
            System.out.println(3);
            return;
        }
        catch (Exception e) //위에서 받아서 여기는 넘어감(else if 느낌)
        {
            System.out.println(4);
            return;
        }
        finally
        {
            System.out.println(5);
        }
        System.out.println(6);
    }

    public static void main(String[] args)
    {
        method(true);
        method(false);
    } // main
}


//method(true)
//ArithmeticException은 RuntimeException의 자손이므로
//RuntimeException 이 정의된 catch블럭에서 처리됨.
//
//1
//3
//5

//method(false)
//1
//2
//5
//6

//만약 catch (RuntimeException r) 부분을 지우면?
//1
//4
//5

//1
//2
//5
//6