import java.io.File;

class ListFileDirectoryInfo
{
	public static void main(String[] args)
	{
		File myDir=new File("MyDir");
		File[] list=myDir.listFiles();
		// listFiles �޼ҵ�� ���͸��� �����ϴ� ���ϰ� ���͸� ������ ��ȯ�Ѵ�. 
		// �� File�� �迭 ���·� ��ȯ�Ѵ�. ���� String�� ���·� ���� �Ǵ� ���͸���
		// �̸��� ��ȯ�ϴ� �޼ҵ嵵 �����Ѵ�. �׷��� File�� �迭 ���·� ������
		// ���� ���� �پ��� �۾��� ������ ó���� �� �ִ�.
		
		for(int i=0; i<list.length; i++)
		{
			System.out.print(list[i].getName());
			// getName �޼ҵ�� ���ڿ��� ���·� ���� �Ǵ� ���͸��� �̸��� ��ȯ�Ѵ�.
			if(list[i].isDirectory())
				System.out.println("\t\tDIR");
			else
				System.out.println("\t\tFILE");

			// isDirectory �޼ҵ�� �ν��Ͻ��� ������ ���͸��� �������� Ȯ���ϱ� ����
			// �޼ҵ��̴�.
		}
	}
}