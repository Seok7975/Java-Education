import java.util.*;

class HashMapEx1 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("myId", "1234");
		map.put("asdf", "1111");
		map.put("asdf", "1234");

		Scanner s = new Scanner(System.in);	// ȭ�����κ��� ���δ����� �Է¹޴´�.

		while(true) {
			System.out.println("id�� password�� �Է����ּ���.");
			System.out.print("id :");
			String id = s.nextLine().trim();

			System.out.print("password :");
			String password = s.nextLine().trim();
			System.out.println();

			if(!map.containsKey(id)) {
				System.out.println("�Է��Ͻ� id�� �������� �ʽ��ϴ�. �ٽ� �Է����ּ���.");
				continue;
			} else {
				if(!(map.get(id)).equals(password)) {
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�. �ٽ� �Է����ּ���.");
				} else {
					System.out.println("id�� ��й�ȣ�� ��ġ�մϴ�.");						
					break;
				}
			}
		} // while
	} // main�� ��
}

/*
// ���� ȭ��
id�� password�� �Է����ּ���.
id :asdf
password :1111

��й�ȣ�� ��ġ���� �ʽ��ϴ�. �ٽ� �Է����ּ���.
id�� password�� �Է����ּ���.
id :asdf
password :1234

id�� ��й�ȣ�� ��ġ�մϴ�.
*/

/*
���� �ڵ�� HashMap�� �����ϰ� �����͸� �����ϴ� �κ��ε� �� �ڵ尡 ����ǰ� ����
HashMap���� �Ʒ��� ���� ���·� �����Ͱ� ����ȴ�.

Ű(key)			��(value)
myId			1234
asdf			1234

3���� �����͸� ������ ���������� �����δ� 2�� �ۿ� ������� ���� ������ �ߺ��� Ű�� �ֱ�
�����̴�. �� ��°�� ������ �������� Ű�� 'asdf'�� �̹� �����ϱ� ������ ���� �߰��Ǵ�
��� ������ ���� ������. �׷��� Ű 'asdf'�� ����� ���� '1234'�� �ȴ�.
 Map�� ���� �ߺ��� ��������� Ű�� �ߺ��� ������� �ʱ� ������ �����Ϸ��� �� ������
 �߿��� ��� ���� Ű�� �� �������� �� �����ؾ��Ѵ�.
[����]
Hashtable�� Ű(key)�� ��(value)���� null�� ������� ������, HashMap�� ����Ѵ�.
�׷��� 'map.put(null, null);'�̳� 'map.get(null);'�� ���� �� �� �ִ�.
*/