import java.util.TreeSet;
import java.util.Iterator;

class SortedTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> tree = new TreeSet<Integer>();
        tree.add(3); tree.add(1);
        tree.add(2); tree.add(4);

        System.out.println("인스턴스 수: " + tree.size());
        
        // for-each문에 의한 반복
        for(Integer n : tree)
            System.out.print(n.toString() + '\t');
        System.out.println();

        // Iterator 반복자에 의한 반복
        for(Iterator<Integer> itr = tree.iterator(); itr.hasNext(); )
            System.out.print(itr.next().toString() + '\t');
        System.out.println();
    }
}

/*
실행 결과

인스턴스 수: 4
1	2	3	4	
1	2	3	4	
*/

/*
TreeSet<E> 클래스는 '트리(Tree)'라는 자료구조를 기반으로 인스턴스를 저장한다.
그리고 이는 정렬된 상태가 유지되면서 인스턴스가 저장됨을 의미한다.
(트리라는 자료구조의 특성이 그러하다는 뜻이다.)

TreeSet<E> 인스턴스가 정렬 상태를 유지하면서 인스턴스를 저장하기 때문에 TreeSet<E>의
반복자는 다음의 특징을 갖는다.

"인스턴스들의 참조 순서는 오름차순을 기준으로 한다."
*/