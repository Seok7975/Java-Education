import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class JavaIO18 {

	public static void main(String[] args) {
		String inFileName = "Grit.txt";
		String outFileName = "cpy.txt";

		int readByte = 0;
		int byteCnt = 0;
		try(BufferedInputStream bIn = new BufferedInputStream(new FileInputStream(inFileName));
				BufferedOutputStream bOut = new BufferedOutputStream(new FileOutputStream(outFileName));)
		{

			while( (readByte=bIn.read()) != -1)
			{
				bOut.write(readByte);
				byteCnt++;
			}
			bIn.close();
			bOut.close();
			System.out.println(byteCnt+ "byte의 파일 복사가 완료되었습니다.");
		}
		catch(FileNotFoundException e)
		{
			System.out.println("파일이 존재하지 않습니다.");
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}