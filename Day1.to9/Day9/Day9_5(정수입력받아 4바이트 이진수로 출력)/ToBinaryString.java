/*
십진 정수를 입력받아 4바이트의 이진수로 출력하시오.

예시
숫자 입력
10
00000000000000000000000000001010

*/


/////////////////////////////////첫번째방법
/*
import java.util.Scanner;

class ToBinaryString
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력");
		int answer = sc.nextInt();
		String binary = Integer.toBinaryString(answer);
		System.out.println(String.format("%016d", Integer.parseInt(binary)));
	}	
}
*/


/////////////////////////////////두번째방법
import java.util.Scanner;

class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = "00000000000000000000000000000000";
		System.out.println("숫자 입력");
		int temp = sc.nextInt();
		String binStr = Integer.toBinaryString(temp);
//		String strNum = sc.nextLine();
//		String binStr = Integer.toBinaryString(Integer.parseInt(strNum));
		String tmp = s1 + binStr;
		System.out.println(tmp.substring(binStr.length()));
	}
}

// String strNum = "5";
// int num = Integer.parseInt(strNum);
// 문자열을 "5"를 int 5로 바꿔서 반환한다.