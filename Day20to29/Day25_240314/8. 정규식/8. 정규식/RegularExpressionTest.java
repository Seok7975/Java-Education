/*
 * ���Խ�(Regular Expression) - java.util.regex  ��Ű��
 * ���Խ��̶� �ؽ�Ʈ ������ �߿��� ���ϴ� ����(����, pettern)�� ��ġ�ϴ� ���ڿ��� ã��
 * ���� ���� ����ϴ� ������ �̸� ���ǵ� ��ȣ�� ���ڸ� �̿��ؼ� �ۼ��� ���ڿ��� ����
 * ��. ���� Unix���� ����ϴ� ���̰� Perl�� ������ ����̾��µ� ������ Java�� �����
 * �پ��� ���� �����ϰ� �ִ�.
 * 
 * ���Խ��� �����ϰ� �����͸� ���ϴ� ������ �ܰ躰�� �����ϸ� ������ ����.
 * 
 * 1. ���Խ��� �Ű������� Pettern Ŭ������ static �޼����� Pattern compile(String regex)
 * �� ȣ���Ͽ� Pattern�ν��Ͻ��� ��´�.
 * Pattern p = Pattern.compile("c[a-z]*");
 * 2. ���Խ����� ���� ����� �Ű������� PatternŬ������ Matcher matcher(CharSequence input)
 * �� ȣ���ؼ� Matcher�ν��Ͻ��� ��´�.
 * Matcher m = p.matcher(data[i]);
 * 3. Matcher�ν��Ͻ��� boolean matchers()�� ȣ���ؼ� ���ԽĿ� �����ϴ��� Ȯ���Ѵ�.
 * if(m.matchers())
 * 
 * [����] CharSequence�� �������̽���, �̸� ������ Ŭ������ CharBuffer, String, StringBuffer�� �ִ�.
 */

//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class RegularExpressionTest {
//
//	public static void main(String[] args) {
//		String[] data = {"a", "aa","aaa","abc", "A"};		
//		Pattern p = Pattern.compile("a");	// a �� ����
//
//		for(int i=0; i < data.length; i++) {
//			Matcher m = p.matcher(data[i]);
//			if(m.matches())
//				System.out.print(data[i] + ",");		// a,
//		}
//	}
//
//}

