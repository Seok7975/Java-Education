import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Arrays;


//Iterator�� �ܹ��� ��ȸ�� ����, ������ ��� �������ų� ���� �Ұ�
//ListIterator�� ������ ��ҵ� �������ų� ������ �� �ִ�

class ListIteratorCollection {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Toy", "Box", "Robot", "Box");
        list = new ArrayList<>(list);
       
        ListIterator<String> litr = list.listIterator();
        String str; 

        // ���ʿ��� ���������� 
        while(litr.hasNext()) {
            str = litr.next();
            System.out.print(str + '\t');

            if(str.equals("Toy"))
                litr.add("Toy2");
        }
        System.out.println();
        //Toy	Box	Robot	Box	
        // �����ʿ��� ��������

        while(litr.hasPrevious()) {
            str = litr.previous();
            System.out.print(str + '\t');

            if(str.equals("Robot"))
                litr.add("Robot2");
        }
        System.out.println();
	// Box	Robot	Robot2	Box	Toy2	Toy	

        // �ٽ� ���ʿ��� ����������
        for(Iterator<String> itr = list.iterator(); itr.hasNext(); )
            System.out.print(itr.next() + '\t');
        System.out.println();
	// Toy	Toy2	Box	Robot2	Robot	Box
    }
}

// ������
/*
Toy	Box	Robot	Box	
Box	Robot	Robot2	Box	Toy2	Toy	
Toy	Toy2	Box	Robot2	Robot	Box	
*/

/*
	���� ����Ʈ�� ���� ����� �ݺ���
	Collection<E>�� �����ϴ� Ŭ������ �ν��Ͻ��� iterator �޼ҵ��� ȣ���� ���ؼ� '�ݺ���'�� ����
	�� �ִ�. �׷��� List<E>�� �����ϴ� Ŭ������ �ν��Ͻ��鸸 ���� �� �ִ� '����� �ݺ���'��� ����
	�ִµ�, �̴� List<E>�� ���� �޼ҵ� ȣ���� ���ؼ� ���� �� �ִ�.

	public ListIterator<E> listIterator()
		-> ListIterator<E>�� Iterator<E>�� ����Ѵ�.

	���� �޼ҵ尡 ��ȯ�ϴ� �ݺ��ڴ� ���� �������� �̵��� �����ϴٴ� Ư¡�� �ִµ�, �̴� �迭�̳� ��
	�� ����Ʈ�� ���� �ڷᱸ���� Ư���� ������ ���̴�. �׸��� �� �޼ҵ尡 ��ȯ�ϴ� �ݺ��ڸ� �������
	ȣ���� �� �ִ� ��ǥ �޼ҵ���� ������ ����.

	E next()			���� �ν��Ͻ��� ���� ���� ��ȯ
	boolean hasNext()		next �޼ҵ� ȣ�� �� ���� �� ��ȯ ���� ���� Ȯ��
	void remove()		next �޼ҵ� ȣ���� ���� ��ȯ�ߴ� �ν��Ͻ��� ����

	E previous()		next �޼ҵ�� ����� ���� ���⸸ �ݴ�
	boolean hasPrevious()	hasNext �޼ҵ�� ����� ���� ���⸸ �ݴ�

	void add(E e)		�ν��Ͻ��� �߰�
	void set(E e)		�ν��Ͻ��� ����

	ListIterator<E>�� Iterator<E>�� ����Ѵ�.
	
	���� ����� ���ؼ� add �޼ҵ尡 ��� ��ġ�� �ν��Ͻ��� �߰��ϴ��� Ȯ���� �� �ִ�. �� �̸� ����
	���� ����� �� �� �ִ�.

	"next ȣ�� �Ŀ� add ȣ���ϸ�, �ռ� ��ȯ�� �ν��Ͻ� �ڿ� �� �ν��Ͻ� ���Եȴ�."
	"previous ȣ�� �Ŀ� add ȣ���ϸ�, �ռ� ��ȯ�� �ν��Ͻ� �տ� �� �ν��Ͻ��� ���Եȴ�."
*/