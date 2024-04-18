//[11-5] 다음에 제시된 Student클래스가 Comparable인터페이스를
//구현하도록 변경해서 이름(name)이 기본 정렬기준이 되도록 하시오.

//[실행결과]
//김자바,1,3,80,80,90,250,83.3
//남궁성,1,2,90,70,80,240,80.0
//안자바,1,5,60,100,80,240,80.0
//이자바,1,4,70,90,70,230,76.7
//홍길동,1,1,100,100,100,300,100.0

//Comparable Interface -> compareTo(Object o) -> Collections.sort(Collections c)

//모르겠당
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Student implements Comparable<Student>
{
    String name;
    int ban;
    int no;
    int kor, eng, math;
    Student(String name, int ban, int no, int kor, int eng, int math)
    {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
    int getTotal()
    {
        return kor+eng+math;
    }
    float getAverage()
    {
        return (int)((getTotal()/ 3f)*10+0.5)/10f;
    }

    @Override
    public int compareTo(Student o)
    {
        return this.name.compareTo(o.name);
    }

    public String toString()
    {
        return name +","+ban +","+no +","+kor +","+eng +","+math
                +","+getTotal() +","+getAverage();
    }
}
class Exercise11_5
{
    public static void main(String[] args)
    {
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student("홍길동",1,1,100,100,100));
        list.add(new Student("남궁성",1,2,90,70,80));
        list.add(new Student("김자바",1,3,80,80,90));
        list.add(new Student("이자바",1,4,70,90,70));
        list.add(new Student("안자바",1,5,60,100,80));
        Collections.sort(list); //compareTo()에서 기준에 맞게 정렬
        Iterator<Student> it = list.iterator();
        while(it.hasNext())
            System.out.println(it.next());
    }
}
