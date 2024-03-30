import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Arrangement_3
{
    public static void main(String[] args)
    {


        byte[][] shipBoard = {
                //  1  2  3  4  5  6  7  8  9
                  { 0, 0, 0, 0, 0, 0, 1, 0, 0 }, // 1
                  { 1, 1, 1, 1, 0, 0, 1, 0, 0 }, // 2
                  { 0, 0, 0, 0, 0, 0, 1, 0, 0 }, // 3
                  { 0, 0, 0, 0, 0, 0, 1, 0, 0 }, // 4
                  { 0, 0, 0, 0, 0, 0, 0, 0, 0 }, // 5
                  { 1, 1, 0, 1, 0, 0, 0, 0, 0 }, // 6
                  { 0, 0, 0, 1, 0, 0, 0, 0, 0 }, // 7
                  { 0, 0, 0, 1, 0, 0, 0, 0, 0 }, // 8
                  { 0, 0, 0, 0, 0, 1, 1, 1, 0 }, // 9
                  };
        int shipBoard_1_Count =0; // 1 찾는 카운트
/*        int shipBoard_1_Count =0;
        String[] ne = new String [shipBoard.length];
        for(int i=0; i<shipBoard.length; i++)
        {
            System.out.println(Arrays.toString(shipBoard[i]));
            ne[i] = Arrays.toString(shipBoard[i]);
            shipBoard_1_Count += Collections.frequency(Arrays.asList(ne), 1);
            System.out.println(shipBoard_1_Count);
        }

        System.out.println(shipBoard_1_Count);*/
        for (int i=0; i< shipBoard.length; i++)
        {
            for(int j=0; j<shipBoard[i].length; j++)
            {
                if(shipBoard[i][j]==1)
                {
                    shipBoard_1_Count++;
                }
            }
        }
        System.out.println(shipBoard_1_Count);

        char[][] result = new char[9][9];
/*                {
                        //  1  2  3  4  5  6  7  8  9
                        { 0, 0, 0, 0, 0, 0, 0, 0, 0 }, // 1
                        { 0, 0, 0, 0, 0, 0, 0, 0, 0 }, // 2
                        { 0, 0, 0, 0, 0, 0, 0, 0, 0 }, // 3
                        { 0, 0, 0, 0, 0, 0, 0, 0, 0 }, // 4
                        { 0, 0, 0, 0, 0, 0, 0, 0, 0 }, // 5
                        { 0, 0, 0, 0, 0, 0, 0, 0, 0 }, // 6
                        { 0, 0, 0, 0, 0, 0, 0, 0, 0 }, // 7
                        { 0, 0, 0, 0, 0, 0, 0, 0, 0 }, // 8
                        { 0, 0, 0, 0, 0, 0, 0, 0, 0 }, // 9
                };
        */
        //boolean flag = true; //무한루프 멈추기용

        while(true)
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("좌표를 입력하세요. (종료는 00)>");
            String xyPos = sc.nextLine();  //12

            if(xyPos.length()<2 || xyPos.length()>2)  //잘못입력 case1
            {
                System.out.println("잘못 입력했습니다. 다시 입력해주세요");
                continue;
            }

            int xPos = xyPos.charAt(0) -'0'; // x값 //1
            //System.out.print(xPos +""+ (int)xPos); 디버그용
            int yPos = xyPos.charAt(1) -'0';// y값  //2

            if(xyPos.length()>3) //잘못입력 case2
            {
                System.out.println("잘못 입력했습니다. 다시 입력해주세요");
                continue;
            }

            if(xPos==0 && yPos==0) //종료
            {
                System.out.println("종료하겠습니다");
                break;
            }

            if(xPos==0) //잘못입력 case3
            {
                System.out.println("잘못 입력했습니다. 다시 입력해주세요");
                continue;
            }
            if(yPos==0) //잘못입력 case4
            {
                System.out.println("잘못 입력했습니다. 다시 입력해주세요");
                continue;
            }


            if (shipBoard[xPos-1][yPos-1] == 0)
            {
                result[xPos-1][yPos-1] = 'X';
            }

            if(shipBoard[xPos-1][yPos-1] == 1 )
            {
                result[xPos-1][yPos-1] = 'O';
                shipBoard_1_Count--;
            }
            for(int i=0; i<9; i++)
            {
                System.out.println(Arrays.toString(result[i]));
            }

            if(shipBoard_1_Count==0)
            {
                System.out.println("모두 찾으셨습니다! 종료합니다!");
                break;
            }
            System.out.println(shipBoard_1_Count);

        }
    }
}
