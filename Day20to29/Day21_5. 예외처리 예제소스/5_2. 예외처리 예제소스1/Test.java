
class Test
{
	public static void main(String[] args)
	{
		int result = 0;
		result = 10 / 0;
		System.out.println("��� ���� " + result);
	}
}


/*
class Test
{
	public static void main(String[] args)
	{
		int result = 0;
		try{
			result = 10 / 0;
		}catch(ArithmeticException e){
			System.out.println("0���� ������ �ȵſ�.");
		}
		System.out.println("���α׷� ���");
	}
}
*/

/*
class Test
{
	public static void main(String[] args)
	{
		int result = div(10, 0);
		System.out.println(result);
	}
	public static int div(int num1, int num2)
	{
		int result = 0;
		try{
			result = num1 / num2;
		}catch(ArithmeticException e){
			System.out.println("0���� ������ �ȵſ�");
		}
		return result;
	}
}
*/

/*
class Test
{
	public static void main(String[] args)
	{
		int result = div(10, 0);
		System.out.println(result);
	}
	public static int div(int num1, int num2)
	{
		int result = 0;
		try{
			result = num1 / num2;
		}catch(ArithmeticException e){
			System.out.println("0���� ������ �ȵſ�");
			System.out.println(e.getMessage());
		}
		return result;
	}
}
*/
/*
class Test
{
	public static void main(String[] args)
	{
		int result = div(10, 0);
		System.out.println(result);
	}
	public static int div(int num1, int num2)
	{
		int result = 0;
		try{
			result = num1 / num2;
			System.out.println("���곡");
		}catch(ArithmeticException e){
			System.out.println("0���� ������ �ȵſ�");
			e.printStackTrace();
		}
		return result;
	}
}
*/

/*
class Test
{
	public static void main(String[] args)
	{	
		try{
			int result = div(10, 0);
			System.out.println(result);
		}catch(ArithmeticException e){
			System.out.println("0���� ������ �ȵſ�.");
		}
	}
	public static int div(int num1, int num2) throws ArithmeticException
	{
		int result = 0;
		result = num1 / num2;

		return result;
	}
}
*/

/*
class Test
{
	public static void main(String[] args) throws ArithmeticException
	{	
		int result = div(10, 0);
		System.out.println(result);
	}
	public static int div(int num1, int num2) throws ArithmeticException
	{
		int result = 0;
		result = num1 / num2;

		return result;
	}
}
*/

/*
����ӽ��� ����ó�� ���
* ����ӽ��� ����ó��1	getMessage �޼ҵ带 ȣ���Ѵ�.
* ����ӽ��� ����ó��2	���ܻ�Ȳ�� �߻��ؼ� ���޵Ǵ� ������ ������ش�.
* ����ӽ��� ����ó��3	���α׷��� �����Ѵ�.
*/