import java.util.LinkedList;

class IntroLinkedList
{
	public static void main(String[] args)
	{
		List<Integer> list = new LinkedList<Integer>();
		//LinkedList<Integer> list=new LinkedList<Integer>();
		// ArrayList<Integer> list = new ArrayList<Integer>();
		//����Ŭ������ �ִ� �޼ҵ常 ����Ѵ� �ǹ�
		
		/* �������� ���� */
		list.add(Integer.valueOf(11));
		list.add(Integer.valueOf(22));
		list.add(Integer.valueOf(33));
		
		/* �������� ���� */
		System.out.println("1�� ����");
		for(int i=0; i<list.size(); i++)
			System.out.println(list.get(i));

		for(Integer num : list)
			System.out.println(num);
		
		/* �������� ���� */
		list.remove(0);
		System.out.println("2�� ����");
		for(int i=0; i<list.size(); i++)
			System.out.println(list.get(i));	
	}
}