
public class Test3 {

	public static void main(String[] args) {
		int num = 123;
		int[] arr = new int[3];
		makeArr(arr, num);
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