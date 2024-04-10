import java.util.Arrays;

/*
class For_Each
{
	public static void main(String[] args)
	{
		int[][] num = {{10, 20, 30}, {40, 50, 60}};

		
		for(int[] i : num)
		{
			for(int j : i)
			{
				System.out.print(j + "\t"); //Arrays.toString(num[i])
			}
			System.out.println();
		}
	}
}
*/
class For_Each
{
	public static void main(String[] args)
	{
		int[][] num = {{10, 20, 30}, {40, 50, 60}};

		
		for(int[] i : num)
		{

			System.out.println(Arrays.toString(i));

		}
	}
}