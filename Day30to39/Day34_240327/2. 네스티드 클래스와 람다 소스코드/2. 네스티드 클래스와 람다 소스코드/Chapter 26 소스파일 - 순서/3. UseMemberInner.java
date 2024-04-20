interface Printable {
    void print();   
}

class Papers {
    private String con;

    public Papers(String s) {
        con = s;
    }

    public Printable getPrinter() {
        return new Printer();
    }

    private class Printer implements Printable {
        public void print() {
            System.out.println(con);
        }
    }
}

class UseMemberInner {
    public static void main(String[] args) {
        Papers p = new Papers("서류 내용: 행복합니다.");
        Printable prn = p.getPrinter();
        prn.print();
    }
}

/*
실행 결과
서류 내용: 행복합니다.
*/

/*
"멤버 클래스를 언제 유용하게 사용할 수 있을까?"
"클래스의 정의를 감추어야 할 때 유용하게 사용이 된다."

Papers 클래스의 외부에서는 getPrinter 메소드가 어떠한 인스턴스의
참조 값을 반환하는지 알지 못한다. 다만 반환되는 참조 값의 인스턴스가
Printable을 구현하고 있어서 Printable의 참조변수로 참조할 수 있다는 사실만
알뿐이다. 그리고 이러한 상황을 가리켜 '클래스의 정의가 감추어진 상황'이라
한다.
이렇게 클래스의 정의를 감추면, getPrinter 메소드가 반환하는 인스턴스가 
다른 클래스의 인스턴스로 변경되어도 Papers 클래스 외부의 코드는 조금도
수정할 필요가 없게 된다.(즉 코드에 유연성이 부여되었다. 그리고 이는 엄청난
장점이다.)
사실 우리는 이러한 방식으로 정의된 클래스의 예를 알고 있다. 컬렉션 프레임워크의 
'반복자'가 바로 그것이다.

public static void main(String[] args){
	List<String> list = new ArrayList<>();
	...
	Iterator<String> itr = list.iterator();	// 반복자 획득!
	...
}

위의 코드에서 iterator 메소드가 반환하는 인스턴스의 클래스를 우리는 알지 못한다.
알려고 노력할 필요도 없으며 알아도 별 의미가 없다. 다만 우리에게는 그 클래스가
Iterator<E> 인터페이스를 구현하고 있다는 정보만 필요할 뿐이다. 실제로 iterator
메소드가 반환하는 자바의 반복자는 다음과 같이 '멤버 클래스'의 형태로 정의되어
있다.

public class ArrayList<E> implements List<E> {
	...
	public Iterator<E> iterator() {
		return new Itr();	// 멤버 클래스의 인스턴스 생성 및 반환
	}

	private class Itr implements Iterator<E> {	// 멤버 클래스의 정의
		...
	}
}

위의 iterator 메소드는 실제 자바의 iterator 메소드와 동일하다. 그리고 ArrayList<E>
인스턴스가 반환하는 반복자는 Itr 클래스의 인스턴스임을 위의 코드를 통해서 알 수
있다. 그러나 이러한 정보는 우리에게 의미가 없다. Itr 클래스는 그 정의가 감춰져
있으므로 이 클래스의 수정 및 변경은 우리가 작성하는 코드에 아무런 영향을 
미치지 않는다는 사실이 중요할 뿐이다.
*/