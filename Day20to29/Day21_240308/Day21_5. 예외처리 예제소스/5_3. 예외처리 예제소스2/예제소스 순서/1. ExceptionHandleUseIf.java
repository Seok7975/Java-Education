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