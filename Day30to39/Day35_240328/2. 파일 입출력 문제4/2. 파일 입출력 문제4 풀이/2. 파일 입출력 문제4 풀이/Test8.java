import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Test8 {
	public static void main(String[] args) {
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter("String.txt"));
			out.write("������ - �޽� ���߰� �ϴµ� �����ϰڴ�.");
			out.newLine();
			out.write("�� ������ ������ �־� �ְ��� �����̴�.");
			out.newLine();
			out.write("���� �¸��ϴ� ���� ���� ���� �ּ������ϰڴ�.");
			out.newLine();
			out.write("ȯ������ ������� �� ���̴�.");
			out.newLine();
			out.newLine();
			out.write("��� ���� �� �����ڷ�");
			out.newLine();
			out.write("press@goodnews.co.kr");
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}