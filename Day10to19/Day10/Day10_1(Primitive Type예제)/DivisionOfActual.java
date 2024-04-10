//나눗셈 할땐 Primitive_Type(비객체 타입)이 중요하다.
//비객체 타입은 null값을 가질 수 없다.
//자바에서 기본 자료형은 반드시 사용 전 선언되어야 한다.
//OS에 따라 자료형의 길이가 변하지 않는다.

public class Test {

	public static void main(String[] args) {
		System.out.println(3/0.0);		// Infinity
		System.out.println(3%0.0);		// NaN
		System.out.println(3/(3/0.0)); 		// 0.0
		System.out.println(3%(3/0.0)); 	// 3.0
		System.out.println(0.0/0.0);		// NaN 
		System.out.println(0.0%0.0);		// NaN 
		System.out.println( (3/0.0)/3 );	// Infinity
		System.out.println( (3/0.0)%3 );	// NaN
		System.out.println( (3/0.0)/(3/0.0) );	// NaN
		System.out.println( (3/0.0)%(3/0.0) );	// NaN
	}
}

// NaN Not a Number
// Infinity	[수학] 무한대