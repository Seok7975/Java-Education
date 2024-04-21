import java.util.TreeSet;
import java.util.Iterator;
import java.util.Comparator;

class StringComparator implements Comparator<String> {
    public int compare(String s1, String s2) {
        return s1.length() - s2.length();
    }
}

class ComparatorString {
    public static void main(String[] args) {
        TreeSet<String> tree = new TreeSet<>(new StringComparator());
        tree.add("Box");    
        tree.add("Rabbit");
        tree.add("Robot");
	
        for(String s : tree)
            System.out.print(s.toString() + '\t');

        System.out.println();
    }
}

/*
실행 결과

Box	Robot	Rabbit

자바에서 제공하는 기본 클래스를 대상으로 정렬 기준을 바꿔야 하는 상황에서는
Comparator<T>의 구현이 좋은 해결책이 된다.
*/