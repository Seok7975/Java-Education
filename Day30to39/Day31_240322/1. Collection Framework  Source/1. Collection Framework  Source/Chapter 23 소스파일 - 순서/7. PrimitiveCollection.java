import java.util.Iterator;
import java.util.LinkedList;

class PrimitiveCollection {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        // ���� �������� ���� �ڽ�
        list.add(10);	
	list.add(20);		
	list.add(30);	
    
        int n;
        for(Iterator<Integer> itr = list.iterator(); itr.hasNext(); ) {
            n = itr.next();    // ���� ��ڽ�
            System.out.print(n + "\t");
        }

        System.out.println();
    }
}
// ������
/*
10	20	30	
*/
// �⺻ �ڷ��� �������� ����� ����
/*
	�÷��� �ν��Ͻ��� �⺻ �ڷ����� ���� �������� ���Ѵ�. �׷��� ���� Ŭ������ �������� �̵� ����
	���� �� ������ �����ϸ�, �� �������� ���� �ڽ̰� ���� ��ڽ����� ���� �ڿ������� �ڵ��� ������
	�����ϴ�.
*/