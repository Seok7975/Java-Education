import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		int[] num = {1, 3, 4, 5, 7, 10, 27, 39, 50, 92};

		//////////////////////////////////////////////////
		
//		int[] num = new int[10000];
//		
//		for(int i=0;i<num.length;i++) {
//			num[i] = i+1;
//		}
		
		//////////////////////////////////////////////////
		System.out.println(Arrays.toString(num));
		int first = 0;
		int last = num.length-1;
		int mid = (first+last)/2;
		
		Scanner sc = new Scanner(System.in);
		int inputNum = 0;
		int cnt = 0;
		
		System.out.println("찾고자 하는 숫자를 입력 : ");
		inputNum = sc.nextInt();
		
		while(first<=last)
		{

			cnt++;
			if(inputNum>num[mid]) first = mid + 1;
			else if(inputNum < num[mid]) last = mid - 1;
			else{
				System.out.println("정답 : " + (mid + 1) + "번째 있음");
				System.out.println("찾은 횟수 : " + cnt);
				break;				
			}
			mid = (first+last)/2;
		}
		if(first>last) 
		{
			System.out.println("검색결과가 없습니다.");
			System.out.println("찾은 횟수 : " + cnt);
		}
		sc.close();
	}
}