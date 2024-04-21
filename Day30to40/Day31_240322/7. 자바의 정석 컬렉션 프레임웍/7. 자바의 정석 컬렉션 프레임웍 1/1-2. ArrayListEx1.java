import java.util.*;

class ArrayListEx1{
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10);
		list1.add(Integer.valueOf(5));
		list1.add(Integer.valueOf(4));
		list1.add(Integer.valueOf(2));
		list1.add(Integer.valueOf(0));
		list1.add(Integer.valueOf(1));
		list1.add(Integer.valueOf(3));

		ArrayList list2 = new ArrayList(list1.subList(1,4)); 
		print(list1, list2);
		// list1:[5, 4, 2, 0, 1, 3]
		// list2:[4, 2, 0]

		Collections.sort(list1);	// list1�� list2�� �����Ѵ�.
		Collections.sort(list2);	// Collections.sort(List l)
		print(list1, list2);
		// list1:[0, 1, 2, 3, 4, 5]
		// list2:[0, 2, 4]

		System.out.println("list1.containsAll(list2):" + list1.containsAll(list2));	
		// list1.containsAll(list2):true 

		list2.add("B");
		list2.add("C");
		list2.add(3, "A");
		print(list1, list2);
		// list1:[0, 1, 2, 3, 4, 5]
		// list2:[0, 2, 4, A, B, C]		

		list2.set(3, "AA");
		print(list1, list2);
		// list1:[0, 1, 2, 3, 4, 5]
		// list2:[0, 2, 4, AA, B, C]
		
		// list1���� list2�� ��ġ�� �κи� ����� �������� �����Ѵ�.
		System.out.println("list1.retainAll(list2):" + list1.retainAll(list2));
		// list1.retainAll(list2):true	
		// reatinAll�� ȣ������ list1�� ���ߴٸ� true�� ��ȯ�Ѵ�.
		print(list1, list2);
		// list1:[0, 2, 4]
		// list2:[0, 2, 4, AA, B, C]
		
		//  list2���� list1�� ���Ե� ��ü���� �����Ѵ�.
		for(int i= list2.size()-1; i >= 0; i--) {
			if(list1.contains(list2.get(i)))
				list2.remove(i);
		}
		print(list1, list2);
		// list1:[0, 2, 4]
		// list2:[AA, B, C]
	} // main�� ��

	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1:"+list1);
		System.out.println("list2:"+list2);
		System.out.println();		
	}
} // class

/*
// ���� ���
list1:[5, 4, 2, 0, 1, 3]
list2:[4, 2, 0]

list1:[0, 1, 2, 3, 4, 5]
list2:[0, 2, 4]

list1.containsAll(list2):true
list1:[0, 1, 2, 3, 4, 5]
list2:[0, 2, 4, A, B, C]

list1:[0, 1, 2, 3, 4, 5]
list2:[0, 2, 4, AA, B, C]

list1.retainAll(list2):true
list1:[0, 2, 4]
list2:[0, 2, 4, AA, B, C]

list1:[0, 2, 4]
list2:[AA, B, C]
*/