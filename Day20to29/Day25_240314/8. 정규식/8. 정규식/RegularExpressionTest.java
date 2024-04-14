/*
 * Á¤±Ô½Ä(Regular Expression) - java.util.regex  ÆĞÅ°Áö
 * Á¤±Ô½ÄÀÌ¶õ ÅØ½ºÆ® µ¥ÀÌÅÍ Áß¿¡¼­ ¿øÇÏ´Â Á¶°Ç(ÆĞÅÏ, pettern)°ú ÀÏÄ¡ÇÏ´Â ¹®ÀÚ¿­À» Ã£¾Æ
 * ³»±â À§ÇØ »ç¿ëÇÏ´Â °ÍÀ¸·Î ¹Ì¸® Á¤ÀÇµÈ ±âÈ£¿Í ¹®ÀÚ¸¦ ÀÌ¿ëÇØ¼­ ÀÛ¼ºÇÑ ¹®ÀÚ¿­À» ¸»ÇÑ
 * ´Ù. ¿ø·¡ Unix¿¡¼­ »ç¿ëÇÏ´ø °ÍÀÌ°í PerlÀÇ °­·ÂÇÑ ±â´ÉÀÌ¾ú´Âµ¥ ¿äÁòÀº Java¸¦ ºñ·ÔÇØ
 * ´Ù¾çÇÑ ¾ğ¾î¿¡¼­ Áö¿øÇÏ°í ÀÖ´Ù.
 * 
 * Á¤±Ô½ÄÀ» Á¤ÀÇÇÏ°í µ¥ÀÌÅÍ¸¦ ºñ±³ÇÏ´Â °úÁ¤À» ´Ü°èº°·Î ¼³¸íÇÏ¸é ´ÙÀ½°ú °°´Ù.
 * 
 * 1. Á¤±Ô½ÄÀ» ¸Å°³º¯¼ö·Î Pettern Å¬·¡½ºÀÇ static ¸Ş¼­µåÀÎ Pattern compile(String regex)
 * À» È£ÃâÇÏ¿© PatternÀÎ½ºÅÏ½º¸¦ ¾ò´Â´Ù.
 * Pattern p = Pattern.compile("c[a-z]*");
 * 2. Á¤±Ô½ÄÀ¸·Î ºñ±³ÇÒ ´ë»óÀ» ¸Å°³º¯¼ö·Î PatternÅ¬·¡½ºÀÇ Matcher matcher(CharSequence input)
 * ¸¦ È£ÃâÇØ¼­ MatcherÀÎ½ºÅÏ½º¸¦ ¾ò´Â´Ù.
 * Matcher m = p.matcher(data[i]);
 * 3. MatcherÀÎ½ºÅÏ½º¿¡ boolean matchers()¸¦ È£ÃâÇØ¼­ Á¤±Ô½Ä¿¡ ºÎÇÕÇÏ´ÂÁö È®ÀÎÇÑ´Ù.
 * if(m.matchers())
 * 
 * [Âü°í] CharSequence´Â ÀÎÅÍÆäÀÌ½º·Î, ÀÌ¸¦ ±¸ÇöÇÑ Å¬·¡½º´Â CharBuffer, String, StringBuffer°¡ ÀÖ´Ù.
 */

