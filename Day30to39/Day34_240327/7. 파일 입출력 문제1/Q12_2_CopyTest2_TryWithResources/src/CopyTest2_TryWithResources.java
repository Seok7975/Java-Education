import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

class CopyTest2
{

    public static void main(String[] args)
    {

        byte[] r = new byte[1024];
        int len = 0, total = 0;
        try (FileInputStream in = new FileInputStream
                ("C:\\JavaStudy\\Java\\Day\\Day34_240327\\" +
                        "7. 파일 입출력 문제1\\Q9_1_CopyTest\\src\\Grit.txt");
             FileOutputStream out = new FileOutputStream("GritCopy.txt"))
        {
            while ((len = in.read(r)) != -1)
            {
                total += len;
                out.write(r, 0, len);
            }
            System.out.println(total + "바이트 배열 단위 파일 복사가 완료되었습니다.");
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