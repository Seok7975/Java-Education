import java.util.Arrays;

class ArrayEquals {
    public static void main(String[] args) {
        int[] ar1 = {1, 2, 3, 4, 5};
        int[] ar2 = Arrays.copyOf(ar1, ar1.length);

        System.out.println(Arrays.equals(ar1, ar2));
    }
}

/*
실행 결과
true
*/

/*
배열의 비교

public static boolean equals(int[] a, int[] a2)
	-> 매개변수 a와 a2로 전달된 배열의 내용을 비교하여 true 또는 false 반환
	
이 메소드는 두 배열에 저장된 데이터의 수, 순서, 그리고 내용이 같을 때 true를
반환한다.(배열의 길이가 다를 경우에는 false를 반환한다.)

그리고 이 메소드는 다음과 같이 Object형 배열에 대해서도 오버로딩 되어 있다.

public static boolean equals(Object[] a, Object[] a2)

이는 인스턴스의 참조 값을 저장하고 있는 두 배열에 대해서 비교를 진행한다. 그렇다면
어떤 상황에서 true를 반환할까? 이 메소드는 참조 값이 아닌 참조하는 인스턴스의 
내용을 비교한다. 그리고 이때 Object 클래스에 정의된 equals 메소드가 사용된다.
*/