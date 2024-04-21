//4. Lambda1.java를 람다로 바꿔보시오.

/*
interface Printable {
    void print(String s);
}

class Printer implements Printable {
    public void print(String s) {
        System.out.println(s);
    }
}

class Lambda1 {
    public static void main(String[] args) {
        Printable prn = new Printer();
        prn.print("What is Lambda?");
    }
}
*/

interface Printable
{
    void print(String s);
}

/*class Printer implements Printable
{
    public void print(String s)
    {
        System.out.println(s);
    }
}*/

class Lambda1
{
    public static void main(String[] args)
    {
        Printable prn = s -> System.out.println(s);
        prn.print("What is Lambda?");
    }
}


/*
What is Lambda?
*/