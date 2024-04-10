// 4_1_1. int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식
/*
import java.util.Random;

class Ch4_1_1
{
	public static void main(String[] args)
	{	
		int x = 0;		
		boolean discrimination = true;
		Random rand = new Random();
		x = rand.nextInt(100)+1;
		if(10<x && x<20)
		{
			discrimination = true;
			System.out.println("랜덤 생성된 숫자는 " + x + "이고 " + discrimination + "입니다.");
		}
		else
		{
			discrimination = false;
			System.out.println("랜덤 생성된 숫자는 " + x + "이고 " + discrimination + "입니다.");
		}

	}
}
*/

// 4_1_2. char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식

/*
import java.util.Scanner;
class Ch4_1_2
{
	public static void main(String[] args)
	{	
		char ch = ' ';		
		
		Scanner sc = new Scanner(System.in);
		ch = sc.nextLine().charAt(0);

		boolean discrimination = (ch != ' ' && ch !='	');
		if(discrimination)
		{
			System.out.println(discrimination);
		}
		else
		{
			System.out.println(discrimination);
		}

	}
}
*/

// 4_2. 1부터 20까지의 정수 중에서 2또는 3의 배수가 아닌 수의 총합을 구하시오
/*
class Ch4_2
{
	public static void main(String[] args)
	{	
		int num=0;
		for(int i=1; i<=20; i++)
		{
			if (i%2 ==0 || i%3 ==0)
			{
				continue;
			}
			num += i ;
		}
		System.out.println(num);		
	}
}
*/
// 4_3. 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10) 의 결과를 계산하시오

/*
class Ch4_3
{
	public static void main(String[] args)
	{
		int sum=0;
		for (int i=1; i<=10; i++)
		{
			for (int j=1; j<=i ; j++)
			{
				sum +=j;
			}
		}
		System.out.println(sum);
	}
}
*/
//4_4. 1+(-2)+3+(-4)+...  과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100이상이 되는지 구하시오.

/*
class Ch4_4
{
	public static void main(String[] args)
	{
		int sum = 0;
		int i = 0;
		for (i=1; sum<100 ; ++i)
		{
			if ( i % 2 == 1)
			{
				sum += i;
			}
			else
			{
				sum += -i;
			}
			System.out.println(i + "     " + sum);
		}
		System.out.println(i-1 + "     " + sum);
	}
}
*/

//4_5. for문을 while문으로

/*
class Ch4_5
{
	public static void main(String[] args)
	{

		int i=0;
		int j=0;
		while(i<=10)
		{
			
			while(j<=i)
			{
				
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
			j=0;
		}
	}
}
*/

//4_6. 두개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오

/*
class Ch4_6
{
	public static void main(String[] args)
	{
		for (int i=1 ; i<=6 ; i++)
		{
			for (int j=1 ; j<=6; j++)
			{
				if ( i+j == 6)
				{
					System.out.println(i+ " " + j);
				}
			}
		}
	}
}
*/

//4_7. Math.random()을 이용해서 1부터 6사이의 임의의 정수를 변수 value에 저장하는
//코드를 완성하라. (1)에 알맞은 코드를 넣으시오 

/*
class Ch4_7
{
	public static void main(String[] args) 
	{
		int value = ( (int)(Math.random()*6)+1);  // Math.random()*6 : 0이상 6미만의 난수
		System.out.println("value:"+value);
	}
}
*/

//4_8. 방정식 2x+4y=10의 모든 해를 구하시오.
//단, x와 y는 정수이고 각각의 범위는 0<=x,y<=10

/*
class Ch4_8
{
	public static void main(String[] args)
	{
		for (int x=0; x<=10; x++)
		{
			for (int y=0; y<=10; y++)
			{
				if( 2*x+4*y == 10)
				{
					System.out.println("x=" + x + ", y=" + y);
				}
			}
		}
	}
}
*/

//4_9. 숫자로 이루어진 문자열 str이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코 
//드를 완성하라 만일 문자열이 "12345" 라면 , ‘1+2+3+4+5’의 결과인 15를 출력이 출력되 
//어야 한다. (1)에 알맞은 코드를 넣으시오 . 
//[Hint] String클래스의 charAt(int i)을 사용

/*
class Ch4_9
{
	public static void main(String[] args)
	{
		String str = "12345";
		int sum = 0;
		
		for(int i=0; i< str.length() ; i++)
		{
			sum += (str.charAt(i)-48);  // ASKII코드 0 = 48
		}
		System.out.println("sum=" + sum);
	}
}
*/

