import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

class SyncArrayList {
    public static List<Integer> lst = 
              Collections.synchronizedList(new ArrayList<Integer>()); //동기화처리가 된 ArrayList

    public static void main(String[] args) throws InterruptedException {
        for(int i = 0; i < 16; i++)
            lst.add(i);
        System.out.println(lst);

        Runnable task = () -> {
            ListIterator<Integer> itr = lst.listIterator();
                
            while(itr.hasNext())
                itr.set(itr.next() + 1);
        };
/*
        Runnable task = () -> {
            synchronized(lst) {
                ListIterator<Integer> itr = lst.listIterator();
                
                while(itr.hasNext())
                    itr.set(itr.next() + 1); 
            }
        };
*/

        ExecutorService exr = Executors.newFixedThreadPool(3);
        exr.submit(task);
        exr.submit(task);
        exr.submit(task);
     
        exr.shutdown();
        exr.awaitTermination(100, TimeUnit.SECONDS);
        System.out.println(lst);
    }
}

/*
실행결과
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]
[2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 13, 14, 16, 17, 18]
*/
/*
컬렉션 인스턴스 동기화
동기화는 그 특성상 어쩔 수 없이 성능의 저하를 수반한다. 따라서 불필요하게 동기화를 진행하지 않도록
주의해야 한다. 이런 이유로 컬렉션 프레임워크의 클래스 대부분도 동기화 처리가 되어 있지 않다. 따라서
쓰레드의 동시 접근에 안전하지 않다. 대신에 Collections의 다음 메소드들을 통한 동기화 방법을
제공하고 있다.

public static <T> Set<T> synchronizedSet(Set<T> s)
public static <T> List<T> synchronizedList(List<T> list)
public static <K, V> Map<K, V> synchronizedMap(Map<K, V> m)
public static <T> Collection<T> synchronizedCollection(Collection<T> c)

동기화 방법은 간단하다. ArrayList<String> 인스턴스를 쓰레드의 동시 접근에 안전한 상태가 되게
하려면 다음과 같이 문장을 구성하면 된다.

List<String> lst = Collections.synchronizedList(new ArrayList<String>());

위에서 보이듯이 컬렉션 인스턴스의 참조 값을 Collections.synchronizedXXX의 인자로 전달하면
동기화 처리된 인스턴스의 참조 값이 반환된다.

예제의 내용은 단순하다. 동기화 처리된 컬렉션 인스턴스에 다음과 같이 0부터 15까지 차례로 저장을
하였다.

public static List<Integer> lst = Collections.synchronizedList(new ArrayList<Integer>());
...
for(int i=0;i<16;i++)
	list.add(i);
	
그리고 다음과 같이 컬렉션 인스턴스에 저장된 값을 1씩 증가시키는 작업을 마련하였다.

Runnable task = () -> {
	ListIterator<Integer> itr = lst.listIterator();
	while(itr.hasNext())
		itr.set(itr.next() + 1);
};

이렇게 마련된 작업을 쓰레드 풀에 총 3회 전달했으니, 컬렉션 인스턴스에 저장된 값은 모두 3씩 증가한
상태여야 한다. 그런데 실행 결과를 보면 이와 다름을 알 수 있다. 무엇이 문제였을까? 우선 컬력션 인스턴스
자체에 대한 동기화에는 문제가 없다. 문제는 반복자이다. 컬렉션 인스턴스가 동기화 되었다고 해도
이를 기반으로 생성된 반복자까지 동기화가 이뤄지는 것은 아니다. 따라서 반복자를 통해 접근 할 때에는,
다음과 같이 이에 대한 동기화도 추가해야 한다.

Runnable task = () -> {
	synchronized(lst){		//	이 영역 실행 시 lst에 다른 쓰레드 접근 불가!
		ListIterator<Integer> itr = lst.listIterator();
		while(itr.hasNext())
			itr.set(itr.next()+1);
	}
}

위의 코드에서 동기화 블록이 갖는 의미는 다음과 같다.

"동기화 블록의 내부를 실행할 때 lst에 다른 쓰레드의 접근을 허용하지 않는다."

앞서 synchronized를 대신할 수 있는 ReentrantLock 기반의 동기화 방법을 소개했는데, 그렇다고
해서 키워드 synchronized가 불필요해진 것은 아니다. 그리고 지금까지 ArrayList<E>를 기반으로
동기화를 설명했지만, 다른 컬렉션 인스컨스의 동기화 방법도 이와 동일하다.

참고. 동기화 처리가 된 Vector 클래스

컬렉션 프레임워크의 Vector 클래스는 기본적으로 동기화가 되어있다. 따라서 동기화가 불필요한 상황에서
사용하면 아무런 의미 없이 성능만 저하가 된다. 그래서 이를 대신하기 위해 자바 2에서는 동기화 처리가
되어 있지 않은 ArrayList와 LinkedList를 추가하였다.
*/
