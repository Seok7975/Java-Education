import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

class HashMapIteration {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        
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
37	23	45	
James	Martin	Brown	
James	Martin	Brown	
*/

/*
HashMap<K, V> 클래스는 Iterable<T> 인터페이스를 구현하지 않으니 for-each문을 통해서,
혹은 '반복자'를 얻어서 순차적 접근을 진행할 수 없다. 대신에 Map<K, V>에는 다음 메소드가
존재한다.

public Set<K> keySet()

이 메소드는 Set<E>를 구현하는 컬렉션 인스턴스를 생성하고, 여기에 모든 Key를 담아서
반환한다. 따라서 이 메소드를 통해서 다음 예제와 같이 모든 Key를 따로 모으고, 이를
통한 순차적 접근을 진행할 수 있다.

Set<Integer> ks = map.keySet();

Set<E>은 Iterable<E>을 상속하므로 예제에서 보이듯이 위의 문장 실행 이후에 for-each문을
통해서, 또는 반복자를 얻어서 순차적 접근을 진행할 수 있다.
*/