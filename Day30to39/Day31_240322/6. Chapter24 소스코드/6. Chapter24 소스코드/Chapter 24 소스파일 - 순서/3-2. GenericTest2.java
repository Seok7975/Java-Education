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
	-> T�� ECar�� ��� ECar�� Comparable<? super ECar>�� �����ؾ� ��
	
���� List<ECar> �ν��Ͻ��� �����ϸ鼭 sort �޼ҵ带 ȣ���ϴ� ���� T�� ECar�� �Ǿ�
���� �޼ҵ�� ���� ���·� ȣ���� �ǰ�,

public static void sort(List<ECar> list)

�޼ҵ��� ���𿡼� T�� �����ؾ� �� �������̽��� Comparable<? super T>�� ��������Ƿ�
ECar Ŭ������ ���� �������̽� �� �ϳ��� �����ص� ���� sort �޼ҵ� ȣ���� �����Ѵ�.

 Comp<Object>, Comp<Car>, Comp<ECar>
*/
