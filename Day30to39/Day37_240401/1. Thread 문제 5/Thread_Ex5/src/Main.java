/*
14. 문제 23-2[쓰레드의 동기화]
main 메소드에서는 프로그램 사용자로부터 총 다섯 개의 정수를 입력 받아서
별도로 생성된 하나의 쓰레드에게 전달하고,
별도로 생성된 쓰레드는 전달받은 수의 총 합을 계산해서,
그 결과를 출력하는 프로그램을 작성해 보자.
이는 main 메소드를 실행하는 main 쓰레드와 main 쓰레드로부터
전달받은 수의 총 합을 계산하는 별도의 쓰레드간 동기화에 관련된 문제이다.
 */

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.SortedMap;

class GetInteger
{
    int num = 0;
    boolean isNewNum = false;


    public void setNum(int n)
    {
        synchronized (key)
        {
            if (isNewNum == true)
            {
                try
                {
                    key.wait();
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                catch (InputMismatchException e)
                {
                    e.printStackTrace();
                }
            }

            num = n;
            isNewNum = true;
            key.notify();
        }
    }

    public int getNum()
    {
        int retNum = 0;
        synchronized (key)
        {
            if (isNewNum == false)
            {
                try
                {
                    key.wait();
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                catch (InputMismatchException e)
                {
                    e.printStackTrace();
                }
                retNum = num;
                isNewNum = false;
                key.notify();
            }
        }
        return retNum;
    }
    Object key = new Object();
}

class IntegerSummer extends Thread
{
    GetInteger gi;
    int sum;

    public IntegerSummer(GetInteger gi)
    {
        this.gi = gi;
    }

    public void run()
    {
        for (int i = 0; i < 5; i++)
        {
            sum += gi.getNum();
        }
        System.out.println("입력된 정수의 총 합 : " + sum);
    }
}

class SummerThreadTest
{
    public static void main(String[] args)
    {
        GetInteger gi = new GetInteger();
        IntegerSummer is = new IntegerSummer(gi);
        is.start();

        Scanner sc = new Scanner(System.in);
        System.out.println("총 5개의 정수 입력!");
        for (int i = 0; i < 5; i++)
        {
            gi.setNum(sc.nextInt());
        }
        try
        {
            is.join();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}


/*
이 문제는 IllegalMonitorStateException이 발생

이 문제는 IllegalMonitorStateException이 발생했다고 합니다. 이 예외는 다음 두 가지 경우에 발생할 수 있습니다:

해당 스레드가 해당 객체의 소유권을 보유하지 않은 상태에서 wait(), notify(), 또는 notifyAll() 메서드를 호출할 때.
synchronized 블록 내부에서 wait(), notify(), 또는 notifyAll() 메서드를 호출하지 않고, 다른 스레드에 의해 소유된 모니터를 사용할 때.
해결책으로는 다음과 같은 접근 방식을 고려할 수 있습니다:

1. setNum() 및 getNum() 메소드 내에서 synchronized 블록 내에서만 wait(), notify(), notifyAll() 메소드를 호출합니다.
2. 동일한 모니터 객체를 사용하여 동기화를 수행합니다.
 */