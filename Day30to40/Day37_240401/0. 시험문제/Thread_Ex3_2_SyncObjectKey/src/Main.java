/*
7. 6번 문제는 동기화가 제대로 되지 않아 잘못된 값을 출력할 확률이 높다.
이 것을 동기화 시키는 두 가지 방법으로 동기화가 제대로 이루어 지도록 하자.
 */

//case1) 동기화 메서드 선언
/*
public synchronized void increment()
{
	num++;
}
 */


//case2) 동기화 블록 지정
/*
public void increment()
{
	synchronized(this)
	{
		num++;
	}
}
 */

//case1) 동기화 메서드 선언
class Increment
{
    int num=0;
    public synchronized void increment(){ num++; } // 동기화 메서드 선언
    //	public synchronized void increment(){ num++; }
    public int getNum() { return num; }
}

class Increment_Thread extends Thread // IncThread
{
    Increment inc;

    public Increment_Thread(Increment inc)
    {
        this.inc=inc;
    }
    public void run()
    {
        for(int i=0; i<10000; i++)
            for(int j=0; j<10000; j++)
                inc.increment();
    }
}

class ThreadSyncError
{
    public static void main(String[] args)
    {
        Increment inc=new Increment();
        Increment_Thread it1=new Increment_Thread(inc);
        Increment_Thread it2=new Increment_Thread(inc);
        Increment_Thread it3=new Increment_Thread(inc);

        it1.start();
        it2.start();
        it3.start();

        try
        {
            it1.join();
            it2.join();
            it3.join();
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }

        System.out.println(inc.getNum());
    }
}

/*

//case2) 동기화 블록 지정
class Increment
{
    int num=0;

    public void increment()
    {
        synchronized (this)
        {
            num++;
        }
    }
    public int getNum() { return num; }
}

class Increment_Thread extends Thread // IncThread
{
    Increment inc;

    public Increment_Thread(Increment inc)
    {
        this.inc=inc;
    }
    public void run()
    {
        for(int i=0; i<10000; i++)
            for(int j=0; j<10000; j++)
                inc.increment();
    }
}

class ThreadSyncError
{
    public static void main(String[] args)
    {
        Increment inc=new Increment();
        Increment_Thread it1=new Increment_Thread(inc);
        Increment_Thread it2=new Increment_Thread(inc);
        Increment_Thread it3=new Increment_Thread(inc);

        it1.start();
        it2.start();
        it3.start();

        try
        {
            it1.join();
            it2.join();
            it3.join();
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }

        System.out.println(inc.getNum());
    }
}*/
