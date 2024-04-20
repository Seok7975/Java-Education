interface Printable {
    void print(String s);
}

class Lambda4 {
    public static void ShowString(Printable p, String s) {
        p.print(s);
    }

    public static void main(String[] args) {
        // 참조 변수에 람다 변수 삽입
        ShowString((s) -> { System.out.println(s); }, "What is Lambda?");
    }
}

/*
What is Lambda?
*/