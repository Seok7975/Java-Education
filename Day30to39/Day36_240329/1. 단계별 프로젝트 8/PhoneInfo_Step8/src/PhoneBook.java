/*
��ȭ��ȣ ���� ���α׷� 08�ܰ� ����
���α׷��� ����Ǹ� ���α׷��� ���� �߿� �Էµ� �����͸� ���Ͽ� �����ϰ�,
���α׷��� �ٽ� ����Ǹ� ���Ͽ� ����� �����͸� ���α׷������� �����ϴ� ����� �߰�����.
�׷��� �ѹ� ����� �����ʹ� ���α׷��󿡼� ��� �����ǵ��� ����.
�� ���̰� ���α׷��� ������ص� ���̴�. �� ���Ϸ��� ������ ������� �ν��Ͻ� ������ ������ ����.
�� ObjectInputStrem Ŭ������ ObjectOutputStream Ŭ���� ������� ��Ʈ���� �����ؼ� �����͸� ��������ڴ� ���̴�.

���� �Ѹ���!
�� ������Ʈ���� ���Ͽ� ����Ǿ�� �� �ν��Ͻ��� �ڷ����� ������ ���� �� �������̴�.
* PhoneInfo class
* PhoneUnivInfo class
* PhoneCompanyInfo class

�׷��� ���� ��� ��Ȳ���� PhoneInfo�� ���������� �ν��Ͻ��� �����ϰ� �ִ�.
�׷��ٸ� ������ ���� ������� ���Ͽ� �ν��Ͻ��� �����ϸ� ���� ������ ����ǰڴ°�?

ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Personal.ser"));
PhoneInfo info1 = new PhoneUnivInfo(...);
out.writeObject(info1);
PhoneInfo info1 = new PhoneComapnyInfo(...);
out.writeObject(info2);

ObjectOutputStream ������� �ν��Ͻ��� �����ϱ� ���ؼ���
writeObject �޼ҵ带 ȣ���ϸ鼭 ���������� �����ؾ� �Ѵ�.
�׷��� ���⼭ �߿��� ���� ���������� �ڷ����� �ƴ϶�, ���������� ������ �����ϴ� �ν��Ͻ��� �ڷ����̴�.
�� ���� �ڵ忡�� info1�� info2�� ��� PhoneInfo�� ��������������,
���� �����ϴ� ����� ���� PhoneUnivInfo �ν��Ͻ��� PhoneCompanyInfo �ν��Ͻ��̱⶧����
������ ����Ǵ� ����� PhoneUnivInfo �ν��Ͻ��� PhoneCompanyInfo �ν��Ͻ��̴�.
 */

import java.io.Serializable;
import java.util.Iterator;
import java.util.TreeSet;

public class PhoneBook implements Serializable
{
    private static final long serialVersionUID = 1L;
    private static PhoneBook instance = new PhoneBook();
    private static PhoneBookManager pbManager;

    private TreeSet<PhoneInfo> set;

    // �����ڸ� private���� �����Ͽ� �ܺο����� �ν��Ͻ� ������ �����մϴ�.
    private PhoneBook()
    {
        pbManager = new PhoneBookManager();
    }

    // �ν��Ͻ� ��ȯ �޼���
    public static PhoneBook getInstance()
    {
        return instance;
    }
`
    // ��ȭ��ȣ�� ���� �޼���
    public void run()
    {
        pbManager.run();
    }

    // �����͸� ���Ͽ� �����ϴ� �޼���
    public void saveData()
    {
        pbManager.saveData();
    }`

    private PhoneBook()
    {
        set = new TreeSet<PhoneInfo>();
    }

    public static PhoneBook getPhoneBook()
    {
        if (pb == null)
            pb = new PhoneBook();
        return pb;
    }

    public boolean insertPhoneInfo(PhoneInfo phoneInfo)
    {
        return set.add(phoneInfo);
    }

    public boolean searchPhoneInfoByName(String name)
    {
        PhoneInfo pInfo = null;
        Iterator<PhoneInfo> itr = set.iterator();
        boolean result = false;

        while (itr.hasNext())
        {
            pInfo = itr.next();
            if (pInfo.getName().equals(name))
            {
                pInfo.printCurrentState();
                result = true;
            }
        }

        return result;
    }

    public boolean deletePhoneInfoByPhoneNumber(String phoneNumber)
    {
        PhoneInfo pInfo = null;
        Iterator<PhoneInfo> itr = set.iterator();

        while (itr.hasNext())
        {
            pInfo = itr.next();
            if (pInfo.getPhoneNumber().equals(phoneNumber))
            {
                itr.remove();
                return true;
            }
        }
        return false;
    }

    public void printAllPhoneInfo()
    {
        Iterator<PhoneInfo> itr = set.iterator();
        while (itr.hasNext())
        {
            itr.next().printCurrentState();
        }
//		for(PhoneInfo info: set)
//			info.printCurrentState();
    }
}