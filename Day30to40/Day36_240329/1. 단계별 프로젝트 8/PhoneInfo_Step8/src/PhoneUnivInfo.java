import java.io.IOException;

public class PhoneUnivInfo extends PhoneInfo
{
    private static final long serialVersionUID = 1L;
    private String major;
    private int year;

    public PhoneUnivInfo(String name, String phoneNumber, String major, int year)
    {
        super(name, phoneNumber);
        this.major = major;
        this.year = year;
    }

    @Override
    public void printCurrentState()
    {
        super.printCurrentState();
        System.out.println("���� : " + major);
        System.out.println("�г� : " + year);
    }
}