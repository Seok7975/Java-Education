import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("a나누기b 할 두 정수 입력");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        try
        {
            System.out.println("a/b = " + (num1/num2));
            System.out.println("a%b = " + (num1%num2));
        }
        catch(ArithmeticException e)
        {
            System.out.println("나눗셈 불가능");
            System.out.println(e.getMessage());
        }

        System.out.println("프로그램 종료");
    }
}