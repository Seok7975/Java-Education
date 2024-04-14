
public class ReplaceTest {

	public static void main(String[] args) {
		String str = "010-1234-5678";
		
		String tmp = str.replace("-", "");
		System.out.println(tmp);	// 01012345678
	}

}