//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class RegularExpressionTest {
//
//	public static void main(String[] args) {
//		String[] data = {"a", "aa","aaa","abc", "A"};		
//		Pattern p = Pattern.compile("a");	// a ÇÑ ±ÛÀÚ
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
//		Pattern p = Pattern.compile("aa");		// aa µÎ ±ÛÀÚ
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
//		Pattern p = Pattern.compile("aaa");		// aaa ¼¼ ±ÛÀÚ
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
//		Pattern p = Pattern.compile("abc");			// abc ¼¼ ±ÛÀÚ
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
//		Pattern p = Pattern.compile(".");			// .(¿ÂÁ¡)À¸·Î, ÀÓÀÇÀÇ ÇÑ ¹®ÀÚ¸¦ ³ªÅ¸³½´Ù.
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
//		Pattern p = Pattern.compile("..");			// ÀÓÀÇÀÇ µÎ ±ÛÀÚ
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
//		Pattern p = Pattern.compile("...");			// ÀÓÀÇÀÇ ¼¼ ±ÛÀÚ
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
 *	| or ¿¬»ê 
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
 * ¹®ÀÚ ÁıÇÕ ¸ŞÅ¸ ¹®ÀÚ.
 * ¹®ÀÚ ÁıÇÕ ³»¿¡ Æ÷ÇÔµÈ ¹®ÀÚ´Â OR·Î ÀÛµ¿
 * ÇÑ °³ÀÇ ¹®ÀÚ¸¦ ÀÇ¹ÌÇÑ´Ù.[abc]¶ó¸é a ¶Ç´Â b ¶Ç´Â c ÁßÀÇ ÇÏ³ª¶ó´Â ¶æ
 * ¹®ÀÚÀÇ ¹üÀ§¸¦ ³ªÅ¸³½´Ù.
 * ¹®ÀÚ »çÀÌ¿¡ -(ÇÏÀÌÇÂ) ±âÈ£°¡ ÀÖ´Ù¸é ´ÙÀ½ ¶æÀ¸·Î ¾²ÀÎ´Ù.
 * [a-z] ÀÌ¸é aºÎÅÍ z±îÁöÀÌ°í ¸¸¾à¿¡[^] ÀÌ·± ½ÄÀ¸·Î ^±âÈ£°¡ µé¾î°¡¸é not ¿¬»êÀ»
 * ÀÇ¹ÌÇÑ´Ù.
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
//		Pattern p = Pattern.compile("[abc]");		// a, b, c Áß¿¡ ÇÑ¹®ÀÚ	
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
//		Pattern p = Pattern.compile("a[abc]");		// a·Î ½ÃÀÛÇÏ°í abcÁß¿¡ ÇÑ ±ÛÀÚ·Î ³¡³ª´Â µÎ±ÛÀÚ
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
//		Pattern p = Pattern.compile("a[abc][abc]");		// a·Î ½ÃÀÛÇÏ°í abcÁß¿¡ ÇÑ ±ÛÀÚ, abcÁß¿¡ ÇÑ±ÛÀÚ. ÃÑ 3±ÛÀÚ ¹®ÀÚ
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
 *    ¾ø°Å³ª ÇÑ °³ ÀÌ»óÀ» ÀÇ¹ÌÇÑ´Ù.
 */

//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class RegularExpressionTest {
//
//	public static void main(String[] args) {
//		String[] data = {"a","b","c","d","aa","ab","ac","abc","aaa", "aaaa", "acc", "bc", "bcd", "bcde", "cd", "cde", "cdef"};		
//		Pattern p = Pattern.compile("a*");		// a·Î ½ÃÀÛÇÏ°í a°¡ ¾ø°Å³ª ÇÑ °³ ÀÌ»ó
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
 *    ÇÑ °³ ÀÌ»óÀ» ÀÇ¹ÌÇÑ´Ù.
 */

//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class RegularExpressionTest {
//
//	public static void main(String[] args) {
//		String[] data = {"a","b","c","d","aa","ab","ac","abc","aaa", "aaaa", "acc", "bc", "bcd", "bcde", "cd", "cde" , "cdef"};		
//		Pattern p = Pattern.compile("a+");		// a·Î ½ÃÀÛÇÏ°í a°¡ ÇÑ °³ ÀÌ»óÀ» ÀÇ¹ÌÇÑ´Ù.
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
//		Pattern p = Pattern.compile("ba*");		// b·Î ½ÃÀÛÇÏ°í a°¡ ¾ø°Å³ª ÇÑ °³ ÀÌ»ó
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
//		Pattern p = Pattern.compile("ba+");		// b·Î ½ÃÀÛÇÏ°í a°¡ ÇÑ °³ ÀÌ»ó
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
 * ¹üÀ§ ÁöÁ¤ ¸ŞÅ¸ ¹®ÀÚ ¸¶ÀÌ³Ê½º(-)! ¿ŞÂÊ ¹®ÀÚ¸¦ ½ÃÀÛÀ¸·Î ¿À¸¥ÂÊ ¹®ÀÚ±îÁö ¼øÂ÷ÀûÀ¸·Î ¹®ÀÚ¸¦ Áõ°¡! 
 * [A-Z] ´Â [ABCDEGHIJKLMNOPQRSTUVWXYZ] °ú µ¿ÀÏ! ¹®ÀÚ ÁıÇÕ ³»¿¡¼­¸¸ »ç¿ë °¡´É 
 */


//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class RegularExpressionTest {
//
//	public static void main(String[] args) {
//		String[] data = {"A","B","C", "AB", "Bc", "a", "b", "c", "0", "1", "2", "ab", "01"};		
//		Pattern p = Pattern.compile("[A-Z]");		// A-Z »çÀÌ ÇÑ±ÛÀÚ
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
//		Pattern p = Pattern.compile("[A-Z][A-Z]");		// A-Z »çÀÌ ÇÑ±ÛÀÚ A-Z »çÀÌ ÇÑ±ÛÀÚ ÃÑ µÎ±ÛÀÚ
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
 * [A-Za-z] ¹üÀ§´Â ÇÏ³ªÀÇ ÆĞÅÏÀ¸·Î Ãë±Ş
 * ¸ğµç ´ë¹®ÀÚ ¾ËÆÄºª, ¸ğµç ¼Ò¹®ÀÚ ¾ËÆÄºªÀ» ÀÇ¹Ì.
 */

