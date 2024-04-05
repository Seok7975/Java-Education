
//11. 문제8번을 main메소드내에서도 예외상황을 처리하지 않는다면 어떻게 해야 되는가?
//8. 나이를 입력 받았을 때 0보다 작은 값이 입력되면은
// "유효하지 않은 나이가 입력되었습니다."라고 출력하도록 예외처리를 만드시오.
//그럼 메인 아닌 다른 메소드에서 하면 되겠네
//혹은 메인에서 던지면 되겠네

import java.util.Scanner;

class ThrowsFromMain_HS_ver
{
    public static void main(String[] args) throws AgeInputException
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("나이를 입력하세요");
        int getAge = sc.nextInt();
        System.out.println("당신은 " + readAge(getAge) + "세입니다.");

    }

    public static int readAge(int getAge) throws AgeInputException
    {
        if (getAge < 0)
        {
            AgeInputException excpt = new AgeInputException();
            throw excpt; // 그냥 있어야 하는 문법
            //throw new AgeInputException();
        }
        return getAge;
    }
}

class AgeInputException extends Exception // java.lang 매소드
{
    public AgeInputException()
    {
        super("유효하지 않은 나이가 입력되었습니다");
    }
}
/*

////////////////////////////////////////////////////////////////선생님 버전
import java.util.Scanner;

class AgeInputException extends Exception
{
    public AgeInputException()
    {
        super("유효하지 않은 나이가 입력되었습니다.");
    }
}

class ThrowsFromMain
{
    public static void main(String[] args) throws AgeInputException
    {
        System.out.print("나이를 입력하세요: ");
        int age=readAge();
        System.out.println("당신은 "+age+"세입니다.");
    }

    public static int readAge() throws AgeInputException
    {
        Scanner keyboard=new Scanner(System.in);
        int age=keyboard.nextInt();
        if(age<0)
        {
            AgeInputException excpt=new AgeInputException();
            throw excpt;
        }
        return age;
    }
}*/
