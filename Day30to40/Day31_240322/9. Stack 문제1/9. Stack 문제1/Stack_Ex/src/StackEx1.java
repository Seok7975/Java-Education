//실행 결과가 다음과 같이 나오도록 소스코드를 완성해 보자.
// ctrl + z => Last In First Out => Stack
//
//back:[1.네이트, 2.야후, 3.네이버, 4.다음]
//forward:[]
//현재화면은 '4.다음' 입니다.
//
//= 뒤로가기 버튼을 누른 후 =
//back:[1.네이트, 2.야후, 3.네이버]
//forward:[4.다음]
//현재화면은 '3.네이버' 입니다.
//
//= '뒤로' 버튼을 누른 후 =
//back:[1.네이트, 2.야후]
//forward:[4.다음, 3.네이버]
//현재화면은 '2.야후' 입니다.
//
//= '앞으로' 버튼을 누른 후 =
//back:[1.네이트, 2.야후, 3.네이버]
//forward:[4.다음]
//현재화면은 '3.네이버' 입니다.
//
//= 새로운 주소로 이동 후 =
//back:[1.네이트, 2.야후, 3.네이버, codechobo.com]
//forward:[]
//현재화면은 'codechobo.com' 입니다.


//스택 자료구조를 구현할 때 push와 pop은 필수요소
//peek : 스택에 가장 위 element 반환 -> 현재 화면

import java.util.*;

public class StackEx1
{
    public static Stack back    = new Stack();
    public static Stack forward = new Stack();

    public static void main(String[] args)
    {
        goURL("1.네이트");
        goURL("2.야후");
        goURL("3.네이버");
        goURL("4.다음");

        printStatus();
        // back:[1.네이트, 2.야후, 3.네이버, 4.다음]
        // forward:[]
        // 현재화면은 '4.다음' 입니다.

        System.out.println("\n");
        goBack();
        System.out.println("= 뒤로가기 버튼을 누른 후 =");
        printStatus();
        // = 뒤로가기 버튼을 누른 후 =
        // back:[1.네이트, 2.야후, 3.네이버]
        // forward:[4.다음]
        // 현재화면은 '3.네이버' 입니다.

        System.out.println("\n");
        goBack();
        System.out.println("= '뒤로' 버튼을 누른 후 =");
        printStatus();
        // = '뒤로' 버튼을 누른 후 =
        // back:[1.네이트, 2.야후]
        // forward:[4.다음, 3.네이버]
        // 현재화면은 '2.야후' 입니다.

        System.out.println("\n");
        goForward();
        System.out.println("= '앞으로' 버튼을 누른 후 =");
        printStatus();
        // = '앞으로' 버튼을 누른 후 =
        // back:[1.네이트, 2.야후, 3.네이버]
        // forward:[4.다음]
        // 현재화면은 '3.네이버' 입니다.

        System.out.println("\n");
        goURL("codechobo.com");
        System.out.println("= 새로운 주소로 이동 후 =");
        printStatus();
        // = 새로운 주소로 이동 후 =
        // back:[1.네이트, 2.야후, 3.네이버, codechobo.com]
        // forward:[]
        // 현재화면은 'codechobo.com' 입니다.
    }

    public static void goBack()
    {
        if(!back.empty())
        {
            forward.push(back.pop());
        }
    }

    public static void goForward()
    {
        if(!forward.empty())
        {
            back.push(forward.pop());
        }
    }
    public static void printStatus()
    {
        System.out.println("back : " + back);
        System.out.println("foward : " + forward);
        System.out.println("현재화면은 '" + back.peek() + "' 입니다."); //가장 위에 있는거 반환

    }

    public static void goURL(String url)
    {
        back.push(url);
        if(!forward.empty())
        {
            back.push(forward.pop());
        }
    }
}