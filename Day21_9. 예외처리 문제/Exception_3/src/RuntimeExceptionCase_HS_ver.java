/*
3. 예외 상황을 알리는 클래스
* 배열의 접근에 잘못된 인덱스 값을 사용하는 예외상황 - 
* 허용할 수 없는 형변환 연산을 진행하는 예외상황 - 
* 배열선언 과정에서 배열의 크기를 음수로 지정하는 예외상황 - 
* 참조변수가 null로 초기화 된 상황에서 메소드를 호출하는 예외상황 - 
*/

class RuntimeExceptionCase_HS_ver
{
    public static void main(String[] args)
    {
        try //배열의 접근에 잘못된 인덱스 값을 사용하는 예외상황
        {
            int[] arr = new int[3];
            arr[-1] = 20;
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }

        try // 허용할 수 없는 형변환 연산을 진행하는 예외상황
        {
            Object obj = new int[10];
            String str = (String)obj;
        }
        catch(ClassCastException e)
        {
            System.out.println(e.getMessage());
        }

        try // 배열선언 과정에서 배열의 크기를 음수로 지정하는 예외상황
        {
            int[] arr = new int[-10];
        }
        catch(NegativeArraySizeException e)
        {
            System.out.println(e.getMessage());
        }

        try // 참조변수가 null로 초기화 된 상황에서 메소드를 호출하는 예외상황
        {
            String str = null;
            int len = str.length();
        }
        catch(NullPointerException e)
        {
            System.out.println(e.getMessage());
        }
    }
}