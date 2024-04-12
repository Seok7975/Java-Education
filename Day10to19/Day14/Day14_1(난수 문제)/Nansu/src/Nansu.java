//프로그램 사용자로부터 최대 정수 A와 최소 정수 B를 입력 받는다.
// 그리고 A와 B사이에 존재하는(A와 B도 포함) 난수 10개를 생성해서 출력하는 프로그램을 작성해보자.

import java.util.Random;
import java.util.Scanner;

class Nansu
{
        public static void main(String[] args)
        {
                int maxNum=0, minNum =0 ;
                //double nan = 0;
                //double[] nansu = new double[10];
                Scanner sc = new Scanner(System.in);
                System.out.println("최대정수 A와 최소정수 B를 입력하시오 : ");

                maxNum = sc.nextInt();
                minNum = sc.nextInt();

                Random rand = new Random();

                for (int i=0 ; i<10  ; i++)
                {

                    System.out.println(rand.nextInt(maxNum-minNum+1)+minNum);
                }

                System.out.printf("\n\n\n\n");

                for (int i=0 ; i<10  ; i++)
                {

                        System.out.println((int)(Math.random()*(maxNum-minNum+1))+minNum);
                }

        }
}