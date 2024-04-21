enum Scale {
   DO, RE, MI, FA, SO, RA, TI
}

class SimpleEnum {
    public static void main(String[] args) {
        Scale sc = Scale.DO;
        System.out.println(sc);

        switch(sc) {
        case DO:
            System.out.println("도~ ");
            break;
        case RE:
            System.out.println("레~ ");
            break;
        case MI:
            System.out.println("미~ ");
            break;
        case FA:
            System.out.println("파~ ");
            break;
        default:
            System.out.println("솔~ 라~ 시~ ");
        }
    }
}

/*
	앞서 보인 문제점의 해결을 위해서 자바 5에서 열거형이 소개되었다.
	
	enum Scale {
	   DO, RE, MI, FA, SO, RA, TI
	}
	
	이는 열거형 Scale의 정의이다. 그리고 그 안에 위치한 이름들을
	가리켜 '열거형 값'이라 한다.(정확한 명칭은 'Enumerated Values'
	이다.)
	열거형은 클래스와 성격이 유사하다. 따라서 다음과 같이 참조변수의
	선언도 가능하다. 단 이렇게 선언된 참조변수는 해당 열거형 내에 선언된
	'열거형 값'만 대입이 가능하다.
	
	Scale sc = Scale.DO;
	
	기본적으로 '열거형 값'은 Scale.DO와 같이 표현하지만, case문에서는
	표현의 간결함을 위해 Do와 같이 '열거형 값'의 이름만 명시하기로 약속되어
	있다.
*/