/*class MethodTest
{
	public static void main(String[] args)
	{
		int max = 3;
		hello(max);
	}
	public static void hello(int max) // void : 반환하는 값의 자료형이 없다, int max->parameter
	{
		for(int i=0; i<max; i++)
		{
			System.out.println("Hello");
		}
		
	}
}
*/

/*
class MethodTest
{
	public static void main(String[] args)
	{
		int result = 0;
		result = hello(3);
		System.out.println(result);
	}
	public static int hello(int max) // int : 반환하는 값의 자료형이 int형, int max->parameter
	{
		for(int i=0; i<max; i++)
		{
			System.out.println("Hello");
		}
		return 100;	
	}
}
*/

/*
class MethodTest
{
	public static void main(String[] args)
	{
		int result = add(5, 10);
		System.out.println(result);
	}
	public static int add(int num1, int num2) // void : 반환하는 값의 자료형이 없다, int max->parameter
	{
		int result = num1 + num2;
		return result;
		
	}
}*/

//1. 사칙연산을 각각 메소드로 사칙연산의 결과 값을 리턴한다.

import java.util.Scanner;

class MethodTest
{
	public static void main(String[] args)
	{
		int a = 0, b = 0, c = 0;
		String str1 = new String("+");
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		System.out.println("계산할 두 숫자를 입력하세요 : ");
		a = sc1.nextInt();
		b = sc2.nextInt();

		System.out.println("+, -, *, / 입력하세요 : ");
		String cal = sc3.nextline();
		if (cal == "str1")
		{
			int result = plus(a, b);
			System.out.println(result);
		}
		
	}
	
	public static int plus(int a, int b)
	{
		int result_plus = a + b;
		return result_plus;
	}
}
//2. 정수값 하나를 넘겨주면 그 정수에 해당하는 구구단을 출력하는 메소드
//(예 정수 3을 넘겨주면 3단을 출력). 리턴값 없음


//3. 정수값 두개를 넘겨주면 첫 번째 매개변수 시작단부터 두번째 매개변수
//끝단까지 출력하는 메소드
//(예 3과 5를 넘겨주면 3단부터 5단까지 출력)
//. 리턴값 없음