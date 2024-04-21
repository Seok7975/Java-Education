import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class StringBinarySearch {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Box");
        list.add("Robot");
        list.add("Apple");

        // ����
        Collections.sort(list);        

        // Ž��
        int idx = Collections.binarySearch(list, "Robot");
 
        // Ž�� ��� ���
        System.out.println(list.get(idx));
    }
}

/*
���� ���
Robot
*/

/*
	public static <T> int binarySearch(List<? extends Comparable<? super T>> list, T key)
		-> list���� key�� ã�� �� �ε��� �� ��ȯ, �� ã���� ���� ���� ��ȯ
		
	binarySearch �޼ҵ�
	�� �޼ҵ�� ���� Ž���̶�� �˰����� ������� Ž���� �����Ѵ�. �׷��� �� 
	�˰����� �����ϱ� ���ؼ��� �ش� �÷��� �ν��Ͻ��� ���ĵ� �����̾�� �Ѵ�.
	���� Ž���� ���ĵ� ����Ʈ �ڷᱸ���� ������� �����ϴ� �˰����̱� �����̴�.
	
	List<String> �ν��Ͻ��� ���ĵ� ���¸� �������� �����Ƿ� ���� ���� ������ ���� 
	�����ؾ� �Ѵ�. ���࿡ ���ĵ��� ���� ���¿��� binarySearch �޼ҵ带 ȣ���ϸ�
	�������� ����� ���� ���Ѵ�. Ȥ �������� ����� ��´� �ص� �̴� �쿬�� ��ġ��
	���̴�.
*/