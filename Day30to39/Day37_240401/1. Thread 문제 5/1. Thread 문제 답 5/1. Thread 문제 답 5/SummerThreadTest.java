import java.util.Scanner;

class IntegerComm
{
	int num=0;
	boolean isNewNum = false;

	public void setNum(int n)
	{
		synchronized(this)
		{
			if(isNewNum == true)
			{
				try
				{
					wait();
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
			num=n;
			isNewNum = true;
			notify();
		}
	}
	public int getNum()
	{
		int retNum=0;
		synchronized(this)
		{
			if(isNewNum==false)
			{
				try
				{
					wait();
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
			retNum = num;
			isNewNum = false;
			notify();
		}
		return retNum;
	}
}

class IntegerSummer extends Thread
{
	IntegerComm comm;
	int sum;
	public IntegerSummer(IntegerComm comm)
	{
		this.comm = comm;
	}
	public void run()
	{
		for(int i=0;i<5;i++)
			sum += comm.getNum();
		System.out.println("입력된 정수의 총 합 : " + sum);
	}
}

class SummerThreadTest
{
	public static void main(String[] args)
	{
		IntegerComm comm = new IntegerComm();
		IntegerSummer summer = new IntegerSummer(comm);
		summer.start();

		Scanner keyboard = new Scanner(System.in);

		System.out.println("총 5개의 정수 입력...");
		for(int i=0;i<5;i++)
			comm.setNum(keyboard.nextInt());

		try
		{
			summer.join();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}