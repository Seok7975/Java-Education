import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Arrays;


//Iterator는 단방향 순회만 가능, 이전의 요소 가져오거나 수정 불가
//ListIterator는 이전의 요소도 가져오거나 수정할 수 있다

class ListIteratorCollection {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Toy", "Box", "Robot", "Box");
        list = new ArrayList<>(list);
       
        ListIterator<String> litr = list.listIterator();
        String str; 

        // 왼쪽에서 오른쪽으로 
        while(litr.hasNext()) {
            str = litr.next();
            System.out.print(str + '\t');

            if(str.equals("Toy"))
                litr.add("Toy2");
        }
        System.out.println();
        //Toy	Box	Robot	Box	
        // 오른쪽에서 왼쪽으로

        while(litr.hasPrevious()) {
            str = litr.previous();
            System.out.print(str + '\t');

            if(str.equals("Robot"))
                litr.add("Robot2");
        }
        System.out.println();
	// Box	Robot	Robot2	Box	Toy2	Toy	

        // 다시 왼쪽에서 오른쪽으로
        for(Iterator<String> itr = list.iterator(); itr.hasNext(); )
            System.out.print(itr.next() + '\t');
        System.out.println();
	// Toy	Toy2	Box	Robot2	Robot	Box
    }
}

// 실행결과
/*
Toy	Box	Robot	Box	
Box	Robot	Robot2	Box	Toy2	Toy	
Toy	Toy2	Box	Robot2	Robot	Box	
*/

/*
	연결 리스트만 갖는 양방향 반복자
	Collection<E>를 구현하는 클래스의 인스턴스는 iterator 메소드의 호출을 통해서 '반복자'를 얻을
	수 있다. 그런데 List<E>를 구현하는 클래스의 인스턴스들만 얻을 수 있는 '양방향 반복자'라는 것이
	있는데, 이는 List<E>의 다음 메소드 호출을 통해서 얻을 수 있다.

	public ListIterator<E> listIterator()
		-> ListIterator<E>는 Iterator<E>을 상속한다.

	위의 메소드가 반환하는 반복자는 양쪽 방향으로 이동이 가능하다는 특징이 있는데, 이는 배열이나 연
	결 리스트와 같은 자료구조의 특성상 가능한 일이다. 그리고 위 메소드가 반환하는 반복자를 대상으로
	호출할 수 있는 대표 메소드들은 다음과 같다.

	E next()			다음 인스턴스의 참조 값을 반환
	boolean hasNext()		next 메소드 호출 시 참조 값 반환 가능 여부 확인
	void remove()		next 메소드 호출을 통해 반환했던 인스턴스를 삭제

	E previous()		next 메소드와 기능은 같고 방향만 반대
	boolean hasPrevious()	hasNext 메소드와 기능은 같고 방향만 반대

	void add(E e)		인스턴스의 추가
	void set(E e)		인스턴스의 변경

	ListIterator<E>는 Iterator<E>를 상속한다.
	
	실행 결과를 통해서 add 메소드가 어느 위치에 인스턴스를 추가하는지 확인할 수 있다. 즉 이를 통해
	다음 사실을 알 수 있다.

	"next 호출 후에 add 호출하면, 앞서 반환된 인스턴스 뒤에 새 인스턴스 삽입된다."
	"previous 호출 후에 add 호출하면, 앞서 반환된 인스턴스 앞에 새 인스턴스가 삽입된다."
*/