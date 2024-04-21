import java.util.*;

class HashSetLotto {
	public static void main(String[] args) {
		Set set = new HashSet();
		
		for (int i = 0; set.size() < 6 ; i++) {
			int num = (int)(Math.random()*45) + 1;
			set.add(new Integer(num));
		}

		List list = new LinkedList(set);	// LinkedList(Collection c)
		Collections.sort(list);				// Collections.sort(List list)
		System.out.println(list);
		// [5, 8, 17, 26, 35, 38]
	}
}

/*
[참고] Collection은 인터페이스고 Collections는 클래스임에 주의하자.
*/