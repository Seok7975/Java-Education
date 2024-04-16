import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;

class IteratorCollection {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        
        // �ν��Ͻ� ���� 
        list.add("Toy");  list.add("Box");
        list.add("Robot");  list.add("Box");
	
        // �ݺ��� ȹ��
        Iterator<String> itr = list.iterator();
        
        // �ݺ��ڸ� �̿��� ������ ����
        while(itr.hasNext())
            System.out.print(itr.next() + '\t');

        System.out.println();
        
        // �ݺ��� �ٽ� ȹ��
        itr = list.iterator();
                		
        // "Box"�� ���� 
        String str;
        while(itr.hasNext()) {
            str = itr.next();
            
            if(str.equals("Box"))
                itr.remove();
        }
    
        // �ݺ��� �ٽ� ȹ��
        itr = list.iterator();
        
        // ���� �� ��� Ȯ��
        while(itr.hasNext())
            System.out.print(itr.next() + '\t');

        System.out.println();
    }
}

// ������
/*
Toy	Box	Robot	Box	
Toy	Robot	
*/

/*
	for-each����,
	for(String s : list)
		System.out.print(s + '\t');

	������ �������� ������ ���� �ݺ��ڸ� �̿��ϴ� �ڵ�� �����ȴ�.
	�� for-each�� ���� �ݺ��ڿ� ���� ������ �������� ������ �ȴ�.

	for(Iterator itr = list.iterator();itr.hasNext();	)
		System.out.print(itr.next() + '\t');
*/