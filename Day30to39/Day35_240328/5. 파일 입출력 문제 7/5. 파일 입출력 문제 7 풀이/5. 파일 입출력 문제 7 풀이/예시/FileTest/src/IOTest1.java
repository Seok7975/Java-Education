import java.io.File;

public class IOTest1 {

	public static void main(String[] args) {
		File myDir = new File("C:\\YourJava\\JavaDir");	// 디렉터리 위치 정보
		if(myDir.mkdirs())	// 디렉터리 생성 mkdir과 mkdirs 차이
			System.out.println("디렉토리 생성 성공");
		else
			System.out.println("디렉토리 생성 실패");
	}

}

/*
mkdir 디렉토리 하나만 만든다
mkdirs 하위 디렉토리까지 만든다.
*/