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
�������� �����ٸ�(Scheduling)�� �������� �켱���� ��Ʈ��
�� �̻��� �����尡 ������ �� �ֱ� ������, �ڹ� ����ӽ���(�ڹ� ����ӽ��� �Ϻη� �����ϴ� ������ �����ٷ���) �������� ������ �����ٸ�(��Ʈ��)�ؾ� �Ѵ�. �����ٸ��� ���Ǵ� �˰����� �⺻��Ģ�� ������ ����.
* �켱������ ���� �������� ������ �켱�Ѵ�.
* ������ �켱������ �����尡 �� �̻� ������ ���� CPU�� �Ҵ�ð��� �й��ؼ� �����Ѵ�.
�ڹ��� �����忡�� �켱������� ���� �Ҵ�ȴ�. �̴� ����ӽſ� ���ؼ� �켱������ ����Ǿ�� �ϴ� �������� ������ �ǹ��ϴ� ������, ���� ���� �켱 ������ ���� 10����, ���� ���� �켱������ ���� 1�� ǥ���Ѵ�.(���� �� 10�ܰ��� �켱������ �����Ѵ�.) �׸��� �̷��� �������� �켱������ ���α׷��󿡼� ���� �� Ȯ���� �����ϴ�.
�������� �������� �ý����� ��Ȳ�� ȯ�濡 ���� �ſ� ���� ���̸� ���δ�. �� "������ �켱������ ��������� CPU�� �Ҵ�ð��� ������(����)������ ����ȴ�"��� �� �̾߱��� �� ���� ��, ���� �����ϰ� ��ġ������ �Ҵ�ð��� �Ҵ������ �̾߱��� ���� ����.
*/