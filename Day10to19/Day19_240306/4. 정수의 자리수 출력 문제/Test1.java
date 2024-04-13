import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int num = sc.nextInt();		
		System.out.println(num + "의 자리수는 " + calNumOfDigits(num));
	}
	public static int calNumOfDigits(int num) {
		int i = 0;
		for(i=0;num != 0;i++)
			num /= 10;
		return i;
	}
}