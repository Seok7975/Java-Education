import java.util.*;
import java.util.Map.Entry;

class Test6 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("김자바", Integer.valueOf(90));
		map.put("김자바", Integer.valueOf(100));
		map.put("이자바", Integer.valueOf(100));
		map.put("강자바", Integer.valueOf(80));
		map.put("안자바", Integer.valueOf(90));

		Set<Entry<String, Integer>> set = map.entrySet();
		Iterator<Entry<String, Integer>> it = set.iterator();

		while(it.hasNext()) {
			Map.Entry<String, Integer> e = it.next();
			System.out.println("이름 : "+ e.getKey() + ", 점수 : " + e.getValue());
		}

		Set<String> kset = map.keySet();
		System.out.println("참가자 명단 : " + kset);

		Collection<Integer> values = map.values();
		Iterator<Integer> vit = values.iterator();

		int total = 0;

		while(vit.hasNext()) {
			Integer i = vit.next();
			total += i.intValue();
		}

		System.out.println("총점 : " + total);
		System.out.println("평균 : " + (float)total/set.size());
		System.out.println("최고점수 : " + Collections.max(values));
		System.out.println("최저점수 : " + Collections.min(values));
	}
}

/*
이름 : 안자바, 점수 : 90
이름 : 김자바, 점수 : 100
이름 : 강자바, 점수 : 80
이름 : 이자바, 점수 : 100
참가자 명단 : [안자바, 김자바, 강자바, 이자바]
총점 : 370
평균 : 92.5
최고점수 : 100
최저점수 : 80
*/

/*
HaspMap의 기본적인 메서드를 이용해서 데이터를 저장하고 읽어오는 예제이다. entrySet()을
이용해서 키와 값을 함께 읽어 올 수도 있고 keySet()이나 values()를 이용해서 키와 값을 따로
읽어 올 수 있다.
*/