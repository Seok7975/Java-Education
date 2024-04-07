class Seller
{
	int price;
	int cnt;
	int money;
	
	public void inintseller(int p, int c, int m)
	{
		this.price=p;
		this.cnt=c;
		this.money=m;
	}
	public int sell(int money)
	{
		this.money+=money;
		int num=money/price;
		this.cnt-=num;
		return num;
	}
	public void sprintCS()
	{
		System.out.println("사과 단가"+price+"원");
		System.out.println("사과 수"+cnt+"개");
		System.out.println("잔액"+money+"원");
	}
}
class Buyer
{
	int cnt;
	int money;

	public void inintbuyer(int m)
	{
		this.money=m;
	}
	public void buy(Seller man, int m)
	{
		this.money-=money;
		this.cnt+=man.sell(m);
	}
	public void bprintCS()
	{
		System.out.println("사과 수"+cnt+"개");
		System.out.println("잔액"+money+"원");
	}
	
}
class AppleMain
{
	public static void main(String[]args)
	{
		Seller man1 = new Seller();
		Seller man2 = new Seller();
		Buyer minsu = new Buyer();
		man1.inintseller(2000,50,50000);
		man2.inintseller(1000,100,100000);
		minsu.inintbuyer(20000);
		minsu.buy(man1,6000);
		man1.sprintCS();
		minsu.buy(man2,5000);
		man2.sprintCS();
		minsu.bprintCS();
	}
}