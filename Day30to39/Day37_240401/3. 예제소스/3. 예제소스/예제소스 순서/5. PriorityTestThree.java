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
		{
			System.out.println(message+"("+getPriority()+")");
			
			try
			{
				sleep(1);
				// sleep은 Thread 클래스의 static 메소드로서, 실행흐름을 일시적으로 멈추는 역할을 한다.
				// sleep을 줌으로서 우선순위 낮은 애도 실행의 기회를 얻음
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}	
}

class PriorityTestThree
{
	public static void main(String[] args)
	{
		MessageSendingThread tr1
			=new MessageSendingThread("First", Thread.MAX_PRIORITY);
			//스레드의 우선순위를 직접 지정
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
실행결과를 보면, 높은 우선순위의 쓰레드가 둘씩이나 존재함에도 불구하고 꿋꿋이 실행되고 있는 가장 낮은
우선순위의 쓰레드를 볼 수 있다. 비록 우선순위가 낮은 쓰레드라 하더라도 높은 우선순위의 쓰레드가 
CPU를 양보해서 실행의 기회를 얻게 되면, 최소 단위의 실행 시간은 보장을 받는다. 따라서 위와 같은 실행
결과를 보이는 것이다. 결론적으로 낮은 우선순위의 쓰레드도 충분히 실행의 기회를 얻을 수 있고, 또 실제로
실행도 된다.
*/
