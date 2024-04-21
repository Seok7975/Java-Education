interface MyFunction{
	int max(int a, int b);
}

public class LambdaTest {

	public static void main(String[] args) {
		MyFunction f = new MyFunction() {
			public int max(int a, int b) {
				return a > b ? a : b;
			}
		};
		int big = f.max(5, 3);	// 익명 객체의 메소드 호출
		System.out.println(big);
	}
}