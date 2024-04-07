import java.util.Iterator;
import java.util.HashSet;

class SimpleNumber
{
	int num;
	public SimpleNumber(int n)
	{
		num=n;
	}
	public String toString()
	{
		return String.valueOf(num);
	}

}

class HashSetEqualityOne
{
	public static void main(String[] args)
	{
		HashSet<SimpleNumber> hSet=new HashSet<SimpleNumber>();
		hSet.add(new SimpleNumber(10));
		hSet.add(new SimpleNumber(20));
		hSet.add(new SimpleNumber(20));
		
		System.out.println("저장된 데이터 수: "+hSet.size());
		//일반인이 만든 클래스기때문에 같은 인스턴스가 아님 size : 3
		
		Iterator<SimpleNumber> itr=hSet.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}
}