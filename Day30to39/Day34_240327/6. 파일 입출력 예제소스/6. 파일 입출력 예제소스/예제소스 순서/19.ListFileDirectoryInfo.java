import java.io.File;

class ListFileDirectoryInfo
{
	public static void main(String[] args)
	{
		File myDir=new File("MyDir");
		File[] list=myDir.listFiles();
		// listFiles 메소드는 디렉터리에 존재하는 파일과 디렉터리 정보를 반환한다. 
		// 단 File의 배열 형태로 반환한다. 물론 String의 형태로 파일 또는 디렉터리의
		// 이름만 반환하는 메소드도 존재한다. 그러나 File의 배열 형태로 정보를
		// 얻어야 보다 다양한 작업을 간결히 처리할 수 있다.
		
		for(int i=0; i<list.length; i++)
		{
			System.out.print(list[i].getName());
			// getName 메소드는 문자열의 형태로 파일 또는 디렉터리의 이름을 반환한다.
			if(list[i].isDirectory())
				System.out.println("\t\tDIR");
			else
				System.out.println("\t\tFILE");

			// isDirectory 메소드는 인스턴스의 정보가 디렉터리의 정보인지 확인하기 위한
			// 메소드이다.
		}
	}
}