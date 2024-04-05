//1. 제수(나누는 수)가 0이 되었을 때 예외 처리하는 소스를 만드시오.


import java.util.Scanner;

class DivideByZero_HS_ver
{
    public static void main(String[] args)
    {
        System.out.print("두 개의  정수 입력: ");
        Scanner keyboard = new Scanner(System.in);

        int num1 = keyboard.nextInt();
        int num2 = keyboard.nextInt();

        try
        {
            System.out.println("나눗셈 결과의 몫 : " + (num1/num2));
            System.out.println("나눗셈 결과의 나머지 : " + (num1%num2));
        }

        catch(ArithmeticException e)	// 제수가 0
        {
            System.out.println("나눗셈 불가능");
            System.out.println(e.getMessage()); //e는 ArithmeticException 클래스의 객체, 즉 예외 객체에 해당한다
            //(ArithmeticException왜냐하면 `x/0`에 의해 ArithmeticException이 발생하여 catch 구문으로 넘어가기 때문
        }

        System.out.println("프로그램을 종료합니다");
    }
}