//7. 예외 상황의 발생여부와 상관없이 항상 실행되는 영역에
// 쓰는 키워드는 무엇이고, 그것을 이용하여 소스코드를 작성해 보시오.

import java.util.Scanner;

class FinallyTest_HS_ver
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        divide(num1, num2);
        //+, - , *, /
    }

    public static void divide(int num1, int num2)
    {
        try
        {
            int result = num1 / num2;
            int remain = num1 % num2;
            System.out.printf("나눗셈 결과는 몫 : %d, 나머지 : %d", result, remain);
            System.out.println();
        }
        catch(ArithmeticException e) //제수가 0
        {
            System.out.println(e.getMessage());
        }
        finally //무조건 마지막에 실행되는 구문
        {
            System.out.println("finally 영역 실행");
        }
    }
}