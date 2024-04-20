
public class PhoneCompanyInfo extends PhoneInfo
{
    private static final long serialVersionUID = 1L;
    private String company;

    public PhoneCompanyInfo(String name, String phoneNumber, String company)
    {
        super(name, phoneNumber);
        this.company = company;
    }

    @Override
    public void printCurrentState()
    {
        super.printCurrentState();
        System.out.println("È¸»ç : " + company);
    }

}