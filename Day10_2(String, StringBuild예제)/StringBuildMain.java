//문제 [StringBuilder의 API 문서 참조]
//String str1 = "ABCDEFGHIJKLMN"; 역순으로 출력
//String str2 = "990208-1012752" 이 문자열을 활용하여 중간에 삽입된 -를 삭제한 String 인스턴스를 생성.





class StringBuildMain
{
	public static void main(String[] args)
	{
		String str1 =  "ABCDEFGHIJKLMN";
		StringBuilder sb = new StringBuilder(str1);	//StringBuilder를 이용해 string을 역순으로 바꿈
		System.out.println(sb.reverse());		// StringBuilder 객체 그 자체를 출력
		System.out.println(sb.reverse().toString());	//System.out.println 메소드 내부에서 객체의 toString() 메서드를 호출
	
		String str2 = "990208-1012752";
		int idx=0;
		StringBuilder sb2 = new StringBuilder(str2);	
		System.out.println(sb1.reverse().toString());
		idx = sb2.indexOf("-");
		if(idx != -1)
			System.out.println(sb2.deleteCharAt(idx).toString());


	}
}

