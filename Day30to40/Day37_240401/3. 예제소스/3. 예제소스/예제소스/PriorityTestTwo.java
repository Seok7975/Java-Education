class MessageSendingThread extends Thread
{
	String message;
	
	public MessageSendingThread(String str, int prio) 
	{
		message=str;
		setPriority(prio);
	}
	public void run()
	{
		for(int i=0; i<1000000; i++)
			System.out.println(message+"("+getPriority()+")");
	}	
}

class PriorityTestTwo
{
	public static void main(String[] args)
	{
		MessageSendingThread tr1
			=new MessageSendingThread("First", Thread.MAX_PRIORITY);
		MessageSendingThread tr2
			=new MessageSendingThread("Second", Thread.NORM_PRIORITY);
		MessageSendingThread tr3
			=new MessageSendingThread("Third", Thread.MIN_PRIORITY);
		
		tr1.start();
		tr2.start();
		tr3.start();
	}
}

/*
실행결과를 통해서 우선순위가 높은 쓰레드가 종료되어야, 그 다음 우선순위의 쓰레드가 실행됨을 확인할 수 있다.
보통 우선순위가 8인 쓰레드와 우선순위가 2인 쓰레드가 대략 8대 2의 비율로 CPU를 할당 받아서 실행된다고
오해하는 경우가 있는데, 대부분의 시스템에서는 우선순위가 높은 쓰레드에게만 실행의 기회를 부여한다.

쓰레드의 우선순위가 지니는 의미
사실 자바가 언어차원에서 쓰레드를 지원하고는 있지만, 쓰레드는 그 특성상 운영체제에 상당히 의존적이다.
즉 가상머신이 동작하는 운영체제에 따라서 실행의 결과는 다르게 나타날 수 있다. 특히 우선순위와 관련된 부분은
더욱 그러하다. 예를 들어서 총 7단계의 쓰레드 레벨을 지원하는 운영체제에서 자바 프로그램이 실행된다고 가정해
보자. 자바가 총 10단계의 쓰레드 우선순위를 제공한다 하더라도 운영체제에서 7단계의 쓰레드 레벨을 지원하면,
실질적인 쓰레드 레벨은 7단계가 된다. 때문에 자바의 우선순위 7과 8이 해당 운영체제의 우선순위 6으로
표현될 수도 있는 일이다. 이렇듯 우선순위를 기반으로 쓰레드 프로그래밍을 할 때에는 해당 운영체제에 대한 지식이
어느 정도 필요하다. 그리고 이러한 문제 때문에라도 쓰레드의 우선순위를 변경할 때에는 상수로 정의되어 있는
MAX_PRIORITY, NORM_PRIORITY, MIN_PRIORITY 중 하나를 선택해서 변경하는 것이 운영체제에 따른 차이를
최소화할 수 있는 방법이다.

대부분의 시스템에서 우선순위가 높은 쓰레드에게만 실행의 기회를 부여하다 보니, 우선순위가 낮은 쓰레드는 거의
실행되지 않는다고 생각할 수 있다. 그러나 프로그램의 실행내용을 잘 들여다 보면, CPU의 할당이 필요치 않는 데이터의
입출력에 대한 부분이 매우 높은 비율을 차지함을 알 수 있다. 간단하게는 파일의 입출력에서부터 네트워크를 통한 
데이터의 송수신 역시 CPU의 할당이 필요치 않는 데이터의 입출력에 해당이 된다. 때문에 프로그램의 실질적인 흐름을
담당하는 쓰레드 역시 CPU의 할당이 필요치 않는 데이터의 입출력과 관련 있는 연산을 상당부분 처리한다고 볼 수 있다.
그리고 이러한 상황에 놓였을 때(CPU의 할당이 필요치 않은 입출력을 처리하는 상황에 놓였을 때), 쓰레드는 무리하게
CPU를 차지하려고 하지 않는다. 오히려 이러한 상황에서는 자신에게 할당된 CPU를 다른 쓰레드들에게 넘긴다. 쓰레드의
바로 이러한 특성 때문에 우선순위가 낮은 쓰레드 역시 실행의 기회를 얻을 수 있는 것이다.
*/