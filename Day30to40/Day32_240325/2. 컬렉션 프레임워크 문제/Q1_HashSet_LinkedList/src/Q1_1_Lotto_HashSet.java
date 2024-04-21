//1. HashSet과 LinkedList를 이용하여 로또번호 만들기.(정렬하여 출력)

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

class Lotto_HashSet
{
    public static void main(String[] args)
    {
        //HashSet 이용
        System.out.println("HashSet 이용");
        HashSet<Integer> lotto = new HashSet<>();

        while(lotto.size()<6)
        {
            int num = (int)(Math.random()*45)+1;
            lotto.add(num);
        }
        System.out.println(lotto + "\n");

        ////////////////////////////////////////
        //LinkedList 이용
        System.out.println("LinkedList 이용");
        LinkedList<Integer> lottoList = new LinkedList<Integer>(lotto);
        Collections.sort(lottoList); //오름차순 정렬
        System.out.println(lottoList);
    }
}