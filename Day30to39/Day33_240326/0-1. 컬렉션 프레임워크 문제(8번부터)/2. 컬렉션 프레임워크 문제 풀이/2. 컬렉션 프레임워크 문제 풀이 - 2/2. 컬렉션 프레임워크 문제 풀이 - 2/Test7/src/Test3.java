import java.util.*;

class Test3 {
	public static void main(String args[]) {
		HashSet<String> setA    = new HashSet<>();
		HashSet<String> setB    = new HashSet<>();
		HashSet<String> setHab = new HashSet<>();
		HashSet<String> setKyo = new HashSet<>();
		HashSet<String> setCha = new HashSet<>();

		setA.add("1");		setA.add("2");
		setA.add("3");		setA.add("4");
		setA.add("5");
		System.out.println("A = "+setA);
		// A = [1, 2, 3, 4, 5]

		setB.add("4");		setB.add("5");
		setB.add("6");		setB.add("7");
		setB.add("8");
		System.out.println("B = "+setB);
		// B = [4, 5, 6, 7, 8]

		Iterator<String> it = setB.iterator();
		while(it.hasNext()) {
			String tmp = it.next();
			if(setA.contains(tmp))
				setKyo.add(tmp);
		}

		it = setA.iterator();
		while(it.hasNext()) {
			String tmp = it.next();
			if(!setB.contains(tmp))
				setCha.add(tmp);
		}

		it = setA.iterator();
		while(it.hasNext())
			setHab.add(it.next());

		it = setB.iterator();
		while(it.hasNext())
			setHab.add(it.next());

		System.out.println("A ∩ B = "+setKyo);  // 한글 ㄷ을 누르고 한자키
		// A ∩ B = [4, 5]
		System.out.println("A ∪ B = "+setHab);  // 한글 ㄷ을 누르고 한자키
		// A ∪ B = [1, 2, 3, 4, 5, 6, 7, 8]
		System.out.println("A - B = "+setCha); 
		// A - B = [1, 2, 3]
	}
}
