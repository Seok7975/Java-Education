import java.util.*;
import java.io.*;

class PropertiesEx3 {
	public static void main(String[] args) {
		Properties prop = new Properties();

		prop.setProperty("timeout","30");
		prop.setProperty("language","한글");
		prop.setProperty("size","10");
		prop.setProperty("capacity","10");

		try {
			prop.store(new FileOutputStream("output.txt"), "Properties Example"); //주석 생성
			prop.storeToXML(new FileOutputStream("output.xml"),  "Properties Example");
		} catch(IOException e) {
			e.printStackTrace();		
		}
	} // main의 끝
}

/*
이전 예제와는 반대로 Properties에 저장된 데이터를 store()와 storeToXML()를 이용해서
파일로 저장하는 방법을 보여 준다. 
*/