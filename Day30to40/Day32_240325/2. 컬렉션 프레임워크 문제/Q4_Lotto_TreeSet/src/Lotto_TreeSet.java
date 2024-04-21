//4. TreeSet을 이용하여 로또 번호 만들기.

import java.util.TreeSet;

class Lotto_TreeSet
{
    public static void main(String[] args)
    {
        TreeSet<Integer> lotto = new TreeSet<Integer>();

        //TreeSet은 중복시 허용도 안하고 추가도 안하기 때문에 일반 반복문으로
        //하면 사이즈가 6으로 맞춰 나오지 않을 수 있다.
        //따라서 무한반복문으로 사이즈가 6이 될때까지 돌린다
        while(lotto.size()<6)
        {
            lotto.add((int)(Math.random()*45)+1);
        }
        System.out.println(lotto);
/*        for(int i=0; i<6; i++)
        {
            lotto.add((int)(Math.random()*45)+1);
        }
        System.out.println(lotto);*/
    }
}