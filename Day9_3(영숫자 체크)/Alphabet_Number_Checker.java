/*
1. 사용자로 부터 영숫자를 입력받아 대문자이면 '대문자', 소문자이면 '소문자', 숫자이면 '숫자'라고 출력.

예시)
영숫자 입력
A
A는 대문자

영숫자 입력
b
b는 소문자

영숫자 입력
3
3은 숫자

영숫자 입력
%
입력한 값은 영숫자가 아닙니다.
*/



import java.util.Scanner;

class Alphabet_Number_Checker
{
	public static void main(String[] args)
	{	
		String str;
		char ch;
		int diff = 'a' - 'A'; 

		Scanner sc = new Scanner(System.in);
		System.out.println("영숫자 입력");
		char answer = sc.nextLine().charAt(0);

		if(answer>= 'A' && answer <= 'Z')
		{
			System.out.println("대문자");
		}

		else if(answer >= 'a' && answer <='z') System.out.println("소문자");
		else System.out.println("입력값은 숫자입니다.");
		sc.close();
	}
}


/*
import java.util.Scanner;

class Alphabet_Number_Checker
{
	public static void main(String[] args)
	{	
		String str;
		char ch;
		int diff = 'a' - 'A';  // 97-65= 32

		Scanner sc = new Scanner(System.in);
		System.out.println("영숫자 입력");
		char answer = sc.nextLine().charAt(0);

		if(answer>= 'A' && answer <= 'Z')
		{
			System.out.println((char)(answer + diff));
		}

		else if(answer >= 'a' && answer <='z') System.out.println((char)(answer-diff));
		else System.out.println("입력값은 알파벳이 아닙니다.");
		sc.close();
	}
}	
*/	