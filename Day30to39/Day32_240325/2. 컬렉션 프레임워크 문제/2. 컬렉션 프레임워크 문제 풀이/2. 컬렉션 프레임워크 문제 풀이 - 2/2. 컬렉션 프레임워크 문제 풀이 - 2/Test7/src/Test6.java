import java.util.*;
import java.util.Map.Entry;

class Test6 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("���ڹ�", Integer.valueOf(90));
		map.put("���ڹ�", Integer.valueOf(100));
		map.put("���ڹ�", Integer.valueOf(100));
		map.put("���ڹ�", Integer.valueOf(80));
		map.put("���ڹ�", Integer.valueOf(90));

		Set<Entry<String, Integer>> set = map.entrySet();
		Iterator<Entry<String, Integer>> it = set.iterator();

		while(it.hasNext()) {
			Map.Entry<String, Integer> e = it.next();
			System.out.println("�̸� : "+ e.getKey() + ", ���� : " + e.getValue());
		}

		Set<String> kset = map.keySet();
		System.out.println("������ ��� : " + kset);

		Collection<Integer> values = map.values();
		Iterator<Integer> vit = values.iterator();

		int total = 0;

		while(vit.hasNext()) {
			Integer i = vit.next();
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