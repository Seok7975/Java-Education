class Counter { 
    int count = 0; 		// 두 쓰레드에 의해 공유되는 변수

    public void increment() {
        count++;		// 첫 번째 쓰레드에 의해 실행되는 문장
    }

    public void decrement() {
        count--;		// 또 다른 쓰레드에 의해 실행되는 문장
    }

    public int getCount() { return count; }
}

class MutualAccess {
    public static Counter cnt = new Counter();

    public static void main(String[] args) throws InterruptedException {        
        Runnable task1 = () -> {
            for(int i = 0; i<1000; i++)
                cnt.increment();	// 값을 1 증가
        };

        Runnable task2 = () -> {
            for(int i = 0; i<1000; i++)
                cnt.decrement();	// 값을 1 감소
        };

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);
        
        t1.start();
        t2.start();
    
        t1.join();		// t1이 참조하는 쓰레드의 종료를 기다림
        t2.join();		// t2가 참조하는 쓰레드의 종료를 기다림
     
        System.out.println(cnt.getCount());
    }
}

//이론상으론 0이 나와야하나 동기화를 해주지 않았으므로 0이 나올 가능성이 적다

/*
실행결과
39
*/

/*

join 메소드는 특정 쓰레드의 실행이 완료되기를 기다릴 때 호출하는 메소드이다.

public final void join() throws InterruptedException

즉 위 예제에서는 main 쓰레드가 두 쓰레드의 실행이 완료되기를 기다리기 위해서 join 메소드를 호출하였다.
그런데 실행 결과를 보면 예상과 다르다. 첫 번째 쓰레드는 increment를 천 번 호출하였고, 두 번째 
쓰레드는 decrement를 천 번 호출하였으므로 출력 결과는 0이어야 하는데, 실행할 때마다 출려되는 값이
다르다. 그리고 이를 통해 다음 사실을 유추할 수 있다.

"둘 이상의 쓰레드가 동일한 변수에 접근하는 것은 문제를 일으킬 수 있다."

따라서 위 예제와 같은 상황에서는 둘 이상의 쓰레드가 동일한 메모리 공간에 접근해도 문제가 발생하지 않도록
'동기화(synchronization)'라는 것을 해야 한다. -> 7번예제에 이어서
*/