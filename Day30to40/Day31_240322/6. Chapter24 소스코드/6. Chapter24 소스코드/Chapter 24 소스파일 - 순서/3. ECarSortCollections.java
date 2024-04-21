import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

class Car implements Comparable<Car> {
    protected int disp;    // ��ⷮ

    public Car(int d) { disp = d; }

    @Override
    public String toString() { 
        return "cc: " + disp; 
    }
    @Override
    public int compareTo(Car o) { 
        return disp - o.disp; 
    }
}

class ECar extends Car {
    private int battery;    // ���͸� 
    
    public ECar(int d, int b) {
        super(d);
        battery = b;
    }

    @Override
    public String toString() { 
        return "cc: " + disp + ", ba: " + battery; 
    }
}

class ECarSortCollections {
    public static void main(String[] args) {
        List<ECar> list = new ArrayList<>();
        list.add(new ECar(1200, 99));
        list.add(new ECar(3000, 55));
        list.add(new ECar(1800, 87));

        // ����
        Collections.sort(list);        

        // ���
        for(Iterator<ECar> itr = list.iterator(); itr.hasNext(); )
            System.out.println(itr.next().toString() + '\t');
    }
}

/*
���� ���
cc: 1200, ba: 99	
cc: 1800, ba: 87	
cc: 3000, ba: 55	
*/

/*
	public static <T extends Comparable<? super T>> void sort(List<T> list)
	
	������ sort �޼ҵ尡 ������ ���� ���ǵǾ� �ִٰ� �����ϰ� �̾߱⸦ �̾� ������
	
	public static <T extends Comparable<T>> void sort(List<T> list)
	
	�׷��� �������� List<Car> �ν��Ͻ��� ���ڷ� �����Ͽ� sort �޼ҵ带 ȣ���� ��, T�� Car��
	�����Ǿ� ���� ������ �޼ҵ� ȣ���� ����ȴ�.
	
	public static void sort(List<Car> list)
	
	�� Car�� ���� ������ �����ؾ� �ϴµ�, �������� ������ Car�� �� ������ �����Ѵ�. ����
	�� ������ ���������� ������ �� ������ �Ϸ��� �� �ִ�.
	
	Car�� Comparable<Car>�� �����ؾ� �Ѵ�.
	
	�׷��� ������ ���� Car�� ����ϴ� ECar�� �����ߴٰ� �����غ���. (ECar�� ���� �ڵ����� 
	ǥ���� Ŭ�����̴�.)
	
	class Car implements Comparable<Car> {...}
	class ECar extends Car {...}	// ECar�� Comparable<Car>�� ���� ����
	
	�׷��� ECar�� Comparable<Car>�� �����ϴ�(���� �����ϴ�) ���°� �Ǵµ�, �̸� �������
	������ ���� �ڵ带 �ۼ��ϸ� �������� �ǰڴ°�?
	
	public static void main(String[] args) {
		List<ECar> list = new ArrayList<>();
		...
		Collections.sort(list);		// �� �޼ҵ� ȣ���� ������ �� ������?
		...
	}
	
	���� ���� sort �޼ҵ带 ȣ���ϸ� 'T�� ECar�� �����Ǿ�' ���� ������ sort �޼ҵ� ȣ����
	����ȴ�.
	
	public static void sort(List<ECar> list)
	
	�׸��� sort �޼ҵ尡 ������ ���ٰ� �����Ͽ�����, ECar�� Comparable<ECar>�� �����ϰ�
	�־�� ���� sort �޼ҵ� ȣ�⿡ ������ ����.
	
	public static <T extends Comparable<T>> void sort(List<T> list)
		-> T�� ECar�� ��� ECar�� Comparable<ECar>�� �����ؾ� ��
		
	�׷��� Ŭ������ ���� �� ����� ������ ������ �����Ƿ� ECar�� Comparable<Car>�� �����ϴ�
	���������� Comparable<ECar>�� �������� �ʴ� �����̴�.
	
	class Car implements Comparable<Car> {...}
	class ECar extends Car {...}	// Comparable<Car>�� ���� �����Ѵ�.
	
	���� ������ ���� sort �޼ҵ��� ȣ���� �������� ���Ѵ�. �׷��� Collections Ŭ������
	sort �޼ҵ�� �̷��� ��Ȳ�� ����Ͽ� ������ ���� ���ǵǾ� �ִ�.
	
	public static <T extends Comparable<? super T>> void sort(List<T> list)
		-> T�� ECar�� ��� ECar�� Comparable<? super ECar>�� �����ؾ� ��
		
	���� List<ECar> �ν��Ͻ��� �����ϸ鼭 sort �޼ҵ带 ȣ���ϴ� ���� T�� ECar�� �Ǿ�
	���� �޼ҵ�� ���� ���·� ȣ���� �ǰ�,
	
	public static void sort(List<ECar> list)
	
	�޼ҵ��� ���𿡼� T�� �����ؾ� �� �������̽��� Comparable<? super T>�� ��������Ƿ�
	ECar Ŭ������ ���� �������̽� �� �ϳ��� �����ص� ���� sort �޼ҵ� ȣ���� �����Ѵ�.
	
	Comparable<Object>, Comparable<Car>, Comparable<ECar>
*/