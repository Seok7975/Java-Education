import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class IOTest1 {

	public static void main(String[] args) throws IOException{
		OutputStream out = new FileOutputStream("hyper.txt");
		out.write(65);
		out.write(66);
		out.close();
	}

}
