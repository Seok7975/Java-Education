/*14. 이름과 나이를 입력받아 저장할려고 한다.
이름은 두글자 이상을 입력받아야한다.
(예외클래스에는 잘못된 이름을 저장할 수 있는 인스턴스 변수와
그 잘못된 이름을 출력하는 메소드를 만들자.)
나이는 음수값이 입력되면 안된다.
그리고 13번에 있는 메소드
(예외가 발생해서 전달되는 과정이 출력되는 메소드
: Throwable클래스에 정의되어 있는 PrintStackTrace메소드)
를 이용하여 예외상황이 전달되는 과정을 출력하도록 하자.*/


import com.sun.source.tree.CatchTree;

import java.util.Scanner;

//예외발생 2글자 미만;
//예외발생 나이 <0;
//예외상황이 전달되는 과정

class PrintStackTrace_HS_Beta_ver
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("이름을 입력해주세요");
        String name = sc.nextLine();
        System.out.println("나이를 입력해주세요");
        int age = sc.nextInt();

        if (name.length() < 2 || age < 0)
        {
            if (name.length() < 2)
            {
                System.out.println("예외 발생 : 2글자 미만 이름 불가");
                System.out.println("잘못 입력 된 이름 : " + name);
            }
            if (age < 0)
            {
                System.out.println("예외 발생 : 음수 나이 불가");
            }
        }
        else
        {
            System.out.println("이름 : " + name);
            System.out.println("나이 : " + age);
        }
    }
}

////////////////////////////////////////////////////////////////////////////////////////////


/*14. 이름과 나이를 입력받아 저장할려고 한다.
이름은 두글자 이상을 입력받아야한다.
(예외클래스에는 잘못된 이름을 저장할 수 있는 인스턴스 변수와
그 잘못된 이름을 출력하는 메소드를 만들자.)
나이는 음수값이 입력되면 안된다.
그리고 13번에 있는 메소드
(예외가 발생해서 전달되는 과정이 출력되는 메소드
: Throwable클래스에 정의되어 있는 PrintStackTrace메소드)
를 이용하여 예외상황이 전달되는 과정을 출력하도록 하자.*/






//예외발생 2글자 미만;
//예외발생 나이 <0;
//예외상황이 전달되는 과정

/*class PrintStackTrace_HS_Beta_ver
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("이름을 입력해주세요");
        String name = sc.nextLine();
        System.out.println("나이를 입력해주세요");
        int age = sc.nextInt();

        if (name.length() < 2 || age < 0)
        {
            if (name.length() < 2)
            {
                System.out.println("예외 발생 : 2글자 미만 이름 불가");
                System.out.println("잘못 입력 된 이름 : " + name);
            }
            if (age < 0)
            {
                System.out.println("예외 발생 : 음수 나이 불가");
            }
        }
        else
        {
            System.out.println("이름 : " + name);
            System.out.println("나이 : " + age);
        }
    }
}*/

////////////////////////////////////////////////////////////////////////////////////////////


class AgeInputException extends Exception
{
    public AgeInputException()
    {
        super("예외 발생 : 음수 나이 불가");
    }
}

class NameLengthException extends Exception
//잘못된 이름을 저장할 수 있는 인스턴스 변수와 그 잘못된 이름을 출력하는 메소드
{
    String wrongName;

    public NameLengthException(String name)
    {
        super("예외 발생 : 2글자 미만 이름 불가");
        wrongName = name;
    }

    public void printWrongName()
    {
        System.out.println("잘못 입력 된 이름 : " + wrongName);
    }
}

class Information
//이름을 저장할 수 있는 인스턴스 변수와 메소드
{
    String name;
    int age;

    public Information(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void printInformation()
    {
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
    }
}



class PrintStackTrace_HS_ver
{
    public static void main(String[] args)
    {

        try
        {

            Information nameAndAge = readInformation();
            nameAndAge.printInformation();
        }
        catch(AgeInputException e)
        {
            e.printStackTrace();
        }
        catch(NameLengthException e)
        {
            e.printWrongName();
            e.printStackTrace();
        }
    }

    public static Information readInformation() throws AgeInputException, NameLengthException
    {
        String name = readName();
        int age = readAge();
        Information Infor = new Information(name, age);
        return Infor;
    }
    public static String readName() throws NameLengthException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("이름을 입력해주세요");
        String name = sc.nextLine();
        if(name.length()<2)
        {
            throw new NameLengthException(name);
        }

        return name;
    }

    public static int readAge() throws AgeInputException //던저짐 명시
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("나이를 입력해주세요");
        int age = sc.nextInt();

        if(age<0)
        {
            throw new AgeInputException(); //던져!
        }
        return age;

    }
}

