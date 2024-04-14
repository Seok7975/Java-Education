
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
- contains() 메소드는 대상 문자열에 특정 문자열이 포함되어 있는지 확인하는 함수이다.
- 대/소문자를 구분한다.

CharSequence?
CharSequence는 클래스가 아니라 인터페이스이다.
인터페이스명(character + sequence)에서 짐작되듯이 char 값을 읽을 수 있는 시퀀스이다. 
그리고 이 인터페이스는 다양한 종류의 char 시퀀스에 대해 균일한 읽기 전용 접근 권한을 제공한다. 
CharSequence를 implements 하여 구현된 대표적인 클래스로는 
String, SpannableStringBuilder, StringBuilder, StringBuffer 등이 있다.
*/