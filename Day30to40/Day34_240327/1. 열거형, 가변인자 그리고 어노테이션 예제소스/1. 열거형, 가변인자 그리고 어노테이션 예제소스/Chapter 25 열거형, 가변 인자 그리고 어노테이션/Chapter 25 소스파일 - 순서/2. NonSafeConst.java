interface Animal 	//interface안의 변수는 다 상수
{
   int DOG = 1;  
   int CAT = 2; 
}

interface Person {
   int MAN = 1;
   int WOMAN = 2;
}

class NonSafeConst {
    public static void main(String[] args) {
        // 정상적인 메소드 호출
        who(Person.MAN);

        // 비정상적 메소드 호출
	who(Animal.DOG);
    }
	
    public static void who(int man) {
        switch(man) {
        case Person.MAN:
            System.out.println("남성 손님입니다.");
            break;
        case Person.WOMAN:
            System.out.println("여성 손님입니다.");
            break;
        }
    }
}

/*
Person.MAN 도 값이 1이고 Animal.DOG도 값이 1이기 때문에,
위와 같은 실수를 범해도 컴파일 오류는 물론 실행 오류도 발생하지
않는다.
*/