//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class RegularExpressionTest {
//
//	public static void main(String[] args) {
//		String[] data = {"A","B","C", "AB", "Bc", "BD", "a", "b", "c", "0", "1", "2", "ab", "01"};		
//		Pattern p = Pattern.compile("[A-Za-z]");		// A-Za-z »çÀÌ ÇÑ±ÛÀÚ
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
//		Pattern p = Pattern.compile("[A-Za-z][A-Za-z]");		// A-Za-z »çÀÌ ÇÑ±ÛÀÚ A-Za-z »çÀÌ ÇÑ±ÛÀÚ ÃÑ µÎ±ÛÀÚ
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
//		Pattern p = Pattern.compile("[0-9]");		// 0-9 »çÀÌ ÇÑ±ÛÀÚ
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
//		Pattern p = Pattern.compile("[0-9][0-9]");		// 0-9 »çÀÌ ÇÑ±ÛÀÚ 0-9 »çÀÌ ÇÑ±ÛÀÚ ÃÑ µÎ±ÛÀÚ
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
 *  \d 		digitÀÇ ¾àÀÚ·Î ÇÑ °³ÀÇ ¼ıÀÚ¸¦ ÀÇ¹ÌÇÑ´Ù.
 *  		[0-9]ÀÇ ÀÇ¹Ì¿Í µ¿ÀÏÇÏ´Ù.
 *  		0¿¡¼­ 9±îÁö ¼ıÀÚ ÁßÀÇ ÇÏ³ª¶ó´Â ¶æÀÌ´Ù.
 */


//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class RegularExpressionTest {
//	
//	public static void main(String[] args) {
//		String[] data = {"A","B","C", "AB", "Bc", "BD", "a", "b", "c", "0", 
//				"1", "2", "ab", "01", "23"};		
//		Pattern p = Pattern.compile("\\d");		// 0-9 »çÀÌ ÇÑ±ÛÀÚ
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
//		Pattern p = Pattern.compile("\\d*");		// 0-9 »çÀÌ ¾ø°Å³ª ÇÑ °³ ÀÌ»ó
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
 * \s	°ø¹é ¹®ÀÚ¸¦ ÀÇ¹ÌÇÑ´Ù.
 */


//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class RegularExpressionTest {
//	
//	public static void main(String[] args) {
//		String[] data = {"ABC", "A C", "123", "A1B"};		
//		Pattern p = Pattern.compile("[A-Z]\\s[A-Z]");		// A-ZÇÑÀÚ °ø¹é¹®ÀÚ A-Z ÇÑÀÚ
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
 *  \w		ÇÑ °³ÀÇ ¾ËÆÄºª, ¾ğ´õ¹Ù(_), ¼ıÀÚ¸¦ ÀÇ¹ÌÇÑ´Ù.
 *  		[a-zA-Z_0-9]¿Í °°Àº ¶æÀÌ´Ù.
 *  		ÀÌÃ³·³ \ ±âÈ£°¡ ºÙÀ¸¸é Å°¿öµåÃ³·³ ¾²ÀÎ´Ù.
 *  		Á÷Á¢ Ç®¾î¾²´Â °Í¿¡ ºñÇØ Æí¸®ÇÏ´Ù.
 *  		Á¤È®ÇÑ ¿ë¾î·Î´Â 'È®Àå¹®ÀÚ'¶ó°í ÇÑ´Ù.
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
 * {n}		n°³¸¦ ÀÇ¹ÌÇÑ´Ù.
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
 * {n,}		n°³ ÀÌ»óÀ» ÀÇ¹ÌÇÑ´Ù.
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
 * {n, m} n°³ºÎÅÍ m°³±îÁö
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
 * ?	¾øÀ½ ¶Ç´Â ÇÑ °³
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
 * ()	±×·ìÇÎ. ¼Ò°ıÈ£ ¾ÈÀÇ ¹®ÀÚ¸¦ ÇÏ³ª·Î ÀÎ½Ä.
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
 *  ^ ¹®ÀÚ¿­ÀÇ ½ÃÀÛ
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
 *  $ ¹®ÀÚ¿­ÀÇ Á¾·áÁöÁ¡
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
//		String[] data = {"123","012", "3GT", "¾È³ç", "Hello"};		
//		Pattern p = Pattern.compile("^[0-9]+$");		// ¼ıÀÚ ÇÑ±ÛÀÚ¶óµµ ÀÖ¾î¾ßÇÏ°í ¼ıÀÚ·Î ³¡³ª¾ßÇÔ
//		
//		for(int i=0; i < data.length; i++) {
//			Matcher m = p.matcher(data[i]);
//			if(m.matches())
//				System.out.println(data[i] + " ¼ıÀÚÀÔ´Ï´Ù.");	
//			else
//				System.out.println(data[i] + " ¼ıÀÚ°¡ ¾Æ´Õ´Ï´Ù.");    
//		}
//	}
//}

