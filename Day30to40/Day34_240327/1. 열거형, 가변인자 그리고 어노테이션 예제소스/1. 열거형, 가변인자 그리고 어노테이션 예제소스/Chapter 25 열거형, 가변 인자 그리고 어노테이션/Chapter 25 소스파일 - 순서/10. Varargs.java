class Varargs {
    public static void showAll(String... vargs) {
        System.out.println("LEN: " + vargs.length);

        for(String s : vargs) 
            System.out.print(s + '\t');
        System.out.println();
    }

    public static void main(String[] args) {
        showAll("Box");
        showAll("Box", "Toy");
        showAll("Box", "Toy", "Apple");
    }
}
/*
실행결과
LEN: 1
Box	
LEN: 2
Box	Toy	
LEN: 3
Box	Toy	Apple	
*/

/*
public static int hash(Object ... values)
이렇듯 ... 이 삽입된 이 메소드의 매개변수 선언을 가리켜
'가변 인자 선언'이라 한다.

    public static void showAll(String... vargs) {
        System.out.println("LEN: " + vargs.length);
        ...
    }

위에 소스 코드를 통해 알수 있는 것은 vargs가 배열을 참조한다는 것이다.
때문에 length에 접근하여 그 길이를 확인할 수 있다. 실제로 다음과 같이
메소드 호출이 이뤄지면,

showAll("Box", "Toy", "Apple");

배열을 생성하여 전달되는 인자들을 모두 담는다. 그리고 그 배열이 매개변수
vargs에 전달된다. 따라서 메소드 내에서는 매개변수 vargs를 배열의 이름으로
이해하고 코드를 작성할 수 있다.	
*/