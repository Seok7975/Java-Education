import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

class PrintWriterStream
{
	public static void main(String[] args) throws IOException
	{
		PrintWriter out=
			new PrintWriter(new FileWriter("printf.txt"));
		
		out.printf("�� ���̴� %d�� �Դϴ�.", 24);
		out.println("");
		
		out.println("���� �ڹٰ� �����ϴ�.");
		out.print("Ư�� I/O �κп��� ���� �ŷ��� �����ϴ�.");
		out.close();
	}
}