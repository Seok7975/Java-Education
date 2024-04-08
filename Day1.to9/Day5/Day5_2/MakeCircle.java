/*④ 원 클래스 만들기
멤버 변수(인스턴스 변수)
반지름 r
면적 πr²
둘레 2πr
파이 π 3.14

멤버 메소드(인스턴스 메소드)
원 초기화 하는 메소드
원의 둘레 구하는 메소드
원의 면적 구하는 메소드
원의 상태를 출력하는 메소드(반지름, 둘레, 면적)

⑤ 원 인스턴스 3개 만들기
	1. 반지름 5
	2. 반지름 10
	3. 반지름 30
⑥ ⑤에서 만든 원 인스턴스들의 상태값 출력하기*/


class Circle
{
	double radius = 0, pi = 3.14, area = 0, round = 0;

	public void initCircle(double r)
	{
		this.radius = r;
	}
	
	public void calculateArea()
	{
		area = pi * (Math.pow(radius,2));		
	}

	public void calculateRound()
	{
		round = 2*pi*radius;
	}

	public void printState()
	{
		System.out.println("반지름 : " + radius);
		System.out.println("둘레 : " + round);
		System.out.println("면적 : " + area);	
	}
}

class CircleMain
{
	public static void main(String[] args)
	{
		Circle c1 = new Circle();
		c1.initCircle(5);
		c1.calculateRound();
		c1.calculateArea();
		c1.printState();
		System.out.println("=====================================");

		Circle c2 = new Circle();
		c2.initCircle(10);
		c2.calculateRound();	
		c2.calculateArea();	
		c2.printState();
		System.out.println("=====================================");

		Circle c3 = new Circle();
		c3.initCircle(30);
		c3.calculateRound();
		c3.calculateArea();
		c3.printState();
		System.out.println("=====================================");
	}
}

