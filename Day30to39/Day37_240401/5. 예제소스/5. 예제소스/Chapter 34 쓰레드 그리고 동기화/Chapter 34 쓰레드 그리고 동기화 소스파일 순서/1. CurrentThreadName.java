class CurrentThreadName {
    public static void main(String[] args) {
	// main 메소드를 실행하는 쓰레드를 지칭하는(main 메소드를 실행하는
	// 쓰레드의 정보를 담고 있는) 인스턴스의 참조를 얻을 수 있다.
        Thread ct = Thread.currentThread();
	// 그리고 쓰레드도 이름이 있는데, 다음 문장을 통해서 참조하는 쓰레드의
	// 이름을 얻을 수 있다.
        String name = ct.getName();
        System.out.println(name);
    }
}

/*
실행결과

main
*/