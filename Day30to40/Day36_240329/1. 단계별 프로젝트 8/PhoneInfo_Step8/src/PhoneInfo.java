import java.io.Serializable;

public class PhoneInfo implements Comparable<PhoneInfo>, Serializable
{
    private static final long serialVersionUID = 1L;
    private String name;
    private String phoneNumber;

    public PhoneInfo(String name, String phoneNumber)
    {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName()
    {
        return name;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void printCurrentState()
    {
        System.out.println("�̸� : " + name);
        System.out.println("��ȭ��ȣ : " + phoneNumber);
    }

    @Override
    public int compareTo(PhoneInfo pInfo)
    {
        return name.compareTo(pInfo.name);
    }
}