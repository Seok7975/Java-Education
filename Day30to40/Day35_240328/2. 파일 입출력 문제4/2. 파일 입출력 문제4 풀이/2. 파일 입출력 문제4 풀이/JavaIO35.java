import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JavaIO35 {
	public static void main(String[] args) {
		String fileName = "String.txt";
		String str = null;
		try
		{
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			while( (str = br.readLine()) != null)
			{
				System.out.println(str);
			}
			br.close();
			
		}
		catch(FileNotFoundException e)
		{
			System.out.println("������ �������� �ʽ��ϴ�.");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}

}