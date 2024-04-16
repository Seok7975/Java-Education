import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

class HashMapIteration {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        
        // Key-Value ��� ������ ����
        map.put(45, "Brown");
        map.put(37, "James");
        map.put(23, "Martin");

        // Key�� ��� �ִ� �÷��� �ν��Ͻ� ����
        Set<Integer> ks = map.keySet();

        // ��ü Key ��� (for-each�� ���)
        for(Integer n : ks)
            System.out.print(n.toString() + '\t');
        System.out.println();

        // ��ü Value ��� (for-each�� ���)
        for(Integer n : ks)
            System.out.print(map.get(n).toString() + '\t');
        System.out.println();

        // ��ü Value ��� (�ݺ��� ���)
        for(Iterator<Integer> itr = ks.iterator(); itr.hasNext(); )
            System.out.print(map.get(itr.next()) + '\t');
        System.out.println();
    }
}

/*
���� ���
37	23	45	
James	Martin	Brown	
James	Martin	Brown	
*/

/*
HashMap<K, V> Ŭ������ Iterable<T> �������̽��� �������� ������ for-each���� ���ؼ�,
Ȥ�� '�ݺ���'�� �� ������ ������ ������ �� ����. ��ſ� Map<K, V>���� ���� �޼ҵ尡
�����Ѵ�.

public Set<K> keySet()

�� �޼ҵ�� Set<E>�� �����ϴ� �÷��� �ν��Ͻ��� �����ϰ�, ���⿡ ��� Key�� ��Ƽ�
��ȯ�Ѵ�. ���� �� �޼ҵ带 ���ؼ� ���� ������ ���� ��� Key�� ���� ������, �̸�
���� ������ ������ ������ �� �ִ�.

Set<Integer> ks = map.keySet();

Set<E>�� Iterable<E>�� ����ϹǷ� �������� ���̵��� ���� ���� ���� ���Ŀ� for-each����
���ؼ�, �Ǵ� �ݺ��ڸ� �� ������ ������ ������ �� �ִ�.
*/