import java.util.Arrays;

public class SortTest {

	public static void main(String[] args) {
		char[] dest = new char[10];
		char[] src = {'1', '2', '3', '4'};
	
		
//		for(int i=0;i<dest.length;i++)	// �迭 ��ü�� '0'���� �ʱ�ȭ
//			dest[i] = '0';
		Arrays.fill(dest, '0');
		
		System.out.println("���� ����");
		System.arraycopy(src, 0, dest, 0, src.length);
		System.out.println(dest);
		
		Arrays.fill(dest, '0');	
		
		System.out.println("������ ����");
		System.arraycopy(src, 0, dest, dest.length - src.length, src.length);
		System.out.println(dest);
		
		Arrays.fill(dest, '0');	
		
		System.out.println("��� ����");
		System.arraycopy(src, 0, dest, (dest.length - src.length)/2, src.length);
		System.out.println(dest);
	}

}
