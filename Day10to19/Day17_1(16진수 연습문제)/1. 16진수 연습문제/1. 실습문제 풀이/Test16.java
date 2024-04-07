import java.util.Scanner;

public class Test16 {

	public static void main(String[] args) {
		String str;
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("16진수 입력");
		str = sc.next();
		String[] binary = {   "0000", "0001", "0010", "0011"
				   , "0100", "0101", "0110", "0111"
				   , "1000", "1001", "1010", "1011"
				   , "1100", "1101", "1110", "1111" };

		String result="", tmp = "";
		int len = str.length();
		for (int i=0; i < len ; i++ ) {	
			char ch = str.charAt(i);
			if(ch >='0' && ch <='9') {
				result +=binary[ch-'0'];	   
			} else if(ch >= 'A' && ch <='F'){	
				result +=binary[ch-'A'+10]; 
			} else if(ch >= 'a' && ch <='f'){	
				result +=binary[ch-'a'+10];
			} else {
				flag = false;
				break;
			}
		}
		if(flag) System.out.println(result);
		else System.out.println("입력하신 것은 16진수가 아닙니다.");
	}
}