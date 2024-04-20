import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class Test {

	public static void main(String[] args) {
		try(PrintWriter out = new PrintWriter(new FileOutputStream("test.txt")))
		{
			out.println("HI");
//			out.println("안녕");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		try(FileInputStream in = new FileInputStream("test.txt")){
			int r = 0, i=0;
			byte[] buf = new byte[10];
			while((r = in.read())!=-1) {
				buf[i++] = (byte)r;
			}
			System.out.println(new String(buf));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}