class ExceptionEx11 {
	public static void main(String[] args) {
		throw new RuntimeException();	// RuntimeException�� ���Ƿ� �߻���Ų��.
	}
}

/*
'RunTimeExceptionŬ������ �� �ڼ�(RuntimeExceptionŬ������)'�� �ش��ϴ� ���ܴ� ���α׷��ӿ� ���� �Ǽ��� �߻��ϴ� �͵��̱� ������ ����ó���� �������� �ʴ� ���̴�. ���� RuntimeException Ŭ�����鿡 ���ϴ� ���ܰ� �߻��� ���ɼ��� �ִ� �ڵ忡�� ����ó���� �ʼ��� �ؾ� �Ѵٸ�, �Ʒ��� ���� ���� ������ �迭�� ���Ǵ� ��� ���� ����ó���� ���־�� �� ���̴�.

try{
	int[] arr = new int[10];
	System.out.println(arr[0]);
} catch(ArrayIndexOutOfBoundsException ae){
	...
} catch(NullPointerException ne) {
	...
}

�����Ϸ��� ����ó���� Ȯ������ �ʴ� RuntimeException Ŭ�������� 'unchecked ����'��� �θ���, ����ó���� Ȯ���ϴ� Exception Ŭ�������� 'checked����'��� �θ���.
*/