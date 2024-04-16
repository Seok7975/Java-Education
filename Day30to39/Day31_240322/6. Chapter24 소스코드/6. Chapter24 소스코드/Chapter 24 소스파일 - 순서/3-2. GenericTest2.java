import java.util.ArrayList;
import java.util.List;
interface Comp<T>
{
	
}
class Gen
{
	public static <T extends Comp<? super T>> void sort(List<T> list)
	{
		
	}
	
}
class Car implements Comp<Car>{}
class ECar extends Car{}
public class GenericTest2 {

	public static void main(String[] args) {
		List<ECar> list = new ArrayList<>();
		Gen.sort(list);		
	}
}

/*
public static <T extends Comp<? super T>> void sort(List<T> list)
	-> T가 ECar인 경우 ECar는 Comparable<? super ECar>를 구현해야 함
	
따라서 List<ECar> 인스턴스를 전달하면서 sort 메소드를 호출하는 순간 T는 ECar가 되어
위의 메소드는 다음 형태로 호출이 되고,

public static void sort(List<ECar> list)

메소드의 선언에서 T가 구현해야 할 인터페이스를 Comparable<? super T>로 명시했으므로
ECar 클래스는 다음 인터페이스 중 하나만 구현해도 위의 sort 메소드 호출은 성공한다.

 Comp<Object>, Comp<Car>, Comp<ECar>
*/
