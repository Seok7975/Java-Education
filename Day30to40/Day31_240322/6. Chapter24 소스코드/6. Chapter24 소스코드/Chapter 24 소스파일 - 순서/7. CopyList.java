import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

class CopyList {
    public static void main(String[] args) {
        List<String> src = Arrays.asList("Box", "Apple", "Toy", "Robot");

        // 복사본을 만들어서 사용        
        List<String> dest = new ArrayList<>(src);

        // 정렬하여 그 결과를 출력
        Collections.sort(dest);
        System.out.println(dest);

        // 사정상 정렬 이전의 상태로 되돌려야 함
        Collections.copy(dest, src);

        // 되돌림 확인
        System.out.println(dest);
    }
}

/*
실행 결과
[Apple, Box, Robot, Toy]
[Box, Apple, Toy, Robot]
*/

/*
복사하기

다음은 리스트 구조의 컬렉션 인스턴스에 저장된 내용을 복사하는 기능의 메소드이다.
물론 이 메소드도 Collections 클래스에 정의되어 있다.

public static <T> void copy(List<? super T> dest, List<? extends T> src)
	-> src의 내용을 dest로 복사
	
List<T> dest 아닌 List<? super T> dest 인 이유는?
	-> dest에 T형 인스턴스를 넣는 것만 허용하겠다. 꺼내면 컴파일 에러!
	
List<T> src 아닌 List<? extends T> src 인 이유는?
	-> src로부터 T형 인스턴스 꺼내는 것만 허용하겠다. 넣으면 컴파일 에러!
	
위 메소드 호출 시 한가지 주의할 점은 매개변수 dest에 전달되는 컬렉션 인스턴스의 저장 공간이
src에 전달되는 컬렉션 인스턴스의 저장 공간보다 크거나 최소한 같아야 한다는 점이다. 만약에
dest로 전달된 인스턴스의 저장 공간이 작다면 복사의 과정에서 공간이 자동으로 늘지 않고
예외가 발생한다.

위 예제에서 보이듯이 컬렉션 인스턴스를 생성하지 않은 상태에서 복사본을 만들려면 다음 방법을 사용하면 된다.

List<String> dest = new ArrayList<>(src);

즉 copy 메소드는 위의 문장을 대신하지 않는다. 그러나 이미 생성된 컬렉션 인스턴스의 내용을
통째로 바꾸려는 경우에 copy 메소드는 유용하게 사용된다. 
*/