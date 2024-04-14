
public class IndexOfTest {

	public static void main(String[] args) {
		String str = "ABCDEABCDEABCDE";
		
		int pos = str.indexOf("AB");	// 0
		// "ABCDEABCDEABCDE"�� ���� "AB"���ڿ��� �˻��Ͽ� ó������ ������ "AB"���ڿ��� ������ġ�� ��ȯ
		// ��ã���� -1 ��ȯ
		System.out.println(pos);
		
		pos = str.indexOf("AB", 0);		// 0
		// "ABCDEABCDEABCDE"�� ���� "AB"���ڿ��� 0��°���� �˻��Ͽ� ó������ ������ "AB"���ڿ��� ������ġ�� ��ȯ
		System.out.println(pos);
		
		pos = str.indexOf("AB", 2);		// 5
		System.out.println(pos);
		
		pos = str.indexOf("AB", 7);		// 10
		System.out.println(pos);
		
		System.out.println("===============================");
		
		//�������� Ž��!!
		pos = str.lastIndexOf("AB");	// 10
		// ��ã���� -1 ��ȯ
		System.out.println(pos);
		
		pos = str.lastIndexOf("AB", 15);	// 10
		System.out.println(pos);
		
		pos = str.lastIndexOf("AB", 9);	// 5
		System.out.println(pos);
		
		pos = str.lastIndexOf("AB", 4);	// 0
		System.out.println(pos);
	}
}
