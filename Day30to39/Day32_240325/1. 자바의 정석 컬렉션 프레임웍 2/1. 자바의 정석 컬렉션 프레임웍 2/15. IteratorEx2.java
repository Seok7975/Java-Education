import java.util.*;

public class IteratorEx2 {
	public static void main(String[] args) {
		ArrayList original = new ArrayList(10);
		ArrayList copy1    = new ArrayList(10);		
		ArrayList copy2    = new ArrayList(10); 	
		//�ڵ������� �þ����, �����߿� �޸� ���ϰ� ũ�Ƿ� �̸� �������ְ� �ϴ°� ����
		
		for(int i=0; i < 10; i++)
			original.add(i+"");

		Iterator it = original.iterator();
		
		while(it.hasNext())
			copy1.add(it.next());

		System.out.println("= Original���� copy1�� ����(copy) =");		
		System.out.println("original:"+original);
		System.out.println("copy1:"+copy1);
		System.out.println();

		it = original.iterator(); // Iterator�� ������ �ȵǹǷ�, �ٽ� ���;� �Ѵ�.
		
		while(it.hasNext()){
			copy2.add(it.next());
			it.remove();
		}
		
		System.out.println("= Original���� copy2�� �̵�(move) =");		
		System.out.println("original:"+original);
		System.out.println("copy2:"+copy2);		
	} // main
} // class

/*
= Original���� copy1�� ����(copy) =
original:[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
copy1:[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

= Original���� copy2�� �̵�(move) =
original:[]
copy2:[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
*/