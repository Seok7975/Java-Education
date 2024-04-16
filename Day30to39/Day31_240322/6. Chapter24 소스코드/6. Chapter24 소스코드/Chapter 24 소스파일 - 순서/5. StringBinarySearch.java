import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class StringBinarySearch {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Box");
        list.add("Robot");
        list.add("Apple");

        // 정렬
        Collections.sort(list);        

        // 탐색
        int idx = Collections.binarySearch(list, "Robot");
 
        // 탐색 결과 출력
        System.out.println(list.get(idx));
    }
}

/*
실행 결과
Robot
*/

/*
	public static <T> int binarySearch(List<? extends Comparable<? super T>> list, T key)
		-> list에서 key를 찾아 그 인덱스 값 반환, 못 찾으면 음의 정수 반환
		
	binarySearch 메소드
	이 메소드는 이진 탐색이라는 알고리즘을 기반으로 탐색을 진행한다. 그런데 이 
	알고리즘을 적용하기 위해서는 해당 컬렉션 인스턴스가 정렬된 상태이어야 한다.
	이진 탐색은 정렬된 리스트 자료구조를 대상으로 적용하는 알고리즘이기 때문이다.
	
	List<String> 인스턴스는 정렬된 상태를 유지하지 않으므로 위와 같이 정렬을 먼저 
	진행해야 한다. 만약에 정렬되지 않은 상태에서 binarySearch 메소드를 호출하면
	정상적인 결과를 얻지 못한다. 혹 정상적인 결과를 얻는다 해도 이는 우연의 일치일
	뿐이다.
*/