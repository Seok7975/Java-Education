import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���.");
		int num = sc.nextInt();		
		String numStr = String.valueOf(num);
		System.out.println(num + "�� �ڸ� ���� " + numStr.length());
	}
}