import java.util.*;

class HashMapEx3 {
	static HashMap phoneBook = new HashMap();

	public static void main(String[] args) {
		addPhoneNo("친구", "이자바", "010-111-1111");
		addPhoneNo("친구", "김자바", "010-222-2222");
		addPhoneNo("친구", "김자바", "010-333-3333");
		addPhoneNo("회사", "김대리", "010-444-4444");
		addPhoneNo("회사", "김대리", "010-555-5555");
		addPhoneNo("회사", "박대리", "010-666-6666");
		addPhoneNo("회사", "이과장", "010-777-7777");
		addPhoneNo("세탁", "010-888-8888");

		printList();
	} // main

	// 그룹을 추가하는 메서드
	static void addGroup(String groupName) {
		if(!phoneBook.containsKey(groupName))
			phoneBook.put(groupName, new HashMap());
	}

	// 그룹에 전화번호를 추가하는 메서드
	static void addPhoneNo(String groupName, String name, String tel) {
		addGroup(groupName);
		HashMap group = (HashMap)phoneBook.get(groupName);
		group.put(tel, name);	// 이름은 중복될 수 있으니 전화번호를 key로 저장한다.
	}

	static void addPhoneNo(String name, String tel) {
		addPhoneNo("기타", name, tel);
	}

	// 전화번호부 전체를 출력하는 메서드
	static void printList() {
		Set set = phoneBook.entrySet();
		Iterator it = set.iterator();	

		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();

			Set subSet = ((HashMap)e.getValue()).entrySet();
			Iterator subIt = subSet.iterator();	

			System.out.println(" * "+e.getKey()+"["+subSet.size()+"]");

			while(subIt.hasNext()) {
				Map.Entry subE = (Map.Entry)subIt.next();
				String telNo = (String)subE.getKey();
				String name = (String)subE.getValue();
				System.out.println(name + " " + telNo );
			}
			System.out.println();
		}
	} // printList()
} // class

/*
* 기타[1]
세탁 010-888-8888

 * 친구[3]
이자바 010-111-1111
김자바 010-222-2222
김자바 010-333-3333

 * 회사[4]
이과장 010-777-7777
김대리 010-444-4444
김대리 010-555-5555
박대리 010-666-6666
*/

/*
HashMap은 데이터를 키와 값을 모두 Object타입으로 저장하기 때문에 HashMap의 값
(value)으로 HashMap을 다시 저장할 수 있다. 이렇게 함으로써 하나의 키에 다시 복수의
데이터를 저장할 수 있다.
 먼저 전화번호를 저장할 그룹을 만들고 그룹 안에 다시 이름과 전화번호를 저장하도록
했다. 이때 이름대신  전화번호를 키로 사용했다는 것을 확인하자. 이름은 동명이인이 있
을 수 있지만 전화번호는 유일하기 때문이다.
[참고] 배열의 배열인 이차원 배열과 비교해보면 이해하기 쉬울 것이다.
*/