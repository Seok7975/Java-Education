//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
//
//public class CopyTest2 {
//
//	public static void main(String[] args) {
//		
//		byte[] r = new byte[1024];
//		int len = 0, total = 0;
//		try {
//			FileInputStream in = new FileInputStream("Grit.txt");
//			FileOutputStream out = new FileOutputStream("GritCopy.txt");
//			while( (len = in.read(r)) != -1)
//			{
//				total += len;
//				out.write(r, 0, len);
//			}
//			in.close();
//			out.close();
//			System.out.println(total + "����Ʈ �迭 ���� ���� ���簡 �Ϸ�Ǿ����ϴ�.");
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//}
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyTest2 {

	public static void main(String[] args) {
		
		byte[] r = new byte[1024];
		int len = 0, total = 0;
		try(FileInputStream in = new FileInputStream("Grit.txt");
			FileOutputStream out = new FileOutputStream("GritCopy.txt")) {
			while( (len = in.read(r)) != -1)
			{
				total += len;
				out.write(r, 0, len);
			}
			System.out.println(total + "����Ʈ �迭 ���� ���� ���簡 �Ϸ�Ǿ����ϴ�.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}