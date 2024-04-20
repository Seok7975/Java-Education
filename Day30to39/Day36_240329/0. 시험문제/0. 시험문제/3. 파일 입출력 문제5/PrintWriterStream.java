import java.io.*;

class PrintWriterStream
{
	public static void main(String[] args)
	{
		try(PrintWriter out=
				new PrintWriter(new FileWriter("printf.txt")))
		{
			out.printf("제 나이는 %d살 입니다.", 24);
			out.println("");
			
			out.println("저는 자바가 좋습니다.");
			out.print("특히 I/O 부분에서 많은 매력을 느낍니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}