

//1. for(i=1;true;i++)으로 설정하고, 1+2+3+ ... 순차적으로 더했을 때 최초로 5000을 넘는 수를 break를 통해 구현.
import java.util.Scanner;

/*class Conbreak1 // continue : 반복문의 처음으로 올라가라!, break
{
	public static void main(String[] args)
	{
		int i=0, sum=0;
		for(i=1; true; i++)
		{
			sum += i;
			System.out.println(sum);
			if ( sum > 5000) break;
		}
	}
}*/


//2. 1부터 20까지 출력을 하는데 2의 배수와 3의 배수는 출력하지 않기 continue 이용

/*class Conbreak2
{
	public static void main(String[] args)
	{
		int i=0 ;
		for (i=1; i<=20; i++)
		{
			if (i%2 ==0 || i%3 ==0) continue;
			
			System.out.println(i);
		}
	}
}*/


/*class Conbreak2
{
	public static void main(String[] args)
	{
		int i=0 ;
		for (i=1; i<=20; i++)
		{
			if (i%2 ==0) continue;
			else if (i%3 ==0) continue;
			
			System.out.println(i);
		}
	}
}*/

//3. 5의 배수이자 7의 배수인 가장 작은 수 break

/*class Conbreak3
{
	public static void main(String[] args)
	{
		int i=0;
		for (i=1; ture; i++)
		{
			//System.out.println(i);
			if (i%5 == 0 && i%7 == 0) break;
		}
	}
}		*/


//4. 100 이하의 자연수 중에 5의 배수이자 7의 배수인 정수를 전부출력하고, 그 수를 세어보는 프로그램 continue;
/*
class Conbreak4
{
	public static void main(String[] args)
	{
		int i=0, cnt=0;
		for (i=1; i<=100; i++)
		{
			
			if (i%5 == 0 && i%7 == 0)
			{
				System.out.println(i+ "   " + cnt);
				cnt +=1;
				
			}
			else continue;
		}
	}
}	
*/

class Conbreak4
{
	public static void main(String[] args)
	{
		int i=0, cnt=0;
		for (i=1; i<=100; i++)
		{
			
			if (i%5 != 0 || i%7 != 0)  // 5의 배수가 아니거나  7의 배수가 아니면 
			{
				continue;
				
			}
			cnt++;
			System.out.println(i+ "   " + cnt);

		}
	}
}	
