import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

class CopyList {
    public static void main(String[] args) {
        List<String> src = Arrays.asList("Box", "Apple", "Toy", "Robot");

        // ���纻�� ���� ���        
        List<String> dest = new ArrayList<>(src);

        // �����Ͽ� �� ����� ���
        Collections.sort(dest);
        System.out.println(dest);

        // ������ ���� ������ ���·� �ǵ����� ��
        Collections.copy(dest, src);

        // �ǵ��� Ȯ��
        System.out.println(dest);
    }
}

/*
���� ���
[Apple, Box, Robot, Toy]
[Box, Apple, Toy, Robot]
*/

/*
�����ϱ�

������ ����Ʈ ������ �÷��� �ν��Ͻ��� ����� ������ �����ϴ� ����� �޼ҵ��̴�.
���� �� �޼ҵ嵵 Collections Ŭ������ ���ǵǾ� �ִ�.

public static <T> void copy(List<? super T> dest, List<? extends T> src)
	-> src�� ������ dest�� ����
	
List<T> dest �ƴ� List<? super T> dest �� ������?
	-> dest�� T�� �ν��Ͻ��� �ִ� �͸� ����ϰڴ�. ������ ������ ����!
	
List<T> src �ƴ� List<? extends T> src �� ������?
	-> src�κ��� T�� �ν��Ͻ� ������ �͸� ����ϰڴ�. ������ ������ ����!
	
�� �޼ҵ� ȣ�� �� �Ѱ��� ������ ���� �Ű����� dest�� ���޵Ǵ� �÷��� �ν��Ͻ��� ���� ������
src�� ���޵Ǵ� �÷��� �ν��Ͻ��� ���� �������� ũ�ų� �ּ��� ���ƾ� �Ѵٴ� ���̴�. ���࿡
dest�� ���޵� �ν��Ͻ��� ���� ������ �۴ٸ� ������ �������� ������ �ڵ����� ���� �ʰ�
���ܰ� �߻��Ѵ�.

�� �������� ���̵��� �÷��� �ν��Ͻ��� �������� ���� ���¿��� ���纻�� ������� ���� ����� ����ϸ� �ȴ�.

List<String> dest = new ArrayList<>(src);

�� copy �޼ҵ�� ���� ������ ������� �ʴ´�. �׷��� �̹� ������ �÷��� �ν��Ͻ��� ������
��°�� �ٲٷ��� ��쿡 copy �޼ҵ�� �����ϰ� ���ȴ�. 
*/