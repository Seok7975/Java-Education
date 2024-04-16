import java.util.Iterator;
import java.util.HashSet;
import java.util.Set;

class SetCollectionFeature {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Toy");
	set.add("Box");
	set.add("Robot");
	set.add("Box");
        
        System.out.println("인스턴스 수: " + set.size());
		
        for(Iterator<String> itr = set.iterator(); itr.hasNext(); )
            System.out.print(itr.next() + '\t');
        System.out.println();

        for(String s : set)
            System.out.print(s + '\t');
        System.out.println();
    }
}

// 실행결과
/*
인스턴스 수: 3
Box	Robot	Toy	
Box	Robot	Toy	
*/
/*
	Set<E>를 구현하는 클래스의 특성과 HashSet<E> 클래스
	Set<E> 인터페이스를 구현하는 제네릭 클래스의 특성
	* 저장 순서가 유지되지 않는다.
	* 데이터의 중복 저장을 허용하지 않는다.

	그리고 이는 Set 이라는 이름처럼 수학에서 말하는 '집합'의 특성이다.
*/