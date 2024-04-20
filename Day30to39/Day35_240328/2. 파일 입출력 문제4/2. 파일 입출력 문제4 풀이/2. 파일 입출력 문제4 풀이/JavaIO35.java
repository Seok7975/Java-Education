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
			System.out.println("파일이 존재하지 않습니다.");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}

}