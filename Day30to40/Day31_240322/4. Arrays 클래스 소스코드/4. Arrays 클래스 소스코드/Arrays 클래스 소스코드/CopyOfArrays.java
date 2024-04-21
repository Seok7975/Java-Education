import java.util.Arrays;

class CopyOfArrays {
    public static void main(String[] args) {
        double[] arOrg = {1.1, 2.2, 3.3, 4.4, 5.5};
     
        // 배열 전체를 복사하여 배열 생성
        double[] arCpy1 = Arrays.copyOf(arOrg, arOrg.length);
        
        // 배열의 세번째 요소까지만 복사하여 배열 생성 
        double[] arCpy2 = Arrays.copyOf(arOrg, 3);


        for(double d : arCpy1)
            System.out.print(d + "\t");
        System.out.println();


        for(double d : arCpy2)
            System.out.print(d + "\t");
        System.out.println();

    }
}

/*
실행 결과
1.1	2.2	3.3	4.4	5.5	
1.1	2.2	3.3	
*/

/*
배열의 복사
배열 복사에 사용되는 Arrays 클래스의 메소드는 다음과 같다. 모든 기본 자료형 배열에 대해 이
메소드가 오버로딩 되어 있으나 아래에서는 int형 배열에 대해 정의된 메소드만 보였다.

public static int[] copyOf(int[] original, int newLength)
	-> original에 전달된 배열을 첫 번째 요소부터 newLength의 길이만큼 복사
	
위 메소드는 배열을 복사하여 '새로운 배열을 생성'하는 메소드이다. 첫 번째 인자로 전달된 
배열을 두 번째 인자로 전달된 길이만큼 복사하되 '새로운 배열을 생성'하여 복사한다. 그리고
이렇게 생성된 배열의 참조 값을 반환한다.

배열의 일부만 복사하려면 Arrays 클래스의 다음 메소드를 사용하면 된다. 물론 이 메소드도 기본
자료형 배열 전부에 대해 오버로딩 되어 있다.

public static int[] copyOfRange(int[] original, int from, int to)
	-> original에 전달된 배열을 인덱스 from부터 to 이전 요소까지 복사
	
예를 들어서 앞서 예제에서 선언한 다음 배열의 2.2가 저장된 요소부터 4.4가 저정된 요소까지
복사하기를 원한다면, 다음과 같이 문장을 구성하면 된다.

double[] arOrg = {1.1, 2.2, 3.3, 4.4, 5.5};
double[] arCpy2 = Arrays.copyOfRange(arOrg, 1, 4);

위의 문장에서 전달된 숫자 1과 4는 배열의 인덱스 정보이다. 그러나 인덱스 1부터 4까지의 
복사가 아니라 4이전까지의 복사를 의미한다는 점에 주의해야 한다. 그리고 위의 예제와 달리
배열을 새로 생성하지 않고 존재하는 배열에 복사를 하려는 경우에는 java.lang.System
클래스의 다음 메소드를 호출하면 된다.

public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
	-> 배열 src의 srcPos에서 배열  dest의 destPos로 length 길이만큼 복사
	
*/