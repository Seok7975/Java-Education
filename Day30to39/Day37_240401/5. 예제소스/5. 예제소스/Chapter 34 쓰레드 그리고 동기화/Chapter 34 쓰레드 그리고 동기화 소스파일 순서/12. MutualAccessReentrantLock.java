import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.TimeUnit;

class Counter { 
    int count = 0;
    ReentrantLock criticObj = new ReentrantLock();

    public void increment() {
        criticObj.lock();

        try {
            count++;
        } finally {
            criticObj.unlock();
        }
    }

    public void decrement() {
        criticObj.lock();

        try {
            count--;
        } finally {
            criticObj.unlock();
        }
    }

    public int getCount() { return count; }
}

class MutualAccessReentrantLock {
    public static Counter cnt = new Counter();

    public static void main(String[] args) throws InterruptedException {        
        Runnable task1 = () -> {
            for(int i = 0; i < 1000; i++)
                cnt.increment();
        };

        Runnable task2 = () -> {
            for(int i = 0; i < 1000; i++)
                cnt.decrement();
        };

        ExecutorService exr = Executors.newFixedThreadPool(2);
        exr.submit(task1);
        exr.submit(task2);
     
        exr.shutdown();
        exr.awaitTermination(100, TimeUnit.SECONDS);

        System.out.println(cnt.getCount());
    }
}

/*
실행 결과
0
*/

/*
	synchronized를 대신하는 ReentrantLock
	
	자바 5에서는 동기화 블록과 동기화 메소드를 대신할 수 있는 ReentrantLock 클래스를 제공하였다. 이 클래스를
	기반으로 하는 동기화 구조는 다음과 같다.
	
	class MyClass {
		ReentrantLock criticObj = new ReentrantLock();
		void myMethod(int arg) {
			criticObj.lock();	// 문을 잠근다.
			...		// 한 쓰레드에 의해서만 실행되는 영역
			criticObj.unlock();	// 문을 연다.
		}
	}
	
	위의 코드에서 한 쓰레드가 lock 메소드를 호출하고, 이어서 다음 문장을 실행하기 시작한 상태에서,
	다른 쓰레드가 lock 메소드를 호출하면 이 쓰레드는 lock 메소드 호출을 반환하지 않고 그 자리에서
	대기하게 된다. 먼저 lock 메소드를 호출한 쓰레드가 unlock 메소드를 호출할 때까지 대기하게 된다.
	따라서 lock 메소드의 호출 문장과 unlock 메소드의 호출 문장 사이는 하나의 쓰레드만이 실행할 수
	있는 영역이 된다. 그런데 lock 메소드를 호출한 쓰레드가 unlock 메소드를 호출하지 않는 코드 상의
	실수가 발생할 수 있다. 때문에 위의 코드는 다음과 같이 작성하는 것이 안정적이다.
	
	class MyClass{
		ReentrantLock criticObj = new ReentrantLock();
		void myMethod(int arg) {
			criticObj.lock();	// 문을 잠근다.
			try{
			...		// 한 쓰레드에 의해서만 실행되는 영역
			} finally {
				criticObj.unlock();	// 문을 연다.
			}
		}		
	}
	
	그럼 위의 예제를 보자. 이는 앞서 보인 MutualAccessSyncBlock.java를 ReentrantLock 기반으로,
	더불어 쓰레드 풀 기반으로 수정한 예제이다.
	
	exr.awaitTermination(100, TimeUnit.SECONDS);
		-> 쓰레드 풀에 전달된 작업이 끝나기를 100초간 기다린다.
		
	생각과 달리 shutdown 메소드는 바로 반환이 된다. 즉 쓰레드 풀에 전달된 작업이 마무리되면 풀을
	폐쇄하라고 명령을 할 뿐 기다려 주지는 않는다. 그래서 쓰레드 풀에 전달된 작업의 최종 결과를 확인하기
	위해서는 위 문장이 필요하다. 위 문장이 실행되면 일단 awaitTermination 메소드의 호출은
	블로킹 상태에(반환하지 않은) 놓이게 되어, 다음 두 가지 중 한가지 상황에 이르러야 메소드를 빠져나오게
	된다.
	* 쓰레드 풀에 전달된 모든 작업이 완료되었다.
	* 작업이 완료되지는 않았지만 초를 기준으로 100으로 세었다.
	
	물론 대기 시간은 얼마든지 수정할 수 있다. 첫 번째 인자를 통해서는 몇을 셀 것인지에 대한 정보를 전달하고
	두 번째 인자를 통해서는 세는 기준을 전달한다. TimeUnit.DAYS를 전달하여 100일을 기다리게 할
	수도 있다.
	
*/