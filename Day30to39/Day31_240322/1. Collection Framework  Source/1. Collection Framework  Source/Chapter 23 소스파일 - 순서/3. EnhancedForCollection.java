import java.util.List;
import java.util.LinkedList;

class EnhancedForCollection {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        
        // �ν��Ͻ� ���� 
        list.add("Toy");
        list.add("Box");
        list.add("Robot");
	
        // �ν��Ͻ� ����
        for(String s : list)
            System.out.print(s + '\t');
        System.out.println();
		
        // ù ��° �ν��Ͻ� ����
        list.remove(0);
   
        // ���� �� �ν��Ͻ� ����
        for(String s : list)
            System.out.print(s + '\t');
        System.out.println();
    }
}

// ������
/*
Toy	Box	Robot	
Box	Robot	
*/

// ����� �ν��Ͻ��� ������ ���� ��� 1: enhanced for���� ���(for-each��)
/* 
for - each���� ���� ������ ������ ����� �Ƿ���, �ش� �÷��� Ŭ������ ���� �������̽���
�����ؾ� �Ѵ�. (Iterable�� ������ �ֵ鸸 enhanced for���� �� �� �ִ�)

public interface Iterable<T>

�׷��� �ռ� �Ұ��� ArrayList<E>, LinkedList<E>Ŭ������ ���� �������̽��� �����ϰ� �ִ�.
��Ȯ���� ������ ���� Collection<E>�� Iterable<T>�� ����ϴµ�, ArrayList<E>,
LinkedList<E> Ŭ������ Collection<E> �������̽��� �����ϰ� �ִ�.

public interface Collection<E> extends Iterable<E>

�̷��� Iterable<T>�� ���� Ȥ�� ���������� �����ϴ� Ŭ������ �ν��Ͻ��� ������� for-each����
������ �� �ִ�.

�ռ� Collection<E>�� Iterable<T>�� ����Ѵٰ� �Ͽ���. ���� Collection<E>�� �����ϴ� �ڹ���
���׸� Ŭ������ Iterable<T>�� ���� �߻� �޼ҵ带 ��� �����Ѵ�.

Iterable<T> iterator()

�� �޼ҵ�� '�ݺ���(Iterator)'��� ���� ��ȯ�Ѵ�. �ݺ��ڴ� ����� �ν��Ͻ����� ���������� ������
�� ����ϴ� �ν��Ͻ���, ������ '������'�� ������ �� �ִ�. �׸��� �� �����̸� ��� ����� ������
����.(���� �� �������� ������ ����� �ν��Ͻ����� ����Ű�� ���̴�.)

public static void main(String[] args) {
	List<String> list = new LinkedList<>();
	...
	Iterator<String> itr = list.iterator();	// �ݺ��� ȹ��, itr�� �����̸� �����Ѵ�.
	...
}

������ ���� �����̸�(�ݺ��ڸ�) ���� ȣ���� �� �ִ�, Iterator<E>�� �޼ҵ���� ������ ����.

E next()			���� �ν��Ͻ��� ���� ���� ��ȯ
boolean hasNext()		next �޼ҵ� ȣ�� �� ���� �� ��ȯ ���� ���� Ȯ��
void remove()		next �޼ҵ� ȣ���� ���� ��ȯ�ߴ� �ν��Ͻ� ����

�ݺ��ڴ� next�� ȣ���� ������ ù ��° �ν��Ͻ��� �������� ���� �ν��Ͻ��� ���� ���� ���ʷ� ��ȯ
�Ѵ�. �׸��� �� �̻� ��ȯ�� ����� ���� �� noSuchElementException ���ܸ� �߻���Ų��. ����
����� �ν��Ͻ��� ���ʷ� ������ ������ ������ ���� �ݺ����� �����ؾ� �Ѵ�.

// �ݺ��ڸ� �̿��� ������ ����
while(itr.hasNext()) {	// next �޼ҵ尡 ��ȯ�� ����� �ִٸ�,
	str = itr.next();	// next �޼ҵ带 ȣ���Ѵ�.
	...
}

for-each���� ���� ������ ���ٰ� �޸� �ݺ��ڸ� �̿��ϸ� �ݺ� �߰��� Ư�� �ν��Ͻ��� �����ϴ� ���� �����ϴ�.
(�̴� for-each���� ���ؼ��� �Ұ����� ���̴�.)

// �ݺ��ڸ� �̿��� ���� ���� �� �ν��Ͻ��� ����
while(itr.hasNext()) {
	str = itr.next();
	if(str.equals("Box")
		itr.remove();	// ������ next �޼ҵ尡 ��ȯ�� �ν��Ͻ� ����
}

�̷��� �ݺ��ڴ� ������ ���ÿ� ù ��° �ν��Ͻ��� ����Ű��, next�� ȣ��� ������ ����Ű�� ����� ���� �ν��Ͻ��� �Ű�����. �׷��ٸ� �� �ݺ��ڸ� ���ϴ� ���� �ٽ� ù ��° �ν��Ͻ��� ����Ű�� �Ϸ��� ��� �ؾ� �ұ�? ����Ű�� ��ġ�� �ǵ����� ����� ������ ������ ���� �ݺ��ڸ� �ٽ� ���� �Ѵ�.

Iterator<String> itr = list.iterator();

*/