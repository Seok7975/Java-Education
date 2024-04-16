//1. "Box", "Toy", "Box", "Toy"로 초기화 된 리스트를 만들고, 중복된 요소를 제거하시오. //Hashset
//

import java.util.*;

class TreeMapIteration {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        List<String> lst = Arrays.asList("Box", "Toy", "Box", "Toy");
        ArrayList<String> list = new ArrayList<>(lst);

        for (String s : list)
            System.out.print(s.toString() + '\t');
        System.out.println();

        HashSet<String> set = new HashSet<>(list);
        list = new ArrayList<>(set);

        for (String s : list)
            System.out.print(s.toString() + '\t');
        System.out.println();
    }
}

/*
실행 결과
23	37	45
Martin	James	Brown
Martin	James	Brown
*/

/*
HashSet<E>이 해쉬 알고리즘을 기반으로 구현되어 있듯이, HashMap<K, V> 역시 해쉬
알고리즘을 기반으로 구현되어 있다. 그리고 TreeSet<E>이 트리 자료구조를 기반으로
구현되어 있어서 정렬 상태를 유지하듯이 TreeMap<K, V> 역시 트리 자료구조를 기반으로
구현되어 있어서 정렬 상태를 유지한다.

위의 실행 결과에서는 Key에 해당하는 나이 정보가 오름차순으로 출력되었다. 이렇듯
대상 컬렉션 인스턴스에 따라서 반환되는 반복자의 성격은 달라진다. TreeMap<K, V>
인스턴스에서 반환된 반복자는 오름차순으로 Key에 접근한다.
*/