//4_10. int타입의 변수 num이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를 완성해라.
//	만일 변수 num의 값이 12345라면, '1+2+3+4+5'의 결과인 15를 출력하라.
//	주의) 문자열로 변환하지 말고 숫자로만 처리해야 한다.

/*
class Ch4_10
{
	public static void main(String[] args)
	{
		int num = 12345;
		int sum = 0;
		for( ; num>0 ; )
		{
			sum += num % 10;
			num = num / 10;
		}
		System.out.println("sum=" + sum);
	}
}
*/


//4_11. 피보나치수열 a의 10항까지 구하시오.

/*
class Ch4_11 
{
	public static void main(String[] args)
	{
		// Fibonnaci 1, 1 . 수열의 시작의 첫 두 숫자를 로 한다
		int num1 = 1;
		int num2 = 1;
		int num3 = 0; // 세번째 값
		System.out.print(num1+", "+num2);
		for (int i = 0 ; i < 8 ; i++ ) // 3 4 5 6 7 8 9 10
		{
			num3 = num1+num2;
			System.out.print(", "+ num3);
			num1 = num2;
			num2 = num3;
		
		}
	} // end of main
} // end of class
*/



//4_12

/*
class Ch4_12
{
	public static void main(String[] args)
	{
		int num1 = 1, num2 = 1;
		for(int i=0; i<=9; i++)
		{
			num2 = i%3 + 1;
			for(int j=0; j<3; j++)
			{	
				num1 = i/3*3 + 2 + j;
				if(num1>9) break;
				System.out.print(num1 + "*" + num2 + "=" + num1 * num2 + "\t");
			}
			System.out.println();
			if( (i+1)%3 == 0)
			{
				System.out.println();
			}
		}
	}
}
*/


//4_13 문자열이 숫자인지 판별하는 프로그램

/*
import java.util.Scanner;

class Ch4_13
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("입력하던가말던가");
		String value = sc.nextLine();
		boolean isNumber = true;

		for(int i=0; i<value.length() ; i++)
		{
			if(!('0' <= value.charAt(i) && value.charAt(i)<= '9'))
			{
				isNumber = false;
			}
			else continue;
		}
		
		if (isNumber)
		{
			System.out.println(value + "는 숫자입니다.");
		}
		else
		{
			System.out.println(value + "는 숫자가 아닙니다.");
		}
	}
}
*/

//4_14 다음은 숫자맞추기 게임을 작성한 것이다. 1과 100사이의 값을 반복적으로 입력해서 컴퓨터가 생각한
//	값을 맞추면 게임이 끝난다. 사용자가 값을 입력하면, 컴퓨터는 자신이 생각한 값과 비교해서
//	결과를 알려준다. 사용자가 컴퓨터가 생각한 숫자를 맞추면 게임이 끝나고 몇 번 만에 숫자를
//	맞췄는지 알려준다.

/*
import java.util.Random;
import java.util.Scanner;

class Ch4_14
{
	public static void main(String[] args)
	{
		Random rand = new Random();
		int answer = rand.nextInt(100)+1;
		int cnt = 0;

		while(true)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("1~100, 숫자 입력해주세요");
			int getNum = sc.nextInt();
			
			if ( getNum > answer)
			{
				System.out.println("down!");
				cnt++;
				continue;
			}
			else if ( getNum < answer)
			{
				System.out.println("up!");
				cnt++;
				continue;	
			}
			else if ( getNum == answer)
			{
				System.out.println("정답입니다!");
				cnt++;
				break;
			}
			else
			{
				System.out.println("잘못입력하셨습니다!");
				cnt++;
				continue;
			}
		
				
		}
		System.out.println("총 " + cnt +"번의 기회를 사용하셨습니다!");
	}
}	
*/

//4_15 회문수(palindrome)를 구하는 프로그램을 짜라
//	회문수 : 숫자를 거꾸로 읽어도 앞으로 읽는 것과 같은 수를 말함 ex)12321

// int형 자릿수 리버스 개념 참고하장!

import java.util.Scanner;

class Ch4_15
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하던가 말던가");
		int number = sc.nextInt();
		int tmp = number;
		int reverseNumber = 0;

		while(tmp != 0)
		{
			reverseNumber = reverseNumber*10 + tmp %10;
			tmp = tmp /10;
		}

		if (number == reverseNumber)
		{
			System.out.println ( number + "는 회문수입니다.");
		}
		else
		{
			System.out.println( number + "는 회문수가 아닙니다.");
		}
	}
}
	