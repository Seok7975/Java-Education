import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class JavaIO38 {

	public static void main(String[] args) {
		String fileName = "printf.txt";
		try(PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(fileName))))
		{
			writer.printf("제 나이는 %d살입니다.", 24);
			writer.println();
			writer.println("저는 자바가 좋습니다.");
			writer.println("특히 I/O 부분에서 많은 매력을 느낍니다.");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}				
		try(BufferedReader bReader = new BufferedReader(new FileReader(fileName)))
		{
			String str = null;
			while( (str = bReader.readLine()) != null )
			{
				System.out.println(str);
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}