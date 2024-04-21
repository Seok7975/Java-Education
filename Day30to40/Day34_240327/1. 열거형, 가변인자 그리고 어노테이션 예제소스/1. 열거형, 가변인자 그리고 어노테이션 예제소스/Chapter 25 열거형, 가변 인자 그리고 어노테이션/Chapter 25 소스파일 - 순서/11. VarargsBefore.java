class VarargsBefore {
    public static void showAll(String[] vargs) {
        System.out.println("LEN: " + vargs.length);

        for(String s : vargs) 
            System.out.print(s + '\t');
        System.out.println();
    }

    public static void main(String[] args) {
        showAll(new String[]{"Box"});
        showAll(new String[]{"Box", "Toy"});
        showAll(new String[]{"Box", "Toy", "Apple"});
    }
}
/*
LEN: 1
Box	
LEN: 2
Box	Toy	
LEN: 3
Box	Toy	Apple	
*/

/*
매개변수의 가변 인자 선언은 자바 5에서 추가된 문법이다.
따라서 그 이전에는 위와 같이 코드를 작성해야만 했다.

위 예제에서 보이듯이 가변 인자 선언을 기반으로 작성된 다음
메소드 정의와 호출문은,

public static void showAll(String...vargs){...}

public static void main(String[] args) {
	showAll("Box");
	showAll("Box", "Toy");
	showAll("Box", "Toy", "Apple");
}
다음과 같이 작성할 수도 있다.

public static void showAll(String[] vargs) {...}
public static void main(String[] args){
	showAll(new String[]{"Box"});
	showAll(new String[]{"Box", "Toy"});
	showAll(new String[]{"Box", "Toy", "Apple"});
}

그리고 이것이 자바 컴파일러가 가변 인자 선언 및 메소드 호출문을
처리하는 방식이기도 하다. 즉 컴파일러는 다음 메소드 정의를,

public static void showAll(String...vargs){...}

다음과 같이 수정하여 컴파일 완료한다.

public static void showAll(String[] vargs){...}

그리고 위의 메소드를 호출하는 다음 문장은,

showAll("Box", "Toy", "Apple");

다음과 같이 수정하여 컴파일을 완료한다.

showAll(new String[]{"Box", "Toy", "Apple"});
*/