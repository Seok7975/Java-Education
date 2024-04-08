//1. 아스키 코드를 입력받으면 알파벳을 출력하는 프로그램.
//2. 알파벳을 입력하면 아스키 코드를 출력하는 프로그램


import java.util.Scanner;

class ConvertAskii
{
	public static void main(String[] args)
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.println("문자 입력");
		char ch1 = sc1.nextLine().charAt(0);
		System.out.println( (int)ch1);

		Scanner sc2 = new Scanner(System.in);
		System.out.println("숫자 입력");
		int ch2 = sc2.nextInt();
		System.out.println( (char)ch2);

	}
}
		