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
	public int hashCode()
	{
		return num%3;
	}
	public boolean equals(Object obj)
	{
		SimpleNumber comp=(SimpleNumber)obj;
		if(comp.num==num)
			return true;
		else
			return false;		
	}
}

//hashset을 쓰기위해선 object클래스의 hashcode와 equals를 매소드 오버라이딩을 해야함

class HashSetEqualityTwo
{
	public static void main(String[] args)
	{
		HashSet<SimpleNumber> hSet=new HashSet<SimpleNumber>();
		hSet.add(new SimpleNumber(10));
		hSet.add(new SimpleNumber(20));
		hSet.add(new SimpleNumber(20)); // 등록이 안됨
		
		System.out.println("저장된 데이터 수: "+hSet.size());
		
		Iterator<SimpleNumber> itr=hSet.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}
}

