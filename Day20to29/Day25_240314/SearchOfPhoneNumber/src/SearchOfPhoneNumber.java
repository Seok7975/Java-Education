/*
문제1.
        String[] phoneNumArr = {
        "012-3456-7890",
        "099-2456-7980",
        "088-2346-9870",
        "013-3456-7890"
};

위의 전화번호를 검색하는 프로그램을 작성해보자.

>>234
        [012-3456-7890, 088-2346-9870]
>>
*/

import java.util.Scanner;

class SearchOfPhoneNumber
{
    public static void main(String[] args)
    {
        String[] phoneNumArr
                =
                {
                        "012-3456-7890",
                        "099-2456-7980",
                        "088-2346-9870",
                        "013-3456-7890"
                };

        Scanner sc = new Scanner(System.in);
        System.out.println("찾으시는 번호 있으신가요? 일부만 입력하셔도 됩니다!");
        String searchNum = sc.nextLine();

        for(int i=0; i<phoneNumArr.length; i++)
        {
            String temp = phoneNumArr[i].replace("-", "");
            int pos = temp.indexOf(searchNum);
            if(pos != -1)
            {
                System.out.println(phoneNumArr[i]);
            }
        }
    }
}