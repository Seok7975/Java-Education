interface Viewable {
    @Deprecated
    public void showIt(String str);

    public void brShowIt(String str);
}

class Viewer implements Viewable {
    @Override 
    @SuppressWarnings("deprecation")
    public void showIt(String str) {
        System.out.println(str);
    }

    @Override
    public void brShowIt(String str) {
        System.out.println('[' + str + ']');
    }
};

class AtSuppressWarnings {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Viewable view = new Viewer();     
        view.showIt("Hello Annotations");
        view.brShowIt("Hello Annotations");
    }
}

/*
@SuppressWarnings
�ռ� ���������� �������̽��� ����� �޼ҵ� �ϳ��� Deprecated �Ǿ
������ ��� �߻��ϴ� ��Ȳ�� �����Ͽ���. �׷��� �ش� �޼ҵ带
��ü�� �� �ִ� ��Ȳ�� �ƴϾ ��а� �� �޼ҵ带 �����ϰ� ȣ���ؾ�
�ϴ� ��Ȳ�̶�� @SuppressWarnings ������ ���� �����Ϸ���
��� ���� �� �ִ�. �����Ϸ��� ��� �޽����� �����ϴ� Ư�� ��Ȳ��
���ؼ�, ��� �޽����� �������� ����� ��û�� �� �ֳ����̼� Ÿ��
@SuppressWarnings�� ����Ѵ�. ���� �� Deprecated�� �޼ҵ���
��뿡 ���� ��� ������ ����� ��û�Ϸ��� ���� ������ �߰��ϸ� �ȴ�.

@SuppressWarnings("deprecation")
*/