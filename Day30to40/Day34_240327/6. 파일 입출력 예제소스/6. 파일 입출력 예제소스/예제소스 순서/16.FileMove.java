import java.io.File;

class FileMove
{
	public static void main(String[] args)
	{
		File myFile=new File("C:\\MyJava\\my.bin");
		//  �̵��� ����� �Ǵ� ���������� File �ν��Ͻ��� ��� �ִ�.
		if(myFile.exists()==false)		
		{
			System.out.println("���� ������ �غ�Ǿ� ���� �ʽ��ϴ�.");
			return;
		}
		// exists �޼ҵ�� �ش� ������ ������ ������ �����ϴ´� Ȯ�� �� �� ȣ���ϴ� �޼ҵ�.
		// �ش� ������ ������ �����ϸ� true��, �׷��� ������ false�� ��ȯ�Ѵ�.
		
		File reDir=new File("C:\\YourJava");
		// �̵��� ��ġ ������ File �ν��Ͻ��� ��� �ִ�. ���⼭ �߿��� ����� ���͸� ������
		// ��Ҵٴ� ���̴�. �̷��� File �ν��Ͻ����� ���͸� ������ ��� �͵� �����ϴ�.
		reDir.mkdir();
		// �̵��� ��ġ�� �ش��ϴ� ���丮�� �����ϰ� �ִ�. �ٷ� �̷��� �������� ������ ������
		// �̸������� ������ ���͸� �������� ���� ���̴�.
		File reFile=new File(reDir, "my.bin");
		// �� ���忡���� ������ �߰� ����� ���̰� �ִ�. �̷��� ������ File �ν��Ͻ��� �������
		// ���͸� �̸��̳� �����̸��� �߰��Ͽ� ���ο� File �ν��Ͻ��� �����ϴ� �͵� �����ϴ�.
		// �� ���忡 ���ؼ� reDir�� ��������� "my.bin"�̶�� ������ �̸������� �߰��Ǿ� ���ο�
		// File �ν��Ͻ��� �����ȴ�.
		myFile.renameTo(reFile);
		// renameTo �޼ҵ� ȣ���� ���ؼ� ������ ��ġ�� �̵���Ű�� �ִ�.
		if(reFile.exists()==true)
			System.out.println("���� �̵��� �����Ͽ����ϴ�.");
		else
			System.out.println("���� �̵��� �����Ͽ����ϴ�.");
	}
}