//조건 연산자(삼항 연산자) -> 조건 ? 참일경우 실행할 내용 : 거짓일경우 실행할 내용

//문제 1. 
//임의의 숫자를 입력받아 절대값 구하기.
//삼항연산자를 이용

import java.util.Scanner;

class OperatorTest
{
	public static void main(String[] args)
	{

		//int num=0, bigNum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();

		int bigNum = num > 0 ? num : -num;  // 입력받은 num이 양수? 맞으면 그대로, 아니면 *(-1)

		System.out.println(bigNum);
	}
}