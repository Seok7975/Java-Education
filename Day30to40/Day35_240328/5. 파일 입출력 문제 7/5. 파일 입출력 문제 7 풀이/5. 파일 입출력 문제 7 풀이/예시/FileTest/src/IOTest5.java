import java.io.File;

public class IOTest5 {
	public static void main(String[] args) {
		File myDir=new File("c:\\JavaStudy");
		File[] list=myDir.listFiles();
		if(list == null)
		{
			System.out.println("디렉토리가 존재하지 않음.");
			myDir.mkdir();
		}
		else
		{
			for(File file : list)
			{
				System.out.print(file.getName());
				if(file.isDirectory())
					System.out.println("\t\tDIR");
				else
					System.out.println("\t\tFILE");
			}			
		}

		System.out.println("시스템 정보");
		String workingDir = System.getProperty("user.dir");
		System.out.println("현재위치 " + workingDir);
		String osName = System.getProperty("os.name");
		System.out.println("os " + osName);
		String javaHome = System.getProperty("java.home");
		System.out.println("JavaHome " + javaHome );
		String javaVersion = System.getProperty("java.version");
		System.out.println("javaVersion " + javaVersion);
	}
}


//58. MyDir이라는 폴더를 경로로 잡고 그 경로에 있는 리스트를 출력하자.
//파일이면 파일이라고 출력하고 디렉토리면 디렉토리라고 출력하도록 하자.
//그리고 나서 다음 정보를 출력하자
//현재위치 절대경로
//OS 이름
//JAVA HOME
//JAVA VERSION