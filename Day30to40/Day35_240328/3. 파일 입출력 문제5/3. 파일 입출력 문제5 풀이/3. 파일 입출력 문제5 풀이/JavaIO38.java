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
			writer.printf("�� ���̴� %d���Դϴ�.", 24);
			writer.println();
			writer.println("���� �ڹٰ� �����ϴ�.");
			writer.println("Ư�� I/O �κп��� ���� �ŷ��� �����ϴ�.");
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