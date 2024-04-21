//Test30_4
//TreeSet으로 Lotto 한 세트를 만들어 출력하는 프로그램.
//
//실행결과
//[1, 7, 12, 25, 34, 45]

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

//이건 그냥 ArrayList로 한번 만들어봄, ArrayList 2차배열 활용 알아두자
class Test30_4_LottoMakeByArrayList
{
    public static void main(String[] args)
    {
        ArrayList<Integer>[] set = new ArrayList[5];

        for(int j=0; j<5; j++)
        {
            set[j] = new ArrayList<Integer>();
            while(set[j].size()<6)
            {
                int num1 = (int)(Math.random()*45) + 1;
                set[j].add(num1);

            }
            System.out.println(set[j]);
            ;//set.clear();
        }
        System.out.println("\n\n");
        Test30_4_LottoMakeByTreeSet.TreeSet();
    }
}

class Test30_4_LottoMakeByTreeSet
{
    public static void TreeSet() 
    {
        //Set ArrayList를 만듬
        Set<Integer> set = new TreeSet<Integer>();

        while (set.size() < 6)
        {
            int num1 = (int) (Math.random() * 45) + 1;
            set.add(num1);

        }
        System.out.println(set);
    }
}
