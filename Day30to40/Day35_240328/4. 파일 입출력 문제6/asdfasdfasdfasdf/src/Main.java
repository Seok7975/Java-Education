import java.io.File;

public static void main(String[] args)
{
    File myDir = new File("C:\\YourJava\\JavaDir");	// 디렉터리 위치 정보
    myDir.mkdir();	// 디렉터리 생성
	...
    if(myDir.mkdir())System.out.println("성공");// 디렉터리 생성
    else System.out.println("실패");

}