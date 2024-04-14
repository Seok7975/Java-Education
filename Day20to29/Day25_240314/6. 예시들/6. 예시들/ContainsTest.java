
public class ContainsTest {
	public static void main(String[] args) {
		String src = "ABCDEFG";
		System.out.println(src.contains("AB"));
		System.out.println(src.contains("AA"));
	}
}

/*
contains()
- boolean contains(CharSequence s)
- contains() �޼ҵ�� ��� ���ڿ��� Ư�� ���ڿ��� ���ԵǾ� �ִ��� Ȯ���ϴ� �Լ��̴�.
- ��/�ҹ��ڸ� �����Ѵ�.

CharSequence?
CharSequence�� Ŭ������ �ƴ϶� �������̽��̴�.
�������̽���(character + sequence)���� ���۵ǵ��� char ���� ���� �� �ִ� �������̴�. 
�׸��� �� �������̽��� �پ��� ������ char �������� ���� ������ �б� ���� ���� ������ �����Ѵ�. 
CharSequence�� implements �Ͽ� ������ ��ǥ���� Ŭ�����δ� 
String, SpannableStringBuilder, StringBuilder, StringBuffer ���� �ִ�.
*/