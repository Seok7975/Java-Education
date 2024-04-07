//4. 숫자하나를 넘겨주면 1부터 그 숫자까지 더해서 그 값을 리턴하는 메소드
//(예 5를 넘겨주면 1부터 5까지 순차적으로 더해서 그 값을 리턴)
/*
import java.util.Scanner;

class Method2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력 : ");
		int num = sc.nextInt();
		int result = add(num);
		System.out.println(result);

	}

	public static int add(int num)
	{
		int sum=0;
		for (int i=1; i<=num; i++)
		{
			sum = sum+i;
		}
	
		return sum;
	}
}

*/
//5. 정수값 두개를 넘겨주면 첫 번째 매개변수가 시작값부터 두 번째 매개
//변수가 끝값까지 더해서 리턴
//(5와 10을 넘겨주면 5부터 10까지 순차적으로 더해서 그 값을 리턴)

/*
import java.util.Scanner;

class Method2
{
	public static void main(String[] args)
	{
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		System.out.println("두개의 숫자입력 ");
		int num1 = sc1.nextInt();
		int num2 = sc2.nextInt();
		int result = abs(num1, num2);
		System.out.println(result);

	}

	public static int abs(int num1, int num2)
	{
		if ( num1 > num2)
		{
			int temp =0;
			temp = num2;
			num2 = num1;
			num1 = temp;
		}

		int sum=0;
		for (int i=num1; i<=num2; i++)
		{
			sum = sum+i;
		}
	
		return sum;
	}
}
*/

//6. 정수값 하나를 넘겨주면 그 정수값에 대한 팩토리얼 값을 리턴
/*
import java.util.Scanner;

class Method2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력 ");
		int num = sc.nextInt();
		int result = mul(num);
		System.out.println(result);

	}

	public static int mul(int num)
	{

		int sum=1;
		for (int i=num; i>=1; i--)
		{
			sum *= i;
		}
	
		return sum;
	}
}*/


//7. 숫자하나를 넘겨주면 그 숫자가 소수이면 true를 리턴 소수가 아니면 false를 리턴하는 메소드
/*
import java.util.Scanner;

class Method2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력 ");
		int num = sc.nextInt();
		boolean result = sosu(num);
		System.out.println(result);

	}

	public static boolean sosu(int num)
	{

		boolean result = true;
		for (int i=2; i<num; i++)
		{
			if (num%i ==0)
			{
				result = false;
				break;
			}
		}
	
		return result;
	}
}*/

/*
import java.util.Scanner;

class Method2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력 ");
		int num = sc.nextInt();
		String result = sosu(num);
		System.out.println(result);

	}

	public static String sosu(int num)
	{

		String result = "true";
		for (int i=2; i<num; i++)
		{
			if (num%i ==0)
			{
				result = "false";
				break;
			}
		}
	
		return result;
	}
}
*/



//8. 7번 메소드를 이용하여 1부터 100사이의 모든 소수 출력. 7번메소드는 변경하면 안된다.

/*
class Method2
{
	public static void main(String[] args)
	{

		int num = 0;
		for (num = 1; num <=100; num++)
		{
			boolean result = sosu(num);
			if ( num != 1 && result == true)
			{
				System.out.println( num);
			}
			else continue;
		}
	}

	public static boolean sosu(int num)
	{

		boolean result = true;
		for (int i=2; i<num; i++)
		{
			if (num%i ==0)
			{
				result = false;
				break;
			}
		}
	
		return result;
	}
}
*/
