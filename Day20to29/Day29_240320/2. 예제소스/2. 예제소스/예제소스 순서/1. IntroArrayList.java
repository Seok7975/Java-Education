import java.util.ArrayList;

class IntroArrayList
{
	public static void main(String[] args)
	{
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		/* �������� ���� */
		list.add(11);
		list.add(Integer.valueOf(22));
		list.add(Integer.valueOf(33));
		
		/* �������� ���� */
		System.out.println("1�� ����");
		for(int i=0; i<list.size(); i++)
			System.out.println(list.get(i));
		
		/* �������� ���� */
		list.remove(0);
		System.out.println("2�� ����");
		for(int i=0; i<list.size(); i++)
			System.out.println(list.get(i));	
	}
}