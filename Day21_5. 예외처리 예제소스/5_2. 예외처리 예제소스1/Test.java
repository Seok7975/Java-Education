
class Test
{
	public static void main(String[] args)
	{
		int result = 0;
		result = 10 / 0;
		System.out.println("결과 값은 " + result);
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
			System.out.println("0으로 나누면 안돼요.");
		}
		System.out.println("프로그램 계속");
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
			System.out.println("0으로 나누면 안돼요");
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
			System.out.println("0으로 나누면 안돼요");
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
			System.out.println("연산끝");
		}catch(ArithmeticException e){
			System.out.println("0으로 나누면 안돼요");
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
			System.out.println("0으로 나누면 안돼요.");
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
가상머신의 예외처리 방법
* 가상머신의 예외처리1	getMessage 메소드를 호출한다.
* 가상머신의 예외처리2	예외상황이 발생해서 전달되는 과정을 출력해준다.
* 가상머신의 예외처리3	프로그램을 종료한다.
*/