///////////////////////////////////////////////////////////////////
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class RegularExpressionTest {
//
//	public static void main(String[] args) {
//		String[] data = {"a", "aa","aaa","abc", "A"};		
//		Pattern p = Pattern.compile("aa");		// aa �� ����
//
//		for(int i=0; i < data.length; i++) {
//			Matcher m = p.matcher(data[i]);
//			if(m.matches())
//				System.out.print(data[i] + ",");	// aa,
//		}
//	}
//
//}

////////////////////////////////////////////////////////////////////
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class RegularExpressionTest {
//
//	public static void main(String[] args) {
//		String[] data = {"a", "aa","aaa","abc", "A"};		
//		Pattern p = Pattern.compile("aaa");		// aaa �� ����
//
//		for(int i=0; i < data.length; i++) {
//			Matcher m = p.matcher(data[i]);
//			if(m.matches())
//				System.out.print(data[i] + ",");	// aaa,
//		}
//	}
//}

///////////////////////////////////////////////////////////////////
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class RegularExpressionTest {
//
//	public static void main(String[] args) {
//		String[] data = {"a", "aa","aaa","abc", "A"};		
//		Pattern p = Pattern.compile("abc");			// abc �� ����
//
//		for(int i=0; i < data.length; i++) {
//			Matcher m = p.matcher(data[i]);
//			if(m.matches())
//				System.out.print(data[i] + ",");	// abc,
//		}
//	}
//}

//////////////////////////////////////////////////////////////////////
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class RegularExpressionTest {
//
//	public static void main(String[] args) {
//		String[] data = {"a","b","c","d","aa","ab","ac","abc","abcd", "bc", "bcd", "cde"};		
//		Pattern p = Pattern.compile(".");			// .(����)����, ������ �� ���ڸ� ��Ÿ����.
//
//		for(int i=0; i < data.length; i++) {
//			Matcher m = p.matcher(data[i]);
//			if(m.matches())
//				System.out.print(data[i] + ",");	// a,b,c,d,
//		}
//	}
//}

////////////////////////////////////////////////////////////////////

//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class RegularExpressionTest {
//
//	public static void main(String[] args) {
//		String[] data = {"a","b","c","d","aa","ab","ac","abc","abcd", "bc", "bcd", "cde"};		
//		Pattern p = Pattern.compile("..");			// ������ �� ����
//
//		for(int i=0; i < data.length; i++) {
//			Matcher m = p.matcher(data[i]);
//			if(m.matches())
//				System.out.print(data[i] + ",");	//aa,ab,ac,bc,
//		}
//	}
//}

/////////////////////////////////////////////////////////////////////

//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class RegularExpressionTest {
//
//	public static void main(String[] args) {
//		String[] data = {"a","b","c","d","aa","ab","ac","abc","abcd", "bc", "bcd", "cde"};		
//		Pattern p = Pattern.compile("...");			// ������ �� ����
//
//		for(int i=0; i < data.length; i++) {
//			Matcher m = p.matcher(data[i]);
//			if(m.matches())
//				System.out.print(data[i] + ",");	//abc,bcd,cde,
//		}
//	}
//}

//////////////////////////////////////////////////////////////////////

/*
 *	| or ���� 
 */


//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class RegularExpressionTest {
//
//	public static void main(String[] args) {
//		String[] data = {"a","b","c","d","aa","ab","ac","abc","abcd", "bc", "bcd", "cde"};		
//		Pattern p = Pattern.compile("a|b");			
//
//		for(int i=0; i < data.length; i++) {
//			Matcher m = p.matcher(data[i]);
//			if(m.matches())
//				System.out.print(data[i] + ",");	// a,b,
//		}
//	}
//}
//////////////////////////////////////////////////////////////////////

//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class RegularExpressionTest {
//	
//	public static void main(String[] args) {
//		String[] data = {"a","b","c","d","aa","ab","ac","abc","abcd", "bc", "bcd", "cde"};		
//		Pattern p = Pattern.compile("a|b|c");			
//		
//		for(int i=0; i < data.length; i++) {
//			Matcher m = p.matcher(data[i]);
//			if(m.matches())
//				System.out.print(data[i] + ",");	// a,b,c,
//		}
//	}
//}

//////////////////////////////////////////////////////////////////////////
/*
 * [] 
 * ���� ���� ��Ÿ ����.
 * ���� ���� ���� ���Ե� ���ڴ� OR�� �۵�
 * �� ���� ���ڸ� �ǹ��Ѵ�.[abc]��� a �Ǵ� b �Ǵ� c ���� �ϳ���� ��
 * ������ ������ ��Ÿ����.
 * ���� ���̿� -(������) ��ȣ�� �ִٸ� ���� ������ ���δ�.
 * [a-z] �̸� a���� z�����̰� ���࿡[^] �̷� ������ ^��ȣ�� ���� not ������
 * �ǹ��Ѵ�.
 */


//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class RegularExpressionTest {
//
//	public static void main(String[] args) {
//		String[] data = {"a","b","c","d","aa","ab","ac","abc","abcd", "bc", "bcd", "bcde", "cd", "cde", "cdef"};		
//		Pattern p = Pattern.compile("[a]");			
//
//		for(int i=0; i < data.length; i++) {
//			Matcher m = p.matcher(data[i]);
//			if(m.matches())
//				System.out.print(data[i] + ",");	// a,
//		}
//	}
//}

/////////////////////////////////////////////////////////////////////////////

//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class RegularExpressionTest {
//
//	public static void main(String[] args) {
//		String[] data = {"a","b","c","d","aa","ab","ac","abc","abcd", "bc", "bcd", "bcde", "cd", "cde", "cdef"};		
//		Pattern p = Pattern.compile("[abc]");		// a, b, c �߿� �ѹ���	
//
//		for(int i=0; i < data.length; i++) {
//			Matcher m = p.matcher(data[i]);
//			if(m.matches())
//				System.out.print(data[i] + ",");	// a,b,c,
//		}
//	}
//}

//////////////////////////////////////////////////////////////////////////////

//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class RegularExpressionTest {
//
//	public static void main(String[] args) {
//		String[] data = {"a","b","c","d","aa","ab","ac","abc","abcd", "bc", "bcd", "bcde", "cd", "cde", "cdef"};		
//		Pattern p = Pattern.compile("a[abc]");		// a�� �����ϰ� abc�߿� �� ���ڷ� ������ �α���
//
//		for(int i=0; i < data.length; i++) {
//			Matcher m = p.matcher(data[i]);
//			if(m.matches())
//				System.out.print(data[i] + ",");	// aa,ab,ac,
//		}
//	}
//}

/////////////////////////////////////////////////////////////////////////////

//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class RegularExpressionTest {
//
//	public static void main(String[] args) {
//		String[] data = {"a","b","c","d","aa","ab","ac","abc","abcd", "acb", "acc", "bc", "bcd", "bcde", "cd", "cde", "cdef"};		
//		Pattern p = Pattern.compile("a[abc][abc]");		// a�� �����ϰ� abc�߿� �� ����, abc�߿� �ѱ���. �� 3���� ����
//
//		for(int i=0; i < data.length; i++) {
//			Matcher m = p.matcher(data[i]);
//			if(m.matches())
//				System.out.print(data[i] + ",");	// abc,acb,acc,
//		}
//	}
//}

//////////////////////////////////////////////////////////////////////////////
/*
 *    *
 *    ���ų� �� �� �̻��� �ǹ��Ѵ�.
 */

//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class RegularExpressionTest {
//
//	public static void main(String[] args) {
//		String[] data = {"a","b","c","d","aa","ab","ac","abc","aaa", "aaaa", "acc", "bc", "bcd", "bcde", "cd", "cde", "cdef"};		
//		Pattern p = Pattern.compile("a*");		// a�� �����ϰ� a�� ���ų� �� �� �̻�
//
//		for(int i=0; i < data.length; i++) {
//			Matcher m = p.matcher(data[i]);
//			if(m.matches())
//				System.out.print(data[i] + ",");	// a,aa,aaa,aaaa,
//		}
//	}
//}

////////////////////////////////////////////////////////////////////////////////

/*
 *    +
 *    �� �� �̻��� �ǹ��Ѵ�.
 */

//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class RegularExpressionTest {
//
//	public static void main(String[] args) {
//		String[] data = {"a","b","c","d","aa","ab","ac","abc","aaa", "aaaa", "acc", "bc", "bcd", "bcde", "cd", "cde" , "cdef"};		
//		Pattern p = Pattern.compile("a+");		// a�� �����ϰ� a�� �� �� �̻��� �ǹ��Ѵ�.
//
//		for(int i=0; i < data.length; i++) {
//			Matcher m = p.matcher(data[i]);
//			if(m.matches())
//				System.out.print(data[i] + ",");	// a,aa,aaa,aaaa,
//		}
//	}
//}

/////////////////////////////////////////////////////////////////////////////

//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class RegularExpressionTest {
//
//	public static void main(String[] args) {
//		String[] data = {"a", "b", "ab", "ba", "abc", "bac", "baa", "bbc", "baaa", "baaaa", "bbc", "bbca"};		
//		Pattern p = Pattern.compile("ba*");		// b�� �����ϰ� a�� ���ų� �� �� �̻�
//
//		for(int i=0; i < data.length; i++) {
//			Matcher m = p.matcher(data[i]);
//			if(m.matches())
//				System.out.print(data[i] + ",");	// b,ba,baa,baaa,baaaa,
//		}
//	}
//}

/////////////////////////////////////////////////////////////////////////////

//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class RegularExpressionTest {
//
//	public static void main(String[] args) {
//		String[] data = {"a", "b", "ab", "ba", "abc", "bac", "baa", "bbc", "baaa", "baaaa", "bbc", "bbca"};		
//		Pattern p = Pattern.compile("ba+");		// b�� �����ϰ� a�� �� �� �̻�
//
//		for(int i=0; i < data.length; i++) {
//			Matcher m = p.matcher(data[i]);
//			if(m.matches())
//				System.out.print(data[i] + ",");	// ba,baa,baaa,baaaa,
//		}
//	}
//}

/////////////////////////////////////////////////////////////////////////////

/*
 * ���� ���� ��Ÿ ���� ���̳ʽ�(-)! ���� ���ڸ� �������� ������ ���ڱ��� ���������� ���ڸ� ����! 
 * [A-Z] �� [ABCDEGHIJKLMNOPQRSTUVWXYZ] �� ����! ���� ���� �������� ��� ���� 
 */


//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class RegularExpressionTest {
//
//	public static void main(String[] args) {
//		String[] data = {"A","B","C", "AB", "Bc", "a", "b", "c", "0", "1", "2", "ab", "01"};		
//		Pattern p = Pattern.compile("[A-Z]");		// A-Z ���� �ѱ���
//
//		for(int i=0; i < data.length; i++) {
//			Matcher m = p.matcher(data[i]);
//			if(m.matches())
//				System.out.print(data[i] + ",");	// A,B,C,
//		}
//	}
//}

/////////////////////////////////////////////////////////////////////////////

//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class RegularExpressionTest {
//
//	public static void main(String[] args) {
//		String[] data = {"A","B","C", "AB", "Bc", "BD", "a", "b", "c", "0", "1", "2", "ab", "01"};		
//		Pattern p = Pattern.compile("[A-Z][A-Z]");		// A-Z ���� �ѱ��� A-Z ���� �ѱ��� �� �α���
//
//		for(int i=0; i < data.length; i++) {
//			Matcher m = p.matcher(data[i]);
//			if(m.matches())
//				System.out.print(data[i] + ",");	// AB,BD,
//		}
//	}
//}

/////////////////////////////////////////////////////////////////////////////

/*
 * [A-Za-z] ������ �ϳ��� �������� ���
 * ��� �빮�� ���ĺ�, ��� �ҹ��� ���ĺ��� �ǹ�.
 */

//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class RegularExpressionTest {
//
//	public static void main(String[] args) {
//		String[] data = {"A","B","C", "AB", "Bc", "BD", "a", "b", "c", "0", "1", "2", "ab", "01"};		
//		Pattern p = Pattern.compile("[A-Za-z]");		// A-Za-z ���� �ѱ���
//
//		for(int i=0; i < data.length; i++) {
//			Matcher m = p.matcher(data[i]);
//			if(m.matches())
//				System.out.print(data[i] + ",");	// A,B,C,a,b,c,
//		}
//	}
//}

/////////////////////////////////////////////////////////////////////////////

//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class RegularExpressionTest {
//	
//	public static void main(String[] args) {
//		String[] data = {"A","B","C", "AB", "Bc", "BD", "a", "b", "c", "0", "1", "2", "ab", "01"};		
//		Pattern p = Pattern.compile("[A-Za-z][A-Za-z]");		// A-Za-z ���� �ѱ��� A-Za-z ���� �ѱ��� �� �α���
//		
//		for(int i=0; i < data.length; i++) {
//			Matcher m = p.matcher(data[i]);
//			if(m.matches())
//				System.out.print(data[i] + ",");	// AB,Bc,BD,ab,
//		}
//	}
//}

/////////////////////////////////////////////////////////////////////////////

//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class RegularExpressionTest {
//	
//	public static void main(String[] args) {
//		String[] data = {"A","B","C", "AB", "Bc", "BD", "a", "b", "c", "0", "1", "2", "ab", "01"};		
//		Pattern p = Pattern.compile("[0-9]");		// 0-9 ���� �ѱ���
//		
//		for(int i=0; i < data.length; i++) {
//			Matcher m = p.matcher(data[i]);
//			if(m.matches())
//				System.out.print(data[i] + ",");	// 0,1,2,
//		}
//	}
//}

/////////////////////////////////////////////////////////////////////////////

//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class RegularExpressionTest {
//	
//	public static void main(String[] args) {
//		String[] data = {"A","B","C", "AB", "Bc", "BD", "a", "b", "c", "0", 
//				"1", "2", "ab", "01", "23"};		
//		Pattern p = Pattern.compile("[0-9][0-9]");		// 0-9 ���� �ѱ��� 0-9 ���� �ѱ��� �� �α���
//		
//		for(int i=0; i < data.length; i++) {
//			Matcher m = p.matcher(data[i]);
//			if(m.matches())
//				System.out.print(data[i] + ",");	// 01,23,
//		}
//	}
//}

/////////////////////////////////////////////////////////////////////////////
/*
 *  \d 		digit�� ���ڷ� �� ���� ���ڸ� �ǹ��Ѵ�.
 *  		[0-9]�� �ǹ̿� �����ϴ�.
 *  		0���� 9���� ���� ���� �ϳ���� ���̴�.
 */


//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class RegularExpressionTest {
//	
//	public static void main(String[] args) {
//		String[] data = {"A","B","C", "AB", "Bc", "BD", "a", "b", "c", "0", 
//				"1", "2", "ab", "01", "23"};		
//		Pattern p = Pattern.compile("\\d");		// 0-9 ���� �ѱ���
//		
//		for(int i=0; i < data.length; i++) {
//			Matcher m = p.matcher(data[i]);
//			if(m.matches())
//				System.out.print(data[i] + ",");	// 0,1,2,
//		}
//	}
//}

/////////////////////////////////////////////////////////////////////////////

//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class RegularExpressionTest {
//	
//	public static void main(String[] args) {
//		String[] data = {"A","B","C", "AB", "Bc", "BD", "a", "b", "c", "0", 
//				"1", "2", "ab", "01", "23", "012"};		
//		Pattern p = Pattern.compile("\\d*");		// 0-9 ���� ���ų� �� �� �̻�
//		
//		for(int i=0; i < data.length; i++) {
//			Matcher m = p.matcher(data[i]);
//			if(m.matches())
//				System.out.print(data[i] + ",");	// 0,1,2,01,23,012,
//		}
//	}
//}

/////////////////////////////////////////////////////////////////////////////

/*
 * \s	���� ���ڸ� �ǹ��Ѵ�.
 */


//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class RegularExpressionTest {
//	
//	public static void main(String[] args) {
//		String[] data = {"ABC", "A C", "123", "A1B"};		
//		Pattern p = Pattern.compile("[A-Z]\\s[A-Z]");		// A-Z���� ���鹮�� A-Z ����
//		
//		for(int i=0; i < data.length; i++) {
//			Matcher m = p.matcher(data[i]);
//			if(m.matches())
//				System.out.print(data[i] + ",");	// A C,
//		}
//	}
//}

/////////////////////////////////////////////////////////////////////////////

/*
 *  \w		�� ���� ���ĺ�, �����(_), ���ڸ� �ǹ��Ѵ�.
 *  		[a-zA-Z_0-9]�� ���� ���̴�.
 *  		��ó�� \ ��ȣ�� ������ Ű����ó�� ���δ�.
 *  		���� Ǯ��� �Ϳ� ���� ���ϴ�.
 *  		��Ȯ�� ���δ� 'Ȯ�幮��'��� �Ѵ�.
 */

//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class RegularExpressionTest {
//	
//	public static void main(String[] args) {
//		String[] data = {"A","B","C", "AB", "Bc", "BD", "a", "b", "c", "0", 
//				"1", "2", "ab", "01", "23", "012"};		
//		Pattern p = Pattern.compile("\\w");		// [a-zA-Z_0-9]
//		
//		for(int i=0; i < data.length; i++) {
//			Matcher m = p.matcher(data[i]);
//			if(m.matches())
//				System.out.print(data[i] + ",");	// A,B,C,a,b,c,0,1,2,
//		}
//	}
//}

/////////////////////////////////////////////////////////////////////////////

/*
 * {n}		n���� �ǹ��Ѵ�.
 */

//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class RegularExpressionTest {
//	
//	public static void main(String[] args) {
//		String[] data = {"A","B","C", "AB", "Bc", "BD", "a", "b", "c", "0", 
//				"1", "2", "ab", "01", "23", "012", "ABC", "A0E"};		
//		Pattern p = Pattern.compile("\\w{2}");		// 
//		
//		for(int i=0; i < data.length; i++) {
//			Matcher m = p.matcher(data[i]);
//			if(m.matches())
//				System.out.print(data[i] + ",");	// AB,Bc,BD,ab,01,23,
//		}
//	}
//}

/////////////////////////////////////////////////////////////////////////////

/*
 * {n,}		n�� �̻��� �ǹ��Ѵ�.
 */

//
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class RegularExpressionTest {
//	
//	public static void main(String[] args) {
//		String[] data = {"A","B","C", "AB", "Bc", "BD", "a", "b", "c", "0", 
//				"1", "2", "ab", "01", "23", "012", "ABC", "A0E"};		
//		Pattern p = Pattern.compile("\\w{2,}");		// 
//		
//		for(int i=0; i < data.length; i++) {
//			Matcher m = p.matcher(data[i]);
//			if(m.matches())
//				System.out.print(data[i] + ",");	// AB,Bc,BD,ab,01,23,012,ABC,A0E,
//		}
//	}
//}

/////////////////////////////////////////////////////////////////////////////

/*
 * {n, m} n������ m������
 */

//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class RegularExpressionTest {
//	
//	public static void main(String[] args) {
//		String[] data = {"A","B","C", "AB", "Bc", "BD", "a", "b", "c", "0", 
//				"1", "2", "ab", "01", "23", "012", "ABC", "A0E"
//				,"A1B", "ABcD", "a2G0", "abcDE", "12ASD"};		
//		Pattern p = Pattern.compile("\\w{2,4}");		// 
//		
//		for(int i=0; i < data.length; i++) {
//			Matcher m = p.matcher(data[i]);
//			if(m.matches())
//				System.out.print(data[i] + ",");	// AB,Bc,BD,ab,01,23,012,ABC,A0E,A1B,ABcD,a2G0,
//		}
//	}
//}

/////////////////////////////////////////////////////////////////////////////

/*
 * ?	���� �Ǵ� �� ��
 */

//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class RegularExpressionTest {
//	
//	public static void main(String[] args) {
//		String[] data = {"abc", "abb", "abbb", "ab","a", "abbbb","abcd"};		
//		Pattern p = Pattern.compile("ab?");		// 
//		
//		for(int i=0; i < data.length; i++) {
//			Matcher m = p.matcher(data[i]);
//			if(m.matches())
//				System.out.print(data[i] + ",");	// ab,a,
//		}
//	}
//}

/////////////////////////////////////////////////////////////////////////////

/*
 * ()	�׷���. �Ұ�ȣ ���� ���ڸ� �ϳ��� �ν�.
 */

//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class RegularExpressionTest {
//	
//	public static void main(String[] args) {
//		String[] data = {"abc", "abbc", "abbbc", "abac","aabc", "babc","abcd"};		
//		Pattern p = Pattern.compile("\\w(abc)");		// 
//		
//		for(int i=0; i < data.length; i++) {
//			Matcher m = p.matcher(data[i]);
//			if(m.matches())
//				System.out.print(data[i] + ",");	// aabc,babc,
//		}
//	}
//}

/////////////////////////////////////////////////////////////////////////////

/*
 *  ^ ���ڿ��� ����
 */

//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class RegularExpressionTest {
//	
//	public static void main(String[] args) {
//		String[] data = {"http://www.naver.com", "hellohttp://www.daum.net", "goodhttp"};		
//		Pattern p = Pattern.compile("^http.*");		// 
//		
//		for(int i=0; i < data.length; i++) {
//			Matcher m = p.matcher(data[i]);
//			if(m.matches())
//				System.out.print(data[i] + ",");	// http://www.naver.com,
//		}
//	}
//}

/////////////////////////////////////////////////////////////////////////////

/*
 *  $ ���ڿ��� ��������
 */

//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class RegularExpressionTest {
//	
//	public static void main(String[] args) {
//		String[] data = {"http://www.naver.com", "hellohttp://www.daum.net", "goodhttp"};		
//		Pattern p = Pattern.compile(".*http$");		// 
//		
//		for(int i=0; i < data.length; i++) {
//			Matcher m = p.matcher(data[i]);
//			if(m.matches())
//				System.out.print(data[i] + ",");	// goodhttp,
//		}
//	}
//}

/////////////////////////////////////////////////////////////////////////////

//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class RegularExpressionTest {
//	
//	public static void main(String[] args) {
//		String[] data = {"123","012", "3GT", "�ȳ�", "Hello"};		
//		Pattern p = Pattern.compile("^[0-9]+$");		// ���� �ѱ��ڶ� �־���ϰ� ���ڷ� ��������
//		
//		for(int i=0; i < data.length; i++) {
//			Matcher m = p.matcher(data[i]);
//			if(m.matches())
//				System.out.println(data[i] + " �����Դϴ�.");	
//			else
//				System.out.println(data[i] + " ���ڰ� �ƴմϴ�.");    
//		}
//	}
//}

/* 
 * ���� ���
123 �����Դϴ�.
012 �����Դϴ�.
3GT ���ڰ� �ƴմϴ�.
�ȳ� ���ڰ� �ƴմϴ�.
Hello ���ڰ� �ƴմϴ�.
 */

/////////////////////////////////////////////////////////////////////////////

//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class RegularExpressionTest {
//	
//	public static void main(String[] args) {
//		String[] data = {"123","012", "3GT", "�ȳ�", "Hello"};		
//		Pattern p = Pattern.compile("^[a-zA-Z]+$");		// ������ �ѱ��ڶ� �־�� �ϰ�, �����ڷ� ��������
//		
//		for(int i=0; i < data.length; i++) {
//			Matcher m = p.matcher(data[i]);
//			if(m.matches())
//				System.out.println(data[i] + " �������Դϴ�.");	
//			else
//				System.out.println(data[i] + " �����ڰ� �ƴմϴ�.");    
//		}
//	}
//}

/*
 * ���� ���
 * 
123 �����ڰ� �ƴմϴ�.
012 �����ڰ� �ƴմϴ�.
3GT �����ڰ� �ƴմϴ�.
�ȳ� �����ڰ� �ƴմϴ�.
Hello �������Դϴ�.
 * 
 */

/////////////////////////////////////////////////////////////////////////////

//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class RegularExpressionTest {
//	
//	public static void main(String[] args) {
//		String[] data = {"123","012", "3GT", "�ȳ�", "Hello"};		
//		Pattern p = Pattern.compile("^[��-�R]+$");		
		// �ѱ����� �ƴ��� �Ǻ��ϴ� ���Խ� // �ѱ��� �ѱ��ڶ� �����ϰ�, �ѱ۷� ��������
//		
//		for(int i=0; i < data.length; i++) {
//			Matcher m = p.matcher(data[i]);
//			if(m.matches())
//				System.out.println(data[i] + " �ѱ��Դϴ�.");	
//			else
//				System.out.println(data[i] + " �ѱ��� �ƴմϴ�.");    
//		}
//	}
//}

/*
 * ���� ���
 * 
123 �ѱ��� �ƴմϴ�.
012 �ѱ��� �ƴմϴ�.
3GT �ѱ��� �ƴմϴ�.
�ȳ� �ѱ��Դϴ�.
Hello �ѱ��� �ƴմϴ�.
 */

/*
[��-�R]�� ���캸��, �����ڵ忡�� '��'�� �ѱ� ���� ���տ��� ���� ù ��° ���ڰ�, '�R'�� ���� ������ ���ڴ�. �׸��� ������(-)�� ������ ������ ��Ÿ���Ƿ�, [��-�R] ������ [A-Z] ���ϰ� ���������� '��' ���ں��� '�R' ���� ���̿� �ִ� ��� ���ڸ� ��Ÿ����. ��, [��-�R] ������ ��� �ѱ� ���ڿ� ��ġ�Ѵ�.

�� ������ �����ڵ� ȯ�濡���� ����� �����Ѵ�. ���� EUC-KR ������ ���ڵ� �� �ؽ�Ʈ�� ���� ��ġ���� �ʴ´�.
*/

/////////////////////////////////////////////////////////////////////

//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class RegularExpressionTest {
//	
//	public static void main(String[] args) {
//		String[] data = {"ca", "cA", "c."};		
//		Pattern p = Pattern.compile("c\\.");		// \. �� ���ڸ� �ǹ�
//		
//		for(int i=0; i < data.length; i++) {
//			Matcher m = p.matcher(data[i]);
//			if(m.matches())
//				System.out.println(data[i]);	// c.
//		}
//	}
//}


/////////////////////////////////////////////////////////////////////////////

//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class RegularExpressionTest {
//	
//	public static void main(String[] args) {
//		String[] data = {"hello", "hello@", "hello@naver", "hello@naver.com", "good@good.co.kr"};		
//		Pattern p = Pattern.compile("\\w+@\\w+\\.\\w+(\\.\\w+)?");		// �̸��� �ּ�
		//\\w : ������ , \\. : �� ���� �� ��ü, ( ) : �׷�ȭ, ? : ���ų� �ϳ�
//		
//		for(int i=0; i < data.length; i++) {
//			Matcher m = p.matcher(data[i]);
//			if(m.matches())
//				System.out.println(data[i] + " ��ȿ�� �̸��� �ּ��Դϴ�.");	
//			else
//				System.out.println(data[i] + " ��ȿ�� �̸��� �ּҰ� �ƴմϴ�.");    
//		}
//	}
//}

/*
 *  ���� ���
 *  
hello ��ȿ�� �̸��� �ּҰ� �ƴմϴ�.
hello@ ��ȿ�� �̸��� �ּҰ� �ƴմϴ�.
hello@naver ��ȿ�� �̸��� �ּҰ� �ƴմϴ�.
hello@naver.com ��ȿ�� �̸��� �ּ��Դϴ�.
good@good.co.kr ��ȿ�� �̸��� �ּ��Դϴ�.
 */



/////////////////////////////////////////////////////////////////////////////

//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class RegularExpressionTest {
//	
//	public static void main(String[] args) {
//		String[] data = {"02", "02-123", "02-123-456", "02-123-4567", 
//				"02-1234-4567", "031-1234-5678"};		
//		Pattern p = Pattern.compile("^\\d{2,3}-\\d{3,4}-\\d{4}$");		// ��ȭ��ȣ
//		// ���� 2~3���ΰ����� ����, - , ���� 3~4���ΰ�, - , ���� 4���� ������ ��
//		for(int i=0; i < data.length; i++) {
//			Matcher m = p.matcher(data[i]);
//			if(m.matches())
//				System.out.println(data[i] + " ��ȿ�� ��ȭ��ȣ�Դϴ�.");	
//			else
//				System.out.println(data[i] + " ��ȿ�� ��ȭ��ȣ�� �ƴմϴ�.");    
//		}
//	}
//}

/*
 * ���� ���
 * 
02 ��ȿ�� ��ȭ��ȣ�� �ƴմϴ�.
02-123 ��ȿ�� ��ȭ��ȣ�� �ƴմϴ�.
02-123-456 ��ȿ�� ��ȭ��ȣ�� �ƴմϴ�.
02-123-4567 ��ȿ�� ��ȭ��ȣ�Դϴ�.
02-1234-4567 ��ȿ�� ��ȭ��ȣ�Դϴ�.
031-1234-5678 ��ȿ�� ��ȭ��ȣ�Դϴ�.
 */

/////////////////////////////////////////////////////////////////////////////

//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class RegularExpressionTest {
//	
//	public static void main(String[] args) {
//
//		String[] data = {"010", "010-1234-5678", "02-123-456", "02-123-4567", 
//				"02-1234-4567", "031-1234-5678"};		
//		Pattern p = Pattern.compile("^01(0|1|[6-9])-(\\d{3}|\\d{4})-\\d{4}$");		// �ڵ��� ��ȣ
//		// 0,1�� �����ϸ鼭 (0�̰ų� 1�̰ų� 6~9 �� �ϳ�), -, ���ڰ� 3���̰ų� ���ڰ� 4���̰ų�, -, ���ڰ� 4���� ��������
//		
//		for(int i=0; i < data.length; i++) {
//			Matcher m = p.matcher(data[i]);
//			if(m.matches())
//				System.out.println(data[i] + " ��ȿ�� �ڵ��� ��ȣ�Դϴ�.");	
//			else
//				System.out.println(data[i] + " ��ȿ�� �ڵ��� ��ȣ�� �ƴմϴ�.");    
//		}
//	}
//}

/*
���� ���
010 ��ȿ�� �ڵ��� ��ȣ�� �ƴմϴ�.
010-1234-5678 ��ȿ�� �ڵ��� ��ȣ�Դϴ�.
02-123-456 ��ȿ�� �ڵ��� ��ȣ�� �ƴմϴ�.
02-123-4567 ��ȿ�� �ڵ��� ��ȣ�� �ƴմϴ�.
02-1234-4567 ��ȿ�� �ڵ��� ��ȣ�� �ƴմϴ�.
031-1234-5678 ��ȿ�� �ڵ��� ��ȣ�� �ƴմϴ�.
*/

//////////////////////////////////////////////////////////////////////////

//import java.util.regex.*;	// Pattern�� Matcher�� ���� ��Ű��
//
//class RegularExpressionTest {
//	public static void main(String[] args) 
//	{
//		String[] data = {"bat", "baby", "bonus",
//				    "cA","ca", "co", "c.", "c0", "car","combat","count",
//				    "date", "disc"};		
//		Pattern p = Pattern.compile("c[a-z]*");	// c�� �����ϴ� �ҹ��ڿ��ܾ�
//		
//		for(int i=0; i < data.length; i++) {
//			Matcher m = p.matcher(data[i]);
//			if(m.matches())
//				System.out.print(data[i] + ",");
//		}
//	}
//}

// ���� ���
// ca,co,car,combat,count,

//////////////////////////////////////////////////////////////////////////

//import java.util.regex.*;	// Pattern�� Matcher�� ���� ��Ű��
//
//class RegularExpressionTest {
//	public static void main(String[] args) {
//		String[] data = {"bat", "baby", "bonus", "c", "cA",
//				        "ca", "co", "c.", "c0", "c#",
//					"car","combat","count", "date", "disc"
//						};		
//		String[] pattern = {".*","c[a-z]*","c[a-z]", "c[a-zA-Z]",
//                                          "c[a-zA-Z0-9]","c.","c.*","c\\.","c\\w",
//                                          "c\\d","c.*t", "[b|c].*", ".*a.*", ".*a.+",
//                                          "[b|c].{2}"
//                                         };
//
//		for(int x=0; x < pattern.length; x++) {
//			Pattern p = Pattern.compile(pattern[x]);
//			System.out.print("Pattern : " + pattern[x] + "  ���: ");
//			for(int i=0; i < data.length; i++) {
//				Matcher m = p.matcher(data[i]);
//				if(m.matches())
//					System.out.print(data[i] + ",");
//			}
//			System.out.println();
//		}
//	} // public static void main(String[] args) 
//}

/* 
���� ���
	
Pattern : .*  ���: bat,baby,bonus,c,cA,ca,co,c.,c0,c#,car,combat,count,date,disc,
Pattern : c[a-z]*  ���: c,ca,co,car,combat,count,
Pattern : c[a-z]  ���: ca,co,
Pattern : c[a-zA-Z]  ���: cA,ca,co,
Pattern : c[a-zA-Z0-9]  ���: cA,ca,co,c0,
Pattern : c.  ���: cA,ca,co,c.,c0,c#,
Pattern : c.*  ���: c,cA,ca,co,c.,c0,c#,car,combat,count,
Pattern : c\.  ���: c.,
Pattern : c\w  ���: cA,ca,co,c0,
Pattern : c\d  ���: c0,
Pattern : c.*t  ���: combat,count,
Pattern : [b|c].*  ���: bat,baby,bonus,c,cA,ca,co,c.,c0,c#,car,combat,count,
Pattern : .*a.*  ���: bat,baby,ca,car,combat,date,
Pattern : .*a.+  ���: bat,baby,car,combat,date,
Pattern : [b|c].{2}  ���: bat,car,
*/

///////////////////////////////////////////////////////////////////

//import java.util.regex.*;	// Pattern�� Matcher�� ���� ��Ű��
//
//class RegularExpressionTest{
//	public static void main(String[] args) {
//		String source  = "HP:011-1111-1111, HOME:02-999-9999 ";
//		String pattern = "(0\\d{1,2})-(\\d{3,4})-(\\d{4})";
//		//0, ���ڰ� 1���̰ų� 2��, - , ���ڰ� 3���̰ų� 4��, -, ���ڰ� 4���� ������ ����?
//		Pattern p = Pattern.compile(pattern);
//		Matcher m = p.matcher(source);
//
//		int i=0;
//
//		while(m.find()) {
//			System.out.println( ++i + ": " + m.group() + " -> "+ m.group(1) +", "+ m.group(2)+", "+ m.group(3));		
//		}
//	} // main�� ��
//}

/*
���� ���

1: 011-1111-1111 -> 011, 1111, 1111
2: 02-999-9999 -> 02, 999, 9999

*/

/*
	���Խ��� �Ϻθ� ��ȣ�� ������ ��� �׷�ȭ(grouping)�� �� �ִ�. �׷�ȭ�� �κ���
	�ϳ��� ������ ���̴� ���� �Ǿ �� �� �Ǵ� �� �̻��� �ݺ��� �ǹ��ϴ� '+' �� '*'��
	�ڿ� ���� �׷�ȭ�� �κ��� �������� �ȴ�. �׸��� �׷�ȭ�� �κ��� group(int i)��
	�̿��ؼ� ������ ���� �� �ִ�.
	 ���� �������� '(0\\d{1,2})-(\\d{3,4})-(\\d{4})'�� ��ȣ�� �̿��ؼ� ���Խ���
	 �� �κ����� �������µ� ������ ������� �� �� �ֵ��� ��Ī�Ǵ� ���ڿ����� ù ��° �׷���
	 group(1)�� �� ��° �׷��� group(2)�� ���� ȣ�������ν� ���� �� �ִ�. group()
	 �Ǵ� group(0)�� �׷����� ��Ī�� ���ڿ��� ��ü�� ���������� ���� ä�� ��ȯ�Ѵ�.
	 
	 [����] group(int i)�� ȣ���� �� i�� ���� �׷��� ������ ������ java.lang.IndexOutOfBoundsException
	 �� �߻��Ѵ�.
	 
	 ���Խ� ����				����
	 0\\d{1,2}				0���� �����ϴ� �ּ� 2�ڸ� �ִ� 3�ڸ� ����(0����)
	 \\d{3,4}				�ּ� 3�ڸ� �ִ� 4�ڸ��� ����
	 \\d{4}					4�ڸ��� ����
	 
	 find()�� �־��� �ҽ� ������ ���ϰ� ��ġ�ϴ� �κ��� ã�Ƴ��� true�� ��ȯ�ϰ� ã��
	 ���ϸ� false�� ��ȯ�Ѵ�. find()�� ȣ���ؼ� ���ϰ� ��ġ�ϴ� �κ��� ã�Ƴ� ����,
	 �ٽ� find()�� ȣ���ϸ� ������ �߰��� ���ϰ� ��ġ�ϴ� �κ��� �������� �ٽ�
	 ���ϸ�Ī�� �����Ѵ�.
	 
	 Matcher m = p.matcher(source);
	 
	 while(m.find()){		// find()�� ��ġ�ϴ� ������ ������ false�� ��ȯ�Ѵ�.
	 	System.out.println(m.group());
	 }
*/

/////////////////////////////////////////////////////////////////////////////

//import java.util.regex.*;	// Pattern�� Matcher�� ���� ��Ű��
//
//class RegularExpressionTest {
//	public static void main(String[] args) {
//		String source  = "A broken hand works, but not a broken heart.";
//		String pattern = "broken";
//
//		StringBuffer sb = new StringBuffer();
//
//		Pattern p = Pattern.compile(pattern);
//		Matcher m = p.matcher(source);
//		System.out.println("source:"+source);
//
//		int i=0;
//
//		while(m.find()) {
//			System.out.println(++i + "��° ��Ī:" + m.start() + "~"+ m.end());
//
//            // broken�� drunken���� ġȯ�Ͽ� sb�� �����Ѵ�.
//			m.appendReplacement(sb, "drunken");  
//		}
//
//		m.appendTail(sb);
//		System.out.println("Replacement count : " + i);
//		System.out.println("result:"+sb.toString());
//	}
//}

/*
���� ���

source:A broken hand works, but not a broken heart.
1��° ��Ī:2~8
2��° ��Ī:31~37
Replacement count : 2
result:A drunken hand works, but not a drunken heart.

*/

/*
Matcher�� find()�� ���Խİ� ��ġ�ϴ� �κ��� ã����, �� ��ġ�� start()�� end()�� �˾Ƴ� ��
�ְ� appendReplacement(StringBuffer sb, String replacement)�� �̿��ؼ� ���ϴ�
���ڿ�(replacement)�� ġȯ�� �� �ִ�. ġȯ�� ����� StringBuffer�� sb�� ����Ǵµ�,
sb�� ����Ǵ� ������ �ܰ躰�� ���캸�� �����ϱ� ���� ���̴�.

1. ���ڿ� source���� "broken"�� m.find()�� ã�� �� ó������ 
m.appendReplacement(sb, "drunken"); �� ȣ��Ǹ� source�� ���ۺ��� "broken"�� ã��
��ġ������ ���뿡 "drunken"�� ���ؼ� �����Ѵ�.
- sb�� ����� ���� : "A drunken"

2. m.find()�� ù ��°�� �߰ߵ� ��ġ�� ���������� �ٽ� �˻��� �����Ͽ� �� ��°
"broken"�� ã�� �ȴ�. �ٽ� m.appendReplacement(sb, "drunken");�� ȣ��
- sb�� ����� ���� : "A drunken hand works, but not a drunken"

3. m.appendTail(sb);�� ȣ��Ǹ� ���������� ġȯ�� ������ �κ��� sb�� �����δ�.
- sb�� ����� ���� : "A drunken hand works, but not a drunken heart."

*/