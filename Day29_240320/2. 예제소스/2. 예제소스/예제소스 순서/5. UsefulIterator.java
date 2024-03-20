import java.util.Iterator;
import java.util.HashSet;

class UsefulIterator
{
	public static void main(String[] args)
	{
		HashSet<String> set=new HashSet<String>();	
		//Set은 중복저장을 허용 X, 집합저장 (저장순서 유지X(순차적 저장이 아님))
		//Hash가 들어가면 빠른검색을 지원
		set.add("First");	
		set.add("Second");
		set.add("Third");
		set.add("Fourth");
		
		Iterator<String> itr=set.iterator();
		
		System.out.println("반복자를 이용한 1차 출력과 \"Third\" 삭제");
		while(itr.hasNext())
		{
			String curStr=itr.next();
			System.out.println(curStr);
			if(curStr.compareTo("Third")==0)
				itr.remove();
		}
		
		System.out.println("\n\"Third\" 삭제 후 반복자를 이용한 2차 출력 ");		
		itr=set.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}
}