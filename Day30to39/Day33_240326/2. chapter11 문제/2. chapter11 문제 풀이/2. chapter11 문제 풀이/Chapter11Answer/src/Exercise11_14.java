//[11-14] 다음은 성적처리 프로그램의 일부이다. Scanner클래스를 이용해서 화면으로부
//터 데이터를 입력하고 보여주는 기능을 완성하시오.
//[실행결과] 
//**************************************************
//* * 성적 관리 프로그램
//**************************************************
//1. 학생성적 입력하기
//2. 학생성적 보기
//3. 프로그램 종료
//원하는 메뉴를 선택하세요.(1~3) : 5
//메뉴를 잘못 선택하셨습니다 다시 입력해주세요 . .
//원하는 메뉴를 선택하세요.(1~3) : 2
//====================================================
//데이터가 없습니다.
//====================================================
//**************************************************
//* * 성적 관리 프로그램
//**************************************************
//1. 학생성적 입력하기
//2. 학생성적 보기
//3. 프로그램 종료
//원하는 메뉴를 선택하세요.(1~3) : 1
//1. 학생성적 입력하기
//이름, 반, 번호, 국어성적, 영어성적, 수학성적'의 순서로 공백없이 입력하세요.
//입력을 마치려면 q를 입력하세요. 메인화면으로 돌아갑니다.
//>>
//입력오류입니다 이름, 반, 번호, 국어성적, 영어성적, 수학성적' 의 순서로 입력하세
//요.
//>> 자바짱,1,1,100,100,100 
//잘입력되었습니다. 입력을 마치려면 q를 입력하세요.
//>> 김자바,1,2,80,80,80 
//잘입력되었습니다. 입력을 마치려면 q를 입력하세요.
//>>q
//**************************************************
//*  성적 관리 프로그램                             *
//**************************************************
//1. 학생성적 입력하기
//2. 학생성적 보기
//3. 프로그램 종료
//원하는 메뉴를 선택하세요.(1~3) : 2
//이름 반 번호 국어 영어 수학 총점 평균 전교등수 반등수
//====================================================
//자바짱,1,1,100,100,100,300,100.0,0,0
//김자바,1,2,80,80,80,240,80.0,0,0
//====================================================
//총점: 180 180 180 540
//**************************************************
//* 성적 관리 프로그램                              *
//**************************************************
//1. 학생성적 입력하기
//2. 학생성적 보기
//3. 프로그램 종료
//원하는 메뉴를 선택하세요.(1~3) : 3
//프로그램을 종료합니다.
//import java.io.*;
//import java.util.*;
//
//class Exercise11_14
//{
//	static ArrayList<Student> record = new ArrayList<Student>(); // 성적데이터를 저장할 공간
//	static Scanner s = new Scanner(System.in);
//	public static void main(String args[]) {
//		while(true) {
//			switch(displayMenu()) {
//			case 1 :
//				inputRecord();
//				break;
//			case 2 :
//				displayRecord();
//				break;
//			case 3 :
//				System.out.println("프로그램을 종료합니다."); 
//				System.exit(0);
//			}
//		} // while(true)
//	}
//	// menu를 보여주는 메서드
//	static int displayMenu(){
//		System.out.println("**************************************************");
//		System.out.println("*                성적 관리 프로그램               *"); 
//		System.out.println("**************************************************");
//		System.out.println();
//		System.out.println(" 1. 학생성적 입력하기 "); 
//		System.out.println();
//		System.out.println(" 2. 학생성적 보기"); 
//		System.out.println();
//		System.out.println(" 3. 프로그램 종료"); 
//		System.out.println();
//		System.out.print("원하는 메뉴를 선택하세요.(1~3) : "); 
//		int menu = 0;
//		
//		while(true) {
//			menu = Integer.parseInt(s.nextLine());
//			if(menu>=1 && menu<=3) break;
//			System.out.println("메뉴를 잘못 선택하셨습니다. 다시 입력해주세요.");
//			System.out.print("원하는 메뉴를 선택하세요.(1~3) : "); 
//		}
//		return menu;
//	} // public static int displayMenu(){
//	// 데이터를 입력받는 메서드
//	static void inputRecord() {
//		System.out.println("1. 학생성적 입력하기"); 
//		System.out.println("이름, 반, 번호, 국어성적, 영어성적, 수학성적' 의 순서로 공백없이 입력하세요."); 
//		System.out.println("입력을 마치려면 q를 입력하세요. 메인화면으로 돌아갑니다."); 
//		while(true) {
//			System.out.print(">>");
//			String str = s.nextLine();
//			if(str.equalsIgnoreCase("q")) break;
//			String[] strArr = str.split(",");
//			try {
//				if(record.add(new Student(strArr[0], Integer.parseInt(strArr[1]), Integer.parseInt(strArr[2]), Integer.parseInt(strArr[3]), Integer.parseInt(strArr[4]), Integer.parseInt(strArr[5]))) ) break;
//			} catch (Exception e) {
//				System.out.println("입력오류입니다 이름, 반, 번호, 국어성적, 영어성적, 수학성적' 의 순서로 입력하세요.");
//			}
//
//		} // end of while
//	} // public static void inputRecord() {
//	// 데이터 목록을 보여주는 메서드
//	static void displayRecord() {
//		int koreanTotal = 0;
//		int englishTotal = 0;
//		int mathTotal = 0;
//		int total = 0;
//		int length = record.size();
//		if(length > 0) {
//			System.out.println();
//			System.out.println("이름 반 번호 국어 영어 수학 총점 평균 전교등수 반등수"); 
//			System.out.println("====================================================");
//			for (int i = 0; i < length ; i++) {
//				Student student = record.get(i);
//				System.out.println(student);
//				koreanTotal += student.kor;
//				mathTotal += student.math;
//				englishTotal += student.eng;
//				total += student.total;
//			}
//			System.out.println("====================================================");
//			System.out.println("총점 : "+koreanTotal+" "+englishTotal 
//					+" "+mathTotal+" "+total);
//			System.out.println();
//		} else {
//			System.out.println("====================================================");
//			System.out.println("데이터가 없습니다."); 
//			System.out.println("====================================================");
//		}
//	} // static void displayRecord() {
//}
//class Student implements Comparable<Student> {
//	String name;
//	int ban;
//	int no;
//	int kor;
//	int eng;
//	int math;
//	int total;
//	int schoolRank;
//	int classRank; // 반등수
//	Student(String name, int ban, int no, int kor, int eng, int math) {
//		this.name = name;
//		this.ban = ban;
//		this.no = no;
//		this.kor = kor;
//		this.eng = eng;
//		this.math = math;
//		total = kor+eng+math;
//	}
//	int getTotal() {
//		return total;
//	}
//	float getAverage() {
//		return (int)((getTotal()/ 3f)*10+0.5)/10f;
//	}
//	
//	@Override
//	public int compareTo(Student o) {
//		return o.total - total;
//	}
//	public String toString() {
//		return name
//				+","+ban
//				+","+no
//				+","+kor
//				+","+eng
//				+","+math
//				+","+getTotal()
//				+","+getAverage()
//				+","+schoolRank
//				+","+classRank
//				;
//	}
//} // class Student
