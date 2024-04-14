// 다음은 사이의 숫자를 맞추는 게임을 실행하던 도중에 숫자가 아닌 영문자를 1~100
//넣어서 발생한 예외이다 예외처리를 해서 숫자가 아닌 값을 입력했을 때는 다시 입력을 .
//받도록 보완하라


/*import java.util.*;
class Ch8_8
{
    public static void main(String[] args)
    {
// 1~100 answer . 사이의 임의의 값을 얻어서 에 저장한다
        int answer = (int)(Math.random() * 100) + 1;
        int input = 0; // 사용자입력을 저장할 공간
        int count = 0; // 시도횟수를 세기 위한 변수
        do {
            count++;
            System.out.print("1 100 :"); 과 사이의 값을 입력하세요
            input = new Scanner(System.in).nextInt();
            if(answer > input) {
                System.out.println(" ."); 더 큰 수를 입력하세요
            } else if(answer < input) {
                System.out.println(" ."); 더 작은 수를 입력하세요
            } else {
                System.out.println(" ."); 맞췄습니다
                System.out.println(" "+count+" ."); 시도횟수는 번입니다
                break; // do-while문을 벗어난다
            }
        } while(true); // 무한반복문
    } // end of main
} // end of class HighLow*/

import java.util.InputMismatchException;
import java.util.Scanner;

class Ch8_8
{
    public static void main(String[] args)
    {
// 1~100 answer . 사이의 임의의 값을 얻어서 에 저장한다
        int answer = (int)(Math.random() * 100) + 1;
        int input = 0; // 사용자입력을 저장할 공간
        int count = 0; // 시도횟수를 세기 위한 변수
        do {
            count++;


            try
            {
                System.out.print("1과 100사이의 값을 입력하세요  :");
                input = new Scanner(System.in).nextInt();
                if(answer > input)
                {
                    System.out.println("더 큰 수를 입력하세요.");
                }
                else if(answer < input)
                {
                    System.out.println("더 작은 수를 입력하세요.");
                }
                else
                {
                    System.out.println("맞췄습니다.");

                    System.out.println("시도횟수는 " + count + "번입니다.");

                    break; // do-while문을 벗어난다
                }
            }
            catch(Exception e)//catch(InputMismatchException e)
            {
                System.out.println("잘못 입력하셨습니다.");
            }

        } while(true); // 무한반복문
    } // end of main
} // end of class HighLow
