//34. String.txt에다가 다음 내용을 출력하시오.
//
//박지성 - 메시 멈추게 하는데 집중하겠다.
//올 시즌은 나에게 있어 최고의 시즌이다.
//팀이 승리하는 것을 돕기 위해 최선을다하겠다.
//환상적인 결승전이 될 것이다.
//
//기사 제보 및 보도자료
//press@goodnews.co.kr


import java.io.*;

class Ex34_BufferedWriter
{
    public static void BufferedWriter()
    {
        try (BufferedWriter out = new BufferedWriter(new FileWriter("String.txt")))
        {
            out.write("박지성 - 메시 멈추게 하는데 집중하겠다.");
            out.newLine();
            out.write("올 시즌은 나에게 있어 최고의 시즌이다.");
            out.newLine();
            out.write("팀이 승리하는 것을 돕기 위해 최선을다하겠다.");
            out.newLine();
            out.write("환상적인 결승전이 될 것이다.");
            out.newLine();
            out.newLine();
            out.write("기사 제보 및 보도자료");
            out.newLine();
            out.write("press@goodnews.co.kr");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}

class Ex35_BufferedReader
{
    public static void BufferedReader()
    {
        String fileName = "String.txt";
        String str = null;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName)))
        {
            while((str = br.readLine()) != null)
            {
                System.out.println(str);
            }
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

class BufferedWriter_Main
{
    public static void main(String[] args)
    {
        Ex34_BufferedWriter.BufferedWriter();
        Ex35_BufferedReader.BufferedReader();
    }



}