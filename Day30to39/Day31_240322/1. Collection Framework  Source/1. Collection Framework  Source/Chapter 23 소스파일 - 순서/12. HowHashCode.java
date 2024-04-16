import java.util.HashSet;

class Car {
    private String model;
    private String color;
    
    public Car(String m, String c) {
        model = m;
        color = c;
    }

    @Override
    public String toString() {
        return model + " : " + color;
    }

    @Override
    public int hashCode() {
        return (model.hashCode() + color.hashCode()) / 2;
    }
/*
    @Override
    public int hashCode() {
        return java.util.Objects.hash(model, color);
    }
*/
    @Override
    public boolean equals(Object obj) {
        String m = ((Car)obj).model;
        String c = ((Car)obj).color;

        if(model.equals(m) && color.equals(c))
            return true;
        else
            return false;
    }    
}

class HowHashCode{
    public static void main(String[] args) {    
        HashSet<Car> set = new HashSet<>();
        set.add(new Car("HY_MD_301", "RED"));
        set.add(new Car("HY_MD_301", "BLACK"));
        set.add(new Car("HY_MD_302", "RED"));
        set.add(new Car("HY_MD_302", "WHITE"));
        set.add(new Car("HY_MD_301", "BLACK"));

        System.out.println("�ν��Ͻ� ��: " + set.size());

        for(Car car : set)
            System.out.println(car.toString() + '\t');
    }
}

// ������
/*
�ν��Ͻ� ��: 4
HY_MD_301 : RED	
HY_MD_302 : RED	
HY_MD_301 : BLACK	
HY_MD_302 : WHITE	
*/

/*
	Ŭ������ ������ ������ �̷��� hashCode �޼ҵ带 �����ϴ� ���� ���ŷο� ���̴�. Ư�� �ؽ�
	�˰����� ������ ������� ����ϸ鼭 ��� Ŭ������ �����ϱ�� ���� ���� �ƴϴ�. �׷��� �ڹٿ�	���� ���� �޼ҵ带 �����ϰ� �ִ�.

	public static int hash(Object ... values)
		-> java.util.Objects�� ���ǵ� �޼ҵ�, ���޵� ���� ����� �ؽ� �� ��ȯ

	�� �޼ҵ��� �Ű����� ���𿡴� '���� ���� ����'�� ���ԵǾ� �ִµ�, �̴� ���޵Ǵ� ������ ����
	�޼ҵ� ȣ�� �ø��� �޸��� �� �ִ� �����̴�.

	@Override
	public int hashCode() {
		return Objects.hash(model, color);	// �������� model, color ��� �ؽ� �� ��ȯ
	}

	�̷��� hash �޼ҵ�� �ϳ� �̻��� ���ڸ� �����Ͽ� �ϳ��� �ؽ� ���� ����� ��ȯ�Ѵ�. ����
	Ư���� ��찡 �ƴ϶�� ���� �ؽ� �˰����� ������ �ʰ� �� �޼ҵ忡 �����ص� �ȴ�.
*/