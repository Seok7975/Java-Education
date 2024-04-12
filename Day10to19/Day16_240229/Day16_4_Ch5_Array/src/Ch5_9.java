class Ch5_9
{
    public static void main(String[] args)
    {
        char[][] star = {
                {'*','*',' ',' ',' '},
                {'*','*',' ',' ',' '},
                {'*','*','*','*','*'},
                {'*','*','*','*','*'}};

        char[][] result = new char[star[0].length][star.length];
        for(int i=0; i < star.length;i++) //star배열 출력
        {
            for(int j=0; j < star[i].length;j++)
            {
                System.out.print(star[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0; i < star.length;i++)
        {
            for(int j=0; j < star[i].length;j++)
            {
                int x = j;
                int y = (star.length-1)-i;
                result[x][y] = star[i][j];
                //result[i][j] = star[j][3-i];  X. 이 반복문에선 star의 기준으로 i j가 돌아가므로 result에 i,j를 쓸수없다
                result[j][3-i] = star[i][j];
            }
        }
        for(int i=0; i < result.length;i++)
        {
            for(int j=0; j < result[i].length;j++)
            {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
    } // end of main
} // end of class




