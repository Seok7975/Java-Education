//6_4 Student클래스에 다음과 같이 정의된 두 개의 메서드
// getTotatl()과 getAverage()를 추가하시오.


class Ch6_3to5
{
    public static void main(String args[])
    {
        System.out.println("Ch6_3,4");
        Student s = new Student();
        s.name = "홍길동";
        s.ban = 1;
        s.no = 1;
        s.kor = 100;
        s.eng = 60;
        s.math = 76;

        System.out.println("이름 : " + s.name);
        System.out.println("총점 : " + s.getTotal());
        System.out.println("평균 : " + s.getAverage());
        System.out.print("\n\n");
        //////////////////////////////////////////////////////////////
        System.out.println("Ch6_5");
        Student2 s2 = new Student2("홍길동", 1, 1, 100, 60, 76);
        s2.info();
    }
}

class Student
{
    String name ; //이름
    int ban ; // 몇반
    int no ; // 번호
    int kor ; //국어점수
    int eng ; //영어점수
    int math ; //수학점수

    int getTotal()
    {
        return kor+eng+math;
    }

    float getAverage()
    {
        float average = (getTotal()/3f);
        //float average = (float)(getTotal()/3);
        //float average = (getTotal()/3.0f);

        average = Math.round(average * 10) / 10.0f;
        //소수 첫째자리까지 반올림
        //123.4567 -> 1234.567 -> 1235 -> 123.5

        return average;
    }
}

class Student2 //생성자 생성
{
    private String name ; //이름
    private int ban ; // 몇반
    private int no ; // 번호
    private int kor ; //국어점수
    private int eng ; //영어점수
    private int math ; //수학점수

    public Student2(String name, int ban, int no, int kor, int eng, int math)
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
        float average = (getTotal()/3f);
        //float average = (float)(getTotal()/3);
        //float average = (getTotal()/3.0f);

        average = Math.round(average * 10) / 10.0f;
        //소수 첫째자리까지 반올림
        //123.4567 -> 1234.567 -> 1235 -> 123.5
        return average;
    }

    public void info()
    {

        System.out.printf("%s, %d, %d, %d, %d, %d, %d, %.1f\n", name, ban, no, kor, eng, math, getTotal(), getAverage());
        //printf는 특이하게 리턴값에 이미 반올림을 했어도 자릿수 맞춰서 출력해야되네
        System.out.println(getAverage()); //print는 자릿수 맞춘 반환값 그대로
    }
}
