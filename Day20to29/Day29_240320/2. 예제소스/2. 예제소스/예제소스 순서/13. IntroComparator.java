import java.util.TreeSet;
import java.util.Iterator;
import java.util.Comparator;

class StrLenComparator implements Comparator<String>
{
	public int compare(String str1, String str2)
	{
		if(str1.length()> str2.length())
			return 1;
		else if(str1.length()< str2.length())
			return -1;
		else
			return 0;
		
		/*
		 * return str1.length()-str2.length();
		 */
	}
}

class IntroComparator
{
	public static void main(String[] args)
	{
		TreeSet<String> tSet=new TreeSet<String>(new StrLenComparator());		
		tSet.add("Orange");
		tSet.add("Apple");
		tSet.add("Dog");
		tSet.add("Individual");
		
		Iterator<String> itr=tSet.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}
}

/*
"문자열을 사전편찬 순서가 아닌, 길이 순으로 정렬해서 TreeSet<E>에 저장하고 싶다."

그리고 이를 위해서 "ComparableMyString.java" 소스에서 MyString이라는 String의 Wrapper 클래스를
정의했는데, TreeSet<E>의 정렬 기준을 변경하기 위해서 MyString이라는 별도의 클래스를 정의한다는 것이,
사실 이치에는 맞지 않는다. 오히려 다음과 같이 요구할 수 있어야 정상 아니겠는가?

"야!TreeSet<String> 인스턴스! 사전편찬 순서 말고, 길이 순으로 문자열을 졍렬해라!"

이러한 유형의 요구를 위해 정의된 것이 Comparator<T>인터페이스이다. 이 인터페이스는 다음과 같이
정의되어 있다.

interface Comparator<T>
{
	int compare(T obj1, T obj2);
	boolean equals(Object obj);
}

위의 인터페이스 중에서 equals 메소드는 신경 쓰지 않아도 된다. 이 인터페이스를 구현하는 모든 클래스는
Object 클래스를 상속하기 때문에, Object 클래스의 equals 메소드가 위의 equals 메소드를 구현하는 꼴이
되기 때문이다. 따라서 compare 메소드만 신경을 쓰면 된다. compare 메소드의 구현방법은 앞서 소개한 
compareTo 메소드의 구현방법과 유사하다. obj1이 크면 양수를, obj2가 크면 음수를, obj1과 obj2가 같으면
0을 반환하면 된다. 물론 크고 작음에 대한 기준은 여러분이 결정할 몫이다.
*/