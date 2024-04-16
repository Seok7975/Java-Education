import java.util.*;

class ListIteratorEx1 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");

		ListIterator it = list.listIterator();

		while(it.hasNext()) {
			System.out.print(it.next()); // 순방향으로 진행하면서 읽어온다.
		}
		System.out.println();

		while(it.hasPrevious()) {
			System.out.print(it.previous()); // 역방향으로 진행하면서 읽어온다.
		}
		System.out.println();
	}
}

/*
12345
54321
*/

/*
ListIterator의 사용방법을 보여주는 간단한 예제이다. Iterator는 단방향으로만 이동하기
때문에 컬렉션의 마지막 요소에 다다르면 더 이상 사용할 수 없지만, ListIterator는
양방향으로 이동하기 때문에 각 요소간의 이동이 자유롭다. 다만 이동하기 전에 반드시
hasNext()나 hasPrevious()를 호출해서 이동할 수 있는지 확인해야 한다.

ListIterator에 있는 메서드 중에서 '선택적 기능(optional operation)'이 있다. 이는 반드시
구현하지 않아도 된다. 예를 들어 Iterator 인터페이스를 구현하는 클래스에서 remove()는 
선택적인 기능이므로 구현하지 않아도 괜찮다. 그렇다하더라도 인터페이스로부터 상속받은
메서드는 추상메서드라 메서드의 몸통(body)을 반드시 만들어 주어야 하므로 다음과 같이
처리한다.

public void remove() {
	throw new UnsupportedOperationException();
}

단순히 public void remove() {} 와 같이 구현하는 것보다 이처럼 예외를 던져서 구현되지
않은 기능이라는 것을 메서드를 호출하는 쪽에 알리는 것이 좋다. 그렇지 않으면 호출하는
쪽에서는 소스를 구해보기 전까지는 이 기능이 바르게 동작하지 않는 이유를 알 방법이
없다.
Java API문서에서 remove()메서드의 상세내용을 보면 remove메서드를 지원하지 않는
Iterator는 UnsupportedOperationException을 발생시킨다고 쓰여 있다. 즉, remove메서드를
구현하지 않는 경우에는 UnsupportedOperationException을 발생시키도록 구현하라는
뜻이다.
 위의 코드에서 remove메서드의 선언부에 예외처리를 하지 않은 이유는 
Unsupported OperationException이 RuntimeException의 자손이기 때문이다.
 Iterator의 remove()는 단독으로 쓰일 수 없고, next()와 같이 써야한다. 특정위치의
요소를 삭제하는 것이 아니라 읽어 온것을 삭제한다. next()의 호출없이 remove()를
호출하면 IllegalStateException이 발생한다.
 '마이크로소프트 아웃룩(Microsoft outlook)'과 같은 email클라이언트에서 메일서버에
있는 메일을 가져올 때 서버에 있는 메일을 읽어만 올 것인지(copy), 메일을 가져오면서
서버에서 삭제할 것(move)인지를 선택할 수 있다. 이와 같은 기능을 구현하고자 할 때 쓸 목적으로 
remove()를 정의해 놓은 것이다.
 단순히 서버에서 읽어오기만 할 때는 next()를 사용하면 되고, 읽어 온 메일을 서버에 
남기지 않고 지울 때는 next()와 함께 remove를 사용하면 이와 같은 기능을 구현할 수 있다.


*/