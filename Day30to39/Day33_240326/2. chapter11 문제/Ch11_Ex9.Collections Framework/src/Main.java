//[11-9]
//문제 11-8의 Student클래스에 반등수(classRank)를 저장하기 위한 인스턴스변수
//를 추가하였다. 반등수를 계산하고 반과 반등수로 오름차순 정렬하여 결과를 출력하시오.
//(1)~(2)에 알맞은 코드를 넣어 완성하시오.


import java.util.*;

class Student implements Comparable<Student>
{
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;
    int total; // 총점
    int schoolRank; // 전교등수
    int classRank;

    Student(String name, int ban, int no, int kor, int eng, int math)
    {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        total = kor + eng + math;
    }

    int getTotal()
    {
        return total;
    }

    float getAverage()
    {
        return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
    }

/*    public int compareTo(Object o)
    {

        //case 1
        if (o instanceof Student)
        {
            Student temp = (Student) o;

            return temp.total - this.total; // 총점 내림차순
        } else
        {
            return -1;
        }
    }*/

    //case 2
    public int compareTo(Student s)
    {
        return s.total - total;
        //리턴값이 양수라 생각해보자, 현재 객체의 total이 다른 객체의 total보다 크면
        //양수잖아. 아니면 -1이고 따라서 현재-다른이 내림차순
    }

    public String toString()
    {
        return name
                + "," + ban
                + "," + no
                + "," + kor
                + "," + eng
                + "," + math
                + "," + getTotal()
                + "," + getAverage()
                + "," + schoolRank
                + "," + classRank// 새로추가
                ;
    }
} // class Student

class classTotalComparator implements Comparator<Student>
{
/*    //case1
    public int compare(Object o1, Object o2)
    {
        Student s1 = (Student) o1;
        Student s2 = (Student) 02;

        int result = s1.ban - s2.ban; // 반 기준 오름차순

        if(result == 0)
        {
            result = s2.total - s1.total; //총점 기준 내림차순
        }
        return result;
    }*/
    //case2
    public int compare(Student s1, Student s2)
    {
        int result = s1.ban - s2.ban; // 반 기준 오름차순
        return result != 0 ? s1.ban - s2.ban : s2.total - s1.total;
        //반이 같으면 총점으로 내림차순
    }
}

class Exercise11_9
{
    public static void calculateSchoolRank(List<Student> list)
    {
        Collections.sort(list); // list . 먼저 를 총점기준 내림차순으로 정렬한다
        int prevBan = -1;
        int prevRank = -1; // 이전 전교등수
        int prevTotal = -1; // 이전 총점
        int length = list.size();


        for(int i=0, n=0; i<length; i++, n++)
        {
            Student s = (Student)list.get(i);

            if(s.ban != prevBan)
            {
                prevRank = -1;
                prevTotal = -1;
                n = 0;
            }

            if(s.total == prevTotal)
            {
                s.classRank = prevRank;
            }
            else
            {
                s.classRank = n + 1;
            }

            prevBan = s.ban;
            prevRank = s.classRank;
            prevTotal = s.total;
        }

    }

    public static void main(String[] args)
    {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("이자바", 2, 1, 70, 90, 70));
        list.add(new Student("안자바", 2, 2, 60, 100, 80));
        list.add(new Student("홍길동", 1, 3, 100, 100, 100));
        list.add(new Student("남궁성", 1, 1, 90, 70, 80));
        list.add(new Student("김자바", 1, 2, 80, 80, 90));
        calculateSchoolRank(list);
        Iterator it = list.iterator();
        while (it.hasNext())
            System.out.println(it.next());
    }
}
