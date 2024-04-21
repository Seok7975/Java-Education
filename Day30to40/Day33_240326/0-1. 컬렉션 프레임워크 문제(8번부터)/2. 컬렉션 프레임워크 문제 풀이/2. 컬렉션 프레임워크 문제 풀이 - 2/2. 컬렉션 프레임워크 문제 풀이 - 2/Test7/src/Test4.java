import java.util.*;

class Test4 {
	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<>();
		
		for (int i = 0; set.size() < 6 ; i++) {
			int num = (int)(Math.random()*45) + 1;
			set.add(num);  // set.add(new Integer(num));
		}

		System.out.println(set);
		// [4, 5, 21, 30, 34, 40]
	}
}