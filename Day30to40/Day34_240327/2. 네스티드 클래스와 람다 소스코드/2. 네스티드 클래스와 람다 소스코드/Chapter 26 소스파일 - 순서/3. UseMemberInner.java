interface Printable {
    void print();   
}

class Papers {
    private String con;

    public Papers(String s) {
        con = s;
    }

    public Printable getPrinter() {
        return new Printer();
    }

    private class Printer implements Printable {
        public void print() {
            System.out.println(con);
        }
    }
}

class UseMemberInner {
    public static void main(String[] args) {
        Papers p = new Papers("���� ����: �ູ�մϴ�.");
        Printable prn = p.getPrinter();
        prn.print();
    }
}

/*
���� ���
���� ����: �ູ�մϴ�.
*/

/*
"��� Ŭ������ ���� �����ϰ� ����� �� ������?"
"Ŭ������ ���Ǹ� ���߾�� �� �� �����ϰ� ����� �ȴ�."

Papers Ŭ������ �ܺο����� getPrinter �޼ҵ尡 ��� �ν��Ͻ���
���� ���� ��ȯ�ϴ��� ���� ���Ѵ�. �ٸ� ��ȯ�Ǵ� ���� ���� �ν��Ͻ���
Printable�� �����ϰ� �־ Printable�� ���������� ������ �� �ִٴ� ��Ǹ�
�˻��̴�. �׸��� �̷��� ��Ȳ�� ������ 'Ŭ������ ���ǰ� ���߾��� ��Ȳ'�̶�
�Ѵ�.
�̷��� Ŭ������ ���Ǹ� ���߸�, getPrinter �޼ҵ尡 ��ȯ�ϴ� �ν��Ͻ��� 
�ٸ� Ŭ������ �ν��Ͻ��� ����Ǿ Papers Ŭ���� �ܺ��� �ڵ�� ���ݵ�
������ �ʿ䰡 ���� �ȴ�.(�� �ڵ忡 �������� �ο��Ǿ���. �׸��� �̴� ��û��
�����̴�.)
��� �츮�� �̷��� ������� ���ǵ� Ŭ������ ���� �˰� �ִ�. �÷��� �����ӿ�ũ�� 
'�ݺ���'�� �ٷ� �װ��̴�.

public static void main(String[] args){
	List<String> list = new ArrayList<>();
	...
	Iterator<String> itr = list.iterator();	// �ݺ��� ȹ��!
	...
}

���� �ڵ忡�� iterator �޼ҵ尡 ��ȯ�ϴ� �ν��Ͻ��� Ŭ������ �츮�� ���� ���Ѵ�.
�˷��� ����� �ʿ䵵 ������ �˾Ƶ� �� �ǹ̰� ����. �ٸ� �츮���Դ� �� Ŭ������
Iterator<E> �������̽��� �����ϰ� �ִٴ� ������ �ʿ��� ���̴�. ������ iterator
�޼ҵ尡 ��ȯ�ϴ� �ڹ��� �ݺ��ڴ� ������ ���� '��� Ŭ����'�� ���·� ���ǵǾ�
�ִ�.

public class ArrayList<E> implements List<E> {
	...
	public Iterator<E> iterator() {
		return new Itr();	// ��� Ŭ������ �ν��Ͻ� ���� �� ��ȯ
	}

	private class Itr implements Iterator<E> {	// ��� Ŭ������ ����
		...
	}
}

���� iterator �޼ҵ�� ���� �ڹ��� iterator �޼ҵ�� �����ϴ�. �׸��� ArrayList<E>
�ν��Ͻ��� ��ȯ�ϴ� �ݺ��ڴ� Itr Ŭ������ �ν��Ͻ����� ���� �ڵ带 ���ؼ� �� ��
�ִ�. �׷��� �̷��� ������ �츮���� �ǹ̰� ����. Itr Ŭ������ �� ���ǰ� ������
�����Ƿ� �� Ŭ������ ���� �� ������ �츮�� �ۼ��ϴ� �ڵ忡 �ƹ��� ������ 
��ġ�� �ʴ´ٴ� ����� �߿��� ���̴�.
*/