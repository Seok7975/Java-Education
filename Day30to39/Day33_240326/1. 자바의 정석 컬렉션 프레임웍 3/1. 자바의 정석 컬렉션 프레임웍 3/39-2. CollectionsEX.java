import java.util.*;
import static java.util.Collections.*;

public class CollectionsEX {

	public static void main(String[] args) {
		List list = new ArrayList();
		System.out.println(list);
		// []
		
		addAll(list, 1,2,3,4,5);
		System.out.println(list);
		// [1, 2, 3, 4, 5]
		
		rotate(list, 2);	// ���������� �� ĭ�� �̵�
		System.out.println(list);
		// [4, 5, 1, 2, 3]
		
		swap(list,0,2);		// ù ��°�� �� ��°�� ��ȯ(swap)
		System.out.println(list);
		// [1, 5, 4, 2, 3]
		
		shuffle(list);		// ����� ����� ��ġ�� ���Ƿ� ����
		System.out.println(list);
		// [1, 3, 4, 5, 2]
		
		sort(list);			// ����
		System.out.println(list);
		// [1, 2, 3, 4, 5]
		
		sort(list, reverseOrder());		// ���� ���� reverse(list);�� ����
		System.out.println(list);
		// [5, 4, 3, 2, 1]
		
		int idx = binarySearch(list, 3);	// 3�� ����� ��ġ(index)�� ��ȯ
		System.out.println("index of 3 = " + idx);
		// index of 3 = 2
		
		System.out.println("max=" + max(list));		// max=5
		System.out.println("min=" + min(list));		// min=1
		System.out.println("min=" + max(list, reverseOrder()));		// min=1
		
		fill(list, 9);		// list�� 9�� ä���.
		System.out.println("list="+list);
		// list=[9, 9, 9, 9, 9]
		
		// list�� ���� ũ���� ���ο� list�� �����ϰ� 2�� ä���. ��, ����� ����Ұ�
		List newList = nCopies(list.size(), 2);
		System.out.println("newList="+newList);
		// newList=[2, 2, 2, 2, 2]
		
		System.out.println(disjoint(list, newList)); // �����Ұ� ������ true
		// true
		
		copy(list, newList);
		System.out.println("newList="+newList);
		// newList=[2, 2, 2, 2, 2]
		System.out.println("list"+list);
		// list[2, 2, 2, 2, 2]
		
		replaceAll(list, 2, 1);
		System.out.println("list="+list);
		// list=[1, 1, 1, 1, 1]
		
		Enumeration e = enumeration(list);	// list�� Enumeration�� ��ȯ
		ArrayList list2 = list(e);		// Enumeration�� ArrayList�� ��ȯ
		
		System.out.println("list2"+list2);
		// list2[1, 1, 1, 1, 1]
	}
}

/*
���׸����� JDK1.5���� ���Ե� ����̹Ƿ� JDK1.5������ �ۼ��� �ڵ带 ����� ����
�� �޼������ �ʿ��� �� �ִ�.
*/