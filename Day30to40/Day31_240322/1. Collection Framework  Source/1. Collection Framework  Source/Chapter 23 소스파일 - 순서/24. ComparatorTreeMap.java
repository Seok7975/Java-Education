import java.util.TreeMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Comparator;

class AgeComparator implements Comparator<Integer> {
    public int compare(Integer n1, Integer n2) {
        return n2.intValue() - n1.intValue(); 
    }
}

class ComparatorTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>(new AgeComparator());
        
        // Key-Value 기반 데이터 저장
        map.put(45, "Brown");
        map.put(37, "James");
        map.put(23, "Martin");

        // Key만 담고 있는 컬렉션 인스턴스 생성
        Set<Integer> ks = map.keySet();

        // 전체 Key 출력 (for-each문 기반)
        for(Integer n : ks)	//n : 45 -> 37-> 23
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
45	37	23	
Brown	James	Martin	
Brown	James	Martin	
*/

/*
TreeMap<Integer, String> map = new TreeMap<>(new AgeComparator());

그리고 AgeComparator 클래스가 Comparator<T>를 구현하면서 T를 Integer로 결정한
이유는 정렬 대상인 Key가 Integer이기 때문이다.
*/