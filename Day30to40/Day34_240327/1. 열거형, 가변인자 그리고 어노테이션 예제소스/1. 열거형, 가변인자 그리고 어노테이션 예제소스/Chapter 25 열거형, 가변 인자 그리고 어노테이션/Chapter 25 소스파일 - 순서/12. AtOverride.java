interface Viewable {
    public void showIt(String str);
}

class Viewer implements Viewable {
    @Override
    public void showIt(String str) {
        System.out.println(str);
    }
};

class AtOverride {
    public static void main(String[] args) {
        Viewable view = new Viewer();
        view.showIt("Hello Annotations");
    }
}
/*
Hello Annotations
*/

/*
������̼�
�ڹ� �����Ϸ����� �޽����� �����ϴ� ������ �޸�

������̼��� ���� ����
������̼��� �ڹ� 5���� �Ұ��Ǿ���. �׸��� ��� �Ұ���
'������̼� Ÿ��(Annotation Types)' �� ������ ������ ����.
(�̵��� '������̼� Ÿ��'�̶� �Ѵ�.)

@Override
@Deprecated
@SuppressWarnings
*/
/*
@Override
"���� Ŭ������ �޼ҵ� �������̵� �Ǵ� �������̽��� ����� �߻� �޼ҵ���
�����Դϴ�."
���� �̿� ��߳� �޼ҵ� ���ǰ� �̷����� ������ ������ �̾����� �츮��
�Ͽ��� �߸��� �κ��� Ȯ���� �� �ְ� ���ش�.
*/