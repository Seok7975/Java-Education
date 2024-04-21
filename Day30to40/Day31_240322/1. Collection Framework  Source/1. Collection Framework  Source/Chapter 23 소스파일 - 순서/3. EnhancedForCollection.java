import java.util.List;
import java.util.LinkedList;

class EnhancedForCollection {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        
        // 인스턴스 저장 
        list.add("Toy");
        list.add("Box");
        list.add("Robot");
	
        // 인스턴스 참조
        for(String s : list)
            System.out.print(s + '\t');
        System.out.println();
		
        // 첫 번째 인스턴스 삭제
        list.remove(0);
   
        // 삭제 후 인스턴스 참조
        for(String s : list)
            System.out.print(s + '\t');
        System.out.println();
    }
}

// 실행결과
/*
Toy	Box	Robot	
Box	Robot	
*/

// 저장된 인스턴스의 순차적 접근 방법 1: enhanced for문의 사용(for-each문)
/* 
for - each문을 통한 순차적 접근의 대상이 되려면, 해당 컬렉션 클래스는 다음 인터페이스를
구현해야 한다. (Iterable을 구현한 애들만 enhanced for문을 쓸 수 있다)

public interface Iterable<T>

그런데 앞서 소개한 ArrayList<E>, LinkedList<E>클래스는 위의 인터페이스를 구현하고 있다.
정확히는 다음과 같이 Collection<E>가 Iterable<T>를 상속하는데, ArrayList<E>,
LinkedList<E> 클래스는 Collection<E> 인터페이스를 구현하고 있다.

public interface Collection<E> extends Iterable<E>

이렇듯 Iterable<T>를 직접 혹은 간접적으로 구현하는 클래스의 인스턴스를 대상으로 for-each문을
구성할 수 있다.

앞서 Collection<E>가 Iterable<T>를 상속한다고 하였다. 따라서 Collection<E>를 구현하는 자바의
제네릭 클래스는 Iterable<T>의 다음 추상 메소드를 모두 구현한다.

Iterable<T> iterator()

이 메소드는 '반복자(Iterator)'라는 것을 반환한다. 반복자는 저장된 인스턴스들을 순차적으로 참조할
때 사용하는 인스턴스로, 일종의 '지팡이'에 비유할 수 있다. 그리고 이 지팡이를 얻는 방법은 다음과
같다.(물론 이 지팡이의 역할은 저장된 인스턴스들을 가리키는 것이다.)

public static void main(String[] args) {
	List<String> list = new LinkedList<>();
	...
	Iterator<String> itr = list.iterator();	// 반복자 획득, itr이 지팡이를 참조한다.
	...
}

위에서 얻은 지팡이를(반복자를) 통해 호출할 수 있는, Iterator<E>의 메소드들은 다음과 같다.

E next()			다음 인스턴스의 참조 값을 반환
boolean hasNext()		next 메소드 호출 시 참조 값 반환 가능 여부 확인
void remove()		next 메소드 호출을 통해 반환했던 인스턴스 삭제

반복자는 next를 호출할 때마다 첫 번째 인스턴스를 시작으로 다음 인스턴스의 참조 값을 차례로 반환
한다. 그리고 더 이상 반환할 대상이 없을 때 noSuchElementException 예외를 발생시킨다. 따라서
저장된 인스턴스에 차례로 접근할 때에는 다음과 같은 반복문을 구성해야 한다.

// 반복자를 이용한 순차적 참조
while(itr.hasNext()) {	// next 메소드가 반환할 대상이 있다면,
	str = itr.next();	// next 메소드를 호출한다.
	...
}

for-each문을 통한 순차적 접근과 달리 반복자를 이용하면 반복 중간에 특정 인스턴스를 삭제하는 것이 가능하다.
(이는 for-each문을 통해서는 불가능한 일이다.)

// 반복자를 이용한 참조 과정 중 인스턴스의 삭제
while(itr.hasNext()) {
	str = itr.next();
	if(str.equals("Box")
		itr.remove();	// 위에서 next 메소드가 반환한 인스턴스 삭제
}

이러한 반복자는 생성과 동시에 첫 번째 인스턴스를 가리키고, next가 호출될 때마다 가리키는 대상이 다음 인스턴스로 옮겨진다. 그렇다면 이 반복자를 원하는 때에 다시 첫 번째 인스턴스를 가리키게 하려면 어떻게 해야 할까? 가리키던 위치를 되돌리는 방법은 없으니 다음과 같이 반복자를 다시 얻어야 한다.

Iterator<String> itr = list.iterator();

*/