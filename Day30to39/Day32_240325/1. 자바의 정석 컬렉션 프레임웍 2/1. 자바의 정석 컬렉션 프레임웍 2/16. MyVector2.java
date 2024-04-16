import java.util.*;

public class MyVector2 extends MyVector implements Iterator {
	int cursor  = 0;
	int lastRet = -1;
	
	public MyVector2(int capacity) {
		super(capacity);		
	}
	
	public MyVector2() {
		this(10);		
	}

	public String toString() {
		String tmp = "";
		Iterator it = iterator();

		for(int i=0; it.hasNext();i++) {
			if(i!=0) tmp+=", ";
			tmp += it.next(); 	// tmp += next().toString();
		}

		return "["+ tmp +"]";		
	}

	public Iterator iterator() {
		cursor=0;		// cursor와 lastRet를 초기화 한다.
		lastRet = -1;
		return this;		
	}	
	
	public boolean hasNext() {
	    return cursor != size();
	}
	
    public Object next(){
		Object next = get(cursor);
		lastRet = cursor++;
		return next;
    }
	
	public void remove() {
         // 더이상 삭제할 것이 없으면 IllegalStateException를 발생시킨다.
		if(lastRet==-1) {  
			throw new IllegalStateException();
		} else {
			remove(lastRet);
			cursor--;           // 삭제 후에 cursor의 위치를 감소시킨다.
			lastRet = -1;		// lastRet의 값을 초기화 한다.	
		}
	}		
} // class

/*
cursor는 앞으로 읽어 올 요소의 위치를 저장하는데 사용되고, lastRet는 마지막으로
읽어 온 요소의 위치(index)를 저장하는데 사용된다.
 그래서 lastRet는 cursor보다 항상 1이 작은 값이 저장되고 remove()를 호출하면
이미 next()를 통해서 읽은 위치의 요소, 즉 lastRet에 저장된 값의 위치에 있는 요소를
삭제하고 lastRet의 값을 -1로 초기화 한다.
 만일 next()를 호출하지 않고 remove()를 호출하면 lastRet의 값은 -1이 되어
IllegalStateException이 발생한다. remove()는 next()로 읽어 온 객체를 삭제하는 것이기
때문에 remove()를 호출하기 전에는 반드시 next()가 호출된 상태이어야 한다.

	public void remove() {
         // 더이상 삭제할 것이 없으면 IllegalStateException를 발생시킨다.
		if(lastRet==-1) {  
			throw new IllegalStateException();
		} else {
			remove(lastRet);		// 최근에 읽어온 요소를 삭제한다.
			cursor--;          		// cursor의 위치를 1 감소시킨다.
			lastRet = -1;			// 읽어온 요소가 삭제되었으므로 초기화 한다.	
		}
	}

위의 코드에서 보면 remove(lastRet)를 호출하여 lastRet의 위치에 있는 객체를 삭제한
다음에 cursor의 값을 감소시킨다. 그리고 lastRet의 값을 초기화(-1)한다.
 그 이유는 remove메서드를 호출해서 객체를 삭제하고 나면, 삭제된 위치 이후의 객체들이
빈 공간을 채우기 위해 자동적으로 이동되기 때문에 cursor의 위치도 같이 이동
시켜주어야 한다. 그리고 읽어온 요소가 삭제되었으므로 읽어온 요소의 위치를 저장하는
lastRet의 값은 -1로 초기화해야 한다. lastRet의 값이 -1이라는 것은 읽어온 값이 없다는
것을 의미한다.
[참고] lastRet의 값이 -1이라는 것은 읽어 온 값이 없다는 의미이다. remove()는 읽어온 값이
있어야 호출될 수 있음을 기억하자.
*/