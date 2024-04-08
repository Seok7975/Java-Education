class BuilderString	//String은 변경 불가, String Builder는 변경가능
{
	public static void main(String[] args)
	{
		StringBuilder strBuf=new StringBuilder("AB");
		strBuf.append(25);
		strBuf.append('Y').append(true);
		System.out.println(strBuf);		
		
		strBuf.insert(2, false);
		strBuf.insert(strBuf.length(), 'Z');
		System.out.println(strBuf);
	}
}