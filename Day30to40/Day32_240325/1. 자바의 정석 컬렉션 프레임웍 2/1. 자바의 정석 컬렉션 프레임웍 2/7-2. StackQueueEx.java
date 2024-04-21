import java.util.*;

class StackQueueEx {
	public static void main(String[] args) {
		Stack st = new Stack();
		Queue q = new LinkedList();	 // Queue�������̽��� ����ü�� LinkedList�� ���
		
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
ť�� ���� ���� ���� ���� �������� ����(FIFO)�̱� ������ ���� ���� ���� �����̰�, 
������ ���� ���� ���� ���߿� �������� ����(LIFO)�̱� ������ ���� ���� ������ �ݴ�� ������ ���� �� �� �ִ�.
 �ڹٿ����� ������ StackŬ������ �����Ͽ� �����ϰ� ������ ť�� Queue�������̽�
�θ� ������ ������ �� ������ Ŭ������ �����ϰ� ���� �ʴ�. ��� Queue�������̽���
������ Ŭ�������� �־ �� �� ���� �ϳ��� �����ؼ� ����ϸ� �ȴ�.
*/