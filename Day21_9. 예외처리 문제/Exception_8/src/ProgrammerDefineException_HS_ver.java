//8. 나이를 입력 받았을 때 0보다 작은 값이 입력되면은
// "유효하지 않은 나이가입력되었습니다."라고 출력하도록 예외처리를 만드시오.

import java.util.Scanner;

class ProgrammerDefineException_HS_ver
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        try
        {
            System.out.println("나이를 입력하세요");
            int getAge = sc.nextInt();
            System.out.println(readAge(getAge));    // 1. getAge =-1

        }
        catch (AgeInputException e) //5
        {
            System.out.println(e.getMessage()); //6
        }
    }

    public static int readAge(int getAge) throws AgeInputException
    {
        if (getAge < 0)
        {
            AgeInputException excpt = new AgeInputException();  //2
            throw excpt; // 그냥 있어야 하는 문법    //4
            //throw new AgeInputException();
        }
        return getAge;
    }
}

class AgeInputException extends Exception // java.lang 매소드
{
    public AgeInputException()  //3
    {
        super("유효하지 않은 나이가 입력되었습니다");
    }
}