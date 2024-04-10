import java.util.Scanner;

class Value
{
	//private int[] arr = new arr ;
	public static int minValue(int[] arr)	//arr이라는 지역변수이자 참조변수생성
	{
		int min = arr[0];	
		for (int i : arr)	//지역변수 i가 들어가구, arr검사
		{
			if( min > i)
			{
				min = i;
			}
		}	
		return min;	
	}


	public static int maxValue(int[] arr)
	{
		int max = arr[0];
		for (int i : arr)
		{
			if( max < i)
			{
				max = i;
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
		