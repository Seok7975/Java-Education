import java.util.TreeMap;
import java.util.Iterator;
import java.util.NavigableSet;

class IntroTreeMap
{
	public static void main(String[] args)
	{
		TreeMap<Integer, String> tMap=new TreeMap<Integer, String>();

		tMap.put(1, "data1");		
		tMap.put(3, "data3");	
		tMap.put(5, "data5");	
		tMap.put(2, "data2");	
		tMap.put(4, "data4");	
		
		NavigableSet<Integer> navi=tMap.navigableKeySet();

// Map은 collection을 상속받지 않음. 따라사 Collection 메소드를 사용 불가(ex) Iterator 등)
// 그래서 색다르게 NavigableSet<Integer> navi=tMap.navigableKeySet(); 사용해야함
// Map : key값 중복불가
// Set : 중복저장 불가
/*
	navigableKeySet 메소드가 호출되면, 인터페이스 NavigableSet<E>를 구현하는 인스
	턴스가(인스턴스의 참조 값이)반환된다. 이 때 E는 key의 자료형인 Integer가 되며,
	변환된 인스턴스에는 저장한 데이터들의 key 정보가 저장되어 있다.

	NavigableSet<E> 인터페이스는 Set<E> 인터페이스를 상속한다. 즉 navigableKeySet
	메소드가 반환하는 인스턴스를 대상으로 반복자를 얻기 위해서 iterator 메소드의 호출이
	가능하다. 그리고 이렇게 해서 얻은 반복자로, 저장된 모든 key에 접근이 가능하다.			
*/
		//오름차순 반복자
		System.out.println("오름차순 출력...");
		Iterator<Integer> itr=navi.iterator();
		while(itr.hasNext())
			System.out.println(tMap.get(itr.next()));
		
		//내림차순 반복자
		System.out.println("내림차순 출력...");
		itr=navi.descendingIterator();
		while(itr.hasNext())
			System.out.println(tMap.get(itr.next()));	
	}
}

/*
참고

TreeMap<K, V>의 전체 데이터 검색

TreeMap<K, V>는 Collection<E>가 아닌 Map<K, V>를 구현하는 컬렉션 클래스이니,
저장되어 있는 전체 데이터를 검색하는 방식에 차이가 있음은 당연한 일이다. 그리고 참
으로 재미있는 것은, TreeMap<K, V>에 저장된 전체 데이터의 참조 과정에서 호출한
navigableKeySet 메소드가 반환하는 인스턴스가 Set<E> 인터페이스를 구현한다는 사
실이다.  key는 중복이 불가능하기 때문에 '집합'의 성격을 띤다. 때문에 이러한 key를
저장하는 인스턴스는 Set<E> 인터페이스를 구현하고 있는 것이다.	
*/