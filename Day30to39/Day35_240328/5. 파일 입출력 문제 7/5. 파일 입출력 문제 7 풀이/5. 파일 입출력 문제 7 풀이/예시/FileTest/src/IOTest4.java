import java.io.File;

public class IOTest4 {

	public static void main(String[] args) {
		File file = new File("AAA");
		System.out.println(file.getAbsolutePath());
		File file2 = new File(file, "BBB");
		System.out.println(file2.getAbsolutePath());
	}

}


//57. AAA 라는 폴더를 경로로 잡고 절대경로를 출력하자
//AAA라는 폴더 밑에 BBB라는 폴더를 잡고 그것의 절대경로를 출력하자.