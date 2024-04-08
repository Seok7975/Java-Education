/*
과일장수 클래스

인스턴스 변수
사과값
사과개수
가지고 있는 돈

메소드
인스턴스 변수를 초기화 한다.
구매자에게 돈을 받으면 사과를 건네준다.
현재 자신의 상태를 출력.

구매자 클래스
인스턴스 변수
사과개수
가지고 있는 돈

메소드
인스턴스 변수를 초기화 한다.
과일장수에게 돈을 주고 사과를 받는다.
현재 자신의 상태를 출력.


과일메인 클래스
사과장수 두명을 만든다.
한명은 사과하나의 값은 2000 원이고 사과를 50 개 들고 있고  그리고 가진돈은 50000원이다.
또 다른 사과장수는 사과하나의 값은 1000원이고 사과를 100개를 들고 있고  그리고 가진돈은 100000원이다.

구매자는 20000원의 돈을 가지고 있으며 처음에는 사과가 하나도 없다.
2000원짜리 사과 3개와 1000원짜리 사과 5개를 구매한다.
우선은 정확히 자신이 사고싶은 만큼의 돈을 넘겨주고 거스름돈은 없는 걸로 하자.
사과 구매후 3명(과일장수, 구매자)의 상태를 출력한다.

*/


class sellerApple
{
	int applePrice=0, numOfApple=0, sellerMoney=0;
	
	public void initFruitSeller(int applePrice, int numOfApple, int sellerMoney)
	{
		this.applePrice = applePrice;
		this.numOfApple = numOfApple;
		this.sellerMoney = sellerMoney;
	}

	public int sell(int buyerMoney)
	{
		int num = buyerMoney / applePrice; //산(판) 개수
		this.numOfApple -= num; // 남은 개수
		this.sellerMoney += buyerMoney;  // 돈 = 있던 돈 + 판 돈
		return num; //판매 갯수 = 산 갯수		
	}

	public void printSellerStatement()
	{
		System.out.println("사과 가격 : " + this.applePrice);
		System.out.println("돈 : " + this.sellerMoney);
		System.out.println("사과 갯수 : " + this.numOfApple);
	}
}
class buyerApple
{
	int numOfApple = 0, buyerMoney = 0;
	
	public void initFruitBuyer(int buyerMoney)
	{
		this.numOfApple = numOfApple;
		this.buyerMoney = buyerMoney;
	}

	public void buy(sellerApple seller, int money)
	{
		this.buyerMoney -= money;
		this.numOfApple += seller.sell(money);
	}

	public void printBuyerStatement()
	{
		System.out.println("사과 갯수 : " + numOfApple);	
		System.out.println("돈 : " + buyerMoney);
	}	
}

class FruitMain
{
	public static void main(String[] args)
	{
		sellerApple seller1 = new sellerApple();
		seller1.initFruitSeller(2000, 50, 50000);
	
		sellerApple seller2 = new sellerApple();
		seller2.initFruitSeller(1000, 100, 100000);

		buyerApple buyer = new buyerApple();
		buyer.initFruitBuyer(20000);

		buyer.buy(seller1, 6000);
		seller1.printSellerStatement();
		System.out.print("\n\n");
		seller2.printSellerStatement();
		System.out.print("\n\n");
		buyer.printBuyerStatement();
		System.out.print("\n\n");
	}
}



/*
class FruitSeller
{
	int PRICE;
	int numOfApples;
	int money;

	public void initFruitSeller(int price, int numOfApples, int money)
	{
		this.PRICE = price;
		this.numOfApples = numOfApples;
		this.money = money;
	}
	
	public int sell(int money)
	{
		int num = money/PRICE;
		this.money += money;  //사과장수의 돈 = 사과장수의 돈 + 내가 준 돈
		numOfApples -= num;
		return num;

	}

	public void printCS()
	{
		System.out.println("사과 가격 " + PRICE);
		System.out.println("돈" + money);
		System.out.println("현재 소지금" + money);
	}
}
class Buyer
{
	int numOfApples;
	int money;

	public void initBuyer(int money)
	{
		this.money = money;
		numOfApples = 0;
	}


	public void buy(FruitSeller Seller, int money)
	{
		this.money -= money;
		this.numOfApples += Seller.sell(money);
	}

	public void printCS()
	{
		System.out.println("돈" + money);
		System.out.println("사과개수" + numOfApples);
	}

}

class FruitMain
{
	public static void main(String[] args)
	{
		FruitSeller seller1 = new FruitSeller();
		seller1.initFruitSeller(2000, 50, 50000);
		FruitSeller seller2 = new FruitSeller();
		seller2.initFruitSeller(1000, 100, 100000);

		Buyer buyer = new Buyer();
		buyer.initBuyer(20000);
		buyer.buy(seller1, 6000);
		seller1.printCS();
		seller2.printCS();
		buyer.printCS();
	}
}
*/