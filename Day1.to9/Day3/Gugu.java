// 구구단출력

/*class Gugu
{
	public static void main(String[] args)
	{
		int i = 0, j =0;

		for (i=2; i<=9; i++)
		{
			for(j=1; j<=9; j++)
			{
				System.out.print(i+ "x" + j + "=" + i*j + "    ");
			}
			System.out.println();
		}
	}
}
*/

/*class Gugu
{
	public static void main(String[] args)
	{
		int i = 0, j =0;

		for (i=1; i<=9; i++)
		{
			for(j=2; j<=9; j++)
			{
				System.out.print(j+ "x" + i + "=" + i*j + "\t");
			}
			System.out.println();
		}
	}
}
*/


// 4. 구구단은 짝수 단(2, 4, 6, 8단)만 출력하는 프로그램을 작성하되, 2단은
//2*2까지, 4단은 4*4까지, 6단은 6*6까지, 8단은 8*8까지만 출력하도록 구현하자

/*
class Gugu
{
	public static void main(String[] args)
	{
		int i =0, j=0;

		for (i=2; i<=9; i=i+2)
		{
			for(j=1; j<=i; j++)
			{
				System.out.print(i+ "x" + j + "=" + i*j + "    ");
			}
			System.out.println();

		}
	}
}	
*/



// 5. 다음 식을 만족하는 모든 A와 B의 조합을 구하는 프로그램을 작성하자. 
//	  AB
//	+BA
//	  99		


class Gugu
{
	public static void main(String[] args)
	{
		int i =0, j=0;

		for (i=0; i<=9; i++)
		{
			for(j=0; j<=9-i; j++)
			{
				if (((10*i)+j) + ((10*j)+i) == 99) 
				{
					if (i == 0)
					{
						System.out.println("\t  " + "0" + j);
						System.out.println("\t" + "+ " + ((10*j)+i));
						System.out.println("-----------------");
						System.out.println("\t  " + 99);
						continue;
					}
					if (j == 0)
					{
						System.out.println("  " + ((10*i)+j));
						System.out.println("+ 0" + i);
						System.out.println("-------");
						System.out.println("  " + 99);
						continue;
					}


					System.out.println("  " + ((10*i)+j));
					System.out.println("+ " + ((10*j)+i));
					System.out.println("-------");
					System.out.println("  " + 99);
				}
				else continue;
			}
			System.out.println();
			System.out.println();

		}
	}
}


/*
class Day5
{
	public static void main(String[] args)
	{
		int i=0, j=0;

		for(i=0;i<=9;i++)
		{
			for(j=0;j<=9;j++)
			{
				if( (i*10+j) + (j*10+i) == 99)
					System.out.println(i+""+j+" + " + j + "" + i + " = 99");
			}
		}
	}
}
*/		
// if((i*10 + j) +( j*10+i) == 99)
// System.out.println(""+a+b+" + "b+a+" = 99");