class Accumulator
{
	private int val;
	
	Accumulator(int init){val=init;}	
	protected void accumulate(int num)
	{
		if(num<0)      // 음수는 누적 대상에서 제외!
			return;
		val+=num;
	}
	protected int getAccVal(){return val;}
}

class SavingAccount extends Accumulator
{
	public SavingAccount(int initDep)
	{
		super(initDep);      // 통장개설 시 첫 입금액
	}
	public void saveMoney(int money)
	{
		accumulate(money);
	}
	public void showSavedMoney()
	{
		System.out.print("지금까지의 누적금액: ");
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