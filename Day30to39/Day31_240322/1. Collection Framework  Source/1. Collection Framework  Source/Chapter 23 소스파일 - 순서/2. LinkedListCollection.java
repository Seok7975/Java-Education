import java.util.List;
import java.util.LinkedList;

class LinkedListCollection {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
	// ArrayListCollection.java와 비교해서 유일한 변화
        
        // 인스턴스 저장 
        list.add("Toy");
        list.add("Box");
        list.add("Robot");
	
        // 인스턴스 참조
        for(int i = 0; i < list.size(); i++)
            System.out.print(list.get(i) + '\t');
        System.out.println();
		
        // 첫 번째 인스턴스 삭제
        list.remove(0);
   
        // 삭제 후 인스턴스 참조
        for(int i = 0; i < list.size(); i++)
            System.out.print(list.get(i) + '\t');
        System.out.println();
    }
}

// 실행결과
/*
Toy	Box	Robot	
Box	Robot	
*/

/*
* ArrayList<E>의 단점
- 저장 공간을 늘리는 과정에서 시간이 비교적 많이 소요된다.
- 인스턴스의 삭제 과정에서 많은 연산이 필요할 수 있다. 따라서 느릴 수 있다.

* ArrayList<E>의 장점
	- 저장된 인스턴스의 참조가 빠르다.

* LinkedList<E>의 단점
	- 저장된 인스턴스의 참조 과정이 배열에 비해 복잡하다. 따라서 느릴 수 있다.

* LinkedList<E>의 장점
- 저장 공간을 늘리는 과정이 간단하다.
- 저장된 인스턴스의 삭제 과정이 단순하다.
*/