/*
import java.util.Scanner;

//상속을 이용하도록 하고, 저장할 때 삽입하면서 정렬하도록 하자.(삽입정렬)
class PhoneBook
{

}
//////////////////////////////////////////////////////////////////////////////////////////////////////
class PhoneUnivInfo
{
    private String name;
    private String phoneNumber;
    private String major;
    private int year;

    public PhoneUnivInfo(String name, String phoneNumber, String major, int year)
    {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.major = major;
        this.year = year;
    }

}
////////////////////////////////////////////////////////////////////////////////////////////////////
class PhoneCompanyInfo
{
    private String name;
    private String phoneNumber;
    private String company;

    public PhoneCompanyInfo(String name, String phoneNumber, String company)
    {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.company = company;
    }
}
///////////////////////////////////////////////////////////////////////////////////////////////////////
class PhoneBookUI
{

}
/////////////////////////////////////////////////////////////////////////////////////////////////////////
class PhoneInfo


//////////////////////////////////////////////////////////////////////////////////////////////

class PhoneMain
{

}
*/

/*
package com.test.memo;

import java.util.Scanner;

class PhoneInfo {
    private String name, phoneNumber, birth;

    PhoneInfo(String name, String phoneNumber, String birth) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birth = birth;
    }

    PhoneInfo(String name, String phoneNumber) {// birth 없이 출력 가능하게
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void showData() {// 전체 정보
        System.out.printf("이름: %s\n", name);
        System.out.printf("전화번호: %s\n", phoneNumber);
        System.out.printf("생년월일: %s\n", birth);
    }

    public void basicData() {// 기본정보
        System.out.printf("이름: %s\n", name);
        System.out.printf("전화번호: %s\n", phoneNumber);
    }
}

class PhoneUnivInfo extends PhoneInfo {// 대학 동기들의 전화번호 저장
    private String major; // 전공
    private int year; // 학년

    PhoneUnivInfo(String name, String phoneNumber, String major, int year) {
        super(name, phoneNumber);
        this.major = major;
        this.year = year;
    }

    public void showData() {
        super.showData();
        System.out.printf("전공: %s\n", major);
        System.out.printf("학년: %d\n", year);
    }

    public void basicData() {
        super.basicData();
        System.out.printf("전공: %s\n", major);
        System.out.printf("학년: %d\n", year);
    }
}

class PhoneCompanyInfo extends PhoneInfo {
    private String company;

    public PhoneCompanyInfo(String name, String phoneNumber, String company) {
        super(name, phoneNumber);
        this.company = company;
    }

    public void showData() {
        super.showData();
        System.out.printf("회사: %s\n", company);
    }

    public void basicData() {
        super.basicData();
        System.out.printf("회사: %s\n", company);
    }
}

class PhoneInfoHandler {
    private PhoneInfo phone[];
    private int phoneCnt;

    public PhoneInfoHandler(int num) {
        phone = new PhoneInfo[num];
        phoneCnt = 0;
    }

    public int getPhoneCnt() {
        return phoneCnt;
    }

    private void addPhoneInfo(PhoneInfo pp) {
        phone[phoneCnt++] = pp;
    }

    public void addPhone() {
        String name, phoneNum, major, company;
        int year;
        Scanner sc = new Scanner(System.in);

        System.out.println("데이터 입력을 시작합니다.");
        System.out.println("1.일반 2.대학 3.회사");
        System.out.print("선택: ");
        int user = sc.nextInt();
        sc.nextLine();// 버퍼에 엔터 빼주기

        System.out.print("이름: ");// 공통된 입력 질문들
        name = sc.nextLine();
        System.out.print("전화번호: ");
        phoneNum = sc.nextLine();

        if (user == 1) {
            addPhoneInfo(new PhoneInfo(name, phoneNum));
        } else if (user == 2) {
            System.out.print("전공: ");
            major = sc.nextLine();
            System.out.print("학년(숫자만): ");
            year = sc.nextInt();
            sc.nextLine();

            addPhoneInfo(new PhoneUnivInfo(name, phoneNum, major, year));
        } else {
            System.out.print("회사: ");
            company = sc.nextLine();
            addPhoneInfo(new PhoneCompanyInfo(name, phoneNum, company));
        }
        System.out.println("데이터 입력이 완료되었습니다.");
    }

    public void searchDataByName(String searchName) {
        boolean found = false;
        for (int i = 0; i < phoneCnt; i++) {
            if (phone[i].getName().equals(searchName)) {
                phone[i].basicData();
                found = true;
            }
        }
        if (!found) {
            System.out.println("해당 이름의 데이터를 찾을 수 없습니다.");
        }
    }

    public void deleteDataByName(String deleteName) {
        boolean found = false;

        for (int i = 0; i < phoneCnt; i++) {
            if (phone[i].getName().equals(deleteName)) {
                found = true;
                System.out.println(deleteName + "의 데이터를 삭제합니다.");

                for (int j = i; j < phoneCnt; j++) {// 삭제할 인덱스부터 존재하는 인덱스까지 한칸 씩 땡기기위해서
                    phone[j] = phone[j + 1];
                }
                phoneCnt--;
                break;
            }
        }
        if (!found) {
            System.out.println("해당 이름의 데이터를 찾을 수 없습니다.");
        }
    }

    public void showAllData() {
        for (int i = 0; i < phoneCnt; i++) {
            phone[i].basicData();
        }
    }
}

class Practice {
    private static void printUI() {
        System.out.println("선택하세요...");
        System.out.println("1. 데이터 입력");
        System.out.println("2. 데이터 검색");
        System.out.println("3. 데이터 삭제");
        System.out.println("4. 모든 데이터 보기");
        System.out.println("5. 프로그램 종료");
        System.out.print("선택: ");
    }

    public static void main(String[] args) {
        PhoneInfoHandler handler = new PhoneInfoHandler(10);
        int user = 0;

        Scanner sc = new Scanner(System.in);

        while (user != 5) {
            printUI();
            user = sc.nextInt();
            sc.nextLine();

            switch (user) {
                case 1:
                    handler.addPhone();
                    break;
                case 2:
                    System.out.println("데이터 검색을 시작합니다.");
                    System.out.print("이름: ");
                    String searchName = sc.nextLine();
                    handler.searchDataByName(searchName);
                    break;
                case 3:
                    System.out.println("데이터 삭제를 시작합니다.");
                    System.out.print("이름: ");
                    String deleteName = sc.nextLine();
                    handler.deleteDataByName(deleteName);
                    break;
                case 4:
                    System.out.println("모든 데이터를 출력합니다.");
                    handler.showAllData();
                    break;
            }
        }
    }
}*/
