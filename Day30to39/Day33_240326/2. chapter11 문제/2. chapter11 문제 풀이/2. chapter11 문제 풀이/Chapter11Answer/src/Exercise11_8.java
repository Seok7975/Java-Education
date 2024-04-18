////[11-8] 문제 11-7의 Student클래스에 총점 (total)과 전교등수 (schoolRank)를 저장하기    
////위한 인스턴스변수를 추가하였다. Student클래스의 기본정렬을 이름 (name)이 아닌 총점
////(total)을 기준으로 한 내림차순으로 변경한 다음, 총점을 기준으로 각 학생의 전교등수
////를 계산하고 전교등수를 기준으로 오름차순 정렬하여 출력하시오.
//
////[실행결과] 
////홍길동,1,3,100,100,100,300,100.0,1
////김자바,1,2,80,80,90,250,83.3,2
////안자바,2,2,60,100,80,240,80.0,3
////남궁성,1,1,90,70,80,240,80.0,3
////이자바,2,1,70,90,70,230,76.7,5
//
//
//import java.util.*;
//class Student implements Comparable<Student> {
//	String name;
//	int ban;
//	int no;
//	int kor;
//	int eng;
//	int math;
//	int total; // 총점
//	int schoolRank; // 전교등수
//	Student(String name, int ban, int no, int kor, int eng, int math) {
//		this.name = name;
//		this.ban = ban;
//		this.no = no;
//		this.kor = kor;
//		this.eng = eng;
//		this.math = math;
//		
//		total = kor+eng+math;
//	}
//	int getTotal() {
//		return total;
//	}
//	float getAverage() {
//		return (int)((getTotal()/ 3f)*10+0.5)/10f;
//	}
//	public int compareTo(Student o) {
//		return o.total- total;	
//	public String toString() {
//		return name
//				+","+ban
//				+","+no
//				+","+kor
//				+","+eng
//				+","+math
//				+","+getTotal()
//				+","+getAverage()
//				+","+schoolRank // 새로추가
//				;
//	}
//} // class Student
//class Exercise11_8 {
//	public static void calculateSchoolRank(List<Student> list) {
//		Collections.sort(list); //  먼저 list를 총점기준 내림차순으로 정렬한다.
//		
//		int prevRank = -1; // 이전 전교등수
//		int prevTotal = -1; // 이전 총점
//		int rank = 1;
//		for(Student stu : list) {
//			if(stu.getTotal() == prevTotal) stu.schoolRank = prevRank; //점수가 같으면 등수 같게
//			else stu.schoolRank = rank;
//			rank++;
//			prevRank = stu.schoolRank;
//			prevTotal = stu.getTotal();
//		}
//	}
//	public static void main(String[] args) {
//		ArrayList<Student> list = new ArrayList<Student>();
//		list.add(new Student("이자바",2,1,70,90,70)); 
//		list.add(new Student("안자바",2,2,60,100,80)); 
//		list.add(new Student("홍길동",1,3,100,100,100)); 
//		list.add(new Student("남궁성",1,1,90,70,80)); 
//		list.add(new Student("김자바",1,2,80,80,90)); 
//		calculateSchoolRank(list);
//		Iterator<Student> it = list.iterator();
//		while(it.hasNext())
//			System.out.println(it.next());
//	}
//}