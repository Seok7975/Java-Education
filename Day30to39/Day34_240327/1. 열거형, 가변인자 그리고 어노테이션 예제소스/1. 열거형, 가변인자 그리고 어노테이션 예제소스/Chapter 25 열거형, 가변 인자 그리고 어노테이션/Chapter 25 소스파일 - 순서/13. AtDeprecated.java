interface Viewable {
    @Deprecated
    public void showIt(String str);
    public void brShowIt(String str);
}

class Viewer implements Viewable {
    @Override 
    public void showIt(String str) {
        System.out.println(str);
    }

    @Override
    public void brShowIt(String str) {
        System.out.println('[' + str + ']');
    }
}

class AtDeprecated {
    public static void main(String[] args) {
        Viewable view = new Viewer();
        view.showIt("Hello Annotations");
        view.brShowIt("Hello Annotations");
    }
}

/*
Hello Annotations
[Hello Annotations]
*/

/*
@Deprecated
������ �߻� ������ �ְų� ������ ����� �ٸ� ������ ��ü�Ǿ
�� �̻� �ʿ� ���� �Ǿ����� ���ϴ� �ܾ Deprecated�̴�.
���� ������ ȣȯ�� ������ ���� ���������� ���Ŀ� ����� ��
�ִ� Ŭ���� �Ǵ� �޼ҵ带 ������ Deprecated �Ǿ��ٰ� �Ѵ�.
�׸��� @Deprecated ������ ���ؼ� �츮�� �ۼ��� �ڵ���
�Ϻο��� Deprecated ������ �� �� �ִ�.

���� ������ ����� ����, �������� �� �Ǿ����� �����Ϸ��� ����
�޽����� �����Ѵ�.

Note: AtDeprecated.java uses or overrides a deprecated API.

�̴� ������ �� �ڵ忡 deprecated �� ���𰡸� ��������� �˸��� �޽����̴�.
��ü������ ��� �κп��� �̷��� ���� �߻��ߴ��� Ȯ���Ϸ��� ���� ������ �����
���� �ֵ��� ������ ���� �ɼ��� �߰��Ͽ� ������ �ϸ� �ȴ�.(������ -Xlint��
�߰��ص� Ȯ���� �� �ִ�.)

C:\JavaStudy>javac -Xlint:deprecation AtDeprecated.java

�׷� ���� ���� �������̽� ���Ǹ� ����.

interface Viewable {
    @Deprecated
    public void showIt(String str);
    public void brShowIt(String str);
}

���� �������̽��� ����� showIt �޼ҵ尡 Deprecated �Ǿ���. ���� �����Ϸ���
�� �޼ҵ带 ȣ���ϴ� ���� ������ ����Ѵ�.

public static void main(String[] args){
	Viewable view = new Viewer();
	view.showIt("Hello Annotations");		// �����Ϸ��� ����ϴ� ����
	...
}

�Ӹ� �ƴ϶� �����Ϸ��� Deprecated �� �޼ҵ带 �����ϴ� ���� �κп�
���ؼ��� ����Ѵ�.

class Viewer implements Viewable {
	@Override
	public void showIt(String str){		// �����Ϸ��� ����ϴ� �κ�
		System.out.println(str);
	}
	...
}

�̷��� �츮�� �ۼ��� �ڵ忡���� �Ϻ� ���뿡 ���� Deprecated ������
�� �� �ִ�.
*/