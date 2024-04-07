class Number  // 인스턴스(멤버) ⊃ 스태틱(클래스) //⊂⊃
{
	public int num1;  //멤버 변수 및 인스턴스 변수 -> 클래스 이름으로 접근 불가
	public static int num2;  //클래스 변수, 스태틱 변수 ->클래스 이름으로도 접근가능, 모든 인스턴스에서 공유

	Number() //디폴트 생성자
	{
		num1++;
		num2++;
	}
	public static void printNumber2() 
	//스태틱 매소드에서는 인스턴스 변수와 메소드를 불러올 수 없음, 스태틱 변수만 불러오기 가능 
	{
		System.out.println(num2); 
		//System.out.println(num1 + " " + num2);  //에러, 인스턴스 변수 참조 불가
		//printNumber();  //에러, 인스턴스 변수 참조 불가
	}
	
	public void printNumber()
	{
		System.out.println(num1 + " " + num2);  // 인스턴스 변수, 스태틱 변수 불러오기 가능
	}
}


class NumberMain
{
	public static void main(String[] agrs)
	{
		Number n1 = new Number(); // num1 = 1  num2 = 1
		Number n2 = new Number(); // num1 = 1  num2 = 2
		Number n3 = new Number(); // num1 = 1  num2 = 3

		System.out.println(n1.num1);  //1
		System.out.println(n1.num2);  //3, 객체를 생성할때마다 1씩 증가해서
		System.out.println(n2.num1);  //1
		System.out.println(n2.num2);  //3

		System.out.println(n3.num1);  //1
		System.out.println(n3.num2);  //3


		System.out.println(Number.num1); //에러

		n2.num1 = 20;
		n3.num1 = 30;
		System.out.println(n1.num1);  //1
		System.out.println(n2.num1);  //20
		System.out.println(n3.num1);  //30

		System.out.println(n1.printNumber());  //1 3
		System.out.println(n2.printNumber());  //20 3
		System.out.println(n3.printNumber());  //30 3

		Number.printNumber2(); //클래스매소드

		System.out.println(n1.num2);
		Sysyem.out.println(Number.num2) ; //가독성을 위해 클래스 변수는 클래스로 호출

		n1.printNumber2();
		Number.printNumber2();


	}

}


//