/* 
 * ½ÇÇà °á°ú
123 ¼ıÀÚÀÔ´Ï´Ù.
012 ¼ıÀÚÀÔ´Ï´Ù.
3GT ¼ıÀÚ°¡ ¾Æ´Õ´Ï´Ù.
¾È³ç ¼ıÀÚ°¡ ¾Æ´Õ´Ï´Ù.
Hello ¼ıÀÚ°¡ ¾Æ´Õ´Ï´Ù.
 */

/////////////////////////////////////////////////////////////////////////////

//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class RegularExpressionTest {
//	
//	public static void main(String[] args) {
//		String[] data = {"123","012", "3GT", "¾È³ç", "Hello"};		
//		Pattern p = Pattern.compile("^[a-zA-Z]+$");		// ¿µ¹®ÀÚ ÇÑ±ÛÀÚ¶óµµ ÀÖ¾î¾ß ÇÏ°í, ¿µ¹®ÀÚ·Î ³¡³ª¾ßÇÔ
//		
//		for(int i=0; i < data.length; i++) {
//			Matcher m = p.matcher(data[i]);
//			if(m.matches())
//				System.out.println(data[i] + " ¿µ¹®ÀÚÀÔ´Ï´Ù.");	
//			else
//				System.out.println(data[i] + " ¿µ¹®ÀÚ°¡ ¾Æ´Õ´Ï´Ù.");    
//		}
//	}
//}

/*
 * ½ÇÇà °á°ú
 * 
123 ¿µ¹®ÀÚ°¡ ¾Æ´Õ´Ï´Ù.
012 ¿µ¹®ÀÚ°¡ ¾Æ´Õ´Ï´Ù.
3GT ¿µ¹®ÀÚ°¡ ¾Æ´Õ´Ï´Ù.
¾È³ç ¿µ¹®ÀÚ°¡ ¾Æ´Õ´Ï´Ù.
Hello ¿µ¹®ÀÚÀÔ´Ï´Ù.
 * 
 */

/////////////////////////////////////////////////////////////////////////////

//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class RegularExpressionTest {
//	
//	public static void main(String[] args) {
//		String[] data = {"123","012", "3GT", "¾È³ç", "Hello"};		
//		Pattern p = Pattern.compile("^[°¡-ÆR]+$");		
		// ÇÑ±ÛÀÎÁö ¾Æ´ÑÁö ÆÇº°ÇÏ´Â Á¤±Ô½Ä // ÇÑ±ÛÀÌ ÇÑ±ÛÀÚ¶óµµ µé¾î°¡¾ßÇÏ°í, ÇÑ±Û·Î ³¡³ª¾ßÇÔ
//		
//		for(int i=0; i < data.length; i++) {
//			Matcher m = p.matcher(data[i]);
//			if(m.matches())
//				System.out.println(data[i] + " ÇÑ±ÛÀÔ´Ï´Ù.");	
//			else
//				System.out.println(data[i] + " ÇÑ±ÛÀÌ ¾Æ´Õ´Ï´Ù.");    
//		}
//	}
//}

/*
 * ½ÇÇà °á°ú
 * 
123 ÇÑ±ÛÀÌ ¾Æ´Õ´Ï´Ù.
012 ÇÑ±ÛÀÌ ¾Æ´Õ´Ï´Ù.
3GT ÇÑ±ÛÀÌ ¾Æ´Õ´Ï´Ù.
¾È³ç ÇÑ±ÛÀÔ´Ï´Ù.
Hello ÇÑ±ÛÀÌ ¾Æ´Õ´Ï´Ù.
 */

