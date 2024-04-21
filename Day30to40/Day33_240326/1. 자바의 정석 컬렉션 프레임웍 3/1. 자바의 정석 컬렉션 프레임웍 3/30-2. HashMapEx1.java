import java.util.*;

class HashMapEx1 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("myId", "1234");
		map.put("asdf", "1111");
		map.put("asdf", "1234");

		Scanner s = new Scanner(System.in);	// 화면으로부터 라인단위로 입력받는다.

		while(true) {
			System.out.println("id와 password를 입력해주세요.");
			System.out.print("id :");
			String id = s.nextLine().trim();

			System.out.print("password :");
			String password = s.nextLine().trim();
			System.out.println();

			if(!map.containsKey(id)) {
				System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
				continue;
			} else {
				if(!(map.get(id)).equals(password)) {
					System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
				} else {
					System.out.println("id와 비밀번호가 일치합니다.");						
					break;
				}
			}
		} // while
	} // main의 끝
}

/*
// 실행 화면
id와 password를 입력해주세요.
id :asdf
password :1111

비밀번호가 일치하지 않습니다. 다시 입력해주세요.
id와 password를 입력해주세요.
id :asdf
password :1234

id와 비밀번호가 일치합니다.
*/

/*
위의 코드는 HashMap을 생성하고 데이터를 저장하는 부분인데 이 코드가 실행되고 나면
HashMap에는 아래와 같은 형태로 데이터가 저장된다.

키(key)			값(value)
myId			1234
asdf			1234

3개의 데이터를 쌍으로 저장했지만 실제로는 2개 밖에 저장되지 않은 이유는 중복된 키가 있기
때문이다. 세 번째로 저장한 데이터의 키인 'asdf'는 이미 존재하기 때문에 새로 추가되는
대신 기존의 값을 덮어썼다. 그래서 키 'asdf'에 연결된 값은 '1234'가 된다.
 Map은 값은 중복을 허용하지만 키는 중복을 허용하지 않기 때문에 저장하려는 두 데이터
 중에서 어느 쪽을 키로 할 것인지를 잘 결정해야한다.
[참고]
Hashtable은 키(key)나 값(value)으로 null을 허용하지 않지만, HashMap은 허용한다.
그래서 'map.put(null, null);'이나 'map.get(null);'과 같이 할 수 있다.
*/