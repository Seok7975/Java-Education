import java.util.Iterator;
import java.util.HashSet;

class SetInterfaceFeature
{
	public static void main(String[] args)
	{
		HashSet<String> hSet=new HashSet<String>();

		hSet.add("First");
		hSet.add("Second");
		hSet.add("Third");
		hSet.add("First");
		
		System.out.println("����� ������ ��: "+hSet.size());
		
		Iterator<String> itr=hSet.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}
}