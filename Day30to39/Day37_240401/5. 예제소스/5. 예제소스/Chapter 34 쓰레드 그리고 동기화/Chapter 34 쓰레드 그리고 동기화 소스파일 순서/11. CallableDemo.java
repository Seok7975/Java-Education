import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ExecutionException;

class CallableDemo {
    public static void main(String[] args) 
              throws InterruptedException, ExecutionException {
        Callable<Integer> task = () -> {
            int sum = 0;
            for(int i = 0; i < 10; i++)
                sum += i;
            return sum;
        };
        
        ExecutorService exr = Executors.newSingleThreadExecutor();
        Future<Integer> fur = exr.submit(task);
        
        Integer r = fur.get();
        System.out.println("result: " + r);
        exr.shutdown();
    }
}

/*
실행결과
result: 45

*/

/*
Callable & Future : 특정 형태의 값을 반환하고 싶을때 사용
앞서 작성했던 작업의 형태는 다음과 같이 Runnable 인터페이스를 기반으로 한다.

Runnable task1 = () ->{
	...
}

이 경우 Runnable에 위치한 추상 메소드 run의 반환형이 void이기 때문에 작업의 결과를
return문을 통해 반환하는 것은 불가능하다. 그러나 다음 인터페이스를 기반으로 작업을 구성하면
작업의 끝에서 값을 반환하는 것이 가능하다. 특히 반환형도 결정할 수 있다.

@FunctionalInterface // 함수형 인터페이스
public interface Callable<V> {
	V call() throws Exception;
}

위 예제에서 값의 반환을 위한 작업을 다음과 같이 마련하였다. 반환하는 값이 int형 값이므로
타입 인자로 Integer를 전달하였다.

Callable<Integer> task = ()->{
	int sum = 0;
	for(int i=0;i<10;i++)
		sum += i;
	return sum;		// 반환 값은 int 형
};

그리고 이 작업을 쓰레드 풀에 다음과 같이 전달하였다. 그런데 이 경우에는 메소드의 반환 값을
다음과 같이 Future<V>형 참조변수에 저장해야 한다. (Future의 타입 인자는 Callable의
타입 인자와 일치시켜야 한다.)

Future<Integer> fur = exr.sumit(task);

이제 위의 참조변수를 통해 다음과 같이 쓰레드가 실행한 메소드의 반환 값을 얻는다.
Integer r = fur.get();	// 쓰레드의 반환 값 획득

만약에 위의 메소드를 호출한 시점에 쓰레드가 작업을 끝내지 않은 상태라면 해당 쓰레드가 값을
반환하고 작업을 끝낼 때까지 대기하게 된다.
*/