////[11-9] 문제11-8의 Student클래스에 반등수(classRank)를 저장하기 위한 인스턴스변수   
////를 추가하였다 반등수를 계산하고 반과 반등수로 오름차순 정렬하여 결과를 출력하시오.
////(1)~(2)에 알맞은 코드를 넣어 완성하시오. 
////
////[실행결과] 
////홍길동,1,3,100,100,100,300,100.0,1,1
////김자바,1,2,80,80,90,250,83.3,2,2
////남궁성,1,1,90,70,80,240,80.0,3,3
////안자바,2,2,60,100,80,240,80.0,3,1
////이자바,2,1,70,90,70,230,76.7,5,2
//
//import java.util.*;
//class Student implements Comparable<Student> {
//	String name;
//	int ban;
//	int no;
//	int kor;
//	int eng;
//	int math;
//	int total;
//	int schoolRank; // 전교등수
//	int classRank; // 반등수
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
//				+","+classRank // 새로추가
//				;
//	}
//} // class Student
//class ClassTotalComparator implements Comparator<Student> {
//
//	@Override
//	public int compare(Student o1, Student o2) {
//		return o1.ban - o2.ban == 0? o2.total - o1.total : o1.ban - o2.ban;
//	}
//}
//class Exercise11_9 {
//	public static void calculateClassRank(List<Student> list) {
//		// . 먼저 반별 총점기준 내림차순으로 정렬한다
//		Collections.sort(list, new ClassTotalComparator());
//		int prevBan = -1;
//		int prevRank = -1;
//		int prevTotal = -1;
//		int length = list.size();
//
//		for(int i=0, n=0; i < length; i++, n++) {
//			Student s = (Student)list.get(i);
//
//			if(s.ban!=prevBan) {
//				prevRank = -1;
//				prevTotal = -1;
//				n = 0;
//			}
//
//			if(s.total==prevTotal) {
//				s.classRank = prevRank;
//			} else {
//
//				s.classRank = n + 1;
//			}
//			prevBan = s.ban;
//			prevRank = s.classRank;
//			prevTotal = s.total;
//		} // public static void calculateClassRank(List list) {
//	}
//
//	public static void calculateSchoolRank(List<Student> list) {
//		Collections.sort(list); //  먼저 list를 총점기준 내림차순으로 정렬한다.
//
//		int prevRank = -1; // 이전 전교등수
//		int prevTotal = -1; // 이전 총점
//		int rank = 1;
//		for(Student stu : list) {
//			if(stu.getTotal() == prevTotal) stu.schoolRank = prevRank;
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
//		calculateClassRank(list);
//		Iterator<Student> it = list.iterator();
//		while(it.hasNext())
//			System.out.println(it.next());
//	}
//}