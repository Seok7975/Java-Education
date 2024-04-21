import java.util.*;

class HashMapEx2 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("���ڹ�", Integer.valueOf(90));
		map.put("���ڹ�", Integer.valueOf(100));
		map.put("���ڹ�", Integer.valueOf(100));
		map.put("���ڹ�", Integer.valueOf(80));
		map.put("���ڹ�", Integer.valueOf(90));

		Set set = map.entrySet();
		Iterator it = set.iterator();

		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("�̸� : "+ e.getKey() + ", ���� : " + e.getValue());
		}

		set = map.keySet();
		System.out.println("������ ��� : " + set);

		Collection values = map.values();
		it = values.iterator();

		int total = 0;

		while(it.hasNext()) {
			Integer i = (Integer)it.next();
			total += i.intValue();
		}

		System.out.println("���� : " + total);
		System.out.println("��� : " + (float)total/set.size());
		System.out.println("�ְ����� : " + Collections.max(values));
		System.out.println("�������� : " + Collections.min(values));
	}
}

/*
�̸� : ���ڹ�, ���� : 90
�̸� : ���ڹ�, ���� : 100
�̸� : ���ڹ�, ���� : 80
�̸� : ���ڹ�, ���� : 100
������ ��� : [���ڹ�, ���ڹ�, ���ڹ�, ���ڹ�]
���� : 370
��� : 92.5
�ְ����� : 100
�������� : 80
*/

/*
HaspMap�� �⺻���� �޼��带 �̿��ؼ� �����͸� �����ϰ� �о���� �����̴�. entrySet()��
�̿��ؼ� Ű�� ���� �Բ� �о� �� ���� �ְ� keySet()�̳� values()�� �̿��ؼ� Ű�� ���� ����
�о� �� �� �ִ�.
*/
