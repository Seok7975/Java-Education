class Arrangement_2
{
    public static void main(String[] args)
    {
        int[][] source =
                        {{100, 100, 100}
                        , {20, 20, 20}
                        , {30, 30, 30}
                        , {40, 40, 40}
                        , {50, 50, 50}};
        int sum = 0;
        int korSum = 0;
        int engSum = 0;
        int mathSum = 0;
        float avg = 0;
        System.out.println("번호   국어    영어     수학     총점    평균");
        System.out.println("=========================================");
        for(int i=0; i<5; i++)
        {
            System.out.printf("%3d\t", i + 1);
            for (int j = 0; j < 3; j++)
            {
                sum += source[i][j];
                System.out.printf("%5d\t", source[i][j]);
            }
            avg = sum/3.0f;
            System.out.printf("%5d\t%5.1f", sum, avg); // 평균을 오른쪽정렬 어케하지?
            System.out.println();
            sum = 0;

            korSum += source[i][0];
            engSum += source[i][1];
            mathSum += source[i][2];
        }
        System.out.println("=========================================");
        System.out.printf("총점:  %d     %d     %d", korSum, engSum, mathSum);
    }
}
