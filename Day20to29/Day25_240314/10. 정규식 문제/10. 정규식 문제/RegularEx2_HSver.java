import java.util.regex.*;	// Pattern과 Matcher가 속한 패키지

class RegularEx2 {
	public static void main(String[] args) {
		String[] data = {"bat", "baby", "bonus", "c", "cA",
				        "ca", "co", "c.", "c0", "c#",
					"car","combat","count", "date", "disc"
						};
		String[] pattern = {".*",
                "c[a-z]*","c[a-z]", "c[a-zA-Z]",
                "c[a-zA-Z0-9]","c.","c.*","c\\.","c\\w",
                "c\\d","c.*t", "[b|c].*", ".*a.*", ".*a.+",
                 "[b|c].{2}"
                 };
        //.*은 문자열의 모든 부분과 일치합니다. 다시 말해, 어떤 문자열이든지 매칭
        //c[a-z]* : c + ~(a~z) : c, ca, co, car, combat, count
        //c[a-z] : c + (a~z) : ca, co
        //c[a-zA-Z] : c + (a~Z) : cA, ca, co
        //c[a-zA-Z0-9] : c + (a~Z, 0~9) : cA, ca, co, c0
        //c. : c + 아무문자 : cA, ca, co, c., c0, c#
        //c.* : c +아무문자열 : c, cA, ca, co, c., c0, c#, car, combat, count
        //c\\. : c + . (백슬래시(\)로 이스케이프된 마침표(.) 즉 마침표 그 자체)
        //        c.
        //c\\w : c + 단어문자(알파벳,숫자,밑줄) : cA, ca, co c0
        //c\\d : c + 숫자문자 : c0
        //c.*t : c + .*(임의의 문자열) + t : combat, count
        //[b|c].* : b or c + 임의의 문자열 :
        //          bat, baby, bonus, c, cA, ca, co, c., c0, c#, car, combat, count
        //.*a.* : 임의의 문자열 + a + 임의의 문자열 : bat,baby,ca,car,combat,date
        //.*a.+ : 임의의 문자열 + a + 하나 이상의 임의의 문자가 반복됨
        //          bat, baby, car, combat, date
        //[b|c].{2} : b or c + 임의의 문자 두번 반복(문자열에서 'b' 또는 'c'로 시작하고 그 뒤에 임의의 두 문자가 나오는 문자열)
        //           bat, car
		for(int x=0; x < pattern.length; x++) {
			Pattern p = Pattern.compile(pattern[x]);
			System.out.print("Pattern : " + pattern[x] + "  결과: ");
			for(int i=0; i < data.length; i++) {
				Matcher m = p.matcher(data[i]);
				if(m.matches())
					System.out.print(data[i] + ",");
			}
			System.out.println();
		}
	} // public static void main(String[] args)
}
