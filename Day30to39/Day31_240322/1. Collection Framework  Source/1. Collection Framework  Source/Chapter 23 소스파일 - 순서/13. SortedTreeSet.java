import java.util.TreeSet;
import java.util.Iterator;

class SortedTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> tree = new TreeSet<Integer>();
        tree.add(3); tree.add(1);
        tree.add(2); tree.add(4);

        System.out.println("�ν��Ͻ� ��: " + tree.size());
        
        // for-each���� ���� �ݺ�
        for(Integer n : tree)
            System.out.print(n.toString() + '\t');
        System.out.println();

        // Iterator �ݺ��ڿ� ���� �ݺ�
        for(Iterator<Integer> itr = tree.iterator(); itr.hasNext(); )
            System.out.print(itr.next().toString() + '\t');
        System.out.println();
    }
}

/*
���� ���

�ν��Ͻ� ��: 4
1	2	3	4	
1	2	3	4	
*/

/*
TreeSet<E> Ŭ������ 'Ʈ��(Tree)'��� �ڷᱸ���� ������� �ν��Ͻ��� �����Ѵ�.
�׸��� �̴� ���ĵ� ���°� �����Ǹ鼭 �ν��Ͻ��� ������� �ǹ��Ѵ�.
(Ʈ����� �ڷᱸ���� Ư���� �׷��ϴٴ� ���̴�.)

TreeSet<E> �ν��Ͻ��� ���� ���¸� �����ϸ鼭 �ν��Ͻ��� �����ϱ� ������ TreeSet<E>��
�ݺ��ڴ� ������ Ư¡�� ���´�.

"�ν��Ͻ����� ���� ������ ���������� �������� �Ѵ�."
*/