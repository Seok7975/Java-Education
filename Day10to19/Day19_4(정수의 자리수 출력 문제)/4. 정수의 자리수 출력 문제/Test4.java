import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int num = sc.nextInt();		
		int len = calNumOfDigits(num);
		int[] arr = new int[len];
		makeArr(arr, num);
	}
	public static int calNumOfDigits(int num) {
		int i = 0;
		for(i=0;num != 0;i++)
			num /= 10;
		return i;
	}
	public static void makeArr(int[] arr, int num) {
		int divisor = 1;
		for(int i=0;i<arr.length-1;i++)
			divisor *= 10;
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = num / divisor;
			num %= divisor;
			divisor /= 10;
		}		
	}	
}