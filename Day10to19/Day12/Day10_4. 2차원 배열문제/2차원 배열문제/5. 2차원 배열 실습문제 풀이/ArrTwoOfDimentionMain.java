import java.util.Scanner;
import java.util.Arrays;

class ArrTwoOfDimention
{
	
	public static void addTwoDArr(int[][] arr, int add)
	{
	
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				arr[i][j] += add;
			}
		}
		
		for (int i=0; i<arr.length; i++)
		{
			System.out.println(Arrays.toString(arr[i]));
		}
	}
}

class ArrTwoOfDimentionMain
{
	public static void main(String[] args)
	{
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		Scanner sc4 = new Scanner(System.in);
		System.out.println("몇차원 배열 만들것인가");
		int num1 = sc1.nextInt();
		int num2 = sc2.nextInt();
		int[][] arr = new int[num1][num2];

		System.out.println("배열에 숫자를 입력하세요.");
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{	
				arr[i][j] = sc3.nextInt();
			}
		}
		
		System.out.println("각 숫자에 몇을 더할 것인가요?");
		int num4 = sc4.nextInt();

		ArrTwoOfDimention.addTwoDArr(arr, num4);
	}
}
		