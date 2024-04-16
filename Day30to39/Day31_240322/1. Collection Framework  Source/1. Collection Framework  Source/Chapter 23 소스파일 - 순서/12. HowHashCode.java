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

        System.out.println("인스턴스 수: " + set.size());

        for(Car car : set)
            System.out.println(car.toString() + '\t');
    }
}

// 실행결과
/*
인스턴스 수: 4
HY_MD_301 : RED	
HY_MD_302 : RED	
HY_MD_301 : BLACK	
HY_MD_302 : WHITE	
*/

/*
	클래스를 정의할 때마다 이렇듯 hashCode 메소드를 정의하는 것은 번거로운 일이다. 특히 해쉬
	알고리즘의 성능적 측면까지 고려하면서 모든 클래스를 정의하기란 쉬운 일이 아니다. 그래서 자바에	서는 다음 메소드를 제공하고 있다.

	public static int hash(Object ... values)
		-> java.util.Objects에 정의된 메소드, 전달된 인자 기반의 해쉬 값 반환

	위 메소드의 매개변수 선언에는 '가변 인자 선언'이 포함되어 있는데, 이는 전달되는 인자의 수를
	메소드 호출 시마다 달리할 수 있는 선언이다.

	@Override
	public int hashCode() {
		return Objects.hash(model, color);	// 전달인자 model, color 기반 해쉬 값 반환
	}

	이렇듯 hash 메소드는 하나 이상의 인자를 조합하여 하나의 해쉬 값을 만들어 반환한다. 따라서
	특별한 경우가 아니라면 직접 해쉬 알고리즘을 만들지 않고 이 메소드에 의존해도 된다.
*/