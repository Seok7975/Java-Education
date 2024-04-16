import java.util.HashMap;

class HashMapCollection {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        
        // Key-Value ��� ������ ����
        map.put(45, "Brown");
        map.put(37, "James");
        map.put(23, "Martin");


        // ������ Ž��
        System.out.println("23��: " + map.get(23));
        System.out.println("37��: " + map.get(37));
        System.out.println("45��: " + map.get(45));
        System.out.println();

        // ������ ����
        map.remove(37);

        // ������ ���� Ȯ��
        System.out.println("37��: " + map.get(37));
    }
}

/*
���� ���

23��: Martin
37��: James
45��: Brown

37��: null
*/

/*
Map<K, V>�� �����ϴ� �÷��� Ŭ������ �ν��Ͻ����� Key�� Value�� �� ����
�̷�� ���·� �����͸� �����Ѵ�.

Key-Value ����� ������ ����� HashMap<K, V> Ŭ����
ĳ��ֿ� ����ö�� ������ �� �ش� ����ö�� ���� ã�� �� �ֵ��� ����ö��
Ư�� ��ġ�� ������ ������ �̸��� ��ִ´�. �׸��� �̰��� Key��
Value�� �ϳ��� ���� �̷�� ������ ���� ����̴�. Key�� ������ �����Ͱ�
�ƴϴ�. ��� ������ Value�� ã�� ��ǥ�� �ȴ�.
Collection<E>�� �����ϴ� Ŭ������ Value�� �����ϴ� �������ٸ�,
Map<K, V>�� �����ϴ� Ŭ������ Value�� ������ ��, �̸� ã�� �� ����ϴ�
Key�� �Բ� �����ϴ� �����̴�. ������ Key�� �ߺ��� �� ����. �ݸ� 
Key�� �ٸ��ٸ� Value�� �ߺ��� �Ǿ �������.

"Key�� ��ǥ�̹Ƿ� �ߺ��� �� ����. �ݸ� Key�� �ٸ��� Value�� 
�ߺ��Ǿ �������."

Map<K, V>�� �����ϴ� ��ǥ Ŭ������ HashMap<K, V>�� TreeMap<K, V>��
�ִ�. ���� ���� ū ��������, Ʈ�� �ڷᱸ���� ������� ������ TreeMap<K, V>
�� ���� ���¸� �����Ѵٴµ� �ִ�. ���� ������ ����� Value�� �ƴ϶�
Key�̴�.
 */