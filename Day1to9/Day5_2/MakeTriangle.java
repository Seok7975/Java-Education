/*
class Number
{
	int num;
	public void initnum(int n)
	{
		num = n;
	}

	public void printCurrentState()
	{
		System.out.println(num);
	}

}

class NumberMain
{
	public static void main(String[] args)
	{

		Number n1 = new Number();     //객체 생성   n1, n2 : 참조 변수
		n1.initNum(10);
		n1.printCurrentState();

		Number n2 = new Number();
		n2.initNum(20);
		n2.printCurrentState();

		Number n3;  //객체 생성이 아니고 변수생성
		n3.printCurrentState();
		n3 = n2;
		n3.printCurrentState();

		n2.initNum(30);
		n2.printCurrentState();
		n3.printCurrentState();
		
		Number n4;
		Number n5 = new Number();
	}

}
*/

/*
클래스 만드는 실습해보기

①. 삼각형 클래스 만들기.
멤버 변수(인스턴스 변수)   num1 num2 num3
밑변                            base
높이                            height
넓이                            area

멤버 메소드(인스턴스 메소드)  -> 함수
삼각형 초기화 하는 메소드
삼각형의 면적 구하는 메소드
삼각형의 현재 상태 출력하는 메소드(밑변, 높이, 넓이 출력)

② 삼각형 인스턴스 3개 만들기
	1. 밑변 10, 높이 5
	2. 밑변 4, 높이 2
	3. 밑변 20 높이 10
③ ②에서 만든 삼각형 인스턴스들의 상태값 출력하기(밑변, 높이, 면적)
*/



class Triangle
{
	int base, height , area;	  // 멤버변수 -> 초기화값을 입력 안하면 기본 0, boolean은 false

	public void initTriangle(int b, int h)  //삼각형 초기화, 메소드 안에 있는 변수들 -> 지역변수
					//멤버 메소드 안에는 멤버변수를 인식할 수 있다!
	{
		base = b;   / base = base; 만약 이럴때 멤버변수 vs 지역변수에선 멤버변수가 우선순위! 지역변수에 값이 안들어갈 수 있음 -> this.base = base  사용!
		height = h;
		//num3 = area;
	}

	public void makingArea() // 면적
	{
		area = (base*height)/2;
		
	}
	
	public void printState()  //상태출력
	{
		System.out.println("밑변 : " + base);
		System.out.println("높이 : " + height);
		//System.out.println("넓이 : " + area);
	}

}

class TriangleMain
{
	public static void main(String[] args)
	{
		Triangle t1 = new Triangle();
		t1.initTriangle(10, 5);
		t1.makingArea();
		t1.printState();
		System.out.println("=====================================");

		Triangle t2 = new Triangle();
		t2.initTriangle(4, 2);
		t2.makingArea();
		t2.printState();
		System.out.println("=====================================");

		Triangle t3 = new Triangle();
		t3.initTriangle(20, 10);
		t3.makingArea();
		t3.printState();
		System.out.println("=====================================");

	}
}
