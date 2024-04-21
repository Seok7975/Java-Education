import java.io.File;

public class IOTest3 {

	public static void main(String[] args) {
		File myFile=new File("C:" + File.separator + "MyJava" + File.separator + "my.bin");
		//  이동의 대상이 되는 파일정보를 File 인스턴스에 담고 있다.
		if(myFile.exists()==false)
		{
			System.out.println("원본 파일이 준비되어 있지 않습니다.");
			return;
		}
		// exists 메소드는 해당 정보의 파일이 실제로 존재하는지 확인 할 때 호출하는 메소드.
		// 해당 파일이 실제로 존재하면 true를, 그렇지 않으면 false를 반환한다.

		File reDir=new File("C:" + File.separator + "YourJava");
		// 이동할 위치 정보를 File 인스턴스에 담고 있다. 여기서 중요한 사실은 디렉터리 정보만
		// 담았다는 것이다. 이렇듯 File 인스턴스에는 디렉터리 정보만 담는 것도 가능하다.
		if(reDir.mkdir())
			System.out.println("디렉토리 생성 성공");
		else
			System.out.println("디렉토리 생성 실패");
		// 이동할 위치에 해당하는 디렉토리를 생성하고 있다. 바로 이러한 목적으로 위에서 파일의
		// 이름정보를 제외한 디렉터리 정보만을 담은 것이다.
		File reFile=new File(reDir, "my.bin");
		// 이 문장에서는 정보의 추가 방법을 보이고 있다. 이렇듯 기존의 File 인스턴스를 대상으로
		// 디렉터리 이름이나 파일이름을 추가하여 새로운 File 인스턴스를 생성하는 것도 가능하다.
		// 이 문장에 의해서 reDir의 경로정보에 "my.bin"이라는 파일의 이름정보가 추가되어 새로운
		// File 인스턴스가 생성된다.
		if(myFile.renameTo(reFile))
			System.out.println("파일 이동 성공");
		else
			System.out.println("파일 이동 실패");
		// renameTo 메소드 호출을 통해서 파일의 위치를 이동시키고 있다.
	}
}