class ShowThread extends Thread
{
	String threadName;
	
	public ShowThread(String name)
	{
		threadName=name;
	}
	
	public void run()
	{
		for(int i=0; i<100; i++)
		{
			System.out.println("안녕하세요. "+threadName+"입니다.");
			try
			{
				sleep(100);
				// sleep은 Thread 클래스의 static 메소드로서,
				// 실행흐름을 일시적으로 멈추는 역할을 한다.
				// 1/1000 * 100 초간 흐름을 멈추게 된다.
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}

class ThreadUnderstand
{
	public static void main(String[] args)
	{
		ShowThread st1=new ShowThread("멋진 쓰레드");
		ShowThread st2=new ShowThread("예쁜 쓰레드");
		st1.start();
		st2.start();
	}
}