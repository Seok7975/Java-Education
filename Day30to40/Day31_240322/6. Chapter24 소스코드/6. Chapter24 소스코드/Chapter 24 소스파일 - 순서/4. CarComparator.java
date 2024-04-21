import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Comparator;
import java.util.Collections;

class Car {
    protected int disp;

    public Car(int d) { disp = d; }

    @Override
    public String toString() { 
        return "cc: " + disp; 
    }
}

// Car의 정렬을 위한 클래스 
class CarComp implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o1.disp - o2.disp;
    }
}

class ECar extends Car {
    private int battery;
    
    public ECar(int d, int b) {
        super(d);
        battery = b;
    }

    @Override
    public String toString() { 
        return "cc: " + disp + ", ba: " + battery; 
    }
}

class CarComparator {
    public static void main(String[] args) {
        List<Car> clist = new ArrayList<>();
        clist.add(new Car(1800));
        clist.add(new Car(1200));
        clist.add(new Car(3000));

        List<ECar> elist = new ArrayList<>();
        elist.add(new ECar(3000, 55));
        elist.add(new ECar(1800, 87));
        elist.add(new ECar(1200, 99));
  
        CarComp comp = new CarComp();

        // 각각 정렬
        Collections.sort(clist, comp);
        Collections.sort(elist, comp);
        

        // 각각 출력
        for(Iterator<Car> itr = clist.iterator(); itr.hasNext(); )
            System.out.println(itr.next().toString() + '\t');
        System.out.println();

        for(Iterator<ECar> itr = elist.iterator(); itr.hasNext(); )
            System.out.println(itr.next().toString() + '\t');

    }
}

/*
실행 결과

cc: 1200	
cc: 1800	
cc: 3000	

cc: 1200, ba: 99	
cc: 1800, ba: 87	
cc: 3000, ba: 55
*/

/*
	Collections 클래스에는 다음 sort 메소드도 정의되어 있다. 이는 호출 시
	정렬의 기준을 결정할 수 있는 형태로 정의된 메소드이다.
	
	public static <T> void sort(List<T> list, Comparator<? super T> c)
	
	그리고 이번에는 매개변수 선언에 <? super T>가 있으므로 다음과 같이 판단할 수
	있다.
	
	"매개변수 c를 대상으로는 T형 인스턴스를 넣는(전달하는) 메소드 호출만 OK"
	
	예제에서는 Car의 정렬을 위해 정의한 다음 클래스의 인스턴스를 대상으로 ECar도
	정렬할 수 있음을 보였다.
	
	class CarComp implements Comparator<Car> {
	    @Override
	    public int compare(Car o1, Car o2) {
	        return o1.disp - o2.disp;
	    }
	}
	
	즉 다음 문장이 실행될 수 있음을 보였다.
	
	Collections.sort(elist, comp);
	
	이는 sort 메소드의 두 번째 매개변수 타입이 Comparator<T>가 아닌 Comparator<? super T>
	이기에 가능한 일이다.
*/