/*
[8-9] 다음과 같은 조건의 예외클래스를 작성하고 테스트하시오.
        [참고] 생성자는 실행결과를 보고 알맞게 작성해야한다.

* 클래스명 : UnsupportedFuctionException
* 조상클래스명 : RuntimeException
* 멤버변수 :
    이 름 : ERR_CODE
    저장값 : 에러코드
    타 입 : int
    기본값 : 100
    제어자 : final private

* 메서드 :
1.메서드명 : getErrorCode
    기 능 : 에러코드(ERR_CODE)를 반환한다.
    반환타입 : int
    매개변수 : 없음
    제어자 : public

2.메서드명 : getMessage
기 능 : 메세지의 내용을 반환한다.(Exception클래스의 getMessage()를 오버라이딩.)
반환타입 : String
매개변수 : 없음
제어자 : public*/

class Ch8_9
{
    public static void main(String[] args) throws Exception // unchecked 예외라 써도 그만 안써도 그만
    {
        try
        {
            throw new UnsupportedFunctionException("지원하지 않는 기능입니다.", 70);  //던지고
        }
        catch(UnsupportedFunctionException g)   //받고
        {
            System.out.println("에러 코드: " + g.getErrorCode());
            System.out.println("에러 메시지: " + g.getMessage());
        }
    }
}

class UnsupportedFunctionException extends RuntimeException
{
    final private int ERR_CODE;

    public UnsupportedFunctionException(String message, int errorCode)  //던지는중~
    //첫번째 생성자
    {
        super(message); //생성자로 상위 클래스를 호출
        ERR_CODE = errorCode;
    }

    public UnsupportedFunctionException(String message)
    //현재 클래스의 첫번째 생성자를 호출하는데, 여기서는 첫 번째 생성자를 호출
    //두번째 생성자
    {
        this(message, 100);
    }

    public int getErrorCode()
    {
        return ERR_CODE;
    }



    public String getMessage()
    {
        return super.getMessage();
    }

}