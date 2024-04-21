/*
5. 문제23-1 [쓰레드 클래스의 정의와 쓰레드의 생성]
RunnableThread.java에서는 총 두 개의 쓰레드를 생성해서 각각 1부터 50까지,
그리고 51부터 100까지 덧셈을 진행하게 하고,
그 결과를 취해서 최종적으로 1부터 100까지의 덧셈결과를 출력하였다.
이번에는 이 예제를 Runnable 인터페이스를 구현하는 방식이 아닌,
쓰레드 클래스를 정의하는 방식으로 변경해보자.
 */

class Sum
{
    int num;
    public Sum()
    {
        num = 0;
    }
    public void addNum(int n)
    {
        num+=n;
    }

    public int getNum()
    {
        return num;
    }
}

class AdderThread extends Sum implements Runnable
{
    int start, end;

    public AdderThread(int start, int end)
    {
        this.start = start;
        this.end = end;
    }

    public void run()
    {
        for(int i=start; i<=end; i++)
        {
            addNum(i);
        }
    }
}

class RunnableThread
{
    public static void main(String[] args)
    {
        AdderThread at1 = new AdderThread(1, 50);
        AdderThread at2 = new AdderThread(51, 100);

        //AdderThread 객체를 쓰레드로 실행하기 위해 Thread 객체에 각각을 전달
        Thread tr1 = new Thread(at1);
        Thread tr2 = new Thread(at2);

        tr1.start();
        tr2.start();

        try
        {
            tr1.join();
            tr2.join();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        System.out.println("1~100까지의 합 : " + (at1.getNum() + at2.getNum()));
    }
}