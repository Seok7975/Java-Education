import java.util.HashSet;

class Num {
    private int num;
    
    public Num(int n) {
        num = n;
    }

    @Override
    public String toString() {
        return String.valueOf(num);
    }

    @Override
    public int hashCode() {
        return num % 3;
    }

    @Override
    public boolean equals(Object obj) {
        if(num == ((Num)obj).num)
            return true;
        else
            return false;
    }    
}

class HashSetEqualityTwo {
    public static void main(String[] args) {    
        HashSet<Num> set = new HashSet<>();
        set.add(new Num(7799));
        set.add(new Num(9955));
        set.add(new Num(7799));

        System.out.println("�ν��Ͻ� ��: " + set.size());

        for(Num n : set)
            System.out.print(n.toString() + '\t');

        System.out.println();
    }
}

// ������
/*
�ν��Ͻ� ��: 2
9955	7799	
*/

/*
	HashSet<E>�� �Ǵ��ϴ� ���� �ν��Ͻ��� ������, Object Ŭ������ ���ǵǾ� �ִ� ���� �� �޼ҵ���
	ȣ�� ����� �ٰŷ� �ϱ� �����̴�.

	public boolean equals(Object obj)
	public int hashCode()

	Object Ŭ������ ���ǵǾ� �ִ� hashCode�� equals �޼ҵ�� ������ ���� ���ǵǾ� �ִ�.(�����
	Object Ŭ������ hashCode �޼ҵ�� �ν��Ͻ��� ����� �ּڰ��� ������� ��ȯ ���� ���������
	�� ���ǵǾ� �ִ�.)

	"�ν��Ͻ��� �ٸ��� Object Ŭ������ hashCode �޼ҵ�� �ٸ� ���� ��ȯ�Ѵ�."
	"�ν��Ͻ��� �ٸ��� Object Ŭ������ equals �޼ҵ�� false�� ��ȯ�Ѵ�."

	String Ŭ������ ���ڿ��� ���� �񱳰� �̷������� hashCode�� equals�� ������ �������̵�
	�ϰ� �ִ�. ���� HashSet<E> �ν��Ͻ����� ������ ���ڿ��� ���ϴ� String �ν��Ͻ��� ��
	�̻� ������� �ʴ´�.
*/