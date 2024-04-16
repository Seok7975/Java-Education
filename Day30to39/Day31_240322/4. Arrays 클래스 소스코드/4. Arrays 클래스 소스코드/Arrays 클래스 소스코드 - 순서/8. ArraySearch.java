import java.util.Arrays;

class ArraySearch {
    public static void main(String[] args) {
        int[] ar = {33, 55, 11, 44, 22};

        Arrays.sort(ar);	// 탐색 이전에 정렬이 선행되어야 한다. 이진탐색 및 삽입을 위해
        for(int n : ar)
            System.out.print(n + "\t");
        System.out.println();

        int idx = Arrays.binarySearch(ar, 33);	// 배열 ar에서 33을 찾아라
        System.out.println("Index of 33: " + idx);

    }
}

/*
출력 결과
11	22	33	44	55	
Index of 33: 2
*/

/*
public static int binarySearch(int[] a, int key)
	-> 배열 a에서 key를 찾아서 있으면 key의 인덱스 값, 없으면 0보다 작은 수 반환
	
그리고 이 메소드는 다음과 같이 Object형 배열에 대해서도 오버로딩 되어 있다. 물론 이
메소드의 호출을 위해서는 배열이 정렬된 상태이어야 한다.

public static int binarySearch(Object[] a, Object key)

그렇다면 이 메소드가 key와 동일한 인스턴스를 찾았다고 판단하는 기준은 무어일까?
Comparable 인터페이스의 compareTo 메소드가 그 기준이다. compareTo 메소드의
호출을 통해서 0이 반환되면 key에 해당하는 인스턴스를 찾았다고 판단한다.
*/