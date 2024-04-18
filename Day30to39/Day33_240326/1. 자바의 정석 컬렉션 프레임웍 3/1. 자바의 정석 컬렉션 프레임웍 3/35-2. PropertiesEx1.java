import java.util.*;

class PropertiesEx1 {
	public static void main(String[] args) {
		Properties prop = new Properties();

		// prop에 키와 값(key, value)을 저장한다.
		prop.setProperty("timeout","30");
		prop.setProperty("language","kr");
		prop.setProperty("size","10");
		prop.setProperty("capacity","10");

		// prop에 저장된 요소들을 Enumeration을 이용해서 출력한다.
		Enumeration e = prop.propertyNames();

		while(e.hasMoreElements()) {
			String element = (String)e.nextElement();
			System.out.println(element + "="+ prop.getProperty(element));
		}

		System.out.println();
		prop.setProperty("size","20");	// size의 값을 20으로 변경한다.
		System.out.println("size="       + prop.getProperty("size"));
		System.out.println("capacity="   + prop.getProperty("capacity", "20"));
		// String getProperty(String key, String defaultValue)
		// 지정된 키(key)의 값(value)를 반환한다. 키를 못찾으면
		// defaultValue를 반환한다.
		System.out.println("loadfactor=" + prop.getProperty("loadfactor", "0.75"));

		System.out.println(prop);	// prop에 저장된 요소들을 출력한다.
		prop.list(System.out);      // prop에 저장된 요소들을 화면(System.out)에 출력한다.
	}
}


/*
capacity=10
size=10
timeout=30
language=kr

size=20
capacity=10
loadfactor=0.75
{size=20, language=kr, timeout=30, capacity=10}
-- listing properties --
size=20
language=kr
timeout=30
capacity=10
*/

/*
Properties의 기본적인 메서드를 이용해서 저장하고 읽어오고 출력하는 방법을 보여주는
간단한 예제이다. 데이터를 저장하는데 사용되는 setProperty()는 단순히 Hashtable의
put메서드를 호출할 뿐이다. 그리고  setProperty()는 기존에 같은 키로 저장된 값이 있는
경우 그 값을 Object타입으로 반환하며, 그렇지 않을 때는 null을 반환한다.

Object setProperty(String key, String value)

getProperty()는 Properties에 저장된 값을 읽어오는 일을 하는데, 만일 읽어오려는 키가
존재하지 않으면 지정된 기본값(defaultValue)을 반환한다.

String getProperty(String key)
String getProperty(String key, String defaultValue)

Properties는 Hashtable을 상속받아 구현한 것이라 Map의 특성상 저장순서를 유지하지
않기 때문에 예제의 결과에 출력된 순서가 저장순서와는 무관하다는 것을 확인하자.
 Properties는 컬렉션프레임웍 이전의 구버전이므로 Iterator가 아닌 Enumeration을
사용한다. 그리고 list메서드를 이용하면 Properties에 저장된 모든 데이터를 화면
또는 파일에 편리하게 출력할 수 있다.

void list(PrintStream out)
void list(PrintWriter out)

System.out은 화면과 연결된 표준출력으로 System클래스에 정의된 PrintStream타입의
static 변수이다.
*/