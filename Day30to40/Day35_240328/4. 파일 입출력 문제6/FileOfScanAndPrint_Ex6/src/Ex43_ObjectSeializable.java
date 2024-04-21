//43. 문제43 폴더에 있는 Circle 클래스를 이용하여
//Circle 인스턴스 new Circle(1, 1, 2.4)와
//Circle 인스턴스 new Circle(2, 2, 4.8)을 저장하고
//그리고 "String implements Serializable" String 인스턴스를 파일로 저장하고,
//다시 파일로 부터 읽어 들이자.


import java.io.*;

class Circle
{
    int xPos;
    int yPos;
    double rad;

    public Circle(int x, int y, double r)
    {
        xPos=x;
        yPos=y;
        rad=r;
    }
    public void showCircleInfo()
    {
        System.out.printf("[%d, %d] \n", xPos, yPos);
        System.out.println("rad: "+rad);
    }
}

/////////////////////////////////////////////////////////////////////

class Ex43_ObjectSeializable
{
    public static void main(String[] args)
            throws IOException, ClassNotFoundException
    {
        //인스턴스 저장
        ObjectOutputStream out
                = new ObjectOutputStream(new FileOutputStream("Object.ser"));

        out.writeObject(new Circle(1, 1, 2.4));
        out.writeObject(new Circle(2, 2, 4.8));
        out.writeObject(new String("String implements Serializable"));
        out.close();

        //인스턴스 복원
        ObjectInputStream in
                = new ObjectInputStream(new FileInputStream("Object.ser"));
        Circle cl1=(Circle)in.readObject();
        Circle cl2=(Circle)in.readObject();
        String message = (String)in.readObject();
        in.close();

        //복원된 정보 출력
        cl1.showCircleInfo();
        cl2.showCircleInfo();
        System.out.println(message);
    }
}