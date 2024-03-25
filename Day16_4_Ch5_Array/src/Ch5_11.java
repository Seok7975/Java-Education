class Ch5_11
{
    public static void main(String[] args)
    {
        int[][] score = {
                {100, 100, 100}
                , {20, 20, 20}
                , {30, 30, 30}
                , {40, 40, 40}
                , {50, 50, 50}};
        int[][] result = new int[score.length+1][score[0].length+1]; // [6][4]
        for(int i=0; i < score.length;i++) //(0; 5; i++)
        {
            for(int j=0; j < score[i].length;j++) //(0; 3; j++)
            {
                result[i][j] = score[i][j];
                result[i][score[i].length] += result[i][j];
                result[score.length][j] += result[i][j];
                result[score.length][score[0].length] += result[i][j];

            }
        }
        for(int i=0; i < result.length;i++)
        {
            for(int j=0; j < result[i].length;j++)
            {
                System.out.printf("%4d",result[i][j]);
            }
            System.out.println();
        }
    } // main
}

/*
        100 100 100 300
        20  20  20  60
        30  30  30  90
        40  40  40  120
        50  50  50  150
        240 240 240 720

*/