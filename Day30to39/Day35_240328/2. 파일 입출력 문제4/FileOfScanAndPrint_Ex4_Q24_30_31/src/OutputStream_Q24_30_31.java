import java.io.*;

class OutputStream_Ex_FileWriterStream
{
    public static void FileWriterStream_Integer()
    {
        try(OutputStream out = new FileOutputStream("hyper_int.txt"))
        {
            out.write(65);  //유니코드 값으로 하기때문에 'A', 65[x]
            out.write(66);  // 'B'
            out.close();
            // 숫자를 입력하고 싶으면 DataOutputStream
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void FileWriterStream_Character()
    {
        try(OutputStream out = new FileOutputStream("hyper_char.txt"))
        {
            char ch1 = 'A';
            char ch2 = 'B';

            out.write(ch1);
            out.write(ch2);
            out.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}

//FileWriterStream_Character()에서 출력한 데이터를 읽어들여서 모니터에 출력해보자.
class FileReaderStream
{
    public static void FileReaderStream_Character()
    {
        char[] cbuf = new char[10];
        int readCount;

        try(Reader in = new FileReader("hyper_char.txt"))
        {
            readCount = in.read(cbuf, 0, cbuf.length);
            for(int i=0; i<readCount; i++)
            {
                System.out.println(cbuf[i]);
            }
            in.close();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }

        catch (IOException e2)
        {
            e2.printStackTrace();
        }
    }
}

class OutputStream_Ex_Main
{
    public static void main(String[] args) throws IOException //실행되는 곳에서 throws
    {
        OutputStream_Ex_FileWriterStream.FileWriterStream_Integer();
        OutputStream_Ex_FileWriterStream.FileWriterStream_Character();
        FileReaderStream.FileReaderStream_Character();
    }

}