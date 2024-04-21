import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;

class AsListCollection {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Toy", "Box", "Robot", "Box");
        // 이렇게 만든 형태는 추가, 삭제가 안되므로 생성자를 통해 객체를 만들어 복사하고 거기서 추가 삭제를 해야함.
        list = new ArrayList<>(list);
       
        for(Iterator<String> itr = list.iterator(); itr.hasNext(); )
            System.out.print(itr.next() + '\t');
        System.out.println();

        for(Iterator<String> itr = list.iterator(); itr.hasNext(); ) {
            if(itr.next().equals("Box"))
                itr.remove();
        }

        for(Iterator<String> itr = list.iterator(); itr.hasNext(); )
            System.out.print(itr.next() + '\t');
        System.out.println();
    }
}

// 실행결과
/*
Toy	Box	Robot	Box	
Toy	Robot	
*/

/*
	배열보다는 컬렉션 인스턴스가 좋다. : 컬렉션 변환
	배열과 ArrayList<E>는 특성이 유사하다. (ArrayList<E>가 배열을 기반으로 인스턴스를 저장하므
	로) 그런데 대부분의 경우 배열보다 ArryList<E>가 더 좋다. 첫 번째 이유로 인스턴스의 저장과 삭
	제가 편하다. 그리고 두 번째 이유로 '반복자'를 쓸 수 있다. 단 배열처럼 '선언과 동시에 초기화'를 할
	수 없어서 초기에 무엇인가를 채워 넣는 일이 조금 번거롭다. 하지만 다음과 같이 컬렉션 인스턴스를
	생성할 수 있어서 이것도 문제가 되지 않는다.

	List<String> list = Arrays.asList("Toy", "Robot", "Box");
		-> 인자로 전달된 인스턴스들을 저장한 컬렉션 인스턴스의 생성 및 반환

	그런데 이렇게 생성된 컬렉션 인스턴스는 새로운 인스턴스의 추가나 삭제가 불가능하다. 물론 반복자
	의 생성은 가능하나 이를 통해서도 참조만 가능할 뿐인다. 따라서 새로운 인스턴스의 추가나 삭제가
	필요한 상황이라면 다음 생성자를 기반으로 ArrayList<E> 인스턴스를 생성해야 한다.

	class ArrayList<E>{
		public ArrayList(Collection<? extends E> c) {...}	// 생성자
		...
	}

	이 생성자의 매개변수 선언에 <? extends E>가 등장한다. 이 의미를 해석해 보면. 먼저 매개변수 
	선언을 다음과 같이 줄여 놓고 그 의미를 판단하자.

	public ArrayList(Collection<E> c)
		-> Collection<E>를 구현한 컬렉션 인스턴스를 인자로 전달받는다.
		-> 그리고 E는 인스턴스 생성 과정에서 결정되므로 무엇이든 될 수 있다.

	이렇게 이해한 후에 다음 내용을 덧붙이면
	public ArrayList(Collection<? extends E> c)
		-> 덧붙여서 매개변수 c로 전달된 컬렉션 인스턴스에서는 참조만(꺼내기만) 가능하다.

	결국 위의 두 내용을 정리하면 다음과 같다.

	public ArrayList(Collection<? extends E> c)
		-> Collection<E>를 구현한 컬렉션 인스턴스를 인자로 전달받는다.
		-> 그리고 E는 인스턴스 생성 과정에서 결정되므로 무엇이든 될 수 있다.
		-> 덧붙여서 매개변수 c로 전달된 컬렉션 인스턴스에서는 참조만(꺼내기만) 가능하다.

	위의 생성자의 사용의 예를 보이면

	public static void main(String[] args) {
		// List<E>는 collection<E>를 상속한다.
		List<String> list = Arrays.asList("Toy", "Box", "Robot", "Box"); 
		// 이렇게 만든 형태는 추가, 삭제가 안되므로 생성자를 통해 객체를 만들어 복사하고 거기서 추가 삭제를 해야함.

		// 생성자 public ArrayList(Collection<? extends E> c)를 통한 인스턴스 생성
		list = new ArrayList<>(list);
		...
	}

	위와 같이 ArrayList<E> 인스턴스를 생성하면, 생성자로 전달된 컬렉션 인스턴스에 저장된 모든
	데이터가, 새로 생성되는 ArrayList<E> 인스턴스에 복사된다. 따라서 위와 같은 코드의 구성은
	배열을 대신하는 컬렉션 인스턴스의 생성에 주로 사용된다.
*/