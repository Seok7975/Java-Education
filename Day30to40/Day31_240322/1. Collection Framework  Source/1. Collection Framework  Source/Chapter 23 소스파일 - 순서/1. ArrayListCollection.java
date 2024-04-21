import java.util.List;
import java.util.ArrayList;

class ArrayListCollection {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        
        // 인스턴스 저장 
        list.add("Toy");
        list.add("Box");
        list.add("Robot");
	
        // 인스턴스 참조
        for(int i = 0; i < list.size(); i++)
            System.out.print(list.get(i) + '\t');
        System.out.println();
		
        // 첫 번째 인스턴스 삭제
        list.remove(0);
   
        // 삭제 후 인스턴스 참조
        for(int i = 0; i < list.size(); i++)
            System.out.print(list.get(i) + '\t');
        System.out.println();
    }
}

// 실행결과
/*
Toy	Box	Robot	
Box	Robot	

*/ 
/*
	List<String> list = new ArrayList<>();
	이 문장에서 ArrayList<E>형 참조변수가 아닌 List<E>형 참조변수를 선언한 이유는 코드에 유연성
	을 제공하기 위함이다. 주로 List<E>에 선언된 메소드를 호출하기 때문에 굳이 ArrayList<E>형 참
	조변수를 선언할 필요가 없으며, 이렇듯 List<E>형 참조변수로 인스턴스를 참조할 경우 다음과 같이
	컬렉션 클래스의 교체가 용이해진다.
	List<String> list = new ArrayList<>();
		->List<String> list = new LinkedList<>();

	public ArrayList(int initialCapacity)
		-> 인자로 전달된 수의 인스턴스를 저장할 수 있는 공간을 미리 확보

	public ArrayList()
		-> 10개의 인스턴스를 저장할 수 있는 공간을 미리 확보

	List<E> 인터페이스를 구현한 컬렉션 클래스들은 '저장 순서를 유지한다.'
*/