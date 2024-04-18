import java.io.*;
import java.util.*;

class PropertiesEx2 {
	public static void main(String[] args) {
		// commandline에서 inputfile을 지정해주지 않으면 프로그램을 종료한다.
		if(args.length != 1) {
			System.out.println("USAGE: java PropertiesEx2 INPUTFILENAME");
			System.exit(0);
		}

		Properties prop = new Properties();

		String inputFile = args[0];

		try {
			prop.load(new FileInputStream(inputFile));
		} catch(IOException e) {
			System.out.println("지정된 파일을 찾을 수 없습니다.");
			System.exit(0);
		}

		String   name = prop.getProperty("name");

//		try {
//			name = new String(name.getBytes("8859_1"), "EUC-KR");
//		} catch(Exception e) {}
		
		String[] data = prop.getProperty("data").split(",");
		int max = 0;
		int min = 0;
		int sum = 0;

		for(int i=0; i < data.length; i++) {
			int intValue = Integer.parseInt(data[i]);
			if (i==0) max = min = intValue;

			if (max < intValue) {
				max = intValue;
			} else if (min > intValue) {
				min = intValue;
			}

			sum += intValue;
		}

		System.out.println("이름 :"  + name);		
		System.out.println("최대값 :" + max);
		System.out.println("최소값 :" + min);
		System.out.println("합계 :"  + sum);
		System.out.println("평균 :"  + (sum*100.0/data.length)/100);
	}
}
/*
실행 예
java PropertiesEx2 input.txt
이름 :Seong Namkung
최대값 :35
최소값 :1
합계 :111
평균 :11.1
*/
/*
외부파일(input.txt)로부터 데이터를 입력받아서 계산결과를 보여주는 예제이다. 외부파
일의 형식은 라인단위로 키와 값이 '='로 연결된 형태이어야 하며 주석라인은 첫 번째
문자가 '#'이어야 한다.
 정해진 규칙대로만 파일을 작성하면 load()를 호출하는 것만으로 쉽게 데이터를 읽어 올
수 있다. 다만 인코딩(encoding)문제로 한글이 깨질 수 있기 때문에 한글을 입력받으려면
아래와 같이 코드를 변경해야한다.

String name = prop.getProperty("name");

try{
	name = new String(name.getBytes("8859_1"), "EUC-KR");
} catch(Exception e) {}

파일로부터 읽어온 데이터의 인코딩을 라팅문자집합(8859_1)에서 한글완성형(EUC-KR
또는 KSC5601)으로 변환해주는 과정을 추가한 것이다. 우리가 사용하고  있는 OS의 
기본 인코딩(encoding)이 유니코드가 아니라서 이런 변환이 필요한 것이라는 것만 
이해하고 넘어가자
[참고] key에 문자 '='를 포함시키고자 한다면 escape 문자 '\'를 사용하여 '\='와
같이 표현한다.
*/