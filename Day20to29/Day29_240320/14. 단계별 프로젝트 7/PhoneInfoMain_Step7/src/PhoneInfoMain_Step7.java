import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Scanner;

class PhoneMain{

    public static void main(String[] args) {

        int menu=0;
        PhoneBookUI pbUI = new PhoneBookUI();
        Scanner sc = PhoneBookUI.sc;

        while(true)
        {
            pbUI.printMenu();
            try
            {
                menu = sc.nextInt();
                sc.nextLine();

                if(menu<Menu.INSERT_PHONE_INFO || menu > Menu.QUIT_PHONE_INFO)
                {
                    throw new MenuChoiceException(menu);
                }
                switch(menu)
                {
                    case Menu.INSERT_PHONE_INFO:
                        pbUI.inputMenu();
                        menu = sc.nextInt();
                        sc.nextLine();
                        if(menu<1 || menu > 3)
                        {
                            throw new MenuChoiceException(menu);
                        }
                        pbUI.inputPhoneInfo(menu);
                        break;
                    case Menu.SEARCH_PHONE_INFO:
                        pbUI.searchPhoneInfoByName();
                        break;
                    case Menu.DELETE_PHONE_INFO:
                        pbUI.deletePhoneInfoByPhoneNumber();
                        break;
                    case Menu.SHOW_ALL_PHONE_INFO:
                        pbUI.printAllPhoneInfo();
                        break;
                    case Menu.QUIT_PHONE_INFO:
                        pbUI.quitProgram();
                        return;
                }
            }
            catch(MenuChoiceException e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
}

interface Menu {
    int INSERT_PHONE_INFO=1; 		// 상수로 준 이유 : 가독성을 높이기 위해서
    int SEARCH_PHONE_INFO=2;
    int DELETE_PHONE_INFO=3;
    int SHOW_ALL_PHONE_INFO=4;
    int QUIT_PHONE_INFO=5;
}

class MenuChoiceException extends Exception {

    public MenuChoiceException(int menu)
    {
        super(menu + "에 해당하는 선택은 존재하지 않습니다.\n" +
                "메뉴 선택을 처음부터 다시 진행합니다.");
    }
}


class PhoneBook {

    private static PhoneBook pb;
    private Set<PhoneInfo> set;

    private PhoneBook()
    {
        set = new HashSet<PhoneInfo>();
    }

    public static PhoneBook getPhoneBook()
    {
        if(pb==null)
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

        while(itr.hasNext())
        {
            pInfo = itr.next();
            if(pInfo.getName().equals(name))
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

        while(itr.hasNext())
        {
            pInfo = itr.next();
            if(pInfo.getPhoneNumber().equals(phoneNumber))
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
        while(itr.hasNext())
        {
            itr.next().printCurrentState();
        }
//		for(PhoneInfo info: set)
//			info.printCurrentState();
    }
}


class PhoneBookUI {
    private PhoneBook pb;
    public static Scanner sc = new Scanner(System.in);

    public PhoneBookUI()
    {
        this.pb = PhoneBook.getPhoneBook();
    }

    public void printMenu()
    {
        System.out.println("선택하세요...");
        System.out.println("1. 데이터 입력");
        System.out.println("2. 데이터 검색");
        System.out.println("3. 데이터 삭제");
        System.out.println("4. 모든 데이터 보기");
        System.out.println("5. 프로그램 종료");
        System.out.println("선택 : ");
    }

    public void inputMenu()
    {
        System.out.println("데이터 입력을 시작합니다.");
        System.out.println("1. 일반, 2. 대학, 3. 회사");
        System.out.print("선택 >>");
    }

    public void inputPhoneInfo(int menu)
    {
        String name, phoneNumber, major, company;
        int year=0;
        boolean result;
        PhoneInfo phoneInfo = null;

        System.out.println("데이터 입력을 시작합니다.");
        System.out.println("이름 : ");
        name = sc.nextLine();
        System.out.println("전화번호 : ");
        phoneNumber = sc.nextLine();

        if(menu == 1)	// 추가
            phoneInfo = new PhoneInfo(name, phoneNumber);
        else if(menu == 2)
        {
            System.out.println("전공 : ");
            major = sc.nextLine();
            System.out.println("학년 : ");
            year = sc.nextInt();
            phoneInfo = new PhoneUnivInfo(name, phoneNumber, major, year);
        }
        else if(menu==3)
        {
            System.out.println("회사 : ");
            company = sc.nextLine();
            phoneInfo = new PhoneCompanyInfo(name, phoneNumber, company);
        }
        result = pb.insertPhoneInfo(phoneInfo);
        if(result == false)
            System.out.println("이미 등록된 데이터 입니다.");
        else System.out.println("데이터 입력이 완료되었습니다.");
    }

    public void searchPhoneInfoByName()
    {
        String name;
        System.out.println("검색하시고자 하는 이름을 입력해 주세요.");
        name = sc.nextLine();
        System.out.println("사용자 검색을 시작합니다.");
        if( !pb.searchPhoneInfoByName(name)) System.out.println("찾으시는 사용자가 없습니다.");
    }

    public void deletePhoneInfoByPhoneNumber()
    {
        String phoneNumber;
        System.out.println("삭제하시고자 하는 전화번호를 입력해 주세요.");
        phoneNumber = sc.nextLine();
        boolean result = pb.deletePhoneInfoByPhoneNumber(phoneNumber);
        if(result) System.out.println("삭제가 완료되었습니다.");
        else System.out.println("삭제하시고자 하는 전화번호 정보가 없습니다.");
    }

    public void printAllPhoneInfo()
    {
        System.out.println("모든 사용자 정보를 출력합니다.");
        pb.printAllPhoneInfo();
    }

    public void quitProgram()
    {
        System.out.println("프로그램을 종료합니다.");
        sc.close();
    }
}


class PhoneCompanyInfo extends PhoneInfo {

    private String company;

    public PhoneCompanyInfo(String name, String phoneNumber, String company) {
        super(name, phoneNumber);
        this.company = company;
    }

    @Override
    public void printCurrentState() {
        super.printCurrentState();
        System.out.println("회사 : " + company);
    }

}

class PhoneInfo {
    private String name;
    private String phoneNumber;

    public PhoneInfo(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void printCurrentState()
    {
        System.out.println("이름 : "  + name);
        System.out.println("전화번호 : "  + phoneNumber);
    }

    @Override
    public boolean equals(Object obj) {
        return phoneNumber.equals(((PhoneInfo)obj).phoneNumber);
    }

    @Override
    public int hashCode() {
        return phoneNumber.hashCode();
    }
}


class PhoneUnivInfo extends PhoneInfo {
    private String major;
    private int year;

    public PhoneUnivInfo(String name, String phoneNumber, String major, int year) {
        super(name, phoneNumber);
        this.major = major;
        this.year = year;
    }

    @Override
    public void printCurrentState() {
        super.printCurrentState();
        System.out.println("전공 : " + major);
        System.out.println("학년 : " + year);
    }
}