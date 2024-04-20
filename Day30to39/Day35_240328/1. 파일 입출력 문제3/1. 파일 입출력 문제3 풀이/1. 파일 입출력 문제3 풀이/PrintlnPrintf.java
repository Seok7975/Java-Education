import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

class MyInfo
{
	String info;
	public MyInfo(String info) { this.info = info; }
	public String toString() { return info; }
}

class PrintlnPrintf
{
	public static void main(String[] args)
	{
		try(OutputStream o = new FileOutputStream("println.txt");
				PrintStream out = new PrintStream(o)) {
			MyInfo mInfo = new MyInfo("저는 자바 프로그래머입니다.");
			out.println("제 소개를 하겠습니다.");
			out.println(mInfo);
			out.printf("나이 %d, 몸무게 %dkg입니다.", 24, 72);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}