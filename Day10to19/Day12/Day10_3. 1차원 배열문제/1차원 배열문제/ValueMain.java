import java.util.Scanner;

class Value
{
	//private int[] arr = new arr ;
	public static int minValue(int[] arr)
	{
		int min = arr[0];	
		for (int i=0; i<arr.length; i++)
		{
			if( min > arr[i])
			{
				min = arr[i];
			}
		}	
		return min;	
	}


	public static int maxValue(int[] arr)
	{
		int max = arr[0];
		for (int i=0; i<arr.length; i++)
		{
			if( max < arr[i])
			{
				max = arr[i];
			}
		}
		return max;
	}
}

class ValueMain
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];

		System.out.println("숫자" + arr.length + "개를 입력하세요.");
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}

		Value v = new Value();
		
		System.out.println("가장 작은 수는 " + Value.minValue(arr));
		System.out.println("가장 큰 수는 " + Value.maxValue(arr));

		System.out.println("가장 작은 수는 " + v.minValue(arr));
		System.out.println("가장 큰 수는 " + v.maxValue(arr));
	}
}

//EnhancedFor문으로도 해보자(참고하자)		