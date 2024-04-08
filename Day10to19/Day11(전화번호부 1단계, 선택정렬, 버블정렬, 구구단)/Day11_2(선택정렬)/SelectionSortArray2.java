//교환 위치 변경: 
//원본 코드에서는 최소값을 찾으면 바로 해당 위치와 교환하는 반면, 
//변경된 코드에서는 모든 비교를 마친 후 한 번에 교환합니다.

//반복 변수 조작: 
//변경된 코드에서는 외부 반복문에서 i를 조작하여 내부 반복문에서 
//최소값의 인덱스를 찾습니다.


import java.util.Scanner;
import java.util.Arrays;
class SelectionSortArray2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("몇개의 숫자를 입력할거니?");
		int getNumber = sc.nextInt();
		int[] A = new int[getNumber];
		int num=0;
		int temp=0;
		int tempi=0;
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
			tempi = i;
			for (int j=i+1; j<A.length; j++)
			{
				if(A[i] > A[j]) i=j;
			}
			temp = A[tempi];
			A[tempi] = A[i];
			A[i] =temp;
			i = tempi;
		
		}
		for (int i=0; i<A.length; i++)	
		{
			System.out.print(A[i]+ "\t");
		}
	}
}