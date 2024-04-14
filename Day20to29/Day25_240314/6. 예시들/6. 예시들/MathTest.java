.
public class MathTest {

	public static void main(String[] args) {
		double num1 = 50.5678;		
		double num2 = 30.3567;		
		
		System.out.println(Math.round(num1));		// 51
		System.out.println(Math.round(num2));		// 30
		
		System.out.println("==============================");
		
		System.out.println(Math.pow(2, 2));	// 2�� 2����(2 * 2)
		System.out.println(Math.pow(2, 3));	// 2�� 3����(2 * 2 * 2)
		System.out.println(Math.pow(2, 4));	// 2�� 4����(2 * 2 * 2 * 2)
		
		System.out.println("==============================");
		
		System.out.println(Math.pow(10, 2));	// 10�� 2����(10 * 10)
		System.out.println(Math.pow(10, 3));	// 10�� 3����(10 * 10 * 10)
		System.out.println(Math.pow(10, 4));	// 10�� 4����(10 * 10 * 10 * 10)
		
		System.out.println("==============================");
		System.out.println(Math.abs(10));
		System.out.println(Math.abs(-10));
		
		System.out.println("==============================");
		
		System.out.println(Math.min(10, 20)); //�ּҰ���?
		System.out.println(Math.min(20, 10));
		
		System.out.println("==============================");
		
		System.out.println(Math.max(10, 20));	//�ִ밪��?
		System.out.println(Math.max(20, 10));
	}
}