

//10. 문제8번을 메소드를 쓰지않고서 메인메소드내에서 처리해 보자.
//8. 나이를 입력 받았을 때 0보다 작은 값이 입력되면은
// "유효하지 않은 나이가입력되었습니다."라고 출력하도록 예외처리를 만드시오.

import java.util.Scanner;

class ProgrammerDefineException2_HS_ver
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        try
        {
            System.out.println("나이를 입력하세요");
            int getAge = sc.nextInt();
            if (getAge < 0)
            {
                AgeInputException excpt = new AgeInputException();
                throw excpt;
            }
            System.out.println("당신은 " + getAge + "세입니다.");

        }
        catch (AgeInputException e)
        {
            System.out.println(e.getMessage());
        }
    }
}

class AgeInputException extends Exception // java.lang 매소드
{
    public AgeInputException()
    {
        super("유효하지 않은 나이가 입력되었습니다");
    }
}