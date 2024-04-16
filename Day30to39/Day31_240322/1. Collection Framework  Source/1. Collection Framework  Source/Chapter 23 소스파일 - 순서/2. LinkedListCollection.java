import java.util.List;
import java.util.LinkedList;

class LinkedListCollection {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
	// ArrayListCollection.java�� ���ؼ� ������ ��ȭ
        
        // �ν��Ͻ� ���� 
        list.add("Toy");
        list.add("Box");
        list.add("Robot");
	
        // �ν��Ͻ� ����
        for(int i = 0; i < list.size(); i++)
            System.out.print(list.get(i) + '\t');
        System.out.println();
		
        // ù ��° �ν��Ͻ� ����
        list.remove(0);
   
        // ���� �� �ν��Ͻ� ����
        for(int i = 0; i < list.size(); i++)
            System.out.print(list.get(i) + '\t');
        System.out.println();
    }
}

// ������
/*
Toy	Box	Robot	
Box	Robot	
*/

/*
* ArrayList<E>�� ����
- ���� ������ �ø��� �������� �ð��� ���� ���� �ҿ�ȴ�.
- �ν��Ͻ��� ���� �������� ���� ������ �ʿ��� �� �ִ�. ���� ���� �� �ִ�.

* ArrayList<E>�� ����
	- ����� �ν��Ͻ��� ������ ������.

* LinkedList<E>�� ����
	- ����� �ν��Ͻ��� ���� ������ �迭�� ���� �����ϴ�. ���� ���� �� �ִ�.

* LinkedList<E>�� ����
- ���� ������ �ø��� ������ �����ϴ�.
- ����� �ν��Ͻ��� ���� ������ �ܼ��ϴ�.
*/