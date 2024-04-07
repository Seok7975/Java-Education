//TreeSet으로 Lotto 한 세트를 만들어 출력하는 프로그램.
//
//실행결과
//[1, 7, 12, 25, 34, 45]

import java.util.TreeSet;

class Lotto_SortTreeSet
{
    public static void main(String[] args)
    {
        TreeSet<Integer> sTree = new TreeSet<Integer>();

        while(sTree.size() < 6)
        {
            int num = (int) (Math.random()*45) + 1;  // 1<=   <46
            sTree.add(num);
        }
        System.out.println(sTree);

    }
}
