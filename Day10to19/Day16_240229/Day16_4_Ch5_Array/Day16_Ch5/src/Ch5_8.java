/*다음은 배열 에 담긴 데이터를 읽고 각 숫자의 개수를 세어서 개수만큼 answer ‘*’
을 찍어서 그래프를 그리는 프로그램이다 에 알맞은 코드를 넣어서 완성하시오 . (1)~(2) .*/


class Ch5_8
{

        public static void main(String[] args)
        {
            int[] answer = { 1,4,4,3,1,4,4,2,1,3,2 };
            int[] counter = new int[4];

            /*
            1 : 3 ***
            2 : 2 **
            3 : 2 **
            4 : 4 ****
            */

            for(int i=0; i < answer.length;i++)
            {
                counter[answer[i]-1]++;
            }
            for(int i=0; i < counter.length;i++)
            {
                System.out.print(i+1);
                for(int j=0; j<counter[i]; j++)
                {
                    System.out.print("*");
                }
                System.out.print("\n");
            }
        } // end of main
    // end of class
}
