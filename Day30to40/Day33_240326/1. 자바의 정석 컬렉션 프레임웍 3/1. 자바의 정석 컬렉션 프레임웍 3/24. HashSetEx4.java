import java.util.*;

class HashSetEx4 {
	public static void main(String[] args) {
		HashSet set = new HashSet();

		set.add(new String("abc"));
		set.add(new String("abc"));
		set.add(new Person2("David",10));
		set.add(new Person2("David",10));

		System.out.println(set);
		// [abc, David:10]
	}
}

class Person2 {
	String name;
	int age;

	Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public boolean equals(Object obj) {
		if(obj instanceof Person2) {
			Person2 tmp = (Person2)obj;
			return name.equals(tmp.name) && age==tmp.age;
		}

		return false;
	}

	public int hashCode() {
		return (name+age).hashCode();
	}

	public String toString() {
		return name +":"+ age;
	}
}

/*
HashSet의 add메서드는 새로운 요소를 추가하기 전에 기존에 저장된 요소와 같은 것
인지 판별하기 위해 추가하려는 요소의 equals()와 hashCode()를 호출하기 때문에
equals()와 hashCode()를 목적에 맞게 오버라이딩해야 한다.

public int hashCode() {
	return (name+age).hashCode();
}

위의 코드를 JDK1.8부터 추가된 java.util.Objects 클래스의 hash()를 이용해서 작성하면
아래와 같다. 이 메서드의 괄호 안에 클래스의 인스턴스 변수들을 넣으면 된다. 이전의
코드와 별반 다르지 않지만, 가능하면 아래의 코드를 쓰자.

public int hashCode(){
	return Objects.hash(name, age);	// int hash(Object... values)
}
*/