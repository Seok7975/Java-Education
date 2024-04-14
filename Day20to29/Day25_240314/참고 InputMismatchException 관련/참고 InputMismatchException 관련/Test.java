import java.util.InputMismatchException;
import java.util.Scanner;

// sc.next() 주석을 넣고 실행해보고, 빼고 실행해보자.
public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("숫자 입력");
			try {
				int num = sc.nextInt();
				
			} catch (InputMismatchException e) {
				System.out.println("잘못된 값 입력 다시 입력하세요.");
//				sc.next();
			}
		}
	}
}
/*
입력과 커서의 위치를 잘 생각하면 이해할수 있다.
사용자의 입력을 '3' 이라고 할때 현재 입력되고 있는 위치의 커서를 _라고 한다면 '_3'이되었다가 sc.nextInt()를 호출하게 되면 
커서가 3을 만나서 3을 리턴하고 3 다음으로 넘어가게 된다. 즉, '3_' 이렇게 3을 읽고 커서가 다음으로 넘어가게 된다.

근데 만약에 'a'를 입력했다고 치면 '_a'로 시작해서 sc.nextInt()를 호출하면 커서가 a를 만나서 sc.nextInt()가 
exception을 일으키고 catch로 넘어가지만 커서의 이동은 없다. 즉 여전히 '_a'로 되어있고, 
다음 루프를 돌때 여전히 '_a' 이라서 다시 sc.nextInt() 만나고 무한루프를 돌게된다. 
따라서 catch()안에서 sc.next()를 하면 '_a'의 위치였던 커서가 'a_' 이렇게 넘어가게 만들어서 
다음 입력을 받을 수 있게 된다.

지금 소스코드에서 가장 간단한 해결 방법은 그렇게 sc.next()를 catch에 넣는거고, 
그 외 가독성을 높이는 방법으로 sc.nextInt()와 sc.next()를 저렇게 두군데에다가 두지 않고 
사용자 입력을 스트림을 다루는 부분은 한군데에다가 놓고 입력된값을 int로 바꿔서 처리를 할 수 있다.

String userInput = sc.next();
int num = Integer.parseInt(userInput);

로 하고 catch안에는 NumberFormatException를 잡도록 하면 문자 입력에 대한 처리가 된다. 
또는 성능을 개선하는 방법으로 아예 exception이 일어나지 않도록 하는 접근법도 있겠다.
*/