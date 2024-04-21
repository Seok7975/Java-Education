import java.util.Queue;	//F-I-F-O
import java.util.LinkedList;

class LinkedListQueue {
    public static void main(String[] args) {
        Queue<String> que = new LinkedList<>(); 

        // 데이터 저장       
        que.offer("Box");
        que.offer("Toy");
        que.offer("Robot");

        // 무엇이 다음에 나올지 확인
        System.out.println("next: " + que.peek());

        // 첫 번째, 두 번째 인스턴스 꺼내기
        System.out.println(que.poll());
        System.out.println(que.poll());

        // 무엇이 다음에 나올지 확인
        System.out.println("next: " + que.peek());

        // 마지막 인스턴스 꺼내기, 실제로 꺼내서 반환
        System.out.println(que.poll());
    }
}

/*
실행 결과
next: Box
Box
Toy
next: Robot
Robot
*/

/*
스택(Stack)과 큐(Queue)의 이해

LIFO(last-in-first-out)
	-> 먼저 저장된 데이터가 마지막에 빠져나간다.
	
즉 스택은 '아래가 막힌 긴 통'에 비유할 수 있다. 이러한 통에 물건을 넣으면, 가장
마지막에 들어간 물건이 먼저 나오고, 가장 먼저 들어간 물건이 마지막에 나온다.
반면 큐는 들어간 순으로 빠져나오는 자료구조이다.
( 넣기(push), 꺼내기(pop) )

FIFO(first-in-first-out)
	-> 먼저 저장된 데이터가 먼저 빠져나간다.
( 넣기(offer), 꺼내기(poll) )

큐는 앞과 뒤가 다 뚫려서 한쪽 방향으로는 넣고 다른 한쪽 방향으로는 꺼내는 통에
비유할 수 있다. 따라서 이 통에 물건을 넣으면 들어간 순으로 물건이 빠져나온다.

Queue<E> 인터페이스와 큐(Queue)의 구현

큐 자료구조를 위한 Queue<E> 인터페이스를 대표하는 세 가지 메소드는 다음과 같다.
boolean add(E e)			넣기
E remove()			꺼내기
E element()			확인하기

remove는 인스턴스의 참조 값을 반환하면서 해당 인스턴스를 저장소에서 삭제하는
메소드이다. 반면 element는 인스턴스의 참조 값을 반환하지만 삭제하지 않는다.
그래서 이 메소드는 무엇이 들어 있는지 확인하는 메소드라 한다.
그런데 위의 세 메소드는 꺼낼 인스턴스가 없을 때 혹은 저장 공간이 부족할 때
예외를 발생시킨다. 반면에 Queue<E> 인터페이스의 다음 세 메소드는 동일한
상황에서 예외를 발생시키지 않고 해당 상황을 알리기 위한 특정 값(null 또는
false)을 반환한다.
boolean offer(E e)		넣기, 넣을 공간이 부족하면 false 반환
E poll()				꺼내기, 꺼낼 대상 없으면 null 반환
E peek()				확인하기, 확인할 대상이 없으면 null 반환

일반적인 선택은 offer, poll, peek이다. 이유는 비어 있는 상황까지도
예외가 아닌 프로그램의 정상적인 흐름으로 간주하는 경우가 대부분이기 때문이다.

위 예제에서 보이듯이 LinkedList<E>는 List<E>를 구현하면서 동시에
Queue<E>를 구현하는 컬렉션 클래스이다. 따라서 어떠한 타입의 참조변수로
참조하느냐에 따라서 '리스트'로도 동작하고 '큐'로도 동작한다.
*/