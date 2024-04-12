import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

class Ch5_7
{
    public static void main(String[] args)
    {
/*        if(args.length != 1)
        {
            System.out.println("USAGE : java Exercise5_7 3120");
            System.exit(0);

        }*/

        Scanner sc = new Scanner(System.in);
        System.out.println("얼마를 바꾸겠습니까?");
        String getMoney = sc.nextLine();

        int money = Integer.parseInt(getMoney); // 문자열을 숫자로 반환
        System.out.println("money = " + money + "원");

        int[] coinUnit = {500, 100, 50, 10}; // 동전의 단위
        int[] coin = {5, 5, 5, 5}; // 단위별 동전 갯수
        int[] numOfCoin = new int[coinUnit.length];
        int[] numOfCoin_Remainder = new int[coinUnit.length];

        for(int i=0 ; i<coinUnit.length; i++)
        {
            //int coinNum = 0;
            /* (1) . 아래의 로직에 맞게 코드를 작성하시오
                1. (money) (coinNum) . 금액 을 동전단위로 나눠서 필요한 동전의 개수 를 구한다
                2. coin coinNum . 배열 에서 만큼의 동전을 뺀다
                ( coin .) 만일 충분한 동전이 없다면 배열 에 있는 만큼만 뺀다
                3. (coinNum) . 금액에서 동전의 개수 와 동전단위를 곱한 값을 뺀다
            */
            //coinNum = money/coinUnit[i];
            numOfCoin[i] = money / coinUnit[i];

            if (coin[i] > numOfCoin[i])
            {
                coin[i] -= numOfCoin[i];
            }

            else
            {
                numOfCoin[i] = coin[i];
                coin[i] = 0;
            }
            money -= numOfCoin[i]*coinUnit[i];  //이 부분이 다르다!!! 나머지가 다음 머니가 되는게 아님
            System.out.println(coinUnit[i]+ "원 동전 " + numOfCoin[i] + "개");

            numOfCoin_Remainder[i] = money ;  //이 부분이 다르다!!! 단순히 나머지만으로 하는게 아님
        }
        if(numOfCoin_Remainder[numOfCoin_Remainder.length-1] ==0)
        {
            System.out.println("필요합니다");
        }

        if (numOfCoin_Remainder[numOfCoin_Remainder.length-1] !=0 && numOfCoin_Remainder[numOfCoin_Remainder.length-1] <10)
        {
            System.out.println("필요합니다");
            System.out.println("바꾸지 못하는 남은 돈은 " + numOfCoin_Remainder[numOfCoin_Remainder.length-1] + "원 입니다");
            //break;
        }

        if (numOfCoin_Remainder[numOfCoin_Remainder.length-1] > 10)
        {
            System.out.println("거스를 돈이 더 필요합니다");
        }
        System.out.println("\n\n");
    }
}

