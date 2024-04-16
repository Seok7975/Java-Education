import java.util.*;

public class StackEx1 {
	public static Stack back    = new Stack();
	public static Stack forward = new Stack();  

	public static void main(String[] args) {
		goURL("1.네이트");
		goURL("2.야후");
		goURL("3.네이버");
		goURL("4.다음");

		printStatus();
		// back:[1.네이트, 2.야후, 3.네이버, 4.다음]
		// forward:[]
		// 현재화면은 '4.다음' 입니다.		

		goBack();
		System.out.println("= 뒤로가기 버튼을 누른 후 =");  
		printStatus();
		// = 뒤로가기 버튼을 누른 후 =
		// back:[1.네이트, 2.야후, 3.네이버]
		// forward:[4.다음]
		// 현재화면은 '3.네이버' 입니다.

		goBack();
		System.out.println("= '뒤로' 버튼을 누른 후 =");  
		printStatus();
		// = '뒤로' 버튼을 누른 후 =
		// back:[1.네이트, 2.야후]
		// forward:[4.다음, 3.네이버]
		// 현재화면은 '2.야후' 입니다.

		goForward();
		System.out.println("= '앞으로' 버튼을 누른 후 =");  
		printStatus();
		// = '앞으로' 버튼을 누른 후 =
		// back:[1.네이트, 2.야후, 3.네이버]
		// forward:[4.다음]
		// 현재화면은 '3.네이버' 입니다.

		goURL("codechobo.com");
		System.out.println("= 새로운 주소로 이동 후 =");  
		printStatus();
		// = 새로운 주소로 이동 후 =
		// back:[1.네이트, 2.야후, 3.네이버, codechobo.com]
		// forward:[]
		// 현재화면은 'codechobo.com' 입니다.
	}

	public static void printStatus() {
		System.out.println("back:"+back);
		System.out.println("forward:"+forward);
		System.out.println("현재화면은 '" + back.peek()+"' 입니다.");  
		System.out.println();
	}

	public static void goURL(String url){
		back.push(url);
		if(!forward.empty()) 
			forward.clear();
	}

	public static void goForward(){
		if(!forward.empty())
			back.push(forward.pop());
	}

	public static void goBack(){
		if(!back.empty())
			forward.push(back.pop());
	}
}

/*
스택과 큐의 활용
스택의 활용 예 - 수식계산, 수식괄호검사, 워드프로세서의 undo/redo,
	웹프라우저의 뒤로/앞으로
큐의 활용 예 - 최근사용문서, 인쇄작업 대기목록, 버퍼(buffer)
*/