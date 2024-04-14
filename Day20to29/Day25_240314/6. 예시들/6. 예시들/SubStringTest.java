
public class SubStringTest {

	public static void main(String[] args) {
		String str = "0123456789";
		
		System.out.println(str.substring(0));	// 0123456789
		System.out.println(str.substring(3));	// 3456789
		System.out.println(str.substring(5));	// 56789

		System.out.println("=======================");
		
		System.out.println(str.substring(0, 5));	// 01234  //0<=  	<5
		System.out.println(str.substring(3, 7));	// 3456	//3<=	<7
		System.out.println(str.substring(5, 9));	// 5678	//5<=	<9
		
		System.out.println("=======================");
		
		str = "Good morning";
		
		System.out.println(str.substring(0));	// Good morning
		System.out.println(str.substring(3));	// d morning
		System.out.println(str.substring(5));	// morning
		
		System.out.println("=======================");
		
		System.out.println(str.substring(0, 5));	// Good 
		System.out.println(str.substring(3, 7));	// d mo
		System.out.println(str.substring(5, 9));	// morn
		
		System.out.println("=======================");
		
		str = "012\\345\\678";	
		//문자열 서식(이스케이프 서식)이라 \\ 역슬래시 두개는 하나를 의미!
		System.out.println(str.substring(0,4));		// 012\ //따라서 012\\가아님
		System.out.println(str.substring(0,5));		// 012\3
		
		System.out.println("=======================");
		
		str = "c:\\jdk1.8\\work\\PathSeparateTest.java";	// c:\jdk1.8\work\PathSeparateTest.java
		System.out.println(str);
	
	}
}

/*
String	substring(int beginIndex)	문자열  beginIndex위치부터 끝까지 문자열 자르기
	Returns a string that is a substring of this string.
String	substring(int beginIndex, int endIndex) 문자열  beginIndex 위치 부터 endIndex전까지 문자열
	Returns a string that is a substring of this string.
*/