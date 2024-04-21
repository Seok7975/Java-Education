class MakeThreadDemo {
    public static void main(String[] args) {
        Runnable task = () -> {	// 쓰레드가 실행하게 할 내용
            int n1 = 10;
            int n2 = 20;
            String name = Thread.currentThread().getName();
            System.out.println(name + ": " + (n1 + n2));
        };

        Thread t = new Thread(task);
        t.start();	// 쓰레드 생성 및 실행

        System.out.println("End " + Thread.currentThread().getName());
    }
}

/*
 	// 실행결과
 	End main
	Thread-0: 30
 */


/*
	쓰레드의 생성을 위해 제일 먼저 할 일은 java.lang.Runnable 인터페이스를 구현하는 클래스의
	인스턴스를 생성하는 일이다. 그런데 Runnable은 다음 추상 메소드 하나만 존재하는 함수형
	인터페이스이다.
	
	void run()
	
	따라서 예제에서는 다음과 같이 람다식을 기반으로, 메소드의 구현과 인스턴스의 생성을 동시에 진행하였다.
	그리고 이렇게 구현된 메소드는 새로 생성되는 쓰레드에 의해 실행되는 메소드이다.
	
        Runnable task = () -> {	// 쓰레드가 실행하게 할 내용
            int n1 = 10;
            int n2 = 20;
            String name = Thread.currentThread().getName();
            System.out.println(name + ": " + (n1 + n2));
        };
        
    이렇듯 Runnable을 구현하였다면, 이를 전달하며 다음과 같이 Thread 인스턴스를 생성해야 한다.
    그리고 여기까지 마쳤다면 새로운 쓰레드의 생성을 위한 준비는 끝난 셈이다.
    
    Thread t = new  Thread(task);	// 인스턴스 생성 시 run 메소드의 구현 내용 전달
    
    이어서 마지막으로 할 일은 다음과 같이 Thread 인스턴스를 대상으로 start 메소드를 호출하는 것이다.
    
    t.start(); // 쓰레드의 생성 밑 실행
    
    그러면 가상머신은 쓰레드를 생성해서 Thread 인스턴스 생성 시 전달된 run 메소드를 실행하게 한다.
    실행 결과를 보면 이렇게 생성된 쓰레드의 이름이 Thread-0으로 출력되었는데 이는 기본적으로 주어진
    이름이다. 따라서 별도의 이름을 붙여주고 싶다면 다음 생성자를 통해 Thread 인스턴스를 생성하면 된다.
    
    public Thread(Runnable target, String name)
    
    또한 위의 샐행 결과에서는 main 쓰레드가 먼저 일을 마친 상황을 보이고 있다. 쓰레드의 생성에는 시간이
    걸리므로 이러한 상황은 쉽게 연출이 된다. 그러나 main 쓰레드가 일을 마쳤다고 해서 프로그램이 
    종료되지는 않는다. 모든 쓰레드가 일을 마치고 소멸되어야 프로그램이 종료된다. 따라서 위 예제에서 생성된 
    쓰레드는 자신의 일을 마칠 충분한 시간을 갖는다. 참고로 위와 같이 생성된 쓰레드는 자신의 일을 마치면
    자동으로 소멸된다는 사실도 기억해 두자.(여기서 말하는 쓰레드의 소멸은 쓰레드의 생성을 위해 할당했던
    모든 자원의 해제를 의미한다.)
    
     "쓰레드는 자신의 일을 마치면(run 메소드의 실행을 완료하면) 자동으로 소멸된다."
     
    public static void sleep(long millis) throws InterruptedException
    
    위 메소드를 호출하는 쓰레드는, 인자로 전달된 값의 millisecond 만큼(1/1000초 만큼) 실행을 멈추고 잠을
    자게 된다.
	
*/