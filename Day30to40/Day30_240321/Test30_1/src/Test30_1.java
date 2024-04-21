//[ArrayList<E> 클래스의 용량(버퍼) 설정]
//ArrayList<E> 클래스는 저장되는 데이터의 수가 증가함에 따라서,
//용량(데이터 저장 가능한 용량)이 자동으로 증가하는 클래스이다.
//그런데 용량을 증가시키는 과정에서 수반되는 연산으로 인해
//때로는 성능에 부담이 되기도 한다. 때문에 대략 500여 개의 데이터가
//저장 될 것이 예상되는 상황에서는 점진적으로 용량을 500으로 늘리기 보다,
//처음부터 용량을 500으로 잡음으로 인해서 불필요한 연산을 줄일 필요도 있다.
//물론 ArrayList<E>의 메소드 중에는 저장용량의 설정을 위한 메소드가 존재한다.
//따라서 여러분은 API 문서를 참조하여 이 메소드를 찾기 바란다.
//그리고 다음 조건을 만족시키는 코드를 각각 구성해 보기 바란다.
//
//* Integer 인스턴스를 저장할 수 있는 ArrayList<E>를 생성하고
//  저장용량을 500으로 늘린다.
//* ArrayList<E>에 저장되어 있는 인스턴스 수의 두 배로 저장용량을 늘린다.


//Test30_1
import java.util.ArrayList;

class ArrListExercise_EnsureCapacity
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.ensureCapacity(500);
        list.ensureCapacity(list.size*2);
    }
}