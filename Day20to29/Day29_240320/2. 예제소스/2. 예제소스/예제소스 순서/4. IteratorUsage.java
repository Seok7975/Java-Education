import java.util.Iterator;
import java.util.LinkedList;

class IteratorUsage
{
	public static void main(String[] args)
	{
		LinkedList<String> list=new LinkedList<String>();
		list.add("First");
		list.add("Second");
		list.add("Third");
		list.add("Fourth");
		
		Iterator<String> itr=list.iterator();	//커서가 맨 마지막으로 가면 반복자 사용 불가, 쓰려면 다시 불러와야함
		
		System.out.println("반복자를 이용한 1차 출력과 \"Third\" 삭제");
		while(itr.hasNext())
		{
			String curStr=itr.next();	//itr의 객체 주솟값이 curStr에 저장
			System.out.println(curStr);
			if(curStr.compareTo("Third")==0)
				itr.remove();
		}
		
		System.out.println("\n\"Third\" 삭제 후 반복자를 이용한 2차 출력 ");		
		itr=list.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}
}