import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

class StrComp implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return s1.compareToIgnoreCase(s2);
    }
}

class StringComparator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ROBOT");
        list.add("APPLE");
        list.add("BOX");

        StrComp cmp = new StrComp();    // ���İ� Ž���� ����

        Collections.sort(list, cmp);    // ����
        int idx = Collections.binarySearch(list, "Robot", cmp);   // Ž��
 
        System.out.println(list.get(idx));    // Ž�� ��� ��� 
    }
}

/*
���� ���

ROBOT
*/

/*
ã�� : Comparator<T> ���
Collections Ŭ�������� Comparator<T>�� �����ϴ� Ŭ������ �����Ͽ� Ž����
������ ������ �� �ִ� ���� �޼ҵ嵵 �����Ѵ�.

public static <T> int binarySearch(List<? extends T> list, T key, Comparator<? super T> c)
	-> list���� key�� ã�µ� c�� ������ �����Ͽ� ã�´�.
	
�� �޼ҵ嵵 �Ѵ��� ������ �ʴ´ٸ� ������ ���� �ٿ� ���� ��������.

public static <T> int binarySearch(List<T> list, T key, Comparator<T> c)

�׸��� ���� ������ ���� <? extends T>�� <? super T>�� �ǹ̸� ��������.

"List<T> �ƴϰ� List<? extends T>�� ������ list���� T�� �ν��Ͻ��� ������ �͸� ����ϱ� ����"
"Comparator<T> �ƴϰ� Comparator<? super T>�� ������ ECar Ŭ������ ���� ������ �װ�"

�׷��� ���� �޼ҵ� ��ü�� ���� ���´�.

public static <T> int binarySearch(List<? extends T> list, T key, Comparator<? super T> c)
*/