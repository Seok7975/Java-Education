import java.util.*; 

public class ArrayListLinkedListTest2 { 
      public static void main(String args[]) { 
            ArrayList  al = new ArrayList(1000000); 
            LinkedList ll = new LinkedList(); 
            add(al);
            add(ll);

            System.out.println("= 접근시간테스트 ="); 
            System.out.println("ArrayList :"+access(al)); 
            System.out.println("LinkedList :"+access(ll)); 
	  }

      public static void add(List list) { 
            for(int i=0; i<100000;i++) list.add(i+""); 
      } 

      public static long access(List list) { 
            long start = System.currentTimeMillis(); 

            for(int i=0; i<10000;i++) list.get(i); 

            long end = System.currentTimeMillis(); 

            return end - start; 
      } 
}
/*
= 접근시간테스트 =
ArrayList :1	//0.001초
LinkedList :107	//0.2초
*/

/*
배열의 경우 만일 인덱스가 n인 원소의 값을 얻어 오고자 한다면 단순히
아래와 같은 수식을 계산함으로써 해결된다.
인덱스가 n인 데이터의 주소 = 배열의 주소 + n * 데이터 타입의 크기

배열은 각 요소들이 연속적으로 메모리상에 존재하기 때문에 이처럼 간단한 계산만으로
원하는 요소의 주소를 얻어서 저장된 데이터를 곧바로 읽어올 수 있지만, LinkedList는 불연속적으로 위치한 각 요소들이 서로 연결된 것이라 처음부터 n번째 데이터까지 차례대로 따라가야만 원하는 값을 얻을 수 있다.
*/