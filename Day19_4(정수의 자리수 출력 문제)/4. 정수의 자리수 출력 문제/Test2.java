import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int num = sc.nextInt();		
		String numStr = String.valueOf(num);
		System.out.println(num + "의 자릿 수는 " + numStr.length());
	}
}