
//////////////////////////////////////////////////6.
/*class For
{
	public static void main(String[] args)
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				System.out.print( (((i-1)*5)+j) + "\t");
			}
			System.out.print("\n");

		}
	}
}
*/

////////////////////////////////////////////7.

/*class For
{
	public static void main(String[] args)
	{
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print( (28-(3*i)-j) + "\t");
			}
			System.out.print("\n");

		}
	}
}*/

/////////////////////////////////////////////8.
/*class For
{
	public static void main(String[] args)
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");

		}
	}
}*/


/////////////////////////////////////////////9.
/*class For
{
	public static void main(String[] args)
	{
		for(int i=1; i<=7; i++)
		{
			for(int j=1; j<=7; j++)
			{


				if(i>j || i+j>8) 
				{
					System.out.print(" ");
					continue;
				}
				else System.out.print("*");
			}
			System.out.print("\n");

		}
	}
}
*/

class Day5
{
	public static void main(String[] args)
	{
		int i=0, j=0;
		int num=1;

		for(i=0;i<5;i++)
		{
			for(j=0;j<5;j++)
			{
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}
	}
}