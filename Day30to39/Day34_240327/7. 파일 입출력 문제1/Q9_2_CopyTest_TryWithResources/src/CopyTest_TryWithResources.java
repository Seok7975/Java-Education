/*
자동 자원 반환 try-with-resources문
JDK1.7 부터 try-with-resources문이라는 try-catch문의 변형이 새로 추가되었다.
try-with-resources문의 괄호()안에 객체를 생성하는 문장을 넣으면, 이 객체는 따로
close()를 호출하지 않아도 try 블럭을 벗어나는 순간 자동적으로 close()가 호출된다. 그 
다음에 catch블럭 또는 finally 블럭이 수행된다.
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

class CopyTestTryWithResources
{
    public static void main(String[] args)
    {
        int r = 0;
        int cnt = 0;

        try(FileInputStream in
                    = new FileInputStream
                ("C:\\JavaStudy\\Java\\Day\\Day34_240327\\7. 파일 입출력 문제1\\Q9_1_CopyTest_TryWithResources\\src\\Grit.txt");
            FileOutputStream out = new FileOutputStream("GritCopy.txt"))
        {

            while((r=in.read()) != -1)
            {
                cnt++;
                out.write(r);
            }
            System.out.println("복사된 byte는 " + cnt);
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}