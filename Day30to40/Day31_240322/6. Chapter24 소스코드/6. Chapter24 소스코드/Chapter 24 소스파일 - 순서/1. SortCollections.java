import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

class SortCollections {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Toy", "Box", "Robot", "Weapon");
        list = new ArrayList<>(list);

        // ���� ���� ���       
        for(Iterator<String> itr = list.iterator(); itr.hasNext(); )
            System.out.print(itr.next() + '\t');
        System.out.println();

        // ����
        Collections.sort(list);        

        // ���� ���� ���
        for(Iterator<String> itr = list.iterator(); itr.hasNext(); )
            System.out.print(itr.next() + '\t');
        System.out.println();
    }
}

/*
Toy	Box	Robot	Weapon	
Box	Robot	Toy	Weapon	
*/

/*
����
List<E>�� ������ �÷��� Ŭ�������� ����� �ν��Ͻ��� ���ĵ� ���·� �������� �ʴ´�. ��ſ�
������ �ؾ� �Ѵٸ� ���� �޼ҵ带 ����� �� �ִ�.

public static <T extends Comparable<T>> void sort(List<T> list)

���� �޼ҵ�� Collections Ŭ������ ���ǵǾ� �ִ� ���׸� �޼ҵ��̴�.

public static <T> void sort(List<T> list)
	-> �޼ҵ� ȣ�� ������ T�� �����ǹǷ� List<T>�� �ν��Ͻ��� ��� ���� ����
	
public static <T extends Comparable<T>> void sort(List<T> list)
	-> �׷��� �� T�� Comparable<T> �������̽��� ������ �����̾�� �Ѵ�.
	
���������� �̷��� �� �ܰ踦 ���ļ� ������ ������ ������ ���� �ϳ��� ��������.

public static <T extends Comparable<T>> void sort(List<T> list)
	-> ���ڷ� List<T>�� �ν��Ͻ��� ��� ���� ����
	-> ��, T�� Comparable<T> �������̽��� ������ �����̾�� �Ѵ�.
	
�̷��� �����ϰ� ���� ������ ���� Comparable<String>�� �����Ѵ�. ����
������ ���̵��� List<String> �ν��Ͻ��� sort �޼ҵ��� ���ڷ� ������ �� �� �ִ�.

public final class String extends Object implements Comparable<String>

String Ŭ������ compareTo �޼ҵ�� ���� ���� ������(lexicographically) ���ĵǵ���
�����Ǿ� �ִ�.
*/