/*1. 다음을 프로그램 하시오.

        Friend 클래스
이름
전화번호
주소

        메소드
showData : 모든 데이터(전체 제이터)를 출력하는 메소드
showBasicInfo : 기본 데이터(일부 데이터)를 출력하는 메소드

HighFriend 클래스 (Friend 클래스 상속)
직장

        메소드
showData : 모든 데이터(전체 제이터)를 출력하는 메소드
showBasicInfo 메소드에서 이름, 전화번호, 직장을 출력

UnivFriend 클래스 (Friend 클래스 상속)
전공

        메소드
showData : 모든 데이터(전체 제이터)를 출력하는 메소드 :이름 전번 주소 전공
showBasicInfo 메소드에서 이름과 전공학과를 출력 : 이름 전공

*** 메뉴 선택 ***
        1. 고교 정보 저장
2. 대학 친구 저장
3. 전체 정보 출력
4. 전체 기본 정보 출력
5. 프로그램 종료
선택>>*/

class Friend
{
    private String name;
    private String phoneNumber;
    private String address;

    public Friend(String name, String phoneNumber, String address)
    {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public void showData()
    {
        System.out.println("이름 : " + name);
        System.out.println("전화번호 : " + phoneNumber);
        System.out.println("주소 : " + address);
    }

    public void showBasicInfo()
    {

    }
}

class HighFriend extends Friend  //고교동창
{
    private String company;

    public HighFriend(String name, String phone, String addr, String job)
    {
        super(name, phone, addr); //맨 처음은 상위 클래스를 호출하는 형태
        company = job;
    }

    public void showData()
    {
        super.showData();
        System.out.println("직업 : " + company);
    }

    public void showBasicInfo()
    {
        System.out.println("이름 : " + name);
        System.out.println("전화 : " + phoneNumber);
    }
}

class UnivFriend extends Friend //대학동기
{
    String major;
    public UnivFriend(String name, String phone, String addr, String major)
    {
        super(name, phone, addr);
        this.major = major;
    }

    public void showData()
    {
        super.showData();
        System.out.println("전공 : " + major);
    }

    public void showBasicInfo()
    {
        System.out.println("이름 : " + name);
        System.out.println("전화 : " + phoneNumber);
        System.out.println("전공 : " + major);
    }

}