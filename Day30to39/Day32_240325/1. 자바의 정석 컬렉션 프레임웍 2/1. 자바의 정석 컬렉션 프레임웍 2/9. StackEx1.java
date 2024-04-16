import java.util.*;

public class StackEx1 {
	public static Stack back    = new Stack();
	public static Stack forward = new Stack();  

	public static void main(String[] args) {
		goURL("1.����Ʈ");
		goURL("2.����");
		goURL("3.���̹�");
		goURL("4.����");

		printStatus();
		// back:[1.����Ʈ, 2.����, 3.���̹�, 4.����]
		// forward:[]
		// ����ȭ���� '4.����' �Դϴ�.		

		goBack();
		System.out.println("= �ڷΰ��� ��ư�� ���� �� =");  
		printStatus();
		// = �ڷΰ��� ��ư�� ���� �� =
		// back:[1.����Ʈ, 2.����, 3.���̹�]
		// forward:[4.����]
		// ����ȭ���� '3.���̹�' �Դϴ�.

		goBack();
		System.out.println("= '�ڷ�' ��ư�� ���� �� =");  
		printStatus();
		// = '�ڷ�' ��ư�� ���� �� =
		// back:[1.����Ʈ, 2.����]
		// forward:[4.����, 3.���̹�]
		// ����ȭ���� '2.����' �Դϴ�.

		goForward();
		System.out.println("= '������' ��ư�� ���� �� =");  
		printStatus();
		// = '������' ��ư�� ���� �� =
		// back:[1.����Ʈ, 2.����, 3.���̹�]
		// forward:[4.����]
		// ����ȭ���� '3.���̹�' �Դϴ�.

		goURL("codechobo.com");
		System.out.println("= ���ο� �ּҷ� �̵� �� =");  
		printStatus();
		// = ���ο� �ּҷ� �̵� �� =
		// back:[1.����Ʈ, 2.����, 3.���̹�, codechobo.com]
		// forward:[]
		// ����ȭ���� 'codechobo.com' �Դϴ�.
	}

	public static void printStatus() {
		System.out.println("back:"+back);
		System.out.println("forward:"+forward);
		System.out.println("����ȭ���� '" + back.peek()+"' �Դϴ�.");  
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
���ð� ť�� Ȱ��
������ Ȱ�� �� - ���İ��, ���İ�ȣ�˻�, �������μ����� undo/redo,
	����������� �ڷ�/������
ť�� Ȱ�� �� - �ֱٻ�빮��, �μ��۾� �����, ����(buffer)
*/