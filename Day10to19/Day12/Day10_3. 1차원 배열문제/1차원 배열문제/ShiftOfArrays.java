import java.util.Scanner;
import java.util.Arrays;

class ShiftOfArrays
{
	
	public static void arrShift(int[][] arr)  // 바꾸는 매소드
	{
		int[] lastRow = arr[arr.length-1];
		for (int i=arr.length-1; i>0; i--)
		{
			arr[i] = arr[i-1];
		}
		arr[0] = lastRow;
	}

	public static void main(String[] args)
	{
		int[][] arr = {
			{1, 2, 3}
			,{4, 5, 6}
			,{7, 8, 9} };
		for(int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();

		arrShift(arr);


		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
			