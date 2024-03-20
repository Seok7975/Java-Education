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