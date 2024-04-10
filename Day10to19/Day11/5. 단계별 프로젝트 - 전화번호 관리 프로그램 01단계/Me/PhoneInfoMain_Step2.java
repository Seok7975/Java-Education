/*
단계별 프로젝트 2단계
(
전화번호 관리 프로그램 01단계 문제
클래스를 하나 정의하자. 클래스의 이름은 PhoneInfo이다. 그리고 이 클래스에는 다음의 데이터들이 문자열의 형태로 저장 가능해야 하며, 저장된 데이터의 적절한 출력이 가능하도록 메소드도 정의되어야 한다.
*이름 name String
*전화번호 phoneNumber String
*생년월일 birthday String
)

선택하세요...
1. 데이터 입력
2. 프로그램 종료
선택 : 1
이름 : 홍길동
전화번호 : 222 - 3333
생년월일 : 99년 12월25일생
입력이 완료됐습니다.

입력된 정보 출력...
name : 홍길동
phone : 222-3333
birth : 99년 12월25일생

선택하세요...
1. 데이터 입력
2. 프로그램 종료
선택 :  2

프로그램을 종료합니다.
*/

import java.util.Scanner;
class PhoneInfo
{
	private String name;
	private String phoneNumber;
	private String birthday;
	public PhoneInfo(String name, String phoneNumber, String birthday)
	{
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birthday = birthday;
	}

	public void printPhoneInfo()
	{
		System.out.printf("name : %s\n", this.name);
		System.out.printf("phone : %s\n", this.phoneNumber);
		System.out.printf("birth : %s\n", this.birthday);
	}
}

class PhoneInfoMain_Step2
{
	public static void main(String[] args)
	{
		System.out.printf("선택하세요...\n");
		System.out.printf("1. 데이터 입력 \n");
		System.out.printf("2. 프로그램 종료\n");
		Scanner sc = new Scanner(System.in);
		int getStart = sc.nextInt();
		if (getStart ==2 ) 
		{
			System.out.printf("선택 : %d\n", getStart);
			System.out.printf("프로그램을 종료합니다.");
			return;
		}
		
		else if (getStart<1 || getStart >2)
		{
			System.out.printf("잘못입력하셨습니다.");
			return;
		}

		else
		{
			System.out.printf("선택 : %d\n", getStart);

			Scanner information1 = new Scanner(System.in, "EUC-KR");  // Window에서 입력받은 한글 깨질때;
			System.out.printf("이름 입력\n");
			String name = information1.nextLine();
			
			Scanner information2 = new Scanner(System.in);
			System.out.printf("핸드폰번호 입력\n");
			String phoneNumber = information2.nextLine();
			
			Scanner information3 = new Scanner(System.in);
			System.out.printf("생일 입력\n");
			String birthday = information3.nextLine();

			PhoneInfo sc2 = new PhoneInfo(name, phoneNumber, birthday);
			sc2.printPhoneInfo();		

		}

	}
}