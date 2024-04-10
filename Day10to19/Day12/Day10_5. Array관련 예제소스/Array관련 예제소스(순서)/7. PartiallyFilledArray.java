class PatiallyFilledArray
{
	public static void main(String[] args)
	{
		int[][] arr={
			{1, 2},
			{3, 4, 5},
			{6, 7, 8, 9}
		};
		
		System.out.println("배열의 세로길이: "+arr.length);
		
		for(int i=0; i<arr.length; i++)
			System.out.printf("%d행의 길이: %d \n", i+1, arr[i].length);
	}
}