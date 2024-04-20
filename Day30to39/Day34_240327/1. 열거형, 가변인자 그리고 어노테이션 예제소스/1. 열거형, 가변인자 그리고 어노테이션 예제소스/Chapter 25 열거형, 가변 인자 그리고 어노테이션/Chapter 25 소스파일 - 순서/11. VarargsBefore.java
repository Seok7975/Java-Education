class VarargsBefore {
    public static void showAll(String[] vargs) {
        System.out.println("LEN: " + vargs.length);

        for(String s : vargs) 
            System.out.print(s + '\t');
        System.out.println();
    }

    public static void main(String[] args) {
        showAll(new String[]{"Box"});
        showAll(new String[]{"Box", "Toy"});
        showAll(new String[]{"Box", "Toy", "Apple"});
    }
}
/*
LEN: 1
Box	
LEN: 2
Box	Toy	
LEN: 3
Box	Toy	Apple	
*/

/*
�Ű������� ���� ���� ������ �ڹ� 5���� �߰��� �����̴�.
���� �� �������� ���� ���� �ڵ带 �ۼ��ؾ߸� �ߴ�.

�� �������� ���̵��� ���� ���� ������ ������� �ۼ��� ����
�޼ҵ� ���ǿ� ȣ�⹮��,

public static void showAll(String...vargs){...}

public static void main(String[] args) {
	showAll("Box");
	showAll("Box", "Toy");
	showAll("Box", "Toy", "Apple");
}
������ ���� �ۼ��� ���� �ִ�.

public static void showAll(String[] vargs) {...}
public static void main(String[] args){
	showAll(new String[]{"Box"});
	showAll(new String[]{"Box", "Toy"});
	showAll(new String[]{"Box", "Toy", "Apple"});
}

�׸��� �̰��� �ڹ� �����Ϸ��� ���� ���� ���� �� �޼ҵ� ȣ�⹮��
ó���ϴ� ����̱⵵ �ϴ�. �� �����Ϸ��� ���� �޼ҵ� ���Ǹ�,

public static void showAll(String...vargs){...}

������ ���� �����Ͽ� ������ �Ϸ��Ѵ�.

public static void showAll(String[] vargs){...}

�׸��� ���� �޼ҵ带 ȣ���ϴ� ���� ������,

showAll("Box", "Toy", "Apple");

������ ���� �����Ͽ� �������� �Ϸ��Ѵ�.

showAll(new String[]{"Box", "Toy", "Apple"});
*/