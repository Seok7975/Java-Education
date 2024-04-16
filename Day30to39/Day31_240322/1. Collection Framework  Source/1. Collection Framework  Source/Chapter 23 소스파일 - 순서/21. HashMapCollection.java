import java.util.HashMap;

class HashMapCollection {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        
        // Key-Value 기반 데이터 저장
        map.put(45, "Brown");
        map.put(37, "James");
        map.put(23, "Martin");


        // 데이터 탐색
        System.out.println("23번: " + map.get(23));
        System.out.println("37번: " + map.get(37));
        System.out.println("45번: " + map.get(45));
        System.out.println();

        // 데이터 삭제
        map.remove(37);

        // 데이터 삭제 확인
        System.out.println("37번: " + map.get(37));
    }
}

/*
실행 결과

23번: Martin
37번: James
45번: Brown

37번: null
*/

/*
Map<K, V>를 구현하는 컬렉션 클래스의 인스턴스들은 Key와 Value가 한 쌍을
이루는 형태로 데이터를 저장한다.

Key-Value 방식의 데이터 저장과 HashMap<K, V> 클래스
캐비닛에 서류철을 보관할 때 해당 서류철을 쉽게 찾을 수 있도록 서류철의
특정 위치에 서류의 정보나 이름을 써넣는다. 그리고 이것이 Key와
Value가 하나의 쌍을 이루는 데이터 저장 방식이다. Key는 실질적 데이터가
아니다. 대신 데이터 Value를 찾는 지표가 된다.
Collection<E>를 구현하는 클래스가 Value를 저장하는 구조였다면,
Map<K, V>를 구현하는 클래스는 Value를 저장할 때, 이를 찾을 때 사용하는
Key를 함께 저장하는 구조이다. 때문에 Key는 중복될 수 없다. 반면 
Key만 다르다면 Value는 중복이 되어도 상관없다.

"Key는 지표이므로 중복될 수 없다. 반면 Key만 다르면 Value는 
중복되어도 상관없다."

Map<K, V>를 구현하는 대표 클래스로 HashMap<K, V>와 TreeMap<K, V>가
있다. 둘의 가장 큰 차이점은, 트리 자료구조를 기반으로 구현된 TreeMap<K, V>
은 정렬 상태를 유지한다는데 있다. 물론 정렬의 대상은 Value가 아니라
Key이다.
 */