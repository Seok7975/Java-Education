/*
5. ����5 ������ �ִ� �ҽ��ڵ�� if���� �̿��� ����ó�� �κ��� �ڵ��� 
�߰��߰��� ���ԵǾ� �ִ�. ���� �ڵ带 �м��ϴµ� �־ �������� ���� �� �ִ�. 
�׷��� try~catch���� Ȱ���ϸ� ����ó���� ���� �ڵ带 ������ ������ ���� �� �ִ�. 
�ϳ��� try ������ �� �̻��� catch ������ ������ �� �ֱ� �����̴�.
������ �ִ� �ҽ��ڵ带 try~catch������ ������ ����.
*/

import java.util.Scanner;

class ExceptionHandleUseTryCatch
{	
	public static void main(String[] args)
	{
		Scanner keyboard=new Scanner(System.in);
		int[] arr=new int[100];
		
		for(int i=0; i<3; i++)
		{
			try
			{
				System.out.print("������ �Է�: ");
				int num1=keyboard.nextInt();
				
				System.out.print("���� �Է�: ");
				int num2=keyboard.nextInt();
				
				System.out.print("�������� ������ �迭�� �ε��� �Է�: ");
				int idx=keyboard.nextInt();
				
				arr[idx]=num1/num2;
				System.out.println("������ ����� "+arr[idx]);
				System.out.println("����� ��ġ�� �ε����� "+idx);	
			}
			catch(ArithmeticException e)
			{
				System.out.println("������ 0�� �� �� �����ϴ�.");
				i-=1;
				continue;
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("��ȿ���� ���� �ε��� ���Դϴ�.");
				i-=1;
				continue;
			}
		}
	}
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//�ٲٱ� ��
/*
import java.util.Scanner;

class ExceptionHandleUseIf
{	
	public static void main(String[] args)
	{
		Scanner keyboard=new Scanner(System.in);
		int[] arr=new int[100];
		
		for(int i=0; i<3; i++)
		{
			System.out.print("������ �Է�: ");
			int num1=keyboard.nextInt();
			
			System.out.print("���� �Է�: ");
			int num2=keyboard.nextInt();
			
			if(num2==0)
			{
				System.out.println("������ 0�� �� �� �����ϴ�.");
				i-=1;
				continue;
			}
			
			System.out.print("�������� ������ �迭�� �ε��� �Է�: ");
			int idx=keyboard.nextInt();
			
			if(idx<0 || idx>99)
			{
				System.out.println("��ȿ���� ���� �ε��� ���Դϴ�.");
				i-=1;
				continue;
			}
			
			arr[idx]=num1/num2;
			System.out.println("������ ����� "+arr[idx]);
			System.out.println("����� ��ġ�� �ε����� "+idx);				
		}
	}
}
*/