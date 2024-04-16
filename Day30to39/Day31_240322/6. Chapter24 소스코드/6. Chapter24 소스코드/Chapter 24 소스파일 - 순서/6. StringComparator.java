import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

class StrComp implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return s1.compareToIgnoreCase(s2);
    }
}

class StringComparator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ROBOT");
        list.add("APPLE");
        list.add("BOX");

        StrComp cmp = new StrComp();    // 정렬과 탐색의 기준

        Collections.sort(list, cmp);    // 정렬
        int idx = Collections.binarySearch(list, "Robot", cmp);   // 탐색
 
        System.out.println(list.get(idx));    // 탐색 결과 출력 
    }
}

/*
실행 결과

ROBOT
*/

/*
찾기 : Comparator<T> 기반
Collections 클래스에는 Comparator<T>를 구현하는 클래스를 정의하여 탐색의
기준을 마련할 수 있는 다음 메소드도 존재한다.

public static <T> int binarySearch(List<? extends T> list, T key, Comparator<? super T> c)
	-> list에서 key를 찾는데 c의 기준을 적용하여 찾는다.
	
이 메소드도 한눈에 들어오지 않는다면 다음과 같이 줄여 놓고 이해하자.

public static <T> int binarySearch(List<T> list, T key, Comparator<T> c)

그리고 나서 다음과 같이 <? extends T>와 <? super T>의 의미를 덧붙이자.

"List<T> 아니고 List<? extends T>인 이유는 list에서 T형 인스턴스를 꺼내는 것만 허용하기 위해"
"Comparator<T> 아니고 Comparator<? super T>인 이유는 ECar 클래스를 통해 설명한 그것"

그러면 다음 메소드 전체가 눈에 들어온다.

public static <T> int binarySearch(List<? extends T> list, T key, Comparator<? super T> c)
*/