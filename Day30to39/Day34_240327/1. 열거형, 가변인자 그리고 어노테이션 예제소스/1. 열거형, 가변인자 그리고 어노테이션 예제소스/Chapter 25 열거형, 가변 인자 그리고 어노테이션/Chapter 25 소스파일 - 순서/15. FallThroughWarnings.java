class FallThroughWarnings {
 //   @SuppressWarnings("fallthrough")
    public static void main(String[] args) {
        int n = 3;
        
        switch(n) {
        case 1:
            System.out.println(n);            
        case 2:
            System.out.println(n);
        case 3:
            System.out.println(n);
        }
    }
}

/*
javac -Xlint FallThroughWarnings.java
옵션 -Xlint의 의미는 'enable recommended warnings'이다.
경고 메시지의 다음 부분을 관찰하자. 여기서 [ ] 안에 위치한
것이 경고 유형이다.

warning: [fallthrough] possible fall-through into case

따라서 이 경고의 전달을 원치 않으면 다음과 같이 어노테이션 타입을
선언하면 된다.

@SuppressWarnings("fallthrough")
public static void main(String[] args) {...}
그리고 둘 이상의 경고 유형에 대해 동시에 @SuppressWarnings 선언을
하고자 한다면 다음과 같이 문장을 구성하면 된다.

@SuppressWarnings({"fallthrough", "deprecation"})

*/