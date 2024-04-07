class Accumulator
{
	private int val;
	
	Accumulator(int init){val=init;}	
	protected void accumulate(int num)
	{
		if(num<0)      // ������ ���� ��󿡼� ����!
			return;
		val+=num;
	}
	protected int getAccVal(){return val;}
}

class SavingAccount extends Accumulator
{
	public SavingAccount(int initDep)
	{
		super(initDep);      // ���尳�� �� ù �Աݾ�
	}
	public void saveMoney(int money)
	{
		accumulate(money);
	}
	public void showSavedMoney()
	{
		System.out.print("���ݱ����� �����ݾ�: ");
		System.out.println(getAccVal());
	}
}

class PrivateInheritance
{	
	public static void main(String[] args)
	{
		SavingAccount sa=new SavingAccount(1000);
		sa.saveMoney(1000);
		sa.saveMoney(1000);
		sa.showSavedMoney();
		
	}
}