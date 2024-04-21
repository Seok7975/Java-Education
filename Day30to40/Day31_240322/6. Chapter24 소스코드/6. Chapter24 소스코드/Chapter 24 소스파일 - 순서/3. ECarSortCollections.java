import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

class Car implements Comparable<Car> {
    protected int disp;    // 배기량

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
    private int battery;    // 배터리 
    
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

        // 정렬
        Collections.sort(list);        

        // 출력
        for(Iterator<ECar> itr = list.iterator(); itr.hasNext(); )
            System.out.println(itr.next().toString() + '\t');
    }
}

/*
실행 결과
cc: 1200, ba: 99	
cc: 1800, ba: 87	
cc: 3000, ba: 55	
*/

/*
	public static <T extends Comparable<? super T>> void sort(List<T> list)
	
	여전히 sort 메소드가 다음과 같이 정의되어 있다고 가정하고 이야기를 이어 나가면
	
	public static <T extends Comparable<T>> void sort(List<T> list)
	
	그러면 예제에서 List<Car> 인스턴스를 인자로 전달하여 sort 메소드를 호출할 때, T는 Car로
	결정되어 다음 형태의 메소드 호출이 진행된다.
	
	public static void sort(List<Car> list)
	
	단 Car는 다음 조건을 만족해야 하는데, 예제에서 정의한 Car는 이 조건을 만족한다. 따라서
	위 예제는 정상적으로 컴파일 및 실행을 완료할 수 있다.
	
	Car는 Comparable<Car>를 구현해야 한다.
	
	그런데 다음과 같이 Car를 상속하는 ECar를 정의했다고 가정해보자. (ECar는 전기 자동차를 
	표현한 클래스이다.)
	
	class Car implements Comparable<Car> {...}
	class ECar extends Car {...}	// ECar는 Comparable<Car>를 간접 구현
	
	그러면 ECar는 Comparable<Car>을 구현하는(간접 구현하는) 상태가 되는데, 이를 대상으로
	다음과 같은 코드를 작성하면 컴파일이 되겠는가?
	
	public static void main(String[] args) {
		List<ECar> list = new ArrayList<>();
		...
		Collections.sort(list);		// 이 메소드 호출이 성공할 수 있을까?
		...
	}
	
	위와 같이 sort 메소드를 호출하면 'T는 ECar로 결정되어' 다음 형태의 sort 메소드 호출이
	진행된다.
	
	public static void sort(List<ECar> list)
	
	그리고 sort 메소드가 다음과 같다고 가정하였으니, ECar는 Comparable<ECar>를 구현하고
	있어야 위의 sort 메소드 호출에 문제가 없다.
	
	public static <T extends Comparable<T>> void sort(List<T> list)
		-> T가 ECar인 경우 ECar는 Comparable<ECar>를 구현해야 함
		
	그러나 클래스의 구현 및 상속의 구조가 다음과 같으므로 ECar는 Comparable<Car>는 구현하는
	상태이지만 Comparable<ECar>는 구현하지 않는 상태이다.
	
	class Car implements Comparable<Car> {...}
	class ECar extends Car {...}	// Comparable<Car>를 간접 구현한다.
	
	따라서 위에서 보인 sort 메소드의 호출은 성공하지 못한다. 그러나 Collections 클래스의
	sort 메소드는 이러한 상황을 고려하여 다음과 같이 정의되어 있다.
	
	public static <T extends Comparable<? super T>> void sort(List<T> list)
		-> T가 ECar인 경우 ECar는 Comparable<? super ECar>를 구현해야 함
		
	따라서 List<ECar> 인스턴스를 전달하면서 sort 메소드를 호출하는 순간 T는 ECar가 되어
	위의 메소드는 다음 형태로 호출이 되고,
	
	public static void sort(List<ECar> list)
	
	메소드의 선언에서 T가 구현해야 할 인터페이스를 Comparable<? super T>로 명시했으므로
	ECar 클래스는 다음 인터페이스 중 하나만 구현해도 위의 sort 메소드 호출은 성공한다.
	
	Comparable<Object>, Comparable<Car>, Comparable<ECar>
*/