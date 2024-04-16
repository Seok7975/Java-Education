import java.util.ArrayDeque;
import java.util.Deque;

interface DIStack<E> {
    public boolean push(E item);
    public E pop();
}

class DCStack<E> implements DIStack<E> {
    private Deque<E> deq;

    public DCStack(Deque<E> d) {
        deq = d;
    }

    public boolean push(E item) {
        return deq.offerFirst(item);
    }
    
    public E pop() {
        return deq.pollFirst();
    }
}


class DefinedStack {
    public static void main(String[] args) {
        DIStack<String> stk = new DCStack<>(new ArrayDeque<String>()); 

        // PUSH 연산
        stk.push("1.Box");
        stk.push("2.Toy");
        stk.push("3.Robot");

        // POP 연산
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.pop());  
    }
}

/*
실행 결과
3.Robot
2.Toy
1.Box
*/

/*
위 예제에서 저자가 정의한 인터페이스와 클래스는 다음과 같다.

interface DIStack<E>
class DCStack<E> implements DIStack<E>

이 인터페이스와 클래스를 기반으로 다음과 같이 문장을 구성하면 배열
기반의 스택이 생성된다.

DIStack<String> stk = new DCStack<>(new ArrayDeque<String>());
그리고 다음과 같이 문장을 구성하면 리스트 기반의 스택이 생성된다.
DIStack<String> stk = new DCStack<>(new LinkedList<String>());
*/