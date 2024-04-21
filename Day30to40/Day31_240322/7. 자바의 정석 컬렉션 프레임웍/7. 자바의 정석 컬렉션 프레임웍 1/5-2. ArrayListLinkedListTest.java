import java.util.*; 

public class ArrayListLinkedListTest { 
      public static void main(String args[]) { 
            // �߰��� �������� ������ ����Ͽ� ����� ��ƾ��Ѵ�.
            ArrayList al = new ArrayList(2000000);
            LinkedList ll = new LinkedList(); 

            System.out.println("= ���������� �߰��ϱ� ="); 
            System.out.println("ArrayList :"+add1(al)); 
            System.out.println("LinkedList :"+add1(ll)); 
            System.out.println(); 
            System.out.println("= �߰��� �߰��ϱ� ="); 
            System.out.println("ArrayList :"+add2(al)); 
            System.out.println("LinkedList :"+add2(ll)); 
            System.out.println(); 
            System.out.println("= �߰����� �����ϱ� ="); 
            System.out.println("ArrayList :"+remove2(al)); 
            System.out.println("LinkedList :"+remove2(ll)); 
            System.out.println(); 
            System.out.println("= ���������� �����ϱ� ="); 
            System.out.println("ArrayList :"+remove1(al)); 
            System.out.println("LinkedList :"+remove1(ll)); 
      } 

      public static long add1(List list) { 
            long start = System.currentTimeMillis(); 
            for(int i=0; i<1000000;i++) list.add(i+""); 
            long end = System.currentTimeMillis(); 
            return end - start; 
      } 

      public static long add2(List list) { 
            long start = System.currentTimeMillis(); 
            for(int i=0; i<10000;i++) list.add(500, "X"); 
            long end = System.currentTimeMillis(); 
            return end - start; 
      } 

      public static long remove1(List list) { 
            long start = System.currentTimeMillis(); 
            for(int i=list.size()-1; i >= 0;i--) list.remove(i); 
            long end = System.currentTimeMillis(); 
            return end - start; 
      } 

      public static long remove2(List list) { 
            long start = System.currentTimeMillis(); 
            for(int i=0; i<10000;i++) list.remove(i); 
            long end = System.currentTimeMillis(); 
            return end - start; 
      } 
} 


/*
= ���������� �߰��ϱ� =
ArrayList :122
LinkedList :225

= �߰��� �߰��ϱ� =
ArrayList :2476	//�� 2.5��
LinkedList :12

= �߰����� �����ϱ� =
ArrayList :1951
LinkedList :111

= ���������� ���������� �����ϱ� =
ArrayList :10
LinkedList :30
*/
/*
���1 ���������� �߰�/�����ϴ� ��쿡�� ArrayList�� LinkedList���� ������.
���2 �߰� �����͸� �߰�/�����ϴ� ��쿡�� LinkedList�� ArrayList���� ������.
*/