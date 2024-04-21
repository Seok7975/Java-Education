//class QueueEx1 {
//	static Queue q = new LinkedList();
//	static final int MAX_SIZE = 5;	// Queue에 최대 5개까지만 저장되도록 한다.
//}
//
//실행 결과
//
///////////////////////////////////////////////////////////////////////
//
//help를 입력하면 도움말을 볼 수 있습니다.
//>>help
// help - 도움말을 보여줍니다.
// q 또는 Q - 프로그램을 종료합니다.
// history - 최근에 입력한 명령어를 5개 보여줍니다.
//>>dir
//dir
//>>cd
//cd
//>>mkdir
//mkdir
//>>dir
//dir
//>>history
//1.dir
//2.cd
//3.mkdir
//4.dir
//5.history
//>>q
//
///////////////////////////////////////////////////////////////////////
//
//이 문제는 유닉스의 history 명령어를 Queue를 이용해서 구현한 것이다. history 명령어는
//사용자가 입력한 명령어의 이력을 순서대로 보여 준다. 여기서는 최근 5개의 명령어만을
//보여주도록 하였다.
// 대부분의 프로그램이 최근에 열어 본 문서들의 목록을 보여 주는 기능을 제공하는데, 이
//기능도 위의 문제를 응용하면 쉽게 구현할 수 있을 것이다.

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

class QueueEx1 {
    static Queue q = new LinkedList();
    static final int MAX_SIZE = 5; // Queue에 최대 5개까지만 저장되도록 한다.

    public static void main(String[] args) {
        System.out.println("help를 입력하면 도움말을 볼 수 있습니다");

        while (true) {
            System.out.println(">>");

            try {
                Scanner sc = new Scanner(System.in);
                String input = sc.nextLine().trim();
                if ("".equals(input)) continue;

                if (input.equalsIgnoreCase("q")) {
                    System.exit(0);
                }
                else if (input.equalsIgnoreCase("help")) {
                    System.out.println(" help - 도움말을 보여줍니다.");
                    System.out.println(" q 또는 Q - 프로그램을 종료합니다.");
                    System.out.println(" history - 최근에 입력한 명령어를 " + MAX_SIZE + "개 보여줍니다.");
                }
                else if (input.equalsIgnoreCase("history")) {

                    int i = 0;
                    save(input);

                    LinkedList tmp = (LinkedList) q;
                    ListIterator it = tmp.listIterator();

                    while (it.hasNext()) {
                        System.out.println(++i + "." + it.next());
                    }
                }
                else {
                    save(input);
                    System.out.println(input);
                }
            }

            catch (Exception e) {
                System.out.println("입력오류입니다.");
            }
        }
    }

    public static void save(String input) {
        if(!"".equals(input)) {
            q.offer(input);
        }

        if(q.size() > MAX_SIZE) {
            q.remove();
        }
    }
}