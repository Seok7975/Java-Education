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

        // PUSH ����
        stk.push("1.Box");
        stk.push("2.Toy");
        stk.push("3.Robot");

        // POP ����
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.pop());  
    }
}

/*
���� ���
3.Robot
2.Toy
1.Box
*/

/*
�� �������� ���ڰ� ������ �������̽��� Ŭ������ ������ ����.

interface DIStack<E>
class DCStack<E> implements DIStack<E>

�� �������̽��� Ŭ������ ������� ������ ���� ������ �����ϸ� �迭
����� ������ �����ȴ�.

DIStack<String> stk = new DCStack<>(new ArrayDeque<String>());
�׸��� ������ ���� ������ �����ϸ� ����Ʈ ����� ������ �����ȴ�.
DIStack<String> stk = new DCStack<>(new LinkedList<String>());
*/