/*
[°¡-ÆR]À» »ìÆìº¸¸é, À¯´ÏÄÚµå¿¡¼­ '°¡'´Â ÇÑ±Û ¹®ÀÚ ÁıÇÕ¿¡¼­ °¡Àå Ã¹ ¹øÂ° ¹®ÀÚ°í, 'ÆR'´Â °¡Àå ¸¶Áö¸· ¹®ÀÚ´Ù. ±×¸®°í ÇÏÀÌÇÂ(-)Àº ¹®ÀÚÀÇ ¹üÀ§¸¦ ³ªÅ¸³»¹Ç·Î, [°¡-ÆR] ÆĞÅÏÀº [A-Z] ÆĞÅÏ°ú ¸¶Âù°¡Áö·Î '°¡' ¹®ÀÚºÎÅÍ 'ÆR' ¹®ÀÚ »çÀÌ¿¡ ÀÖ´Â ¸ğµç ¹®ÀÚ¸¦ ³ªÅ¸³½´Ù. Áï, [°¡-ÆR] ÆĞÅÏÀº ¸ğµç ÇÑ±Û ¹®ÀÚ¿Í ÀÏÄ¡ÇÑ´Ù.

ÀÌ ¿¹Á¦´Â À¯´ÏÄÚµå È¯°æ¿¡¼­¸¸ Á¦´ë·Î µ¿ÀÛÇÑ´Ù. µû¶ó¼­ EUC-KR µîÀ¸·Î ÀÎÄÚµù µÈ ÅØ½ºÆ®ÀÏ °æ¿ì´Â ÀÏÄ¡ÇÏÁö ¾Ê´Â´Ù.
*/

/////////////////////////////////////////////////////////////////////

//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class RegularExpressionTest {
//	
//	public static void main(String[] args) {
//		String[] data = {"ca", "cA", "c."};		
//		Pattern p = Pattern.compile("c\\.");		// \. Á¡ ¹®ÀÚ¸¦ ÀÇ¹Ì
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
//		Pattern p = Pattern.compile("\\w+@\\w+\\.\\w+(\\.\\w+)?");		// ÀÌ¸ŞÀÏ ÁÖ¼Ò
		//\\w : ¿µ¼ıÀÚ , \\. : Á¡ ¹®ÀÚ ±× ÀÚÃ¼, ( ) : ±×·ìÈ­, ? : ¾ø°Å³ª ÇÏ³ª
//		
//		for(int i=0; i < data.length; i++) {
//			Matcher m = p.matcher(data[i]);
//			if(m.matches())
//				System.out.println(data[i] + " À¯È¿ÇÑ ÀÌ¸ŞÀÏ ÁÖ¼ÒÀÔ´Ï´Ù.");	
//			else
//				System.out.println(data[i] + " À¯È¿ÇÑ ÀÌ¸ŞÀÏ ÁÖ¼Ò°¡ ¾Æ´Õ´Ï´Ù.");    
//		}
//	}
//}

/*
 *  ½ÇÇà °á°ú
 *  
hello À¯È¿ÇÑ ÀÌ¸ŞÀÏ ÁÖ¼Ò°¡ ¾Æ´Õ´Ï´Ù.
hello@ À¯È¿ÇÑ ÀÌ¸ŞÀÏ ÁÖ¼Ò°¡ ¾Æ´Õ´Ï´Ù.
hello@naver À¯È¿ÇÑ ÀÌ¸ŞÀÏ ÁÖ¼Ò°¡ ¾Æ´Õ´Ï´Ù.
hello@naver.com À¯È¿ÇÑ ÀÌ¸ŞÀÏ ÁÖ¼ÒÀÔ´Ï´Ù.
good@good.co.kr À¯È¿ÇÑ ÀÌ¸ŞÀÏ ÁÖ¼ÒÀÔ´Ï´Ù.
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
//		Pattern p = Pattern.compile("^\\d{2,3}-\\d{3,4}-\\d{4}$");		// ÀüÈ­¹øÈ£
//		// ¼ıÀÚ 2~3°³ÀÎ°ÍÀ¸·Î ½ÃÀÛ, - , ¼ıÀÚ 3~4°³ÀÎ°Í, - , ¼ıÀÚ 4°³·Î ³¡³ª´Â °Í
//		for(int i=0; i < data.length; i++) {
//			Matcher m = p.matcher(data[i]);
//			if(m.matches())
//				System.out.println(data[i] + " À¯È¿ÇÑ ÀüÈ­¹øÈ£ÀÔ´Ï´Ù.");	
//			else
//				System.out.println(data[i] + " À¯È¿ÇÑ ÀüÈ­¹øÈ£°¡ ¾Æ´Õ´Ï´Ù.");    
//		}
//	}
//}

/*
 * ½ÇÇà °á°ú
 * 
02 À¯È¿ÇÑ ÀüÈ­¹øÈ£°¡ ¾Æ´Õ´Ï´Ù.
02-123 À¯È¿ÇÑ ÀüÈ­¹øÈ£°¡ ¾Æ´Õ´Ï´Ù.
02-123-456 À¯È¿ÇÑ ÀüÈ­¹øÈ£°¡ ¾Æ´Õ´Ï´Ù.
02-123-4567 À¯È¿ÇÑ ÀüÈ­¹øÈ£ÀÔ´Ï´Ù.
02-1234-4567 À¯È¿ÇÑ ÀüÈ­¹øÈ£ÀÔ´Ï´Ù.
031-1234-5678 À¯È¿ÇÑ ÀüÈ­¹øÈ£ÀÔ´Ï´Ù.
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
//		Pattern p = Pattern.compile("^01(0|1|[6-9])-(\\d{3}|\\d{4})-\\d{4}$");		// ÇÚµåÆù ¹øÈ£
//		// 0,1·Î ½ÃÀÛÇÏ¸é¼­ (0ÀÌ°Å³ª 1ÀÌ°Å³ª 6~9 Áß ÇÏ³ª), -, ¼ıÀÚ°¡ 3°³ÀÌ°Å³ª ¼ıÀÚ°¡ 4°³ÀÌ°Å³ª, -, ¼ıÀÚ°¡ 4°³·Î ³¡³ª¾ßÇÔ
//		
//		for(int i=0; i < data.length; i++) {
//			Matcher m = p.matcher(data[i]);
//			if(m.matches())
//				System.out.println(data[i] + " À¯È¿ÇÑ ÇÚµåÆù ¹øÈ£ÀÔ´Ï´Ù.");	
//			else
//				System.out.println(data[i] + " À¯È¿ÇÑ ÇÚµåÆù ¹øÈ£°¡ ¾Æ´Õ´Ï´Ù.");    
//		}
//	}
//}

/*
½ÇÇà °á°ú
010 À¯È¿ÇÑ ÇÚµåÆù ¹øÈ£°¡ ¾Æ´Õ´Ï´Ù.
010-1234-5678 À¯È¿ÇÑ ÇÚµåÆù ¹øÈ£ÀÔ´Ï´Ù.
02-123-456 À¯È¿ÇÑ ÇÚµåÆù ¹øÈ£°¡ ¾Æ´Õ´Ï´Ù.
02-123-4567 À¯È¿ÇÑ ÇÚµåÆù ¹øÈ£°¡ ¾Æ´Õ´Ï´Ù.
02-1234-4567 À¯È¿ÇÑ ÇÚµåÆù ¹øÈ£°¡ ¾Æ´Õ´Ï´Ù.
031-1234-5678 À¯È¿ÇÑ ÇÚµåÆù ¹øÈ£°¡ ¾Æ´Õ´Ï´Ù.
*/

