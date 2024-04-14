import java.util.Arrays;

public class SortTest {

	public static void main(String[] args) {
		char[] dest = new char[10];
		char[] src = {'1', '2', '3', '4'};
	
		
//		for(int i=0;i<dest.length;i++)	// 배열 전체를 '0'으로 초기화
//			dest[i] = '0';
		Arrays.fill(dest, '0');
		
		System.out.println("왼쪽 정렬");
		System.arraycopy(src, 0, dest, 0, src.length);
		System.out.println(dest);
		
		Arrays.fill(dest, '0');	
		
		System.out.println("오른쪽 정렬");
		System.arraycopy(src, 0, dest, dest.length - src.length, src.length);
		System.out.println(dest);
		
		Arrays.fill(dest, '0');	
		
		System.out.println("가운데 정렬");
		System.arraycopy(src, 0, dest, (dest.length - src.length)/2, src.length);
		System.out.println(dest);
	}

}
