import java.util.*;
import java.util.Map.Entry;

class Test8 {
	public static void main(String[] args) {
		String[] data = { "A","K","A","K","D","K","A","K","K","K","Z","D" };

		HashMap<String, Integer> map = new HashMap<>();

		for(int i=0; i < data.length; i++) {
			if(map.containsKey(data[i])) {
				Integer value = (Integer)map.get(data[i]);
				map.put(data[i], Integer.valueOf( (value.intValue() + 1)) );
			} else {
				map.put(data[i], 1);			
			}
		}

		Iterator<Entry<String, Integer>> it = map.entrySet().iterator();

		while(it.hasNext()) {
			Map.Entry<String, Integer> entry = it.next();
			int value = entry.getValue().intValue();
			System.out.println(entry.getKey() + " : " + printBar('#', value) + " " + value );
		}
	} // main

	public static String printBar(char ch, int value) { 
		char[] bar = new char[value]; 

		for(int i=0; i < bar.length; i++) { 
			bar[i] = ch; 
		} 

		return new String(bar); 	// String(char[] chArr)
	}
}
/*
A : ### 3
D : ## 2
Z : # 1
K : ###### 6
*/

/*
문자열 배열에 담긴 문자열을 하나씩 읽어서 HashMap에 키로 저장하고 값으로
1을 저장한다. HashMap에 같은 문자열이 키로 저장되어 있는지 containsKey()로
확인하여 이미 저장되어 있는 문자열이면 값을 1증가시킨다.
그리고 그 결과를 printBar()를 이용해서 그래프로 표현했다. 이렇게 하면 문자열
배열에 담긴 문자열들의 빈도수를 구할 수 있다.
 한정된 범위 내에 있는 순차적인 값들의 빈도수는 배열을 이요하지만, 이처럼
한정되지 않은 범위의 비순차적인 값들의 빈도수는 HashMap을 이용해서 구할 수
있다.
[참고] 결과를 통해 HashMap과 같이 해싱을 구현한 컬렉션 클래스들은 저장순서를
유지하지 않는다는 사실을 다시 한 번 확인하자.
*/