import java.util.regex.*;	// Pattern�� Matcher�� ���� ��Ű��

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
        //.*�� ���ڿ��� ��� �κа� ��ġ�մϴ�. �ٽ� ����, � ���ڿ��̵��� ��Ī
        //c[a-z]* : c + ~(a~z) : c, ca, co, car, combat, count
        //c[a-z] : c + (a~z) : ca, co
        //c[a-zA-Z] : c + (a~Z) : cA, ca, co
        //c[a-zA-Z0-9] : c + (a~Z, 0~9) : cA, ca, co, c0
        //c. : c + �ƹ����� : cA, ca, co, c., c0, c#
        //c.* : c +�ƹ����ڿ� : c, cA, ca, co, c., c0, c#, car, combat, count
        //c\\. : c + . (�齽����(\)�� �̽��������� ��ħǥ(.) �� ��ħǥ �� ��ü)
        //        c.
        //c\\w : c + �ܾ��(���ĺ�,����,����) : cA, ca, co c0
        //c\\d : c + ���ڹ��� : c0
        //c.*t : c + .*(������ ���ڿ�) + t : combat, count
        //[b|c].* : b or c + ������ ���ڿ� :
        //          bat, baby, bonus, c, cA, ca, co, c., c0, c#, car, combat, count
        //.*a.* : ������ ���ڿ� + a + ������ ���ڿ� : bat,baby,ca,car,combat,date
        //.*a.+ : ������ ���ڿ� + a + �ϳ� �̻��� ������ ���ڰ� �ݺ���
        //          bat, baby, car, combat, date
        //[b|c].{2} : b or c + ������ ���� �ι� �ݺ�(���ڿ����� 'b' �Ǵ� 'c'�� �����ϰ� �� �ڿ� ������ �� ���ڰ� ������ ���ڿ�)
        //           bat, car
		for(int x=0; x < pattern.length; x++) {
			Pattern p = Pattern.compile(pattern[x]);
			System.out.print("Pattern : " + pattern[x] + "  ���: ");
			for(int i=0; i < data.length; i++) {
				Matcher m = p.matcher(data[i]);
				if(m.matches())
					System.out.print(data[i] + ",");
			}
			System.out.println();
		}
	} // public static void main(String[] args)
}
