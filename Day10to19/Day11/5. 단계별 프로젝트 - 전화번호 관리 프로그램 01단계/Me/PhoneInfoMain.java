
/*
전화번호 관리 프로그램 01단계 문제
클래스를 하나 정의하자. 클래스의 이름은 PhoneInfo이다. 
그리고 이 클래스에는 다음의 데이터들이 문자열의 형태로 저장 가능해야 하며, 
저장된 데이터의 적절한 출력이 가능하도록 메소드도 정의되어야 한다.
*이름 name String
*전화번호 phoneNumber String
*생년월일 birthday String
단 생년월일 정보는 저장을 할 수도, 저장하지 않을 수도 있게끔 생성자를 정의하자.
그리고 정의된 클래스의 확인을 위한 main 메소드도 간단히 정의하자.
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
		System.out.printf("이름 : %s\n", this.name);
		System.out.printf("전화번호 : %s\n", this.phoneNumber);
		System.out.printf("생년월일 : %s\n", this.birthday);
	}
}

class PhoneInfoMain
{
	public static void main(String[] args)
	{
		PhoneInfo sc = new PhoneInfo("박홍석", "010-1234-5678", "941234");
		sc.printPhoneInfo();
	}
}