import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Test2 {

	public static void main(String[] args) {
//		Set<Integer> set = new LinkedHashSet<>();
		Set<Integer> set = new HashSet<>();
		while(set.size()<25) {
			set.add((int)(Math.random()*50)+1);
		}
		Iterator<Integer> itr = set.iterator();
		int i=0;
		while(itr.hasNext()) {
			System.out.print(itr.next()+"\t");
			i++;
			if(i%5==0) {
				System.out.println();
				i=0;
			}
		}
	}

}

//2. HashSet과 LinkedHashSet을 이용하여 5 * 5 빙고를 만들어 출력하자. 번호는 1이상 50이하로 하자.