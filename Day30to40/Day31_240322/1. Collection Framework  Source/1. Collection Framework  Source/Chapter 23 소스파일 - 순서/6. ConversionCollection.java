import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.Arrays;

class ConversionCollection {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Toy", "Box", "Robot", "Box");
        list = new ArrayList<>(list);

        // ArrayList<E> �ν��Ͻ��� ��ȯ
        for(Iterator<String> itr = list.iterator(); itr.hasNext(); )
            System.out.print(itr.next() + '\t');
        System.out.println();

        // ArrayList<E>�� LinkedList<E>�� ��ȯ
        list = new LinkedList<>(list);

        // LinkedList<E> �ν��Ͻ��� ��ȯ
        for(Iterator<String> itr = list.iterator(); itr.hasNext(); )
            System.out.print(itr.next() + '\t');
        System.out.println();
    }
}

// ������
/*
Toy	Box	Robot	Box	
Toy	Box	Robot	Box	
*/

/*
	��ټ� �÷��� Ŭ�������� �ٸ� �÷��� �ν��Ͻ��� ���ڷ� ���޹޴� �����ڸ� ������ �־,
	�ٸ� �÷��� �ν��Ͻ��� ����� �����͸� �����ؼ� ���ο� �÷��� �ν��Ͻ��� ������ �� �ִ�.

	public ArrayList(Collection<? extends E> c)	// ArrayList<E> ������ �� �ϳ�
		-> ���ڷ� ���޵� �÷��� �ν��Ͻ��κ��� ArrayList<E> �ν��Ͻ� ����

	public LinkedList(Collection<? extends E> c)	// LinkedList<E> ������ �� �ϳ�
		-> ���ڷ� ���޵� �ν��Ͻ��κ��� LinkedList<E> �ν��Ͻ� ����

	public HashSet(Collection<? extends E> c)	// HashSet<E> ������ �� �ϳ�
		-> ���ڷ� ���޵� �ν��Ͻ��κ��� HashSet<E> �ν��Ͻ� ����

	���� ArrayList<E> �ν��Ͻ��� ����ϴٰ� ���� ����Ʈ �ڷᱸ���� Ư���� �ʿ��ϸ� 
	�̸� ������� LinkedList<E> �ν��Ͻ��� �����ϸ� �ȴ�.
*/