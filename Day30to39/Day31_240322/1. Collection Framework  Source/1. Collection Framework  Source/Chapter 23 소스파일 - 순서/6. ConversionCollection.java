import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.Arrays;

class ConversionCollection {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Toy", "Box", "Robot", "Box");
        list = new ArrayList<>(list);

        // ArrayList<E> 인스턴스의 순환
        for(Iterator<String> itr = list.iterator(); itr.hasNext(); )
            System.out.print(itr.next() + '\t');
        System.out.println();

        // ArrayList<E>를 LinkedList<E>로 변환
        list = new LinkedList<>(list);

        // LinkedList<E> 인스턴스의 순환
        for(Iterator<String> itr = list.iterator(); itr.hasNext(); )
            System.out.print(itr.next() + '\t');
        System.out.println();
    }
}

// 실행결과
/*
Toy	Box	Robot	Box	
Toy	Box	Robot	Box	
*/

/*
	대다수 컬렉션 클래스들은 다른 컬렉션 인스턴스를 인자로 전달받는 생성자를 가지고 있어서,
	다른 컬렉션 인스턴스에 저장된 데이터를 복사해서 새로운 컬렉션 인스턴스를 생성할 수 있다.

	public ArrayList(Collection<? extends E> c)	// ArrayList<E> 생성자 중 하나
		-> 인자로 전달된 컬렉션 인스턴스로부터 ArrayList<E> 인스턴스 생성

	public LinkedList(Collection<? extends E> c)	// LinkedList<E> 생성자 중 하나
		-> 인자로 전달된 인스턴스로부터 LinkedList<E> 인스턴스 생성

	public HashSet(Collection<? extends E> c)	// HashSet<E> 생성자 중 하나
		-> 인자로 전달된 인스턴스로부터 HashSet<E> 인스턴스 생성

	따라서 ArrayList<E> 인스턴스를 사용하다가 연결 리스트 자료구조의 특성이 필요하면 
	이를 기반으로 LinkedList<E> 인스턴스를 생성하면 된다.
*/