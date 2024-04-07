interface TV
{
	public void onTV();		// public abstract void on TV()�� ����Ѱų� �ٸ�����
}

class TVImpl
{
	public void onTV()
	{
		System.out.println("���� ��� ��");
	}
}

interface Computer
{
	public void dataReceive();
}

class ComputerImpl
{	
	public void dataReceive()
	{
		System.out.println("���� ������ ���� ��");
	}
}

class IPTV implements TV, Computer
{
	ComputerImpl comp=new ComputerImpl();
	TVImpl tv = new TVImpl();
	
	public void dataReceive()
	{
		comp.dataReceive();
	}
	public void onTV()
	{
		tv.onTV();
	}
	public void powerOn()
	{
		dataReceive();
		onTV();
	}
}

class MultiInheriAlternative
{	

	public static void main(String[] args)
	{
		IPTV iptv=new IPTV();
		iptv.powerOn();
		
		TV tv=iptv;
		Computer comp=iptv;
	}
}