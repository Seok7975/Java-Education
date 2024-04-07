import java.util.Arrays;

public class NumberArray2 {

	public static void main(String[] args) {
		int[] num = new int[10];
		for(int i=0;i<num.length;i++)
			num[i] = i;

		for (int i = num.length - 1; i > 0; i--) {
			int j = (int)Math.floor(Math.random() * (i + 1)); 
			int tmp = num[i];
			num[i] = num[j];
			num[j] = tmp;	    
		}
		System.out.println(Arrays.toString(num));
		

		int len = 3;
		String numStr = "";
		int rnum = 0;
		for(int i=0;i<len;i++)
		{
			numStr += num[i];
		}
		rnum = Integer.parseInt(numStr);
		System.out.println(rnum);

	}
}