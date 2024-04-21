import java.util.*;

class VectorEx1 {
	public static void main(String[] args) {
		Vector v = new Vector(5);	// �뷮(capacity)�� 5�� Vector�� �����Ѵ�.
		v.add("1");
		v.add("2");
		v.add("3");
		print(v);

		// [1, 2, 3]
		// size :3
		// capacity :5

		v.trimToSize();	// �� ������ ���ش�.(�뷮�� ũ�Ⱑ ��������.)
		System.out.println("=== After trimToSize() ===");
		print(v);

		// === After trimToSize() ===
		// [1, 2, 3]
		// size :3
		// capacity :3

		v.ensureCapacity(6);
		System.out.println("=== After ensureCapacity(6) ===");
		print(v);

		// === After ensureCapacity(6) ===
		// [1, 2, 3]
		// size :3
		// capacity :6

		v.setSize(7);
		System.out.println("=== After setSize(7) ===");
		print(v);

		// === After setSize(7) ===
		// [1, 2, 3, null, null, null, null]
		// size :7
		// capacity :12		

		v.clear();
		System.out.println("=== After clear() ===");
		print(v);

		// === After clear() ===
		// []
		// size :0
		// capacity :12
	}

	public static void print(Vector v) {
		System.out.println(v);
		System.out.println("size :" + v.size());
		System.out.println("capacity :" + v.capacity());
	}
}

/*
ArrayList�� Vector ���� �迭�� �̿��� �ڷᱸ���� �����͸� �о���� �����ϴ� ����
ȿ���� ������, �뷮�� �����ؾ��� ���� ���ο� �迭�� ������ �� ������ �迭�κ��� ��
�� ������ �迭�� �����͸� �����ؾ��ϱ� ������ ����� ȿ���� �������ٴ� ������ ������
�ִ�. �׷��� ó���� �ν��Ͻ��� ������ ��, ������ �������� ������ �� ����Ͽ� �����
�뷮�� �ν��Ͻ��� �����ϴ� ���� ����.
*/