// 임의의 수를 입력받은 후 소수인지 아닌지 출력하기.
//소수 정의(prime number) : 1과 자기 자신만으로 나누어 떨어지는 1보다 큰 양의 정수

/*import java.util.Scanner;

class Sosu
{
	public static void main(String[] args)
	{
		Scanner a = new Scanner(System.in);
		int num = 0;
		System.out.print("숫자를 입력해주세요 : ");
		num = a.nextInt();
		a.close();

		int i = 0;

		for (i=1; i<=num; i++)  // i<=1을 넣어버리면 반복문 자체가 안돌아감
		{
			//System.out.println(i);
			if (i !=1 && num%i == 0)  break;

		}
		//System.out.println(i); 
		if ( i==num) System.out.println("소수가 맞습니다!");
		else System.out.println("소수가 아닙니다!");

		
	}
}
*/
//////////////////////////////////////////////////////////////////////////////////////////////////////

/*class Sosu
{
	public static void main(String[] args)
	{
		Scanner a = new Scanner(System.in);
		int num = 0;
		System.out.print("숫자를 입력해주세요 : ");
		num = a.nextInt();
		a.close();

		boolean flag = true;
		int i = 0;
		if (num <= 1) 
		{
			flag = false;
			
		}
		for (i=1; i<num; i++)
		{

			if (i !=1 && num%i == 0)  
			{
				flag = false;
				break;
			}

		}
		//System.out.print(flag);
		if (flag) System.out.println("소수가 맞습니다!");
		else System.out.println("소수가 아닙니다!");

		
	}
}


*/

////////////////1부터 100까지 소수 출력
import java.util.Scanner;

class Sosu
{
	public static void main(String[] args)
	{

		int i = 0, j = 0;

		for (i=1; i<=100; i++)  //
		{
			if ( i==1) continue;
			if ( 100%i == 0) continue;
			for (j=1; j <=i; j++)
			{
				if (j != 1 && i%j == 0) break;
			
			}

			if( i == j) System.out.print(i + "  ");
			
		}
	
	}

}