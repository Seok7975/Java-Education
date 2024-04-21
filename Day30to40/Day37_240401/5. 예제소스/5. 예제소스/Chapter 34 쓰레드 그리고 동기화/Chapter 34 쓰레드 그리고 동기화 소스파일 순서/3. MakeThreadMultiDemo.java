class MakeThreadMultiDemo {
    public static void main(String[] args) {
        Runnable task1 = () -> {    // 20 미만 짝수 출력
            try {
                for(int i = 0; i < 20; i++) {
                    if(i % 2 == 0)
                        System.out.print(i + " ");
                    Thread.sleep(100);	// 0.1초간 잠을 잔다.
                }
            } catch(InterruptedException e) {
                e.printStackTrace();
            }     
        };

        Runnable task2 = () -> {    // 20 미만 홀수 출력
            try {
                for(int i = 0; i < 20; i++) {
                    if(i % 2 == 1)
                        System.out.print(i + " ");
                    Thread.sleep(100);
                }
            } catch(InterruptedException e) {
                e.printStackTrace();
            }     
        };

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);

        t1.start();
        t2.start();
    }
}

/*
//실행 결과
0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 
*/

/*

public static void sleep(long millis) throws InterruptedException

위 메소드를 호출하는 쓰레드는, 인자로 전달된 값의 millisecond 만큼(1/1000초 만큼)
실행을 멈추고 잠을 자게 된다.

한 쓰레드는 20미만의 짝수를, 다른 한 쓰레드는 20미만의 홀수를 출력한다. 그리고 값을 하나
출력할 때마다 0.1씩 잠이 든다. 따라서 위의 실행 결과와 같이 0부터 19까지 1씩 증가하여
출력이 되는 모습을 볼 수 있다.
보통은 쓰레드 하나에 하나의 CPU의 코어 하나가 할당되어 동시에 실행이 이뤄진다. 보급형
스마트폰의 CPU에도 코어가 8개 들어가는 시대이므로 쓰레드 별로 코어가 하나씩 할당되는 
상황은 이제 일반적인 경우가 되었다. 따라서 동시에 실행이 이뤄지는 쓰레드를 대상으로 위
예제에서 보이는 수준으로 실행 흐름을 조절하거나 예측하는 것은 잘못된 결과로 이어지기 쉽다.
즉 수백 번 실행을 해서 동일한 결과를 얻더라도 그 결과를 항상 보장할 수는 없다. 쓰레드가
처한 상황에 따라서, 또는 운영체제가 코어를 쓰레드에 할당하는 방식에 따라서 두 쓰레드의
실행 속도에는 차이가 있을 수 있게 때문이다. 그럼 이러한 상황의 확인을 위해서, 위 예제에서
sleep 메소드의 호출을 생략한 다음 예제를 실행해보자.
*/