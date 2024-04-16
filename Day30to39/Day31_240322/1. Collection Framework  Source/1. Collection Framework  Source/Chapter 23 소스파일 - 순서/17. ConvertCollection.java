import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashSet;

class ConvertCollection {
    public static void main(String[] args) {
        List<String> lst = Arrays.asList("Box", "Toy", "Box", "Toy");
        ArrayList<String> list = new ArrayList<>(lst);
        
        for(String s : list)
            System.out.print(s.toString() + '\t');
        System.out.println();

        HashSet<String> set = new HashSet<>(list);
        list = new ArrayList<>(set);

        for(String s : list)
            System.out.print(s.toString() + '\t');
        System.out.println();
    }
}
/*
실행 결과

Box	Toy	Box	Toy	
Box	Toy	
*/

/*
HashSet<String> set = new HashSet<>(list);

public HashSet(Collection<? extends E> c)
	-> 다른 컬렉션 인스턴스로부터 HashSet<E> 인스턴스 생성
	
위와 같이 인스턴스를 생성하면 HashSet<String> 인스턴스에 저장
대상을 복사하는 연산이 내부적으로 진행된다. 그리고 그 과정에서
Set<E> 인터페이스의 성격에 맞게 중복된 인스턴스는 걸러지게 된다.
*/
