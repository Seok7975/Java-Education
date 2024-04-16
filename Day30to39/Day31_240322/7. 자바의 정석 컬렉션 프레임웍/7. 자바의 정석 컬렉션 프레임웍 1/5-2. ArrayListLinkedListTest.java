import java.util.*; 

public class ArrayListLinkedListTest { 
      public static void main(String args[]) { 
            // 추가할 데이터의 개수를 고려하여 충분히 잡아야한다.
            ArrayList al = new ArrayList(2000000);
            LinkedList ll = new LinkedList(); 

            System.out.println("= 순차적으로 추가하기 ="); 
            System.out.println("ArrayList :"+add1(al)); 
            System.out.println("LinkedList :"+add1(ll)); 
            System.out.println(); 
            System.out.println("= 중간에 추가하기 ="); 
            System.out.println("ArrayList :"+add2(al)); 
            System.out.println("LinkedList :"+add2(ll)); 
            System.out.println(); 
            System.out.println("= 중간에서 삭제하기 ="); 
            System.out.println("ArrayList :"+remove2(al)); 
            System.out.println("LinkedList :"+remove2(ll)); 
            System.out.println(); 
            System.out.println("= 순차적으로 삭제하기 ="); 
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
= 순차적으로 추가하기 =
ArrayList :122
LinkedList :225

= 중간에 추가하기 =
ArrayList :2476	//약 2.5초
LinkedList :12

= 중간에서 삭제하기 =
ArrayList :1951
LinkedList :111

= 끝에서부터 순차적으로 삭제하기 =
ArrayList :10
LinkedList :30
*/
/*
결론1 순차적으로 추가/삭제하는 경우에는 ArrayList가 LinkedList보다 빠르다.
결론2 중간 데이터를 추가/삭제하는 경우에는 LinkedList가 ArrayList보다 빠르다.
*/