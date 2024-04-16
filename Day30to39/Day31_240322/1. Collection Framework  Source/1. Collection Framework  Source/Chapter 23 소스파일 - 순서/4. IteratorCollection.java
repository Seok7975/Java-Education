import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;

class IteratorCollection {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        
        // 인스턴스 저장 
        list.add("Toy");  list.add("Box");
        list.add("Robot");  list.add("Box");
	
        // 반복자 획득
        Iterator<String> itr = list.iterator();
        
        // 반복자를 이용한 순차적 참조
        while(itr.hasNext())
            System.out.print(itr.next() + '\t');

        System.out.println();
        
        // 반복자 다시 획득
        itr = list.iterator();
                		
        // "Box"의 삭제 
        String str;
        while(itr.hasNext()) {
            str = itr.next();
            
            if(str.equals("Box"))
                itr.remove();
        }
    
        // 반복자 다시 획득
        itr = list.iterator();
        
        // 삭제 후 결과 확인
        while(itr.hasNext())
            System.out.print(itr.next() + '\t');

        System.out.println();
    }
}

// 실행결과
/*
Toy	Box	Robot	Box	
Toy	Robot	
*/

/*
	for-each문도,
	for(String s : list)
		System.out.print(s + '\t');

	컴파일 과정에서 다음과 같이 반복자를 이용하는 코드로 수정된다.
	즉 for-each문 역시 반복자에 의한 순차적 접근으로 진행이 된다.

	for(Iterator itr = list.iterator();itr.hasNext();	)
		System.out.print(itr.next() + '\t');
*/