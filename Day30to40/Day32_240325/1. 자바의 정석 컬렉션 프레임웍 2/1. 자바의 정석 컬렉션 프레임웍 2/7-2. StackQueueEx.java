import java.util.*;

class StackQueueEx {
	public static void main(String[] args) {
		Stack st = new Stack();
		Queue q = new LinkedList();	 // Queue인터페이스의 구현체인 LinkedList를 사용
		
		st.push("0");
		st.push("1");
		st.push("2");

		q.offer("0");
		q.offer("1");
		q.offer("2");

		System.out.println("= Stack =");
		while(!st.empty()) {
			System.out.println(st.pop());
		}

		System.out.println("= Queue =");
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
	}
}

/*
= Stack =
2
1
0
= Queue =
0
1
2
*/
/*
큐는 먼저 넣은 것이 먼저 꺼내지는 구조(FIFO)이기 때문에 넣을 때와 같은 순서이고, 
스택은 먼저 넣은 것이 나중에 꺼내지는 구조(LIFO)이기 때문에 넣을 때의 순서와 반대로 꺼내진 것을 알 수 있다.
 자바에서는 스택을 Stack클래스로 구현하여 제공하고 있지만 큐는 Queue인터페이스
로만 정의해 놓았을 뿐 별도의 클래스를 제공하고 있지 않다. 대신 Queue인터페이스를
구현한 클래스들이 있어서 이 들 중의 하나를 선택해서 사용하면 된다.
*/