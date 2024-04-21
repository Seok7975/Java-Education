import java.util.Comparator;
import java.util.TreeSet;


class Person implements Comparable<Person> {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() { return name + " : " + age; }

    @Override
    public int compareTo(Person p) {
        return this.age - p.age;
    }
}

class PersonComparator implements Comparator<Person> {
    public int compare(Person p1, Person p2) {
        return p2.age - p1.age; 
    }
}



class ComparatorPerson {
    public static void main(String[] args) {
        TreeSet<Person> tree = new TreeSet<>(new PersonComparator());
        tree.add(new Person("YOON", 37));
        tree.add(new Person("HONG", 53));
        tree.add(new Person("PARK", 22));
	
        for(Person p : tree)
            System.out.println(p);
    }
}

/*
���� ���

HONG : 53
YOON : 37
PARK : 22

*/

/*
Comparator<T> �������̽��� ������� TreeSet<E>�� ���� ���� �����ϱ�

�츮�� Person Ŭ������ �����Ͽ���. �̶� ���̰� ���� ����� ���ʿ� ��ġ�ϵ���
compareTo �޼ҵ嵵 ������ ���Ҵ�. �׷��� ���̰� ���� ����� ���ʿ� ��ġ�ϵ���
������ �ٲ�� �Ѵٸ�? ���� �޼ҵ��� ���� ������ �����ϸ� �ȴ�. �׷��� �Ͻ�����
���� �����̶�� �޼ҵ带 �����ϴ� ���� ����ġ �ʴ�. �׸��� ������ �̷��� ��Ȳ��
����Ͽ� ���� �������̽��� �����ǰ� �ִ�.

public interface Comparator<T>
	-> int compare(T o1, T o2)�� ������ ���� ���� ������ ������ �� �ִ�.
	
public TreeSet(Comparator<? super E> comparator)

�׷��� �̷��� ������ TreeSet<E> �ν��Ͻ��� �����ڷ� ���޵� �ν��Ͻ��� compare
�޼ҵ� ȣ������ �������� ������ �����Ѵ�. �׸��� compare �޼ҵ��� ���� ������ 
������ ����.

int compare(T o1, T o2)
	* o1�� o2���� ũ�� ���� ���� ��ȯ
	* o1�� o2���� ������ ���� ���� ��ȯ
	* o1�� o2�� ���ٸ� 0��ȯ
	
*/