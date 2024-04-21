import java.io.*;
import java.util.*;

class PropertiesEx2 {
	public static void main(String[] args) {
		// commandline���� inputfile�� ���������� ������ ���α׷��� �����Ѵ�.
		if(args.length != 1) {
			System.out.println("USAGE: java PropertiesEx2 INPUTFILENAME");
			System.exit(0);
		}

		Properties prop = new Properties();

		String inputFile = args[0];

		try {
			prop.load(new FileInputStream(inputFile));
		} catch(IOException e) {
			System.out.println("������ ������ ã�� �� �����ϴ�.");
			System.exit(0);
		}

		String   name = prop.getProperty("name");

//		try {
//			name = new String(name.getBytes("8859_1"), "EUC-KR");
//		} catch(Exception e) {}
		
		String[] data = prop.getProperty("data").split(",");
		int max = 0;
		int min = 0;
		int sum = 0;

		for(int i=0; i < data.length; i++) {
			int intValue = Integer.parseInt(data[i]);
			if (i==0) max = min = intValue;

			if (max < intValue) {
				max = intValue;
			} else if (min > intValue) {
				min = intValue;
			}

			sum += intValue;
		}

		System.out.println("�̸� :"  + name);		
		System.out.println("�ִ밪 :" + max);
		System.out.println("�ּҰ� :" + min);
		System.out.println("�հ� :"  + sum);
		System.out.println("��� :"  + (sum*100.0/data.length)/100);
	}
}
/*
���� ��
java PropertiesEx2 input.txt
�̸� :Seong Namkung
�ִ밪 :35
�ּҰ� :1
�հ� :111
��� :11.1
*/
/*
�ܺ�����(input.txt)�κ��� �����͸� �Է¹޾Ƽ� ������� �����ִ� �����̴�. �ܺ���
���� ������ ���δ����� Ű�� ���� '='�� ����� �����̾�� �ϸ� �ּ������� ù ��°
���ڰ� '#'�̾�� �Ѵ�.
 ������ ��Ģ��θ� ������ �ۼ��ϸ� load()�� ȣ���ϴ� �͸����� ���� �����͸� �о� ��
�� �ִ�. �ٸ� ���ڵ�(encoding)������ �ѱ��� ���� �� �ֱ� ������ �ѱ��� �Է¹�������
�Ʒ��� ���� �ڵ带 �����ؾ��Ѵ�.

String name = prop.getProperty("name");

try{
	name = new String(name.getBytes("8859_1"), "EUC-KR");
} catch(Exception e) {}

���Ϸκ��� �о�� �������� ���ڵ��� ���ù�������(8859_1)���� �ѱۿϼ���(EUC-KR
�Ǵ� KSC5601)���� ��ȯ���ִ� ������ �߰��� ���̴�. �츮�� ����ϰ�  �ִ� OS�� 
�⺻ ���ڵ�(encoding)�� �����ڵ尡 �ƴ϶� �̷� ��ȯ�� �ʿ��� ���̶�� �͸� 
�����ϰ� �Ѿ��
[����] key�� ���� '='�� ���Խ�Ű���� �Ѵٸ� escape ���� '\'�� ����Ͽ� '\='��
���� ǥ���Ѵ�.
*/