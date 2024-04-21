import java.util.*;

class TreeSetEx2 {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		int[] score = {80, 95, 50, 35, 45, 65, 10, 100};

		for(int i=0; i < score.length; i++)
//			set.add(new Integer(score[i]));
			set.add(Integer.valueOf(score[i]));

//		System.out.println("50���� ���� �� :"	+ set.headSet(new Integer(50)));
//		System.out.println("50���� ū �� :"	+ set.tailSet(new Integer(50)));
		System.out.println("50���� ���� �� :"	+ set.headSet(Integer.valueOf(50)));
		System.out.println("50���� ū �� :"	+ set.tailSet(Integer.valueOf(50)));
	}
}
/*
50���� ���� �� :[10, 35, 45]
50���� ū �� :[50, 65, 80, 95, 100]
*/

/*
headSet �޼���� tailSet�޼��带 �̿��ϸ�, TreeSet�� ����� ��ü �� ������ ����
������ ū ���� ��ü��� ���� ���� ��ü���� ���� �� �ִ�.
*/
