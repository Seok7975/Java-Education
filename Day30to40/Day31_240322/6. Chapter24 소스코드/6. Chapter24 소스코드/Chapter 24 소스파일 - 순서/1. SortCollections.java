import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

class SortCollections {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Toy", "Box", "Robot", "Weapon");
        list = new ArrayList<>(list);

        // 정렬 이전 출력       
        for(Iterator<String> itr = list.iterator(); itr.hasNext(); )
            System.out.print(itr.next() + '\t');
        System.out.println();

        // 정렬
        Collections.sort(list);        

        // 정렬 이후 출력
        for(Iterator<String> itr = list.iterator(); itr.hasNext(); )
            System.out.print(itr.next() + '\t');
        System.out.println();
    }
}

/*
Toy	Box	Robot	Weapon	
Box	Robot	Toy	Weapon	
*/

/*
정렬
List<E>를 구현한 컬렉션 클래스들은 저장된 인스턴스를 정렬된 상태로 유지하지 않는다. 대신에
정렬을 해야 한다면 다음 메소드를 사용할 수 있다.

public static <T extends Comparable<T>> void sort(List<T> list)

위의 메소드는 Collections 클래스에 정의되어 있는 제네릭 메소드이다.

public static <T> void sort(List<T> list)
	-> 메소드 호출 시점에 T가 결정되므로 List<T>의 인스턴스는 모두 전달 가능
	
public static <T extends Comparable<T>> void sort(List<T> list)
	-> 그런데 그 T는 Comparable<T> 인터페이스를 구현한 상태이어야 한다.
	
마지막으로 이렇게 두 단계를 거쳐서 이해한 내용을 다음과 같이 하나로 정리하자.

public static <T extends Comparable<T>> void sort(List<T> list)
	-> 인자로 List<T>의 인스턴스는 모두 전달 가능
	-> 단, T는 Comparable<T> 인터페이스를 구현한 상태이어야 한다.
	
이렇게 이해하고 나면 다음과 같이 Comparable<String>을 구현한다. 따라서
위에서 보이듯이 List<String> 인스턴스는 sort 메소드의 인자로 전달이 될 수 있다.

public final class String extends Object implements Comparable<String>

String 클래스의 compareTo 메소드는 사전 편찬 순으로(lexicographically) 정렬되도록
구현되어 있다.
*/