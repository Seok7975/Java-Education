//1. Factorial을 재귀메소드로  n! = n*(n-1)!

/*
import java.util.Scanner;
class Remethod
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();
		int result = factorial(num);
		System.out.println(result);
	}	
	public static int factorial(int num)
	{
		if (num ==1) return 1;
		return num*factorial(num-1);


	}	
}	
*/



//2. 1부터 n까지의 합을 재귀메소드로 구현.

/*
import java.util.Scanner;
class Remethod
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();
		int result = factorial(num);
		System.out.println(result);
	}	
	public static int factorial(int num)
	{
		if (num ==1) return 1;
		return num+factorial(num-1);


	}	
}
*/
//3. 정수 n을 전달 받아서, 2의 N승을 계산하여 반환하는 메소드를 재귀의 형태로 정의할 것.
/*
import java.util.Scanner;
class Remethod
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();
		int result = factorial(num);
		System.out.println(result);
	}	
	public static int factorial(int num)
	{
		if (num == 1) return 2;

		return 2*factorial(num-1);

	}	
}
*/

//4. 10진수 정수를 전달받아서, 전달받은 정수에 해당하는 2진수를 출력하는 메소드를 재귀의 형태로 정의

/*
import java.util.Scanner;
class Remethod
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();
		binaryNum(num);
		
	}	
	public static void binaryNum(int num)
	{
		if (num < 2) System.out.print(num + " ");
		else
		{
			binaryNum(num/2);
			System.out.print(num%2 + " ");
		}
	
		
	}	
}
*/
//5. 정수 하나를 넘겨주면 그 정수번째의 피보나치 수열을 리턴해 주는 메소드 
//1 1 2 3 5 8 13 21 ...

import java.util.Scanner;
class Remethod
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i<num; i++)
		{
			System.out.print( fibonacci(i) + "  ");
			
		}
	}	
	public static int fibonacci(int num)
	{
		if (num == 1 || num == 2) return 1;
		else
		{
			return fibonacci(num-1) + fibonacci(num-2);
		}
	
		
	}	
}