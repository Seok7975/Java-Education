class StringEquals
{
    public static void main(String[] args)
    {
        //new 연산자를 이용한 방식
        String str1=new String("Hi my string");
        String str2=new String("Hi my string");

        //리터럴을 이용한 방식
		//String str1="Hi my string";		//== -> 동일하다, equals -> 동일하다
		//String str2="Hi my string";


        if(str1==str2)
            System.out.println("참조 대상이 동일하다.");
        else
            System.out.println("참조 대상이 동일하지 않다.");

        if(str1.equals(str2))	//Object 클래스의 메소드를 오버라이딩
            System.out.println("인스턴스 내용이 동일하다.");
        else
            System.out.println("인스턴스 내용이 동일하지 않다.");
    }
}

//<출력결과>
//1. 참조 대상이 동일하지 않다.
//  ( == : 객체의 주소값을 비교, Primitive Type의 객체는 값 비교 가능, Reference Type 객체는 주소를 비교)
//  Primitive Type의 객체는 Constant Pool의 특정한 값을 참조하는 변수이기에, 결국 Constant Pool내의 동일한 주소를 비교합니다.
//  (해당 주소가 동일하기에 ==을 사용해서 비교가 가능)
//2. 인스턴스 내용이 동일하다.    (String클래스의 a.equals(b) : 객체의 비교하는 두 대상의 데이터값을 비교)

// 주의)
//Object클래스의 equals()는 ==와 동일하게 주소값을 비교하는 메소드

/*
String은 일반적인 타입이 아니라 클래스
클래스는 기본적으로 Call by Reference형태로 객체 생성 시 주소값이 부여됩니다.
그렇기에 String 타입을 선언했을때는 같은 값을 부여하더라도 서로의 주소값이 다릅니다.
 */


//cf)https://velog.io/@ilil1/%EC%9E%90%EB%B0%94%EC%97%90%EC%84%9C-equals%EC%99%80-%EC%9D%98-%EC%B0%A8%EC%9D%B4