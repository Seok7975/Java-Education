import java.util.Iterator;
import java.util.LinkedList;

class PrimitiveCollection {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        // 저장 과정에서 오토 박싱
        list.add(10);	
	list.add(20);		
	list.add(30);	
    
        int n;
        for(Iterator<Integer> itr = list.iterator(); itr.hasNext(); ) {
            n = itr.next();    // 오토 언박싱
            System.out.print(n + "\t");
        }

        System.out.println();
    }
}
// 실행결과
/*
10	20	30	
*/
// 기본 자료형 데이터의 저장과 참조
/*
	컬렉션 인스턴스도 기본 자료형의 값은 저장하지 못한다. 그러나 래퍼 클래스의 도움으로 이들 값의
	저장 및 참조가 가능하며, 이 과정에서 오토 박싱과 오토 언박싱으로 인해 자연스러운 코드의 구성이
	가능하다.
*/