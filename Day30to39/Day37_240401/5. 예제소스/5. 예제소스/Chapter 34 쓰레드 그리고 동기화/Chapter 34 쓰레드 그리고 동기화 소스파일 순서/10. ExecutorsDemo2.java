import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

class ExecutorsDemo2 {
    public static void main(String[] args) {
        Runnable task1 = () -> {
            String name = Thread.currentThread().getName();
            System.out.println(name + ": " + (5 + 7));
        };
        
        Runnable task2 = () -> {
            String name = Thread.currentThread().getName();
            System.out.println(name + ": " + (7 - 5));
        };
               
        ExecutorService exr = Executors.newFixedThreadPool(2);
        exr.submit(task1);
        exr.submit(task2);
        exr.submit(() -> {
            String name = Thread.currentThread().getName();
            System.out.println(name + ": " + (5 * 7));
        });	// 스레드 두개중 먼저 끝난것이 이 작업을 함

        exr.shutdown();
    }
}

/*
실행결과
pool-1-thread-2: 2
pool-1-thread-1: 12
pool-1-thread-2: 35
*/

/*
위 예제에서 다음 문장을 통해 두 개의 쓰레드가 존재하는 쓰레드 풀을 생성하였다.
(전달인자가 2이므로 두 개의 쓰레드가 존재하게 된다.)

ExecutorService exr = Executors.newFixedThreadPool(2);

그리고 이 풀을 대상으로 세 개의 작업을 전달했는데, 세 번째 작업의 전달 방식은 다음과 같다.

        exr.submit(() -> {
            String name = Thread.currentThread().getName();
            System.out.println(name + ": " + (5 * 7));
        });
        
반복해서 시킬 일이 아니라면 이렇듯 submit 메소드의 인자 전달 위치에 람다식을 작성하는 것도 괜찮은
선택이다.
*/