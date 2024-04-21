//2.
//HashSet과 LinkedHashSet을 이용하여 5 * 5 빙고를 만들어 출력하자.
//번호는 1이상 50이하로 하자.(HashSet으로 한번, LinkedHashSet으로 한번)

import java.util.*;

//2_1 HashSet
class Bingo_HashSet
{
    public static void main(String[] args)
    {
        System.out.println("HashSet 이용");
        Set<Integer> set_HashSet = new HashSet<>();
        while(set_HashSet.size()<25)
        {
            set_HashSet.add((int)(Math.random()*50)+1);
        }
        Iterator<Integer> itr_HashSet = set_HashSet.iterator();

        int i=0;
        while(itr_HashSet.hasNext())
        {
            System.out.print(itr_HashSet.next() + "\t");
            i++;
            if(i%5==0)
            {
                System.out.println();
                i=0;
            }
        }
        System.out.print("\n\n");

        System.out.println("LinkedHashSet 이용");
        Set<Integer> set_LinkedHashSet = new LinkedHashSet<>();
        while(set_LinkedHashSet.size()<25)
        {
            set_LinkedHashSet.add((int)(Math.random()*50)+1);
        }
        Iterator<Integer> itr_LinkedHashSet = set_LinkedHashSet.iterator();

        i=0;
        while(itr_LinkedHashSet.hasNext())
        {
            System.out.print(itr_LinkedHashSet.next() + "\t");
            i++;
            if(i%5==0)
            {
                System.out.println();
                i=0;
            }
        }
        //iterator는 ArrayList, HashSet과 같은 컬렉션을 반복하는 데 사용할 수 있는 객체다.
        //iterator는 반복의 기술 용어기 때문에 반복자라고 한다
        
        
        //HashSet<Integer> bingoBoard = new HashSet<Integer>(5);
        //제네릭 배열을 사용하여 HashSet을 직접 생성하는 것은 Java에서 지원X
        //따라서 ArrayList를 사용해야함

/*        for(int i : bingoBoard) //HashSet이 비어있으면 반복문이 실행되지않음
            bingoBoard.add((int)(Math.random()*50)+1);
        System.out.print(bingoBoard);*/


        /*
        for (int i=0; i< bingoBoard.size(); i++) ////HashSet이 비어있으면 반복문이 실행되지않음
        {
            bingoBoard.add((int)(Math.random()*50)+1);
        }
        System.out.print(bingoBoard);
        */



/*        List<List<HashSet<Integer>>> bingoBoard = new ArrayList<>(5);

        for(int i=0; i<5; i++)
        {
            List<HashSet<Integer>> row = new ArrayList<>();
            for(int j=0; j<5; j++)
            {
                HashSet<Integer> set = new HashSet<>();
            }
        }

        while (bingoBoard.size() < 5)
        {
            bingoBoard.add((int)(Math.random()*50) + 1);
        }

        System.out.println(bingoBoard);*/

    }
}















//HashSet
//
//- null 입력은 가능하지만 한 번만 저장 가능하고 중복될 수 없습니다.
//
//- 객체(데이터)를 중복 저장할 수 없고, 순서를 보장하지 않습니다.
//
//- 내부적으로 HashMap을 사용합니다.
//
//
//
//TreeSet
//
//- null 입력은 가능하지만 한 번만 저장 가능하고 중복될 수 없습니다.
//
//- 객체(데이터)를 중복 저장할 수 없지만 오름차순으로 데이터를 정렬합니다.
//
//- 내부적으로 TreeMap을 사용합니다.
//
//
//
//LinkedHashSet
//
//- null 입력은 가능하지만 한 번만 저장 가능하고 중복될 수 없습니다.
//
//- 객체(데이터)를 중복 저장할 수 없지만 입력한 순서대로 데이터를 정렬합니다.
//
//- 내부적으로 LinkedHashMap을 사용합니다.