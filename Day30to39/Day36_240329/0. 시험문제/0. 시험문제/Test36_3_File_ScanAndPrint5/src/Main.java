/*
[PrintWriter와 버퍼링]

예제 PrintWriterStream.java에서 생성하는 스트림에 BufferedWriter에 의한
버퍼링 기능을 추가해보자. 그리고 더불어서 파일에 문자열 저장 이후에,
파일에 저장된 문자열을 전부를 다시 출력하는형태로 예제를 확장해보자.

import java.io.*;

class PrintWriterStream
{
    public static void main(String[] args)
    {
        try(PrintWriter out=
                    new PrintWriter(new FileWriter("printf.txt")))
        {
            out.printf("제 나이는 %d살 입니다.", 24);
            out.println("");

            out.println("저는 자바가 좋습니다.");
            out.print("특히 I/O 부분에서 많은 매력을 느낍니다.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

 */

import java.io.*;

class PrintWriterStream
{
    public static void main(String[] args)
    {
        String fileName = "printf.txt";
        try(PrintWriter out=
                    new PrintWriter(new FileWriter("printf.txt")))
        {
            out.printf("제 나이는 %d살 입니다.", 24);
            out.println("");

            out.println("저는 자바가 좋습니다.");
            out.print("특히 I/O 부분에서 많은 매력을 느낍니다.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}