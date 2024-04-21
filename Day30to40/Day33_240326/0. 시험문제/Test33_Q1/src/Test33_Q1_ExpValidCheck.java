//실행 결과
////////////////////////////////////////////////////////////////////////////////
//
//c:\JavaStudy\java ExpValidCheck
//Usage : java ExpValidCheck "EXPRESSION"
//Example : java ExpValidCheck "((2+3)*1)+3"
//
//c:\JavaStudy\java ExpValidCheck\java ExpValidCheck (2+3)*1
//expression:(2+3)*1
//괄호가 일치합니다.
//
//c:\JavaStudy\java ExpValidCheck\java ExpValidCheck (2+3*1
//expression:(2+3*1
//괄호가 일치하지 않습니다.
////////////////////////////////////////////////////////////////////////////////
//
//위와 같은 실행 결과가 나오도록 코딩하시오.
//(입력한 수식의 괄호가 올바른지를 체크하는 예제이다.
//스택을 이용하여 풀어보시오.)

//arguments값 따로 넣고 출력;;

import java.util.EmptyStackException;

import java.util.Stack;

class ExpValidCheck
{
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage : java ExpValidCheck \"EXPRESSION\"");
            System.out.println("Example : java ExpValidCheck \"((2+3)*1)+3\"");
            System.out.println("Example : java ExpValidCheck \"(2+3*1\"");
            System.exit(0);
        }
        
        Stack<String> st = new Stack<>();
        String expression = args[0];


        System.out.println("expression : " + expression);

        try
        {
            for (int i = 0; i < expression.length(); i++) {
                char ch = expression.charAt(i);

                if (ch == '(') {
                    st.push(ch + "");
                }
                else if (ch == ')') {
                        st.pop();
                        //throw new EmptyStackException();
                }
            }
            if (st.isEmpty()) {
                System.out.println("괄호가 일치합니다.");
            }
            else {
                System.out.println("괄호가 일치하지 않습니다.");
            }
        }
        catch(EmptyStackException e)
        {
                System.out.println("괄호가 일치하지 않습니다.");
        }

    }
}
