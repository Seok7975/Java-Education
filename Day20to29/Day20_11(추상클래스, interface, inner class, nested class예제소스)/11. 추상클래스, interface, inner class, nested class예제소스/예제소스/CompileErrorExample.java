class TV
{
	public void onTV()
	{
		System.out.println("영상 출력 중");
	}
}

class Computer
{	
	public void dataReceive()
	{
		System.out.println("영상 데이터 수신 중");
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