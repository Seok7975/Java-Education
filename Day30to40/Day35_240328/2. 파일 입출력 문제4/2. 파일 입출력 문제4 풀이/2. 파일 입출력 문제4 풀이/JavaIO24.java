import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class JavaIO24 {
	public static void main(String[] args) throws IOException
	{
		OutputStream out = new FileOutputStream("hyper.txt");
		out.write('A');
		out.write('B');
		out.close();
	}
}