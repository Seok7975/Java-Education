class TV
{
	public void onTV()
	{
		System.out.println("���� ��� ��");
	}
}

class Computer
{	
	public void dataReceive()
	{
		System.out.println("���� ������ ���� ��");
	}
}

class IPTV extends TV, Computer
{
	public void powerOn()
	{
		dataReceive();
		onTV();
	}
}

class CompileErrorExample
{	

	public static void main(String[] args)
	{
		IPTV iptv=new IPTV();
		iptv.powerOn();
		
		TV tv=iptv;
		Computer comp=iptv;
	}
}