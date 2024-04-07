import java.util.Arrays;
import java.util.Scanner;

public class Test {
	public static boolean  chkArr(char[] chArr)
	{
		for(int i=0;i<chArr.length-1;i++)
		{
			for(int j=i+1;j<chArr.length;j++)
			{
				if(chArr[i]==chArr[j])
					return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int rnum = 0;
		String rnumStr = "";
		while(true)
		{
			rnum = (int)(Math.random()*(999-100+1)+100);  // (end-start+1)+start
			rnumStr = String.valueOf(rnum);
			if(chkArr(rnumStr.toCharArray())) break;
		}
		int len = rnumStr.length();

		String inumStr;
		int scnt=0, bcnt=0;
		System.out.println(rnum);
		while(true)
		{
			System.out.println("공격하세요.");
			inumStr = sc.next();
			for(int i=0;i<len;i++)
			{
				char ch = rnumStr.charAt(i);
				int idx = inumStr.indexOf(ch);
				if(idx != -1)
				{
					if(i==idx) scnt++;
					else bcnt++;
				}				
			}
			if(scnt==0 && bcnt==0) System.out.println("out");			
			else if(scnt != len) System.out.println(scnt + " strike " + bcnt + " ball");
			else 			
			{
				System.out.println("홈런");
				break;
			}
			scnt = 0;
			bcnt = 0;
		}
		sc.close();
	}
}