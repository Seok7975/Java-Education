//버블정렬 이용

import java.util.Scanner;
import java.util.Arrays;
class bubbleSort
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("몇개의 숫자를 입력할거니?");
		int getNumber = sc.nextInt();
		int[] A = new int[getNumber];
		int num=0;
		int temp=0;
		for (int i=0; i<A.length; i++)
		{	
			Scanner sc2 = new Scanner(System.in);
			System.out.println("숫자입력" + (i+1));
			num = sc2.nextInt();
			A[i] = num;
	
		}
		for (int i=0; i<A.length; i++)	
		{
			System.out.print(A[i]+ "\t");
		}
//////////////////////////////////////////////////////////////////////////////////////////오름차순으로
		System.out.print("\n\n");
		System.out.println("오름차순으로 정렬하면");

		for (int i=0; i<A.length-1; i++)
		{
			for (int j=0; j<A.length-i-1; j++)
			{
				if(A[j] > A[j+1])
				{
					temp = A[j];
					A[j] = A[j+1];
					A[j+1] =temp;
				}
			}
		}
		for (int i=0; i<A.length; i++)	
		{
			System.out.print(A[i]+ "\t");
		}
	}
}