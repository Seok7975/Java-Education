interface Printable {
    void print();   
}

class Papers {
    private String con;
    public Papers(String s) { con = s; }

    public Printable getPrinter() {
        class Printer implements Printable {
            public void print() { System.out.println(con); }
        }
        
        return new Printer();
    }
}

class UseLocalInner {
    public static void main(String[] args) {
        Papers p = new Papers("서류 내용: 행복합니다.");
        Printable prn = p.getPrinter();
        prn.print();
    }
}

/*
서류 내용: 행복합니다.
*/

/*
이렇듯 메소드 내에 클래스를 정의하면 해당 메소드 내에서만
인스턴스 생성이 가능하다. (따라서 클래스에 대한 private 선언은
의미가 없다. 어차피 메소드 내에서만 인스턴스 생성이 가능하므로)
즉 멤버 클래스보다도 클래스를 더 깊이, 특정 블록 안으로 감추는
효과가 있다.
*/