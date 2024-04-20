import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyTestTryWithResources {

	public static void main(String[] args) {
		int r = 0;
		int cnt = 0;
		
		try(FileInputStream in = new FileInputStream("Grit.txt");
			FileOutputStream out = new FileOutputStream("GritCopy.txt")	) {

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
		}
	}
}