import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���.");
		int num = sc.nextInt();		
		System.out.println(num + "�� �ڸ����� " + calNumOfDigits(num));
	}
	public static int calNumOfDigits(int num) {
		int i = 0;
		for(i=0;num != 0;i++)
			num /= 10;
		return i;
	}
}