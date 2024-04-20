/*
[쓰레드 클래스의 정의와 쓰레드의 생성]
RunnableThread.java에서는 총 두 개의 쓰레드를 생성해서 각각 1부터 50까지,
그리고 51부터 100까지 덧셈을 진행하게 하고,
그 결과를 취해서 최종적으로 1부터 100까지의 덧셈결과를 출력하였다.
이번에는 이 예제를 Runnable 인터페이스를 구현하는 방식이 아닌,
쓰레드 클래스를 정의하는 방식으로 변경해보자.
 */

//Thread를 상속받는 방식을 만들어보자

/*class Sum
{
    int num;
    public Sum() { num=0; }
    public void addNum(int n) { num+=n; }
    public int getNum() { return num; }
}*/

class SumThread extends Thread
{
    int num;
    int start, end;

    public SumThread(int s, int e)
    {
        num = 0;
        start = s;
        end = e;
    }

    public void run()
    {
        for (int i = start; i <= end; i++)
            addNum(i);
    }
    public void addNum(int n) { num+=n; }
    public int getNum() { return num; }
}

class Sum1To100
{
    public static void main(String[] args)
    {
        SumThread tr1 = new SumThread(1,50);
        SumThread tr2 = new SumThread(51,100);
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

        System.out.println("1~100까지의 합: " + (tr1.getNum() + tr2.getNum()));
    }
}
