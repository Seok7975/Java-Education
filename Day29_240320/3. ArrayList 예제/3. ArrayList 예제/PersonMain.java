import java.util.ArrayList;
import java.util.List;

public class PersonMain {

	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();
		list.add(new Person("홍길동", 20));
		list.add(new Person("슈퍼맨", 25));
		list.add(new Person("배트맨", 30));
		
		for(Person person : list)
			person.showInfo();
	}
}

/*
	List<String> list = new ArrayList<>();
	이 문장에서 ArrayList<E>형 참조변수가 아닌 List<E>형 참조변수를 선언한 이유는 코드에 유연성을
	제공하기 위함이다. 주로 List<E>에 선언된 메소드를 호출하기 때문에 굳이 ArrayList<E>형 참조변수를
	선언할 필요가 없으며, 이렇듯 List<E>형 참조변수로 인스턴스를 참조할 경우 다음과 같이 컬렉션
	클래스의 교체가 용이해진다.

	List<String> list = new ArrayList<>();
		-> List<String> list = new LinkedList<>();

	인스턴스의 저장 방법
	list.add("Toy");		// 인스턴스의 저장

	list.remove(0);	// 맨 앞에 위치한(첫 번째로 저장된) 인스턴스 삭제

	ArrayList<E> 인스턴스는 내부적으로 배열을 생성해서 인스턴스를 저장하는데, 필요하면 그 배열의
	길이를 스스로 늘리기 때문이다. 단 배열의 길이를 늘린다는 것은 더 긴 배열로의 교체를 의미한다.
	(한번 생성된 배열은 길이를 늘릴 수 없으므로) 따라서 성능에 신경을 써야 한다면 ArrayList<E>의
	다음 생성자 정도는 알아 둘 필요가 있다.

	public ArrayList(int initialCapacity)
		-> 인자로 전달된 수의 인스턴스를 저장할 수 있는 공간을 미리 확보

	저장해야 할 인스턴스의 수가 대략 계산이 된다면 위의 생성자를 통해서 적당한 길이의 배열을 미리
	만들어 두는 것이 성능 향상에 도움이 된다.

	public ArrayList()
		-> 10개의 인스턴스를 저장할 수 있는 공간을 미리 확보

	List<E> 인터페이스를 구현한 컬렉션 클래스들은 '저장 순서를 유지한다.'
*/