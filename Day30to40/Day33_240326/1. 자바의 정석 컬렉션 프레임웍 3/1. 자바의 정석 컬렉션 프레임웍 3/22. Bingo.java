import java.util.*; 

class Bingo { 
      public static void main(String[] args) { 
            Set set = new HashSet(); 
//          Set set = new LinkedHashSet(); 
            int[][] board = new int[5][5]; 

            for(int i=0; set.size() < 25; i++) { 
                  set.add((int)(Math.random()*50)+1+""); 
            } 

            Iterator it = set.iterator(); 

            for(int i=0; i < board.length; i++) { 
                  for(int j=0; j < board[i].length; j++) { 
                        board[i][j] = Integer.parseInt((String)it.next());
                        System.out.print((board[i][j] < 10 ? "  " : " ") + board[i][j]);  //\t를 3항연산으로 했음
                  } 
                  System.out.println(); 
            } 
      } // main
} 


/*

 22 44 46 47 48
 26 49 27 28 30
 32 33 11 35 13
 36 17 18  5  7
  8 40 41 20 21
*/
/*
1~50사이의 숫자 중에서 25개를 골라서 '5x5'크기의 빙고판을 만드는 예제이다. next()
는 반환값이 Object타입이므로 형변환해서 원래의 타입으로 되돌려 놓아야 한다. 이 예제
역시 random()을 사용했기 때문에 실행할 때마다 다른 결과를 얻을 것이다.
 그런데 몇번 실행해보면 같은 숫자가 비슷한 위치에 나온다는 사실을 발견할 수 있을 것
이다. HashSet은 저장된 순서를 보장하지 않고 자체적인 저장방식에 따라 순서가 결정되기
때문이다. 이 경우에는 HashSet보다 LinkedHashSet이 더 나은 선택이다.
*/
