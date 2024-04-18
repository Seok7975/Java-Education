import java.util.*;

class PropertiesEx4{
	public static void main(String[] args) {
		Properties sysProp = System.getProperties();
		System.out.println("java.version :" + sysProp.getProperty("java.version"));
		System.out.println("user.languag :" + sysProp.getProperty("user.language"));
		sysProp.list(System.out);
	}
}

/*
시스템 속성을 가져오는 방법을 보여주는 예제이다. System클래스의 getProperties()를
호출하면 시스템과 관련된 속성이 저장된 Properties를 가져올 수 있다. 이 중에서 원하는
속성을 getProperty()를 통해 얻을 수 있다.
 이 예제를 실행시켜보고 어떠한 속성들이 있는지 살펴보고 어떤 속성을 통해 어떤 값을
얻을 수 있는지 확인하도록 하자.
*/