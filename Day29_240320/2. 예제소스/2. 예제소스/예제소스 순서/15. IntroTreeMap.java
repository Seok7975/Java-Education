import java.util.TreeMap;
import java.util.Iterator;
import java.util.NavigableSet;

class IntroTreeMap
{
	public static void main(String[] args)
	{
		TreeMap<Integer, String> tMap=new TreeMap<Integer, String>();

		tMap.put(1, "data1");		
		tMap.put(3, "data3");	
		tMap.put(5, "data5");	
		tMap.put(2, "data2");	
		tMap.put(4, "data4");	
		
		NavigableSet<Integer> navi=tMap.navigableKeySet();

// Map�� collection�� ��ӹ��� ����. ����� Collection �޼ҵ带 ��� �Ұ�(ex) Iterator ��)
// �׷��� ���ٸ��� NavigableSet<Integer> navi=tMap.navigableKeySet(); ����ؾ���
// Map : key�� �ߺ��Ұ�
// Set : �ߺ����� �Ұ�
/*
	navigableKeySet �޼ҵ尡 ȣ��Ǹ�, �������̽� NavigableSet<E>�� �����ϴ� �ν�
	�Ͻ���(�ν��Ͻ��� ���� ����)��ȯ�ȴ�. �� �� E�� key�� �ڷ����� Integer�� �Ǹ�,
	��ȯ�� �ν��Ͻ����� ������ �����͵��� key ������ ����Ǿ� �ִ�.

	NavigableSet<E> �������̽��� Set<E> �������̽��� ����Ѵ�. �� navigableKeySet
	�޼ҵ尡 ��ȯ�ϴ� �ν��Ͻ��� ������� �ݺ��ڸ� ��� ���ؼ� iterator �޼ҵ��� ȣ����
	�����ϴ�. �׸��� �̷��� �ؼ� ���� �ݺ��ڷ�, ����� ��� key�� ������ �����ϴ�.			
*/
		//�������� �ݺ���
		System.out.println("�������� ���...");
		Iterator<Integer> itr=navi.iterator();
		while(itr.hasNext())
			System.out.println(tMap.get(itr.next()));
		
		//�������� �ݺ���
		System.out.println("�������� ���...");
		itr=navi.descendingIterator();
		while(itr.hasNext())
			System.out.println(tMap.get(itr.next()));	
	}
}

/*
����

TreeMap<K, V>�� ��ü ������ �˻�

TreeMap<K, V>�� Collection<E>�� �ƴ� Map<K, V>�� �����ϴ� �÷��� Ŭ�����̴�,
����Ǿ� �ִ� ��ü �����͸� �˻��ϴ� ��Ŀ� ���̰� ������ �翬�� ���̴�. �׸��� ��
���� ����ִ� ����, TreeMap<K, V>�� ����� ��ü �������� ���� �������� ȣ����
navigableKeySet �޼ҵ尡 ��ȯ�ϴ� �ν��Ͻ��� Set<E> �������̽��� �����Ѵٴ� ��
���̴�.  key�� �ߺ��� �Ұ����ϱ� ������ '����'�� ������ ���. ������ �̷��� key��
�����ϴ� �ν��Ͻ��� Set<E> �������̽��� �����ϰ� �ִ� ���̴�.	
*/