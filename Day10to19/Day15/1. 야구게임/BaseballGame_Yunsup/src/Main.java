import java.util.Scanner;

class BaseballGameUI
{
    //private int numberOfDigits;
    //private int myNumber;
    Scanner sc = new Scanner(System.in);

    public BaseballGameUI() {

    }

    public int startBaseballGameUI() {
        //Scanner sc = new Scanner(System.in);
        int numberOfDigits = 0;
        //int myNumber = 0;

        System.out.println("숫자 야구 게임을 시작합니다!");

        while (true) {
            System.out.println("원하는 자릿수를 선택하세요");
            System.out.println("1~9까지 선택가능");
            numberOfDigits = sc.nextInt();
            if (1 <= numberOfDigits && numberOfDigits <= 9) break;
            System.out.println("잘못 입력하셨습니다.");
        }
        return numberOfDigits;
    }

    public int[] getComputerNumber() {
        int gameNumberOfDigits = startBaseballGameUI();
        int[] computerNumber = new int[gameNumberOfDigits];
        for (int i = 0; i < gameNumberOfDigits; i++)
        {
            computerNumber[i] = (int) (Math.random() * 9) + 1; //0<= <10
            for (int j = i - 1; j >= 0; j--) //0~9 중복 없이
            {
                if (computerNumber[i] == computerNumber[j])
                {
                    i--;
                }
            }

        }

        return computerNumber;
    }
}

class hahahahaha
{
    public static void main(String[] args)
    {
        BaseballGameUI bb = new BaseballGameUI();
        //bb.getMyNumber();
        for(int i : bb.getComputerNumber())
        {
            System.out.print(i + " ");
        }
        //System.out.println(bb.getMyNumber());
    }
}