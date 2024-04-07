import java.util.Scanner;

class PhoneBook {

    private static PhoneBook pb;
    private PhoneInfo[] pInfoArr;
    private int numOfPhoneInfo;

    private PhoneBook(int size)	//폰북 사이즈를 받아 만드는 매소드
    {
        pInfoArr = new PhoneInfo[size];	//
    }

    public static PhoneBook getPhoneBook(int size)
    {
        if(pb==null)
            pb = new PhoneBook(size);
        return pb;
    }

    public boolean checkNumOfPhoneInfo()
    {
        if(numOfPhoneInfo >= pInfoArr.length)
            return false;
        return true;
    }
    public void insertPhoneInfo(String name, String phoneNumber, String birthday)
    {
        pInfoArr[numOfPhoneInfo++] = new PhoneInfo(name, phoneNumber, birthday);
    }

    public boolean searchPhoneInfoByName(String name)
    {
        boolean result = false;  //false : 동일인물이 없다
        for(int i=0;i<numOfPhoneInfo;i++)
        {
            if( name.compareTo(pInfoArr[i].getName()) == 0 )  //동명이인이 있을 수 있으니 반복문을 끝까지 돌림
            {
                pInfoArr[i].printCurrentState();
                result = true; // 동일인물이 있다
            }
        }
        return result;
    }

    public int searchPhoneInfoByPhoneNumber(String phoneNumber)//검색 메소드
    {
        for(int i=0;i<numOfPhoneInfo;i++)
        {
            if( phoneNumber.compareTo(pInfoArr[i].getPhoneNumber()) == 0 )
            {
                return i;
            }
        }

        return -1;  //찾았는데 있다면 -1
    }

    public boolean deletePhoneInfoByPhoneNumber(String phoneNumber)//삭제 메소드
    {
        boolean deleteResult = false;
        int searchResult = searchPhoneInfoByPhoneNumber(phoneNumber);  //유지를 위해 따로 만듬
        if( searchResult != -1 )
        {
            for(int i=searchResult;i<numOfPhoneInfo-1;i++)
                pInfoArr[i] = pInfoArr[i+1];

            pInfoArr[numOfPhoneInfo-1] = null;
            deleteResult = true;
            numOfPhoneInfo--;
        }

        return deleteResult;
    }

    public void printAllPhoneInfo()//모든 정보 출력 메소드
    {
        for(int i=0;i<numOfPhoneInfo;i++)
            pInfoArr[i].printCurrentState();
        System.out.println();
    }
}
////////////////////////////////////////////////////////////////////////////////////////////////////

class PhoneBookUI
{
    private static PhoneBook pb = PhoneBook.getPhoneBook(100);	//싱글톤 패턴으로 만듬
    public static Scanner sc = new Scanner(System.in);

    private PhoneBookUI(){}

    public static void printMenu()
    {
        System.out.println("선택하세요...");
        System.out.println("1. 데이터 입력");
        System.out.println("2. 데이터 검색");
        System.out.println("3. 데이터 삭제");
        System.out.println("4. 모든 데이터 보기");
        System.out.println("5. 프로그램 종료");
        System.out.print("선택 : ");
    }

    public static void inputPhoneInfo()
    {
        boolean result = pb.checkNumOfPhoneInfo();
        if(result == false)
        {
            System.out.println("더이상 데이터를 저장할 수 없습니다.");
            return;
        }

        String name, phoneNumber, birthday;

        System.out.println("데이터 입력을 시작합니다.");
        System.out.print("이름 : ");
        name = sc.nextLine();
        System.out.print("전화번호 : ");
        phoneNumber = sc.nextLine();
        System.out.print("생년월일 : ");
        birthday = sc.nextLine();
        pb.insertPhoneInfo(name, phoneNumber, birthday);
        System.out.println("데이터 입력이 완료되었습니다.");
    }

    public static void searchPhoneInfoByName()
    {
        String name;
        System.out.print("검색하시고자 하는 이름을 입력해 주세요.");
        name = sc.nextLine();
        System.out.println("사용자 검색을 시작합니다. : ");
        if( !pb.searchPhoneInfoByName(name)) System.out.println("찾으시는 사용자가 없습니다.");
    }

    public static void deletePhoneInfoByPhoneNumber()
    {
        String phoneNumber;
        System.out.print("삭제하시고자 하는 전화번호를 입력해 주세요. : ");
        phoneNumber = sc.nextLine();
        boolean result = pb.deletePhoneInfoByPhoneNumber(phoneNumber);
        if(result) System.out.println("삭제가 완료되었습니다.");  //true or false
        else System.out.println("삭제하시고자 하는 전화번호 정보가 없습니다.");
    }

    public static void printAllPhoneInfo()
    {
        System.out.println("모든 사용자 정보를 출력합니다.");
        pb.printAllPhoneInfo();
    }

    public static void quitProgram()
    {
        System.out.println("프로그램을 종료합니다.");
        sc.close();
    }
    public static void wrongNumber()
    {
        System.out.println("잘못 입력하셨습니다.");
    }
}


/////////////////////////////////////////////////////////////////////////////////////////////////////////
class PhoneInfo
{
    private String name;
    private String phoneNumber;
    private String birthday;
    private String major;
    private int year;

    public PhoneInfo(String name, String phoneNumber, String birthday)
    {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthday = birthday;
    }

/*    public PhoneUnivInfo(String name, String phoneNomeber, String major, String year)
    {
        this.major =
    }*/

    public PhoneInfo(String name, String phoneNumber)
    {
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
        System.out.println("생일 : "  + birthday);
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////

class PhoneMain {

    private static final int INSERT_PHONE_INFO=1; 		// 상수로 준 이유 : 가독성을 높이기 위해서, 객체를 생성하지 않기위해
    private static final int SEARCH_PHONE_INFO=2;
    private static final int DELETE_PHONE_INFO=3;
    private static final int SHOW_ALL_PHONE_INFO=4;
    private static final int QUIT_PHONE_INFO=5;

    public static void main(String[] args)
    {

        int menu=0;
        Scanner sc = PhoneBookUI.sc;

        while(true)
        {
            PhoneBookUI.printMenu();
            menu = sc.nextInt();
            sc.nextLine();
            switch(menu)
            {
                case INSERT_PHONE_INFO:
                    PhoneBookUI.inputPhoneInfo();
                    break;
                case SEARCH_PHONE_INFO:
                    PhoneBookUI.searchPhoneInfoByName();  //동명이인이 있을 수 있음
                    break;
                case DELETE_PHONE_INFO:
                    PhoneBookUI.deletePhoneInfoByPhoneNumber();  //삭제시에 전화번호는 동일이 없으므로 전화번호로 삭제
                    break;
                case SHOW_ALL_PHONE_INFO:
                    PhoneBookUI.printAllPhoneInfo();
                    break;
                case QUIT_PHONE_INFO:
                    PhoneBookUI.quitProgram();
                    return;
                default:
                    PhoneBookUI.wrongNumber();
            }
        }
    }
}