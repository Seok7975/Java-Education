import java.util.Scanner;


class PhoneInfo
{
    private String name;
    private String phone;
    private String birth;

    public PhoneInfo(String name, String phone, String birth)
    {
        this.name = name;
        this.phone = phone;
        this.birth = birth;
    }
    public void showPhoneInfo()
    {
        System.out.println("name : " + name);
        System.out.println("phone : " + phone);
        System.out.println("birth : " + birth);
    }
    public String getName()
    {
        return name;
    }

    public void deleteName()
    //"배열의 중간에 저장된 데이터를 삭제할 경우에는, 해당 요소의 뒤에 저장된 요소들을 한 칸씩 앞으로 이동시키는 형태로 삭제를 진행한다."
    {

    }
}

class PhoneInfoMain
{
    public static void main(String[] args)
    {
        PhoneInfo info = null;
        Scanner sc = new Scanner(System.in,"Euc-kr");
        int menu = 0;
        String name = null, phone = null, birth = null;
        PhoneInfo[] infoArr = new PhoneInfo[100];
        int cnt = 0;
        boolean sflag = false;
        int idx = 0;


        while(true)
        {
            System.out.println("선택하세요.");
            System.out.println("1. 데이터 입력");
            System.out.println("2. 데이터 검색");
            System.out.println("3. 데이터 삭제");
            System.out.println("4. 모든 데이터 보기");
            System.out.println("5. 프로그램 종료");
            System.out.print("선택 : ");
            menu = sc.nextInt();		// 1 엔터
            sc.nextLine();		// 버퍼에 있는 엔터키 값을 없앤다.
            switch(menu)
            {
                case 1:
                    System.out.println("데이터 입력을 시작합니다.");
                    System.out.print("이름 : ");
                    name = sc.nextLine();
                    System.out.print("전화번호 : ");
                    phone = sc.nextLine();
                    System.out.print("생년월일 : ");
                    birth = sc.nextLine();
                    info = new PhoneInfo(name, phone, birth);
                    infoArr[cnt++] = info;
                    System.out.println("데이터 입력이 완료되었습니다.");
                    break;

                case 2:
                    System.out.println("검색하시고자 하는 이름을 입력하세요.");
                    name = sc.nextLine();
                    for(int i=0;i<cnt;i++)
                    {
                        if(name.equals(infoArr[i].getName()))
                        {
                            infoArr[i].showPhoneInfo();
                            sflag = true;
                        }
                    }
                    if(!sflag) System.out.println("검색하시고자 하는 사람이 없습니다.");
                    sflag = false;
                    break;

                case 3:
                    System.out.println("삭제하시고자 하는 이름을 입력하세요");
                    name = sc.nextLine();
                    for(int i=0; i<cnt; i++)
                    {
                        if(name.compareTo(infoArr[i].getName()) == 0)
                        {
                            idx = i;
                            sflag = true;
                            break;
                        }
                    }

                    if(!sflag)
                    {
                        System.out.println("삭제하고자 하는 사람이 없습니다.");
                    }

                    else
                    {
                        for(int i = idx; i<cnt-1; i++)
                            infoArr[i] = infoArr[i+1];
                        infoArr[cnt-1] = null;
                        cnt--;
                        sflag = false;
                        System.out.println("삭제가 완료되었습니다.");
                    }
                    break;

                case 4:
                    for(int i=0;i<cnt;i++)
                        infoArr[i].showPhoneInfo();
                    break;

                case 5:
                    System.out.println("프로그램을 종료합니다.");
                    return;

                default:
                    System.out.println("잘못 선택하셨습니다.");
            }
        }
    }
}