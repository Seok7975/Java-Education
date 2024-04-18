import java.util.*;

class PropertiesEx1 {
	public static void main(String[] args) {
		Properties prop = new Properties();

		// prop�� Ű�� ��(key, value)�� �����Ѵ�.
		prop.setProperty("timeout","30");
		prop.setProperty("language","kr");
		prop.setProperty("size","10");
		prop.setProperty("capacity","10");

		// prop�� ����� ��ҵ��� Enumeration�� �̿��ؼ� ����Ѵ�.
		Enumeration e = prop.propertyNames();

		while(e.hasMoreElements()) {
			String element = (String)e.nextElement();
			System.out.println(element + "="+ prop.getProperty(element));
		}

		System.out.println();
		prop.setProperty("size","20");	// size�� ���� 20���� �����Ѵ�.
		System.out.println("size="       + prop.getProperty("size"));
		System.out.println("capacity="   + prop.getProperty("capacity", "20"));
		// String getProperty(String key, String defaultValue)
		// ������ Ű(key)�� ��(value)�� ��ȯ�Ѵ�. Ű�� ��ã����
		// defaultValue�� ��ȯ�Ѵ�.
		System.out.println("loadfactor=" + prop.getProperty("loadfactor", "0.75"));

		System.out.println(prop);	// prop�� ����� ��ҵ��� ����Ѵ�.
		prop.list(System.out);      // prop�� ����� ��ҵ��� ȭ��(System.out)�� ����Ѵ�.
	}
}


/*
capacity=10
size=10
timeout=30
language=kr

size=20
capacity=10
loadfactor=0.75
{size=20, language=kr, timeout=30, capacity=10}
-- listing properties --
size=20
language=kr
timeout=30
capacity=10
*/

/*
Properties�� �⺻���� �޼��带 �̿��ؼ� �����ϰ� �о���� ����ϴ� ����� �����ִ�
������ �����̴�. �����͸� �����ϴµ� ���Ǵ� setProperty()�� �ܼ��� Hashtable��
put�޼��带 ȣ���� ���̴�. �׸���  setProperty()�� ������ ���� Ű�� ����� ���� �ִ�
��� �� ���� ObjectŸ������ ��ȯ�ϸ�, �׷��� ���� ���� null�� ��ȯ�Ѵ�.

Object setProperty(String key, String value)

getProperty()�� Properties�� ����� ���� �о���� ���� �ϴµ�, ���� �о������ Ű��
�������� ������ ������ �⺻��(defaultValue)�� ��ȯ�Ѵ�.

String getProperty(String key)
String getProperty(String key, String defaultValue)

Properties�� Hashtable�� ��ӹ޾� ������ ���̶� Map�� Ư���� ��������� ��������
�ʱ� ������ ������ ����� ��µ� ������ ��������ʹ� �����ϴٴ� ���� Ȯ������.
 Properties�� �÷��������ӿ� ������ �������̹Ƿ� Iterator�� �ƴ� Enumeration��
����Ѵ�. �׸��� list�޼��带 �̿��ϸ� Properties�� ����� ��� �����͸� ȭ��
�Ǵ� ���Ͽ� ���ϰ� ����� �� �ִ�.

void list(PrintStream out)
void list(PrintWriter out)

System.out�� ȭ��� ����� ǥ��������� SystemŬ������ ���ǵ� PrintStreamŸ����
static �����̴�.
*/