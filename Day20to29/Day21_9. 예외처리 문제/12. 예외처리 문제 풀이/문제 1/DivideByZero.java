import java.util.Scanner;

class DivideByZero
{	
	public static void main(String[] args)
	{
		System.out.print("�� ����  ���� �Է�: ");
		Scanner keyboard=new Scanner(System.in);
		int num1=keyboard.nextInt();
		int num2=keyboard.nextInt();
			
		try
		{
			System.out.println("������ ����� ��: "+(num1/num2));
			System.out.println("������ ����� ������: "+(num1%num2));
		}
		catch(ArithmeticException e)
		{
			System.out.println("������ �Ұ���");
			System.out.println(e.getMessage());
		}
		
		System.out.println("���α׷��� �����մϴ�.");
	}
}