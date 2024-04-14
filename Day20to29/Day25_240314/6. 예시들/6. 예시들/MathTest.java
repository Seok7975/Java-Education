.
public class MathTest {

	public static void main(String[] args) {
		double num1 = 50.5678;		
		double num2 = 30.3567;		
		
		System.out.println(Math.round(num1));		// 51
		System.out.println(Math.round(num2));		// 30
		
		System.out.println("==============================");
		
		System.out.println(Math.pow(2, 2));	// 2ÀÇ 2Á¦°ö(2 * 2)
		System.out.println(Math.pow(2, 3));	// 2ÀÇ 3Á¦°ö(2 * 2 * 2)
		System.out.println(Math.pow(2, 4));	// 2ÀÇ 4Á¦°ö(2 * 2 * 2 * 2)
		
		System.out.println("==============================");
		
		System.out.println(Math.pow(10, 2));	// 10ÀÇ 2Á¦°ö(10 * 10)
		System.out.println(Math.pow(10, 3));	// 10ÀÇ 3Á¦°ö(10 * 10 * 10)
		System.out.println(Math.pow(10, 4));	// 10ÀÇ 4Á¦°ö(10 * 10 * 10 * 10)
		
		System.out.println("==============================");
		System.out.println(Math.abs(10));
		System.out.println(Math.abs(-10));
		
		System.out.println("==============================");
		
		System.out.println(Math.min(10, 20)); //ÃÖ¼Ò°ªÀº?
		System.out.println(Math.min(20, 10));
		
		System.out.println("==============================");
		
		System.out.println(Math.max(10, 20));	//ÃÖ´ë°ªÀº?
		System.out.println(Math.max(20, 10));
	}
}