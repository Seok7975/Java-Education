import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

public class Test1 {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		while(set.size()<6) {
			set.add((int)(Math.random()*45)+1);
		}
		LinkedList<Integer> list = new LinkedList<Integer>(set);
		Collections.sort(list);
		System.out.println(list);
	}
}

//1. HashSet과 LinkedList를 이용하여 로또번호 만들기.(정렬하여 출력)