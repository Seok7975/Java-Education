import java.util.Arrays;

class ArraySort {
    public static void main(String[] args) {
        int[] ar1 = {1, 5, 3, 2, 4};
        double[] ar2 = {3.3, 2.2, 5.5, 1.1, 4.4};
        
        Arrays.sort(ar1);
        Arrays.sort(ar2);

        for(int n : ar1) 
            System.out.print(n + "\t");
        System.out.println();

        for(double d : ar2) 
            System.out.print(d + "\t");
        System.out.println();
    }
}

/*
실행 결과
1	2	3	4	5	
1.1	2.2	3.3	4.4	5.5	
*/
/*
public static void sort(int[] a)
	-> 매개변수 a로 전달된 배열을 오름차순(Ascending Numerical Order)으로 정렬
	
그리고 이 메소드는 다음과 같이 Object 배열에 대해서도 오버로딩 되어 있다.

public static void sort(Object[] a)

이는 인스턴스의 참조 값을 저장하고 있는 배열에 대한 정렬을 진행한다. 그렇다면 순서상 인스턴스의
앞서고 뒤섬은 어떻게 판단을 할까? 이는 다음 인터페이스의 구현을 기반으로 프로그래머가 클래스
별로 결정하게 되어 있다.

interface Comparable
	-> int compareTo(Object o) 메서드 구현을 통해 인스턴스의 순서 판단 기준을 결정
	
위 인터페이스에 존재하는 추상 메소드 compareTo의 구현 방법은 다음과 같다.
* 인자로 전달된 o가 작다면 양의 정수 반환
* 인자로 전달된 o가 크다면 음의 정수 반환
* 인자로 전달된 o와 같다면 0을 반환
*/