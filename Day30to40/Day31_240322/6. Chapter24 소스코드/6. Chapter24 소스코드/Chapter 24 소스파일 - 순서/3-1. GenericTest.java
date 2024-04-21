import java.util.ArrayList;
import java.util.List;
interface Comp<T>
{
	
}
class Gen
{
	public static <T extends Comp<T>> void sort(List<T> list)
	{
		
	}
	
}
class Car implements Comp<Car>{}
class ECar extends Car{}
public class GenericTest {

	public static void main(String[] args) {
		List<ECar> list = new ArrayList<>();
		Gen.sort(list);		// Error
	}
}


/*
public static <T extends Comp<T>> void sort(List<T> list)
	-> T가 ECar인 경우 ECar는 Comp<ECar>를 구현해야 한다.
*/