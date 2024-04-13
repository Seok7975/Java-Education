/*1. 사용자로 부터 임의의 정수 하나를 입력받아 그 자리수를 출력하시오.
        예)
        숫자를 입력하세요.
        314
        314는 3자리 숫자 입니다.

2. 사용자로 부터 입력받은 정수를 int형 배열로 만드시오.*/

import java.util.Arrays;
import java.util.Scanner;

class IntegerDigitPrinter
{
    public static void main(String[] args)
    {
        System.out.println("1번문제");
        System.out.println("숫자를 입력하세요.");
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        System.out.println(number);
        System.out.printf("%s는 %d자리 숫자 입니다.", number, number.length());
        System.out.printf("\n\n");

        System.out.println("2번문제");
        int[] integerNumber =  new int[number.length()];
        for(int i=0; i<number.length(); i++)
        {
            integerNumber[i] = (number.charAt(i) - '0');
            System.out.print(integerNumber[i]+ "  ");
        }
    }
}