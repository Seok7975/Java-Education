//1. java.lang.String





//2. 임의의 문자열을 입력받아 문자열의 갯수 세기
/*
import java.util.Scanner;

class StringTest
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		// Scanner sc = new Scanner(System.in, "EUC-KR");  // Window에서 입력받은 한글 깨질때
		String str = null;
		System.out.println("문자열을 입력하세요.");
		str = sc.next();		// Hello Jane
		System.out.println("next 입력받은 문자열은 " + str);
		int num = str.length();
		System.out.println(num);
		sc.close();	
	}
}
*/

//3. 임의의 문자열 두개를 입력받아 두 문자열 합치기
/*
import java.util.Scanner;

class StringTest
{
	public static void main(String[] args)
	{
		//int sb;
		//Scanner sc = new Scanner(System.in);
		Scanner sc = new Scanner(System.in, "EUC-KR");  // Window에서 입력받은 한글 깨질때
		String str = null;
		String str2 = null;
		System.out.println("문자열을 입력하세요.");
		str = sc.nextLine();		// Hello Jane
		System.out.println("nextLine 입력받은 문자열은 " + str);
		System.out.println("문자열을 입력하세요.");
		str2 = sc.next();		// Hello Jane
		System.out.println("next 입력받은 문자열은 " + str2);
		System.out.println(str1.concat(str2));
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		sb.append(str2);

		System.out.println(sb.toString());
		sc.close();		
	}
}
*/
//4. 임의의 문자열을 입력받아 문자열을 소문자로 바꾸기
/*
import java.util.Scanner;

class StringTest
{
	public static void main(String[] args)
	{
		//Scanner sc = new Scanner(System.in);
		Scanner sc = new Scanner(System.in, "EUC-KR");  // Window에서 입력받은 한글 깨질때
		String str = null;
		System.out.println("문자열을 입력하세요.");
		str = sc.nextLine();		// Hello Jane
		System.out.println("nextLine 입력받은 문자열은 " + str);

		System.out.println(str.toLowerCase());
		sc.close();		
	}
}
*/

//5. 임의의 문자열을 입력받아 문자열을 대문자로 바꾸기
/*
import java.util.Scanner;

class StringTest
{
	public static void main(String[] args)
	{
		//Scanner sc = new Scanner(System.in);
		Scanner sc = new Scanner(System.in, "EUC-KR");  // Window에서 입력받은 한글 깨질때
		String str = null;
		System.out.println("문자열을 입력하세요.");
		str = sc.nextLine();		// Hello Jane
		System.out.println("nextLine 입력받은 문자열은 " + str);

		System.out.println(str.toUpperCase());
		sc.close();		
	}
}
*/
//6. 임의의 문자열 5개를 입력받아 알파벳 순으로 정렬

import java.util.Scanner;

class StringTest
{
	public static void main(String[] args)
	{
		String temp="";
		//Scanner sc = new Scanner(System.in);
		Scanner sc = new Scanner(System.in, "EUC-KR");  // Window에서 입력받은 한글 깨질때
		String str1 = null;
		String str2 = null;
		String str3 = null;
		String str4 = null;
		String str5 = null;
		System.out.println("문자열을 입력하세요.");
		str1 = sc.nextLine();		// Hello Jane
		//System.out.println("nextLine 입력받은 문자열은 " + str1);
		System.out.println("문자열을 입력하세요.");
		str2 = sc.nextLine();		// Hello Jane
		System.out.println("문자열을 입력하세요.");
		str3 = sc.nextLine();		// Hello Jane
		//System.out.println("nextLine 입력받은 문자열은 " + str3);
		System.out.println("문자열을 입력하세요.");
		str4 = sc.nextLine();		// Hello Jane
		//System.out.println("nextLine 입력받은 문자열은 " + str4);
		System.out.println("문자열을 입력하세요.");
		str5 = sc.nextLine();		// Hello Jane
		//System.out.println("nextLine 입력받은 문자열은 " + str5);
		
		//int num = str1.compareTo(str2);
		//System.out.println(num);
		if ( str1.compareTo(str2) > 0)
		{
			temp = str1;
			str1 = str2;
			str2 = temp;
		}
		if ( str1.compareTo(str3) > 0)
		{
			temp = str1;
			str1 = str3;
			str3 = temp;
		}
		if ( str1.compareTo(str4) > 0)
		{
			temp = str1;
			str1 = str4;
			str4 = temp;
		}
		if ( str1.compareTo(str5) > 0)
		{
			temp = str1;
			str1 = str5;
			str5 = temp;
		}
		if ( str2.compareTo(str3) > 0)
		{
			temp = str2;
			str2 = str3;
			str3 = temp;
		}
		if ( str2.compareTo(str4) > 0)
		{
			temp = str2;
			str2 = str4;
			str4 = temp;
		}
		if ( str2.compareTo(str5) > 0)
		{
			temp = str2;
			str2 = str5;
			str5 = temp;
		}
		if ( str3.compareTo(str4) > 0)
		{
			temp = str3;
			str3 = str4;
			str4 = temp;
		}
		if ( str3.compareTo(str5) > 0)
		{
			temp = str3;
			str3 = str5;
			str5 = temp;
		}
		if ( str4.compareTo(str5) > 0)
		{
			temp = str4;
			str4 = str5;
			str5 = temp;
		}
		System.out.println(str1 + "\n"+ str2 + "\n" + str3 + "\n" + str4 + "\n"+ str5);
		sc.close();		
	}
}
