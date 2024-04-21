import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyTest {

	public static void main(String[] args) {
		int r = 0;
		int cnt = 0;
		InputStream in = null;
		OutputStream out = null;

		try {
			in = new FileInputStream("Grit.txt");
			out = new FileOutputStream("GritCopy.txt");
			while((r=in.read()) != -1)
			{
				cnt++;
				out.write(r);
			}
			System.out.println("복사된 byte는 " + cnt);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(in!=null) in.close();
				if(out!=null) out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}