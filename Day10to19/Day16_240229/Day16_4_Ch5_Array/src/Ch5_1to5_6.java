import java.util.Random;
import java.util.Arrays;

class Ch5_5to5_6
{
    public static void main(String[] args)
    {
        //5.5
        System.out.println("5-5번문제");
        int[] ballArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] ball3 = new int[3];

        for (int i = 0; i < ballArr.length; i++)
        {
            int j = (int) (Math.random() * ballArr.length) + 1;
            int tmp = 0;
//////////////////////////////////////////////////////////////////////
            tmp = ballArr[i];
            ballArr[i] = j;
            j = tmp;
            for (int a = 0; a < i; a++)
            {
                if (ballArr[i] == ballArr[a])
                {
                    i--;
                }
            }
///////////////////////////////////////////////////////////////////

            for (int k = 0; k < ball3.length; k++)
            {
                ball3[k] = ballArr[k];
            }
            //System.arraycopy(ballArr,0,ball3,0,3);
/////////////////////////////////////////////////////////////////////
        }
        System.out.println(Arrays.toString(ballArr));
        System.out.println(Arrays.toString(ball3) + "\n\n");




        //5-6
        System.out.println("5-6번문제");
        int[] coinUnit = {500, 100, 50, 10};
        int[] numOfCoin = new int[coinUnit.length];
        int[] numOfCoin_Remainder = new int[coinUnit.length];

        int money = 2680;
        System.out.println("가지고 있는 money는 " + money + "원");

        for(int i=0; i<coinUnit.length; i++)
        {
            numOfCoin[i] = money / coinUnit[i];
            numOfCoin_Remainder[i] = money % coinUnit[i];
            System.out.println(numOfCoin[i] + "개");

            money = numOfCoin_Remainder[i];
        }
        System.out.println("필요합니다");
        if (numOfCoin_Remainder[numOfCoin_Remainder.length-1] !=0 && numOfCoin_Remainder[numOfCoin_Remainder.length-1] <10)
        {
            System.out.println("바꾸지 못하는 남은 돈은 " + numOfCoin_Remainder[numOfCoin_Remainder.length-1] + "원 입니다");
            //break;
        }
        System.out.println("\n\n");
    }
}

            /*
            2680 / 500 => 5개
                2680%500 = 108
                        if !0?
                180/100 = 1 =>1개
                180%100 = 80
                        if !0?
                80/50 => 1개
                80%50 = 30
                        if !0?
                30/10 => 3개
                0%10 = 0
                        %10 if 0? =>종료
                        */

//////////////////////////////////////////////////////////////////////////////

