class Box<T>
{
	public Box<T> nextBox;
	T item;

	public void store(T item) { this.item=item; }
	public T pullOut() { return item; }
}

class SoSimpleLinkedListImpl
{
	public static void main(String[] args)
	{
		Box<String> boxHead=new Box<String>();
		boxHead.store("First String");
		
		boxHead.nextBox=new Box<String>();
		boxHead.nextBox.store("Second String");
		
		boxHead.nextBox.nextBox=new Box<String>();
		boxHead.nextBox.nextBox.store("Third String");
		
		Box<String> tempRef;
		
		/* 두 번째 박스에 담긴 문자열 출력 과정 */
		tempRef=boxHead.nextBox;
		System.out.println(tempRef.pullOut());

		/* 세 번째 박스에 담긴 문자열 출력 과정 */
		tempRef=boxHead.nextBox;
		tempRef=tempRef.nextBox;
		System.out.println(tempRef.pullOut());
		boxHead.nextBox = boxHead.nextBox.nextBox;
	}
}

//싱글링크드 리스트는 하나의 로드만
//더블링크드 리스트 다운로드 가리키는 링크, 전 노드를 가리키는 링크
//링크드 리스트는 참조가 힘듬 -> 노드를 타고 타고 타고
//메모리 늘리고 줄이기 쉬움
//배열은 참조가 쉬움 -> 주소번지를 사용함
//메모리 늘리고 줄이기 힘듬 