/*
동기화(Synchronization)
6(1). Increment라 이름의 클래스는 num이라는 인스턴스 변수를  가지고 있고
그 클래스는 1씩 증가시키는 메소드와 숫자 값을 가져오는 메소드가 있다.
IncThread라는 클래스는 Increment라는 클래스의 참조변수를
인스턴스변수로 가지고 있고 쓰레드를 실행시키면 중첩된 반복문으로
각각 10000 씩 Increment의 1씩 증가시키는 메소드를 호출한다.
그리고 main메소드가 있는 클래스에서 Increment 인스턴스한개 IncThread 3개를
만들고 3개의 쓰레드를 실행한 후에 Increment의 num의 값을 출력해본다.
 */

import java.util.SortedMap;

class Increment
{
    int num=0;
    public void increment() //1씩 증가시키는 메서드
    {
        num++;  
    }

    public int getNum() //숫자값을 가져오는 메서드
    {
        return num;
    }
}

class Increment_Thread extends Thread //IncThread
{
    Increment inc;

    public Increment_Thread(Increment inc)
    {
        this.inc = inc;
    }
    
    public void run()   //중첩된 반복문으로 1을 증가시킴
    {
        for(int i=0; i<10000; i++)
        {
            for(int j=0; j<10000; j++)
            {
                inc.increment();
            }
        }
    }
}

class ThreadSyncError
{
    public static void main(String[] args)
    {
        Increment inc = new Increment();
        Increment_Thread it1 = new Increment_Thread(inc);
        Increment_Thread it2 = new Increment_Thread(inc);
        Increment_Thread it3 = new Increment_Thread(inc);

        it1.start();
        it2.start();
        it3.start();

        try
        {
            it1.join();
            it2.join();
            it3.join();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        System.out.println(inc.getNum());
    }
}