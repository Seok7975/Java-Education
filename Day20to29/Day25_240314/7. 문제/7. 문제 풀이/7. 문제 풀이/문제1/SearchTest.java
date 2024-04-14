import java.util.Scanner;
import java.util.Vector;

public class SearchTest {

	public static void main(String[] args) {
		String[] phoneNumArr = {
				"012-3456-7890",
				"099-2456-7980",
				"088-2346-9870",
				"013-3456-7890"
		};
//		Vector<String> vec = new Vector<String>(); // 검색결과를 담을 Vector 
		Vector vec = new Vector(); 
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.print(">>");
			String input = s.nextLine().trim(); // trim()으로 입력내용에서 공백을 제거
			if(input.equals("")) {
				continue;
			} else if(input.equalsIgnoreCase("Q")) {
				System.exit(0);
			}

			for(int i=0;i<phoneNumArr.length;i++) {
				String phoneNum = phoneNumArr[i];
				String tmp = phoneNum.replace("-",""); // phoneNum에서 '-'를 제거
				if(tmp.contains(input)) { // 찾는 문자열이 있으면
					vec.add(phoneNum);
				}				
			}

			if(vec.size()>0) { // 검색결과가 있으면
				System.out.println(vec); // 검색결과를 출력하고
				vec.clear(); // 검색결과를 삭제
			} else {
				System.out.println("일치하는 번호가 없습니다.");
			}
		}
	}
}