import java.util.Scanner;

class HexToQarterAndBinary
{
    public static void main(String[] args)
    {
        String hexadecimal;

        Scanner sc = new Scanner(System.in);
        System.out.println("16진수 입력");
        hexadecimal = sc.next();
        String[] binary = {"0000", "0001", "0010", "0011"
                , "0100", "0101", "0110", "0111"
                , "1000", "1001", "1010", "1011"
                , "1100", "1101", "1110", "1111"};

        String result = "";
        String tmp = "";
        //int len = hexadecimal.length();
        boolean flag = true; // 16진수 범위 밖이면 false
        int result_count = 0; // 그냥 스페이스 넣어보고 싶었음

        for (int i = 0; i < hexadecimal.length(); i++)
        {
            char ch = hexadecimal.charAt(i);

            if ('0' <= ch && ch <= '9') //// binary[0]~[9]
            {
                result += binary[ch - '0'];
                result_count++;
                if (result_count == 1)
                {
                    String space = " ";
                    result = result + space;
                }
            } else if ('A' <= ch && ch <= 'F') //10~15 binary[10]~[15]
            {
                result += binary[ch - 'A' + 10]; // 10~15니까 +10
                result_count++;
                if (result_count == 1)
                {
                    String space = " ";
                    result = result + space;
                }
            } else if ('a' <= ch && ch <= 'f') //대소문자 구분 없애기
            {
                result += binary[ch - 'a' + 10];
                result_count++;
                if (result_count == 1)
                {
                    String space = " ";
                    result = result + space;
                }
            } else
            {
                flag = false;
                break;
            }
            result_count = 0;

        }
        if (flag) System.out.println(result);
        else System.out.println("입력하신 것은 16진수가 아닙니다");
    }
}




/*
import java.util.Scanner;

class HexToQarterAndBinary
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("16진수 문자열 입력!");  // abcd
        String hexadecimal = sc.nextLine();

        char[] hex = hexadecimal.toCharArray();  // {'a', 'b', 'c', 'd'}
        for (int i=0; i<hex.length; i++)
        {
            System.out.println(hex[i]);


            if('0'<=hex[i] && hex[i]<='9')
            {
                int intHex = ((int)hex[i])-48;
                System.out.println(intHex);
            }
            else if('a'<=hex[i] && hex[i]<='f')
            {

                System.out.println(a-)
            }

        }


    }
}*/
