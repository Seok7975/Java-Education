import java.util.Deque;
import java.util.ArrayDeque;

class ArrayDequeCollection {
    public static void main(String[] args) {
        Deque<String> deq = new ArrayDeque<>(); 

        // 앞으로 넣고       
        deq.offerFirst("1.Box");
        deq.offerFirst("2.Toy");
        deq.offerFirst("3.Robot");

        // 앞에서 꺼내기
        System.out.println(deq.pollFirst());
        System.out.println(deq.pollFirst());
        System.out.println(deq.pollFirst());  
    }
}

/*
실행 결과
3.Robot
2.Toy
1.Box

스택(Stack)의 구현
자바는 기본 자료구조 대부분을 지원한다. 스택 자료구조도 컬렉션 클래스
Stack<E>를 통해 지원하고 있다.

public class Stack<E> extends Vector<E>

그러나 Stack<E>는 (그리고 이 클래스가 상속하는 Vector<E>도) 자바
초기에 정의된 클래스로써 지금은 이전 코드와의 호환성 유지를 위해 존재하는
클래스일 뿐이다. Stack<E>는 동기화된 클래스로 멀티 쓰레드에 안전하지만,
그만큼 성능의 저하가 발생한다. 때문에 이 클래스의 사용은 권할 만한 일이
아니다. 대신에 자바 6에서 스택을 대신할 수 있는 '덱(Deque)'이라는 
자료구조가 포함되었다. 그리고 이를 위해 다음 인터페이스를 정의하였다.

public interface Deque<E>	extends Queue<E>

덱은 외형 구조가 큐와 유사하다. 그러나 한쪽 방향으로만 넣고 꺼내는 큐와
달리 덱은 양쪽 끝에서 넣고 빼는 것이 가능한 자료구조이다. 따라서 덱을
스택처럼 사용하는 것이 가능하다.(뿐만 아니라 덱은 큐처럼 사용하는 것도
가능하다.)
Deque<E>의 대표 메소드들은 다음과 같다.
* 앞으로 넣고, 꺼내고, 확인하기
	void addFirst(E e) 		넣기
	E removeFirst()		꺼내기
	E getFirst()		확인하기
* 뒤로 넣고, 꺼내고, 확인하기
	void addLast(E e)		넣기
	E removeLast()		꺼내기
	E getLast()		확인하기
	
그런데 이들은 꺼낼 대상이 없을 때, 그리고 공간이 부족해서 넣지 못할 때
예외를 발생시킨다. 반명 Deque<E>의 다음 메소드들은 그러한 상황에서
예외를 발생시키지 않고 특정 값을 반환한다.

* 앞으로 넣고, 꺼내고, 확인하기
	boolean offerFirst(E e)		넣기, 공간 부족하면 false 반환
	E pollFirst()			꺼내기, 꺼낼 대상 없으면 null 반환
	E peekFirst()			확인하기, 확인할 대상 없으면 null 반환
	
* 뒤로 넣고, 꺼내고, 확인하기
	boolean	offerLast(E e)		넣기, 공간이 부족하면 false 반환
	E poolLast()			꺼내기, 꺼낼 대상 없으면 null 반환
	E peekLast()			확인하기, 확인할 대상 없으면 null 반환
	
따라서 스택이 필요하면 Deque<E>를 구현한 컬렉션 클래스의 인스턴스를 대상으로
다음과 같이 쌍을 이루어 메소드를 호출하면 된다.

offerFirst & pollFirst		앞으로 넣고 앞에서 꺼내기
offerLast & pollLast		뒤로 넣고 뒤에서 꺼내기

위의 예제를 통해서 Deque<E>을 구현하는 ArrayDeque<E> 클래스의 인스턴스를
스택처럼 활용하는 예를 보였다.

위 예제에서는 넣은 순서의 역순으로 String 인스턴스를 꺼냈다. 즉 스택으로 
동작하게끔 메소드를 호출하였다.

Deque<String> deq = new ArrayDeque<>();
	-> 배열을 기반으로 하는 덱의 구성
	
Deque<String> deq = new LinkedList<>();
	-> 리스트를 기반으로 하는 덱의 구성
	
이렇듯 LinkedList<E>로 대신할 수 있는 이유는 이 클래스가 다음 세 가지 인터페이스를 
모두 구현하기 때문이다.

Deque<E>, List<E>, Queue<E>

따라서 어느 타입의 참조변수로 참조하느냐에 따라서 LinkedList<E>는 그 성격이 결정된다. 
그리고 스택에 대한 이야기를 조금 더하면, 스택의 두 기능인 넣고 꺼내기 연산에 대해
전통적으로 다음과 같이 이름을 붙인다.

* 스택에 넣기 push
* 스택에서 꺼내기 pop

그런데 앞서 보인 예제에서는 덱을 스택처럼 사용했기 때문에 코드상에서 이것이 덱인지
스택인지 구분하기 어렵다. 뿐만 아니라, 스택으로 사용하려 했는데 앞으로 넣고
뒤로 꺼내는 실수를 할 수도 있는 상황이다. 따라서 스택이 필요한 경우에는 "DefinedStack.java"
소스같이 별도의 클래스를 정의하여 사용할 것을 권한다.
*/