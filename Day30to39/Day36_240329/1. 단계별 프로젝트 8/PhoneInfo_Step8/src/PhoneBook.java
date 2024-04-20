/*
전화번호 관리 프로그램 08단계 문제
프로그램이 종료되면 프로그램의 실행 중에 입력된 데이터를 파일에 저장하고,
프로그램이 다시 실행되면 파일에 저장된 데이터를 프로그램상으로 복원하는 기능을 추가하자.
그래서 한번 저장된 데이터는 프로그램상에서 계속 유지되도록 하자.
몇 번이건 프로그램을 재실행해도 말이다. 단 파일로의 데이터 입출력은 인스턴스 단위로 진행을 하자.
즉 ObjectInputStrem 클래스와 ObjectOutputStream 클래스 기반으로 스트림을 생성해서 데이터를 입출력하자는 뜻이다.

도움 한마디!
본 프로젝트에서 파일에 저장되어야 할 인스턴스의 자료형은 다음과 같이 총 세가지이다.
* PhoneInfo class
* PhoneUnivInfo class
* PhoneCompanyInfo class

그런데 거의 모든 상황에서 PhoneInfo형 참조변수로 인스턴스를 참조하고 있다.
그렇다면 다음과 같은 방식으로 파일에 인스턴스를 저장하면 과연 무엇이 저장되겠는가?

ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Personal.ser"));
PhoneInfo info1 = new PhoneUnivInfo(...);
out.writeObject(info1);
PhoneInfo info1 = new PhoneComapnyInfo(...);
out.writeObject(info2);

ObjectOutputStream 기반으로 인스턴스를 저장하기 위해서는
writeObject 메소드를 호출하면서 참조변수를 전달해야 한다.
그런데 여기서 중요한 것은 참조변수의 자료형이 아니라, 참조변수가 실제로 참조하는 인스턴스의 자료형이다.
즉 위의 코드에서 info1과 info2는 모두 PhoneInfo형 참조변수이지만,
실제 참조하는 대상이 각각 PhoneUnivInfo 인스턴스와 PhoneCompanyInfo 인스턴스이기때문에
실제로 저장되는 대상은 PhoneUnivInfo 인스턴스와 PhoneCompanyInfo 인스턴스이다.
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

    // 생성자를 private으로 선언하여 외부에서의 인스턴스 생성을 제한합니다.
    private PhoneBook()
    {
        pbManager = new PhoneBookManager();
    }

    // 인스턴스 반환 메서드
    public static PhoneBook getInstance()
    {
        return instance;
    }
`
    // 전화번호부 실행 메서드
    public void run()
    {
        pbManager.run();
    }

    // 데이터를 파일에 저장하는 메서드
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