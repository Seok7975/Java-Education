//9. 파일을 1바이트씩 복사하는 프로그램을 짜시오. 그리고 복사된 바이트를 출력하시오.

import java.io.*;

class CopyTest
{

    public static void main(String[] args)
    {
        int r = 0;
        int cnt = 0;
        InputStream in = null;
        OutputStream out = null;

        try
        {
            //in = new FileInputStream("Grit.txt"); // src폴더에(같은 디렉토리)에 Grit.txt파일이 있어야함
            in = new FileInputStream("C:\\JavaStudy\\Java\\Day\\Day34_240327\\7. 파일 입출력 문제1\\Q9_1_CopyTest_TryWithResources\\src\\Grit.txt");
            //그게 아니라면 이렇게 주소를 직접 기입
            out = new FileOutputStream("GritCopy.txt");
            while ((r = in.read()) != -1)
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
        finally
        {
            try
            {
                if (in != null)
                    in.close();
                if (out != null)
                    out.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}
