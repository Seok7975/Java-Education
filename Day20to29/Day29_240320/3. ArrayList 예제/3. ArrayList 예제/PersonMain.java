import java.util.ArrayList;
import java.util.List;

public class PersonMain {

	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();
		list.add(new Person("ȫ�浿", 20));
		list.add(new Person("���۸�", 25));
		list.add(new Person("��Ʈ��", 30));
		
		for(Person person : list)
			person.showInfo();
	}
}

/*
	List<String> list = new ArrayList<>();
	�� ���忡�� ArrayList<E>�� ���������� �ƴ� List<E>�� ���������� ������ ������ �ڵ忡 ��������
	�����ϱ� �����̴�. �ַ� List<E>�� ����� �޼ҵ带 ȣ���ϱ� ������ ���� ArrayList<E>�� ����������
	������ �ʿ䰡 ������, �̷��� List<E>�� ���������� �ν��Ͻ��� ������ ��� ������ ���� �÷���
	Ŭ������ ��ü�� ����������.

	List<String> list = new ArrayList<>();
		-> List<String> list = new LinkedList<>();

	�ν��Ͻ��� ���� ���
	list.add("Toy");		// �ν��Ͻ��� ����

	list.remove(0);	// �� �տ� ��ġ��(ù ��°�� �����) �ν��Ͻ� ����

	ArrayList<E> �ν��Ͻ��� ���������� �迭�� �����ؼ� �ν��Ͻ��� �����ϴµ�, �ʿ��ϸ� �� �迭��
	���̸� ������ �ø��� �����̴�. �� �迭�� ���̸� �ø��ٴ� ���� �� �� �迭���� ��ü�� �ǹ��Ѵ�.
	(�ѹ� ������ �迭�� ���̸� �ø� �� �����Ƿ�) ���� ���ɿ� �Ű��� ��� �Ѵٸ� ArrayList<E>��
	���� ������ ������ �˾� �� �ʿ䰡 �ִ�.

	public ArrayList(int initialCapacity)
		-> ���ڷ� ���޵� ���� �ν��Ͻ��� ������ �� �ִ� ������ �̸� Ȯ��

	�����ؾ� �� �ν��Ͻ��� ���� �뷫 ����� �ȴٸ� ���� �����ڸ� ���ؼ� ������ ������ �迭�� �̸�
	����� �δ� ���� ���� ��� ������ �ȴ�.

	public ArrayList()
		-> 10���� �ν��Ͻ��� ������ �� �ִ� ������ �̸� Ȯ��

	List<E> �������̽��� ������ �÷��� Ŭ�������� '���� ������ �����Ѵ�.'
*/