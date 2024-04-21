class Counter { 
    int count = 0; 

    public void increment() {
        synchronized(this) {
            count++;
        }
    }

    public void decrement() {
        synchronized(this) {
            count--;
        }
    }

    public int getCount() { return count; }
}

class MutualAccessSyncBlock {
    public static Counter cnt = new Counter();

    public static void main(String[] args) throws InterruptedException {        
        Runnable task1 = () -> {
            for(int i = 0; i<1000; i++)
                cnt.increment();
        };

        Runnable task2 = () -> {
            for(int i = 0; i<1000; i++)
                cnt.decrement();
        };


        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);
        
        t1.start();
        t2.start();
    
        t1.join();
        t2.join();
     
        System.out.println(cnt.getCount());
    }
}

/*
실행결과
0
*/


/*

StringBuffer는 '쓰레드에 안전'하다고 설명한 바 있는데, 이는 StringBuffer가 동기화되어 있어서, 이 인스턴스를 대상으로 둘 이상의 쓰레드가
동시에 접근해도 문제가 되지 않음을 의미한다. 그리고 이러한 클래스별 쓰레드의 안전 여부는 자바 문서에서 쉽게 확인할 수 있따. 예를 들어 자바 문서의
ArrayList<E> 페이지를 보면 굵은 글씨로 다음과 같이 쓰여 있다.

Note that this implementation is not synchronized

이는 동기화되어 있지 않았다는 뜻이다. 따라서 ArrayList<E> 인스턴슬르 대상으로는 둘 이상의 쓰레드가 동시에 접근하는 코드를 만들면 안 된다.

*/