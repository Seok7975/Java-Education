/*
5. 문제5 폴더에 있는 소스코드는 if문을 이용한 예외처리 부분이 코드의 
중간중간에 삽입되어 있다. 따라서 코드를 분석하는데 있어서 불편함이 따를 수 있다. 
그러나 try~catch문을 활용하면 예외처리를 위한 코드를 완전히 별도로 묶을 수 있다. 
하나의 try 영역에 둘 이상의 catch 영역을 구성할 수 있기 때문이다.
문제에 있는 소스코드를 try~catch문으로 변경해 보자.
*/

import java.util.Scanner;

class ExceptionHandleUseTryCatch
{	
	public static void main(String[] args)
	{
		Scanner keyboard=new Scanner(System.in);
		int[] arr=new int[100];
		
		for(int i=0; i<3; i++)
		{
			try
			{
				System.out.print("피제수 입력: ");
				int num1=keyboard.nextInt();
				
				System.out.print("제수 입력: ");
				int num2=keyboard.nextInt();
				
				System.out.print("연산결과를 저장할 배열의 인덱스 입력: ");
				int idx=keyboard.nextInt();
				
				arr[idx]=num1/num2;
				System.out.println("나눗셈 결과는 "+arr[idx]);
				System.out.println("저장된 위치의 인덱스는 "+idx);	
			}
			catch(ArithmeticException e)
			{
				System.out.println("제수는 0이 될 수 없습니다.");
				i-=1;
				continue;
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("유효하지 않은 인덱스 값입니다.");
				i-=1;
				continue;
			}
		}
	}
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//바꾸기 전
/*
import java.util.Scanner;

class ExceptionHandleUseIf
{	
	public static void main(String[] args)
	{
		Scanner keyboard=new Scanner(System.in);
		int[] arr=new int[100];
		
		for(int i=0; i<3; i++)
		{
			System.out.print("피제수 입력: ");
			int num1=keyboard.nextInt();
			
			System.out.print("제수 입력: ");
			int num2=keyboard.nextInt();
			
			if(num2==0)
			{
				System.out.println("제수는 0이 될 수 없습니다.");
				i-=1;
				continue;
			}
			
			System.out.print("연산결과를 저장할 배열의 인덱스 입력: ");
			int idx=keyboard.nextInt();
			
			if(idx<0 || idx>99)
			{
				System.out.println("유효하지 않은 인덱스 값입니다.");
				i-=1;
				continue;
			}
			
			arr[idx]=num1/num2;
			System.out.println("나눗셈 결과는 "+arr[idx]);
			System.out.println("저장된 위치의 인덱스는 "+idx);				
		}
	}
}
*/