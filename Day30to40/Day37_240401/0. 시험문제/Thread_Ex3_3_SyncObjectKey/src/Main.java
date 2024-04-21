/*
8. 문제 8 폴더에 있는 SyncObjectKy를 적절하게 Key를 사용하여 동기화해보자.
(두 가지 방법)
 */


//case1) 동기화 메서드 선언불가, 동기화 블록 지정 및 key 이용
/*class IHaveTwoNum
{
    int num1 = 0;
    int num2 = 0;

    public synchronized void addOneNum1()
    {
        num1 += 1;
    }

    public synchronized void addTwoNum1()
    {
        num1 += 2;
    }

    public synchronized void addOneNum2()
    {
        num2 += 1;
    }

    public synchronized void addTwoNum2()
    {
        num2 += 2;
    }

    public void showAllNums()
    {
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
    }
}

class AccessThread extends Thread
{
    IHaveTwoNum twoNumInst;

    public AccessThread(IHaveTwoNum inst)
    {
        twoNumInst = inst;
    }

    public void run()
    {
        twoNumInst.addOneNum1();
        twoNumInst.addTwoNum1();

        twoNumInst.addOneNum2();
        twoNumInst.addTwoNum2();
    }
}

class SyncObjectKey
{
    public static void main(String[] args)
    {
        IHaveTwoNum numInst = new IHaveTwoNum();

        AccessThread at1 = new AccessThread(numInst);
        AccessThread at2 = new AccessThread(numInst);

        at1.start();
        at2.start();

        try
        {
            at1.join();
            at2.join();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        numInst.showAllNums();
    }
}*/

/*class IHaveTwoNum
{
    int num1=0;
    int num2=0;

    public void addOneNum1()
    {
        synchronized(key1)
        {
            num1+=1;
        }
    }
    public void addTwoNum1()
    {
        synchronized(key1)
        {
            num1+=2;
        }
    }
    public void addOneNum2()
    {
        synchronized(key2)
        {
            num2+=1;
        }
    }
    public void addTwoNum2()
    {
        synchronized(key2)
        {
            num2+=2;
        }
    }

    public void showAllNums()
    {
        System.out.println("num1: "+num1);
        System.out.println("num2: "+num2);
    }

    Object key1=new Object();
    Object key2=new Object();
}

class AccessThread extends Thread
{
    IHaveTwoNum twoNumInst;

    public AccessThread(IHaveTwoNum inst)
    {
        twoNumInst=inst;
    }

    public void run()
    {
        twoNumInst.addOneNum1();
        twoNumInst.addTwoNum1();

        twoNumInst.addOneNum2();
        twoNumInst.addTwoNum2();
    }
}

class SyncObjectKeyAnswer
{
    public static void main(String[] args)
    {
        IHaveTwoNum numInst=new IHaveTwoNum();

        AccessThread at1=new AccessThread(numInst);
        AccessThread at2=new AccessThread(numInst);

        at1.start();
        at2.start();

        try
        {
            at1.join();
            at2.join();
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        numInst.showAllNums();
    }
}*/


//case2) 동기화 블록 지정 및 this 이용(현재 실행중인 메서드나 생성자가
//      속한 객체를 사용)

class IHaveTwoNum
{
    int num1=0;
    int num2=0;

    public void addOneNum1()
    {
        synchronized(this)
        {
            num1+=1;
        }
    }
    public void addTwoNum1()
    {
        synchronized(this)
        {
            num1+=2;
        }
    }
    public void addOneNum2()
    {
        synchronized(key1)
        {
            num2+=1;
        }
    }
    public void addTwoNum2()
    {
        synchronized(key1)
        {
            num2+=2;
        }
    }

    public void showAllNums()
    {
        System.out.println("num1: "+num1);
        System.out.println("num2: "+num2);
    }

    Object key1=new Object();
    Object key2=new Object();
}

class AccessThread extends Thread
{
    IHaveTwoNum twoNumInst;

    public AccessThread(IHaveTwoNum inst)
    {
        twoNumInst=inst;
    }

    public void run()
    {
        twoNumInst.addOneNum1();
        twoNumInst.addTwoNum1();

        twoNumInst.addOneNum2();
        twoNumInst.addTwoNum2();
    }
}

class SyncObjectKeyAnswer
{
    public static void main(String[] args)
    {
        IHaveTwoNum numInst=new IHaveTwoNum();

        AccessThread at1=new AccessThread(numInst);
        AccessThread at2=new AccessThread(numInst);

        at1.start();
        at2.start();

        try
        {
            at1.join();
            at2.join();
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        numInst.showAllNums();
    }
}

/*
this 키워드는 현재 객체를 가리킵니다.
즉, 현재 실행 중인 메서드나 생성자가 속한 객체를 참조하는 데 사용됩니다.
이 코드에서 this는 동기화 블록에서 사용되어 멀티스레드 환경에서의
안전한 데이터 접근을 보장하기 위해 사용됩니다.

여기서 synchronized(this)는 IHaveTwoNum 클래스의 메서드에서 사용되었습니다.
이것은 현재 객체에 대한 동기화를 수행하겠다는 의미입니다.
이 경우에는 addOneNum1()과 addTwoNum1() 메서드에서 num1 변수에 접근할 때
동기화가 보장됩니다.

this를 사용하는 것은 해당 객체에 대한 락을 획득하여 동기화를
달성하는 일반적인 방법 중 하나입니다.
여기서는 하나의 객체에 대한 락을 사용하여 멀티스레드 환경에서의 데이터 일관성을
보호하고 있습니다.

그러나 this를 사용하는 것이 항상 가장 좋은 방법은 아닙니다.
특히 다음과 같은 상황에서는 주의해야 합니다:

this를 사용하면 객체에 대한 전체 락이 획득됩니다.
이는 해당 객체의 모든 동기화 블록에 영향을 줄 수 있습니다.
이로 인해 성능 저하가 발생할 수 있습니다.
this를 사용하는 경우 다른 메서드에서도 동시에 실행되지 못하도록
하려는 동기화 블록에 영향을 줄 수 있습니다.
따라서 불필요한 대기 시간이 발생할 수 있습니다.
클래스의 구조가 변경되면 this를 사용하는 모든 동기화 블록을
수정해야 할 수 있습니다.
따라서 상황에 따라 this 대신에 더 세밀한 락을 사용하는 것이
더 효율적일 수 있습니다. 이를 위해 별도의 락 객체를 생성하여
사용하는 것이 일반적인 방법 중 하나입니다.
위의 코드에서도 key1과 key2와 같이 별도의 락 객체를
사용하여 이를 보여주고 있습니다.
 */