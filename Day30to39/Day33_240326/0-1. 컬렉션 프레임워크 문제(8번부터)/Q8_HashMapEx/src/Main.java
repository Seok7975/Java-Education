//8.다음과 같이 실행 결과가 나오도록 하자.
//import java.util.*;
//
//class HashMapEx4 {
//	public static void main(String[] args) {
//		String[] data = { "A","K","A","K","D","K","A","K","K","K","Z","D" };
//
//		HashMap map = new HashMap();
//	}
//}
//
//실행결과
//
//A : ### 3
//D : ## 2
//Z : # 1
//K : ###### 6


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

class HashMapEx4 {
    public static void main(String[] args) {
        String[] data = {"A", "K", "A", "K", "D", "K", "A", "K", "K", "K", "Z", "D"};

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < data.length; i++) {

            if (map.containsKey(data[i])) {
                Integer value = (Integer) map.get(data[i]);
                map.put(data[i], Integer.valueOf((value.intValue() + 1)));
            } else {
                map.put(data[i], 1);
            }
        }

        Iterator<Entry<String, Integer>> it = map.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<String, Integer> entry = it.next();
            int value = entry.getValue().intValue();
            System.out.println(entry.getKey() + " : " + printBar('#', value) + "" + value);
        }
    }

    public static String printBar(char ch, int value) {
        char[] bar = new char[value];

        for (int i = 0; i < bar.length; i++) {
            bar[i] = ch;
        }

        return new String(bar);
    }
}