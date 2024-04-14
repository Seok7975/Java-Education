class StringEquals
{
    public static void main(String[] args)
    {
        //new �����ڸ� �̿��� ���
        String str1=new String("Hi my string");
        String str2=new String("Hi my string");

        //���ͷ��� �̿��� ���
		//String str1="Hi my string";		//== -> �����ϴ�, equals -> �����ϴ�
		//String str2="Hi my string";


        if(str1==str2)
            System.out.println("���� ����� �����ϴ�.");
        else
            System.out.println("���� ����� �������� �ʴ�.");

        if(str1.equals(str2))	//Object Ŭ������ �޼ҵ带 �������̵�
            System.out.println("�ν��Ͻ� ������ �����ϴ�.");
        else
            System.out.println("�ν��Ͻ� ������ �������� �ʴ�.");
    }
}

//<��°��>
//1. ���� ����� �������� �ʴ�.
//  ( == : ��ü�� �ּҰ��� ��, Primitive Type�� ��ü�� �� �� ����, Reference Type ��ü�� �ּҸ� ��)
//  Primitive Type�� ��ü�� Constant Pool�� Ư���� ���� �����ϴ� �����̱⿡, �ᱹ Constant Pool���� ������ �ּҸ� ���մϴ�.
//  (�ش� �ּҰ� �����ϱ⿡ ==�� ����ؼ� �񱳰� ����)
//2. �ν��Ͻ� ������ �����ϴ�.    (StringŬ������ a.equals(b) : ��ü�� ���ϴ� �� ����� �����Ͱ��� ��)

// ����)
//ObjectŬ������ equals()�� ==�� �����ϰ� �ּҰ��� ���ϴ� �޼ҵ�

/*
String�� �Ϲ����� Ÿ���� �ƴ϶� Ŭ����
Ŭ������ �⺻������ Call by Reference���·� ��ü ���� �� �ּҰ��� �ο��˴ϴ�.
�׷��⿡ String Ÿ���� ������������ ���� ���� �ο��ϴ��� ������ �ּҰ��� �ٸ��ϴ�.
 */


//cf)https://velog.io/@ilil1/%EC%9E%90%EB%B0%94%EC%97%90%EC%84%9C-equals%EC%99%80-%EC%9D%98-%EC%B0%A8%EC%9D%B4