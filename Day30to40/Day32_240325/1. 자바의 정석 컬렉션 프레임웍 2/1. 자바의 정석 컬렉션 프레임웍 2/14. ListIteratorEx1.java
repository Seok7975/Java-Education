import java.util.*;

class ListIteratorEx1 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");

		ListIterator it = list.listIterator();

		while(it.hasNext()) {
			System.out.print(it.next()); // ���������� �����ϸ鼭 �о�´�.
		}
		System.out.println();

		while(it.hasPrevious()) {
			System.out.print(it.previous()); // ���������� �����ϸ鼭 �о�´�.
		}
		System.out.println();
	}
}

/*
12345
54321
*/

/*
ListIterator�� ������� �����ִ� ������ �����̴�. Iterator�� �ܹ������θ� �̵��ϱ�
������ �÷����� ������ ��ҿ� �ٴٸ��� �� �̻� ����� �� ������, ListIterator��
��������� �̵��ϱ� ������ �� ��Ұ��� �̵��� �����Ӵ�. �ٸ� �̵��ϱ� ���� �ݵ��
hasNext()�� hasPrevious()�� ȣ���ؼ� �̵��� �� �ִ��� Ȯ���ؾ� �Ѵ�.

ListIterator�� �ִ� �޼��� �߿��� '������ ���(optional operation)'�� �ִ�. �̴� �ݵ��
�������� �ʾƵ� �ȴ�. ���� ��� Iterator �������̽��� �����ϴ� Ŭ�������� remove()�� 
�������� ����̹Ƿ� �������� �ʾƵ� ������. �׷����ϴ��� �������̽��κ��� ��ӹ���
�޼���� �߻�޼���� �޼����� ����(body)�� �ݵ�� ����� �־�� �ϹǷ� ������ ����
ó���Ѵ�.

public void remove() {
	throw new UnsupportedOperationException();
}

�ܼ��� public void remove() {} �� ���� �����ϴ� �ͺ��� ��ó�� ���ܸ� ������ ��������
���� ����̶�� ���� �޼��带 ȣ���ϴ� �ʿ� �˸��� ���� ����. �׷��� ������ ȣ���ϴ�
�ʿ����� �ҽ��� ���غ��� �������� �� ����� �ٸ��� �������� �ʴ� ������ �� �����
����.
Java API�������� remove()�޼����� �󼼳����� ���� remove�޼��带 �������� �ʴ�
Iterator�� UnsupportedOperationException�� �߻���Ų�ٰ� ���� �ִ�. ��, remove�޼��带
�������� �ʴ� ��쿡�� UnsupportedOperationException�� �߻���Ű���� �����϶��
���̴�.
 ���� �ڵ忡�� remove�޼����� ����ο� ����ó���� ���� ���� ������ 
Unsupported OperationException�� RuntimeException�� �ڼ��̱� �����̴�.
 Iterator�� remove()�� �ܵ����� ���� �� ����, next()�� ���� ����Ѵ�. Ư����ġ��
��Ҹ� �����ϴ� ���� �ƴ϶� �о� �°��� �����Ѵ�. next()�� ȣ����� remove()��
ȣ���ϸ� IllegalStateException�� �߻��Ѵ�.
 '����ũ�μ���Ʈ �ƿ���(Microsoft outlook)'�� ���� emailŬ���̾�Ʈ���� ���ϼ�����
�ִ� ������ ������ �� ������ �ִ� ������ �о �� ������(copy), ������ �������鼭
�������� ������ ��(move)������ ������ �� �ִ�. �̿� ���� ����� �����ϰ��� �� �� �� �������� 
remove()�� ������ ���� ���̴�.
 �ܼ��� �������� �о���⸸ �� ���� next()�� ����ϸ� �ǰ�, �о� �� ������ ������ 
������ �ʰ� ���� ���� next()�� �Բ� remove�� ����ϸ� �̿� ���� ����� ������ �� �ִ�.


*/