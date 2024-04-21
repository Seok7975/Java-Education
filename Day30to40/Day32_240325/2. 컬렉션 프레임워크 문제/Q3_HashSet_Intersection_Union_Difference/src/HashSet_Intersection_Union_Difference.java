//3. HashSet 객체를 두 개를 만들고, 하나에는 1, 2, 3, 4, 5를 넣고
//다른 하나에는 4, 5, 6, 7, 8을 넣자.
//그리고 두 개의 합 집합, 교집합, 차집합을 구해서 출력하자.


import java.util.HashSet;
import java.util.Set;

class HashSet_Intersection
{
    public static void main(String[] args)
    {
        Set<Integer> set1 = new HashSet<>(5);
        for(int i=0; i<5; i++)
        {
            set1.add(i+1);
        }

        Set<Integer> set2 = new HashSet<>();
        for(int i=4; i<9; i++)
        {
            set2.add(i);
        }

        //합집합
        System.out.println("합집합");
        Set<Integer> union = new HashSet<>(set1);
        for(int num : set2)
        {
            union.add(num);
        }
        System.out.println(union + "\n");

        System.out.println("교집합");
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        //* boolean : list.retainAll(Collection c)
        //ArrayList에 저장된 객체 중에서 주어진 컬렉션과 공통된 것들만 남기고 제거한다.(removeAll 반대 버전)
        System.out.println(intersection+ "\n");
        //System.out.println(intersection.retainAll(set2)+ "\n");

        System.out.println("차집합");
        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        //* boolean : list.removeAll(Collection c)
        //지정한 컬렉션에 저장된 것과 동일한 객체들을 ArrayList에서 제거한다.
        System.out.println(difference+ "\n");
    }
}