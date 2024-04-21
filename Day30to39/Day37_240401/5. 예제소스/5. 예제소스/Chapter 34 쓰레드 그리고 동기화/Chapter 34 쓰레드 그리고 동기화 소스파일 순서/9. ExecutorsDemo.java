import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

class ExecutorsDemo {
    public static void main(String[] args) {
        Runnable task = () -> {     // 쓰레드에게 시킬 작업
            int n1 = 10;
            int n2 = 20;
            String name = Thread.currentThread().getName();
            System.out.println(name + ": " + (n1 + n2));
        }; // run을 람다로 표현
        
        ExecutorService exr = Executors.newSingleThreadExecutor();
        exr.submit(task);    // 쓰레드 풀에 작업을 전달

        System.out.println("End " + Thread.currentThread().getName());

        exr.shutdown();    // 쓰레드 풀과 그 안에 있는 쓰레드의 소멸
    }
}

/*
실행결과

End main
pool-1-thread-1: 30

*/

/*
쓰레드를 생성하는 더 좋은 방법

자바 5에서 쓰레드 관련 java.util.concurret 패키지를 추가하고, 이후로 자바 8에 이르기까지
쓰레드의 생성과 활용에 대한 기능을 발전시켜왔다. 따라서 더 간단히 쓰레드를 생성할 수 있고 더 강력하게
쓰레드를 활용할 수 있게 되었다.

지금 소개하는 이 방법으로 쓰레드를 생성하고 활용하자.
쓰레드의 생성과 소멸은 그 자체로 시스템에 부담을 주는 일이다. 따라서 처리해야 할 일이 있을 때마다
쓰레드를 생성하는 것은 성능의 저하로 이어질 수 있다. 그래서 '쓰레드 풀(Thread Pool)'이라는 것을
만들고 그 안에 미리 제한된 수의 쓰레드를 생성해 두고 이를 재활용하는 기술을 프로그래머들은 사용해 왔다.

쓰레드 풀 이미지 1.JPG 참고

위 이미지의 쓰레드 풀에는 세 개의 쓰레드가 존재한다. 그리고 처리해야 할 작업이 있을 때 풀에서 쓰레드를
꺼내 그 작업을 처리하게 만든다. 그리고 작업을 끝낸 쓰레드는 다시 풀로 돌아가 다음 작업을 대기하게 된다.
그런데 앞서 작성한 예제에서는 다음과 같이 두 개의 작업이 존재할 때,

Runnable task1 = () -> {...}
Runnable task2 = () -> {...}

이들 각각에 대해 다음과같이 쓰레드를 생성하였고, 이렇게 생성된 쓰레드는 작업이 끝나면 자동으로 소멸되어 리소스 소모가 많았다.

Thread t1 = new Thread(task1);
t1.start();		// 이렇게 생성된 쓰레드는 일 끝나면 자동 소멸

Thread t2 = new Thread(task2);
t2.start();		// 이렇게 생성된 쓰레드는 일 끝나면 자동 소멸

따라서 멀티 쓰레드 프로그래밍에서 쓰레드 풀의 활용은 매우 중요하다. 단, 쓰레드 풀의 구현이 간단하지 않다는 문제가 있다.
하지만 위 예제에서 보이듯이 concurrent 패키지를 활용하면 간단히 쓰레드 풀을 생성할 수 있다.
(쓰레드 풀을 직접 구현하지 않고 생성할 수 있다.)

쓰레드에게 시킬 작업의 마련 방법은 앞서 소개한 방법과 다르지 않다. 다음과 같이 Runnable 인터페이스를 구현하는 
인스턴스를 마련하면 된다.

Runnable task = ()->{...}

그런데 이어서 쓰레드를 생성하지 않고 다음 메소드 호출을 통해서 쓰레드 풀을 생성한다.

ExecutorService exr = Executors.newSingleThreadExecutor(); // 한개짜리 스레드풀을 만듬, exr이 참조

그리고 이렇게 생성된 쓰레드 풀에 다음과 같이 submit 메소드 호출을 통해 작업을 전달하면, 풀에서 
대기하고 있던 쓰레드가 이 일을 실행하게 된다. 그리고 작업이 끝나면 해당 쓰레드는 다시 쓰레드 풀로
돌아가서 다음 작업이 전달되기를 기다리게 된다.

exr.submit(task);		// 쓰레드 풀에 작업 전달

위에서는 newSingleThreadExecutor 메소드의 호출을 통해 쓰레드 풀을 생성했지만 Executors
클래스의 다음 메소드들을 통해서 다양한 유형의 쓰레드 풀을 생성할 수 있다.

* newSingleThreadExecutor 풀 안에 하나의 쓰레드만 생성하고 유지한다.
* newFixedThreadPool 풀 안에 인자로 전달된 수의 쓰레드를 생성하고 유지한다.
* newCachedThreadPool 풀 안의 쓰레드의 수를 작업의 수에 맞게 유동적으로 관리한다.

newSingleThreadExecutor가 생성하는 쓰레드 풀 안에는 하나의 쓰레드만 생성해 두고 이 쓰레드가
모든 작업을 처리하게 한다. 따라서 하나의 코어를 기준으로 코어의 활용도를 매우 높인 풀이라 할 수 있다.
그러나 이는 마지막에 전달된 작업은 가장 늦게 처리된다는 단점이 있는 풀이다. 반면 newCachedThreadPool
이 생성하는 풀은 전달된 작업의 수에 근거하여 쓰레드의 수를 늘리기도 하고 줄이기도 한다. 따라서 가장 효율적으로
쓰레드를 관리하는 것처럼 보이지만 전달된 작업의 수에 비례하여 쓰레드가 생성될 수 있는 관계로 앞서 언급한,
빈번한 쓰레드의 생성과 소멸로 이어질 수 있어 주의가 필요하다.
마지막으로, 생성된 쓰레드 풀과 그 안에 존재하는 쓰레드를 소멸하기 위해서는 다음 메소드를 호출해야 한다.

void shutdown()

위 메소드가 호출되어도 이미 전달된 작업은 진행이 된다. (추가로 작업을 전달받지는 않는다.)그러나 전달된 모든 
작업이 처리가 되면 해당 풀은 종료가 된다. 
*/