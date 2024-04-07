import java.util.LinkedList;

class IntroLinkedList
{
	public static void main(String[] args)
	{
		List<Integer> list = new LinkedList<Integer>();
		//LinkedList<Integer> list=new LinkedList<Integer>();
		// ArrayList<Integer> list = new ArrayList<Integer>();
		//상위클래스에 있는 메소드만 사용한단 의미
		
		/* 데이터의 저장 */
		list.add(Integer.valueOf(11));
		list.add(Integer.valueOf(22));
		list.add(Integer.valueOf(33));
		
		/* 데이터의 참조 */
		System.out.println("1차 참조");
		for(int i=0; i<list.size(); i++)
			System.out.println(list.get(i));

		for(Integer num : list)
			System.out.println(num);
		
		/* 데이터의 삭제 */
		list.remove(0);
		System.out.println("2차 참조");
		for(int i=0; i<list.size(); i++)
			System.out.println(list.get(i));	
	}
}