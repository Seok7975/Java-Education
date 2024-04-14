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
//		Vector<String> vec = new Vector<String>(); // �˻������ ���� Vector 
		Vector vec = new Vector(); 
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.print(">>");
			String input = s.nextLine().trim(); // trim()���� �Է³��뿡�� ������ ����
			if(input.equals("")) {
				continue;
			} else if(input.equalsIgnoreCase("Q")) {
				System.exit(0);
			}

			for(int i=0;i<phoneNumArr.length;i++) {
				String phoneNum = phoneNumArr[i];
				String tmp = phoneNum.replace("-",""); // phoneNum���� '-'�� ����
				if(tmp.contains(input)) { // ã�� ���ڿ��� ������
					vec.add(phoneNum);
				}				
			}

			if(vec.size()>0) { // �˻������ ������
				System.out.println(vec); // �˻������ ����ϰ�
				vec.clear(); // �˻������ ����
			} else {
				System.out.println("��ġ�ϴ� ��ȣ�� �����ϴ�.");
			}
		}
	}
}