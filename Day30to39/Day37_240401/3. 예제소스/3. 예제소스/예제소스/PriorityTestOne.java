class MessageSendingThread extends Thread
{
	String message;
	int priority;
	
	public MessageSendingThread(String str) 
	{
		message=str;
	}
	public void run()
	{
		for(int i=0; i<1000000; i++)
			System.out.println(message+"("+getPriority()+")");
	}	
}

class PriorityTestOne
{
	public static void main(String[] args)
	{
		MessageSendingThread tr1=new MessageSendingThread("First");
		MessageSendingThread tr2=new MessageSendingThread("Second");
		MessageSendingThread tr3=new MessageSendingThread("Third");
		tr1.start();
		tr2.start();
		tr3.start();
	}
}

/*
쓰레드의 스케줄링(Scheduling)과 쓰레드의 우선순위 컨트롤
둘 이상의 쓰레드가 생성될 수 있기 때문에, 자바 가상머신은(자바 가상머신의 일부로 존재하는 쓰레드 스케줄러는) 쓰레드의 실행을 스케줄링(컨트롤)해야 한다. 스케줄링에 사용되는 알고리즘의 기본원칙은 다음과 같다.
* 우선순위가 높은 쓰레드의 실행을 우선한다.
* 동일한 우선순위의 쓰레드가 둘 이상 존재할 때는 CPU의 할당시간을 분배해서 실행한다.
자바의 쓰레드에는 우선순위라는 것이 할당된다. 이는 가상머신에 의해서 우선적으로 실행되어야 하는 쓰레드의 순위를 의미하는 것으로, 가장 높은 우선 순위는 정수 10으로, 가장 낮은 우선순위는 정수 1로 표현한다.(따라서 총 10단계의 우선순위가 존재한다.) 그리고 이러한 쓰레드의 우선순위는 프로그램상에서 변경 및 확인이 가능하다.
쓰레드의 실행방식은 시스템의 상황과 환경에 따라서 매우 많은 차이를 보인다. 즉 "동일한 우선순위의 쓰레드들은 CPU의 할당시간을 적절히(골고루)나눠서 실행된다"라고 만 이야기할 수 있을 뿐, 아주 엄밀하게 수치적으로 할당시간과 할당순서를 이야기할 수는 없다.
*/