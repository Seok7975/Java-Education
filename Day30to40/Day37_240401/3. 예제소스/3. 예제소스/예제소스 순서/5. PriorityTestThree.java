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
				// sleep�� Thread Ŭ������ static �޼ҵ�μ�, �����帧�� �Ͻ������� ���ߴ� ������ �Ѵ�.
				// sleep�� �����μ� �켱���� ���� �ֵ� ������ ��ȸ�� ����
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
			//�������� �켱������ ���� ����
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
�������� ����, ���� �켱������ �����尡 �Ѿ��̳� �����Կ��� �ұ��ϰ� ����� ����ǰ� �ִ� ���� ����
�켱������ �����带 �� �� �ִ�. ��� �켱������ ���� ������� �ϴ��� ���� �켱������ �����尡 
CPU�� �纸�ؼ� ������ ��ȸ�� ��� �Ǹ�, �ּ� ������ ���� �ð��� ������ �޴´�. ���� ���� ���� ����
����� ���̴� ���̴�. ��������� ���� �켱������ �����嵵 ����� ������ ��ȸ�� ���� �� �ְ�, �� ������
���൵ �ȴ�.
*/
