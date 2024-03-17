import java.util.Scanner;

class PhoneBookMain
{
    private static final int INSERT_PHONE_INFORMATION = 1;
    private static final int SEARCH_PHONE_INFORMATION = 2;
    private static final int DELETE_PHONE_INFORMATION = 3;
    private static final int SHOW_ALL_PHONE_INFORMATION = 4;
    private static final int QUIT_PHONE_INFORMATION = 5;

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int choice=0;

        while(true)
        {
            PhonebookUI.printMenu();//1.UI가 나와야함
            choice = sc.nextInt(); // UI가 나오면 선택
            //sc.nextLine();
            switch(choice)
            {
                case INSERT_PHONE_INFORMATION:
                    PhonebookUI.InputPhoneInformation();
                    break;
            }
        }
    }
}

class PhonebookUI
{
    private static PhoneBook pb = PhoneBook.getPhoneBook(100);
    //전화번호부(PhoneBook)를 생성하고 초기화하는 역할
    //전체적인 어플리케이션의 핵심 역할 수행 -> static으로 선언.
    //getPhoneBook()메소드를 이용해 전화번호부 인스턴스 생성
    //싱글톤 패턴을 구형해 항상 동일안 인스턴스로 반환하도록 함
    public static Scanner sc = new Scanner(System.in);
    //이 Scanner 객체를 public static으로 선언하여 다른 클래스에서도 쉽게 사용할 수 있도록 함.

    private PhonebookUI(){}
    //생성자를 private으로 선언하여 외부에서 해당 클래스의 객체를 생성할 수 없도록 하기위함.
    //싱글톤 패턴은 애플리케이션 내에서 특정 클래스의 인스턴스가 오직 하나만 존재하도록 보장하는 디자인 패턴.
    //여러 곳에서 같은 인스턴스에 접근해야 하는 경우에 유용.
    //따라서 여러 인스턴스가 생성되는 것을 방지
    //데이터에 저장이 꽉찼을 때 저장을 못함

    public static void printMenu()
    {

        System.out.println("선택하세요");
        System.out.println("1. 데이터 입력");
        System.out.println("2. 데이터 검색");
        System.out.println("3. 데이터 삭제");
        System.out.println("4. 모든 데이터 보기");
        System.out.println("5. 프로그램 종료");
        System.out.println("선택 : ");
    }

    public static void InputPhoneInformation()  //입력해 집어넣는 메소드
    {
        boolean result = checkNumOfPhoneInformation();
        if(result == false)
        {
            System.out.println("더이상 데이터를 저장할 수 없습니다.");
            return;
        }
        System.out.println("데이터 입력을 시작합니다.");
        System.out.print("이름 : ");
        String name = sc.nextLine();
        System.out.print("전화번호 : ");
        String phoneNumber = sc.nextLine();
        System.out.print("생년월일 : ");
        String birthday = sc.nextLine();
        insertPhoneInformation(name, pheoneNumber, birthday);
        System.out.println("데이터 입력이 완료되었습니다.");
    }

    public boolean checkNumOfPhoneInformation()
    {
        if(numOfPhoneInformation >= pInformationArr.length)
            return false;
        return true;
    }
    public void insertPhoneInformation(String name, String phoneNumber, String birthday)
    {
        pInformationArr[numOfPhoneInformation++] = new PhoneInformation(name, phoneNumber, birthday);
    }

    public static void inputPhoneInformation()
    {
        boolean result = pb.
    }



    class PhoneBook
    {
        private static PhoneBook pb;
        private PhoneInformation[] phoneInformationArray;
        private int numOfPhoneInformation;

        private PhoneBook(int size)
        {
            phoneInformationArray = new PhoneInformation[size];
        }

        public static PhoneBook getPhoneBook(int size)
        {
            if(pb==null)
            {
                pb = new PhoneBook(size);
            }
            return pb;
        }

        public boolean checkNumOfPhoneInformation()
        {
            if (numOfPhoneInformation >= phoneInformationArray.length)
            {
                return false;
            }
            return true;
        }

        public void insertPhoneInformation(String name, String phoneNumber, String birthday)
        {
            phoneInformationArray[numOfPhoneInformation++] = new PhoneInformation(name, phoneNumber, birthday);
        }
    }

    class PhoneInformation
    {
        private String name;
        private String phoneNumber;
        private String birthday;

        public PhoneInformation(String name, String phoneNumber, String birthday)
        {
            this.name = name;
            this.phoneNumber = phoneNumber;
            this.birthday = birthday;
        }


    }




}


/*
boolean result = true;
        if(numOfPhoneInformation >= phoneInformationArray.length)
        {
result = false;
        if(result == false)
        {
        System.out.println("더이상 데이터를 저장할 수 없습니다");
                return;
                        }
                        }*/
