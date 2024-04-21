interface Printable {
    void print(String s);
}

class Lambda3 {
    public static void main(String[] args) {
        Printable prn = (s) -> { System.out.println(s); }; // Printable을 구현한 객체들이 와야함
        prn.print("What is Lambda?");
    }
}

/*
What is Lambda?
*/