//////////////////////////////////////////////////////////////////////////

//import java.util.regex.*;	// Pattern°ú Matcher°¡ ¼ÓÇÑ ÆĞÅ°Áö
//
//class RegularExpressionTest {
//	public static void main(String[] args) 
//	{
//		String[] data = {"bat", "baby", "bonus",
//				    "cA","ca", "co", "c.", "c0", "car","combat","count",
//				    "date", "disc"};		
//		Pattern p = Pattern.compile("c[a-z]*");	// c·Î ½ÃÀÛÇÏ´Â ¼Ò¹®ÀÚ¿µ´Ü¾î
//		
//		for(int i=0; i < data.length; i++) {
//			Matcher m = p.matcher(data[i]);
//			if(m.matches())
//				System.out.print(data[i] + ",");
//		}
//	}
//}

// ½ÇÇà °á°ú
// ca,co,car,combat,count,

//////////////////////////////////////////////////////////////////////////

//import java.util.regex.*;	// Pattern°ú Matcher°¡ ¼ÓÇÑ ÆĞÅ°Áö
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
//			System.out.print("Pattern : " + pattern[x] + "  °á°ú: ");
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
½ÇÇà °á°ú
	
Pattern : .*  °á°ú: bat,baby,bonus,c,cA,ca,co,c.,c0,c#,car,combat,count,date,disc,
Pattern : c[a-z]*  °á°ú: c,ca,co,car,combat,count,
Pattern : c[a-z]  °á°ú: ca,co,
Pattern : c[a-zA-Z]  °á°ú: cA,ca,co,
Pattern : c[a-zA-Z0-9]  °á°ú: cA,ca,co,c0,
Pattern : c.  °á°ú: cA,ca,co,c.,c0,c#,
Pattern : c.*  °á°ú: c,cA,ca,co,c.,c0,c#,car,combat,count,
Pattern : c\.  °á°ú: c.,
Pattern : c\w  °á°ú: cA,ca,co,c0,
Pattern : c\d  °á°ú: c0,
Pattern : c.*t  °á°ú: combat,count,
Pattern : [b|c].*  °á°ú: bat,baby,bonus,c,cA,ca,co,c.,c0,c#,car,combat,count,
Pattern : .*a.*  °á°ú: bat,baby,ca,car,combat,date,
Pattern : .*a.+  °á°ú: bat,baby,car,combat,date,
Pattern : [b|c].{2}  °á°ú: bat,car,
*/

