class Task extends Thread {		// Thread의 run 메소드 오버라이딩
    public void run() {
        int n1 = 10;
        int n2 = 20;
        String name = Thread.currentThread().getName();
        System.out.println(name + ": " + (n1 + n2));    
    }
}

class MakeThreadDemo2 {
    public static void main(String[] args) {
        Task t1 = new Task();
        Task t2 = new Task();
        
        t1.start();
        t2.start();

        System.out.println("End " + Thread.currentThread().getName()); 
        // Thread.currentThread().getName() : main(main함수니까)
    }
}

// 스레드에 이름을 부여? super()
/*
Task()
{
	super("good"); // good이 스레드의 이름이 됨
}
*/

/*
실행결과

End main
Thread-1: 30
Thread-0: 30

 */

/*
쓰레드를 생성하는 두 가지 방법
첫번째
* 1단계 Runnable을 구현한 인스턴스 생성
* 2단계 Thread 인스턴스 생성
* 3단계 start 메소드 호출

두번째
* 1단계 Thread를 상속하는 클래스의 정의와 인스턴스 생성
* 2단계 start 메소드 호출
 
 위 예제에서 보이듯이 Thread를 상속하는 클래스는 다음 메소드를 오버라이딩 해야 한다.
 
 public void run()

 그러면 start 메소드 호출을 통해 쓰레드가 생성되었을 때, 이 쓰레드는 오버라이딩 된 run 메소드를 실행하게 된다.
*/