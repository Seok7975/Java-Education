import java.util.*;

class MyVector2Test {
	public static void main(String args[]) {
		MyVector2 v = new MyVector2();
		v.add("0");
		v.add("1");
		v.add("2");
		v.add("3");
		v.add("4");

		System.out.println("���� �� : " + v);
		Iterator it = v.iterator();
		it.next();
		it.remove();
		it.next();		
		it.remove();

		System.out.println("���� �� : " + v);
	}
}

/*
���� �� : [0, 1, 2, 3, 4]
���� �� : [2, 3, 4]
*/

/*
MyVector2Ŭ������ �׽�Ʈ�ϴ� ������ �����̴�. MyVector2��ü�� �����ϰ�
�����͸� ������ ���� Iterator�� ���ؼ� ù ��°�� �� ��°�� ����� �����͸�
�����Ѵ�.

if(lastRet == -1) {
	throw new IllegalStateException();
} else {
	remove(lastRet);
//	cursor--;			// �ּ�ó���Ѵ�.
	lastRet = -1;
}

MyVector2.java�� remove()���� ���� ���� �ּ�ó���ϸ�, MyVector2Test.java
�� �������� ������ ���� �� ���̴�. 0�� 1, ù ��°�� �� ��° ��Ұ� �������
�������� �ʰ�, ù ��°�� �� ��° ����� 0�� 2�� ������ ���� �� �� �ִ�.

���� ��:[0,1,2,3,4]
���� ��:[1,3,4]

*/