///////////////////////////////////////////////////////////////////

//import java.util.regex.*;	// Pattern°ú Matcher°¡ ¼ÓÇÑ ÆĞÅ°Áö
//
//class RegularExpressionTest{
//	public static void main(String[] args) {
//		String source  = "HP:011-1111-1111, HOME:02-999-9999 ";
//		String pattern = "(0\\d{1,2})-(\\d{3,4})-(\\d{4})";
//		//0, ¼ıÀÚ°¡ 1°³ÀÌ°Å³ª 2°³, - , ¼ıÀÚ°¡ 3°³ÀÌ°Å³ª 4°³, -, ¼ıÀÚ°¡ 4°³·Î ³¡³ª´Â °ÍÀº?
//		Pattern p = Pattern.compile(pattern);
//		Matcher m = p.matcher(source);
//
//		int i=0;
//
//		while(m.find()) {
//			System.out.println( ++i + ": " + m.group() + " -> "+ m.group(1) +", "+ m.group(2)+", "+ m.group(3));		
//		}
//	} // mainÀÇ ³¡
//}

/*
½ÇÇà °á°ú

1: 011-1111-1111 -> 011, 1111, 1111
2: 02-999-9999 -> 02, 999, 9999

*/

/*
	Á¤±Ô½ÄÀÇ ÀÏºÎ¸¦ °ıÈ£·Î ³ª´©¾î ¹­¾î¼­ ±×·ìÈ­(grouping)ÇÒ ¼ö ÀÖ´Ù. ±×·ìÈ­µÈ ºÎºĞÀº
	ÇÏ³ªÀÇ ´ÜÀ§·Î ¹­ÀÌ´Â ¼ÀÀÌ µÇ¾î¼­ ÇÑ ¹ø ¶Ç´Â ±× ÀÌ»óÀÇ ¹İº¹À» ÀÇ¹ÌÇÏ´Â '+' ³ª '*'°¡
	µÚ¿¡ ¿À¸é ±×·ìÈ­µÈ ºÎºĞÀÌ Àû¿ë´ë»óÀÌ µÈ´Ù. ±×¸®°í ±×·ìÈ­µÈ ºÎºĞÀº group(int i)¸¦
	ÀÌ¿ëÇØ¼­ ³ª´©¾î ¾òÀ» ¼ö ÀÖ´Ù.
	 À§ÀÇ ¿¹Á¦¿¡¼­ '(0\\d{1,2})-(\\d{3,4})-(\\d{4})'Àº °ıÈ£¸¦ ÀÌ¿ëÇØ¼­ Á¤±Ô½ÄÀ»
	 ¼¼ ºÎºĞÀ¸·Î ³ª´©¾ú´Âµ¥ ¿¹Á¦¿Í °á°ú¿¡¼­ ¾Ë ¼ö ÀÖµíÀÌ ¸ÅÄªµÇ´Â ¹®ÀÚ¿­¿¡¼­ Ã¹ ¹øÂ° ±×·ìÀº
	 group(1)·Î µÎ ¹øÂ° ±×·ìÀº group(2)¿Í °°ÀÌ È£ÃâÇÔÀ¸·Î½á ¾òÀ» ¼ö ÀÖ´Ù. group()
	 ¶Ç´Â group(0)Àº ±×·ìÀ¸·Î ¸ÅÄªµÈ ¹®ÀÚ¿­À» ÀüÃ¼¸¦ ³ª´©¾îÁöÁö ¾ÊÀº Ã¤·Î ¹İÈ¯ÇÑ´Ù.
	 
	 [Âü°í] group(int i)¸¦ È£ÃâÇÒ ¶§ i°¡ ½ÇÁ¦ ±×·ìÀÇ ¼öº¸´Ù ¸¹À¸¸é java.lang.IndexOutOfBoundsException
	 ÀÌ ¹ß»ıÇÑ´Ù.
	 
	 Á¤±Ô½Ä ÆĞÅÏ				¼³¸í
	 0\\d{1,2}				0À¸·Î ½ÃÀÛÇÏ´Â ÃÖ¼Ò 2ÀÚ¸® ÃÖ´ë 3ÀÚ¸® ¼ıÀÚ(0Æ÷ÇÔ)
	 \\d{3,4}				ÃÖ¼Ò 3ÀÚ¸® ÃÖ´ë 4ÀÚ¸®ÀÇ ¼ıÀÚ
	 \\d{4}					4ÀÚ¸®ÀÇ ¼ıÀÚ
	 
	 find()´Â ÁÖ¾îÁø ¼Ò½º ³»¿¡¼­ ÆĞÅÏ°ú ÀÏÄ¡ÇÏ´Â ºÎºĞÀ» Ã£¾Æ³»¸é true¸¦ ¹İÈ¯ÇÏ°í Ã£Áö
	 ¸øÇÏ¸é false¸¦ ¹İÈ¯ÇÑ´Ù. find()¸¦ È£ÃâÇØ¼­ ÆĞÅÏ°ú ÀÏÄ¡ÇÏ´Â ºÎºĞÀ» Ã£¾Æ³½ ´ÙÀ½,
	 ´Ù½Ã find()¸¦ È£ÃâÇÏ¸é ÀÌÀü¿¡ ¹ß°ßÇÑ ÆĞÅÏ°ú ÀÏÄ¡ÇÏ´Â ºÎºĞÀÇ ´ÙÀ½ºÎÅÍ ´Ù½Ã
	 ÆĞÅÏ¸ÅÄªÀ» ½ÃÀÛÇÑ´Ù.
	 
	 Matcher m = p.matcher(source);
	 
	 while(m.find()){		// find()´Â ÀÏÄ¡ÇÏ´Â ÆĞÅÏÀÌ ¾øÀ¸¸é false¸¦ ¹İÈ¯ÇÑ´Ù.
	 	System.out.println(m.group());
	 }
*/

