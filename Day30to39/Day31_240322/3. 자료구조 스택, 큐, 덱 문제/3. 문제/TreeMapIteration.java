import java.util.TreeMap;
import java.util.Iterator;
import java.util.Set;

class TreeMapIteration {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        
        // Key-Value 기반 데이터 저장
        map.put(45, "Brown");
        map.put(37, "James");
        map.put(23, "Martin");

        // Key만 담고 있는 컬렉션 인스턴스 생성
        Set<Integer> ks = map.keySet();

        // 전체 Key 출력 (for-each문 기반)
        for(Integer n : ks)
            System.out.print(n.toString() + '\t');
        System.out.println();

        // 전체 Value 출력 (for-each문 기반)
        for(Integer n : ks)
            System.out.print(map.get(n).toString() + '\t');
        System.out.println();

        // 전체 Value 출력 (반복자 기반)
        for(Iterator<Integer> itr = ks.iterator(); itr.hasNext(); )
            System.out.print(map.get(itr.next()) + '\t');
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