/////////////////////////////////////////////////////////////////////////////

//import java.util.regex.*;	// Pattern°ú Matcher°¡ ¼ÓÇÑ ÆĞÅ°Áö
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
//			System.out.println(++i + "¹øÂ° ¸ÅÄª:" + m.start() + "~"+ m.end());
//
//            // brokenÀ» drunkenÀ¸·Î Ä¡È¯ÇÏ¿© sb¿¡ ÀúÀåÇÑ´Ù.
//			m.appendReplacement(sb, "drunken");  
//		}
//
//		m.appendTail(sb);
//		System.out.println("Replacement count : " + i);
//		System.out.println("result:"+sb.toString());
//	}
//}

/*
½ÇÇà °á°ú

source:A broken hand works, but not a broken heart.
1¹øÂ° ¸ÅÄª:2~8
2¹øÂ° ¸ÅÄª:31~37
Replacement count : 2
result:A drunken hand works, but not a drunken heart.

*/

/*
MatcherÀÇ find()·Î Á¤±Ô½Ä°ú ÀÏÄ¡ÇÏ´Â ºÎºĞÀ» Ã£À¸¸é, ±× À§Ä¡¸¦ start()¿Í end()·Î ¾Ë¾Æ³¾ ¼ö
ÀÖ°í appendReplacement(StringBuffer sb, String replacement)¸¦ ÀÌ¿ëÇØ¼­ ¿øÇÏ´Â
¹®ÀÚ¿­(replacement)·Î Ä¡È¯ÇÒ ¼ö ÀÖ´Ù. Ä¡È¯µÈ °á°ú´Â StringBufferÀÎ sb¿¡ ÀúÀåµÇ´Âµ¥,
sb¿¡ ÀúÀåµÇ´Â ³»¿ëÀ» ´Ü°èº°·Î »ìÆìº¸¸é ÀÌÇØÇÏ±â ½¬¿ï °ÍÀÌ´Ù.

1. ¹®ÀÚ¿­ source¿¡¼­ "broken"À» m.find()·Î Ã£Àº ÈÄ Ã³À½À¸·Î 
m.appendReplacement(sb, "drunken"); °¡ È£ÃâµÇ¸é sourceÀÇ ½ÃÀÛºÎÅÍ "broken"À» Ã£Àº
À§Ä¡±îÁöÀÇ ³»¿ë¿¡ "drunken"À» ´õÇØ¼­ ÀúÀåÇÑ´Ù.
- sb¿¡ ÀúÀåµÈ ³»¿ë : "A drunken"

2. m.find()´Â Ã¹ ¹øÂ°·Î ¹ß°ßµÈ À§Ä¡ÀÇ ³¡¿¡¼­ºÎÅÍ ´Ù½Ã °Ë»öÀ» ½ÃÀÛÇÏ¿© µÎ ¹øÂ°
"broken"À» Ã£°Ô µÈ´Ù. ´Ù½Ã m.appendReplacement(sb, "drunken");°¡ È£Ãâ
- sb¿¡ ÀúÀåµÈ ³»¿ë : "A drunken hand works, but not a drunken"

3. m.appendTail(sb);ÀÌ È£ÃâµÇ¸é ¸¶Áö¸·À¸·Î Ä¡È¯µÈ ÀÌÈÄÀÇ ºÎºĞÀ» sb¿¡ µ¡ºÙÀÎ´Ù.
- sb¿¡ ÀúÀåµÈ ³»¿ë : "A drunken hand works, but not a drunken heart."

*/