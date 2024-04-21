class CopyOfSystem {
    public static void main(String[] args) {
        double[] org = {1.1, 2.2, 3.3, 4.4, 5.5};
        double[] cpy = new double[3];

        System.arraycopy(org, 1, cpy, 0, 3);

        for(double d : cpy)
            System.out.print(d + "\t");
        
        System.out.println();
    }
}

/*
실행 결과
2.2	3.3	4.4	
*/

/*
앞서 배열의 복사와 관련된 메소드들이, 모든 기본 자료형 배열을 대상으로 오버로딩
되어 있음을 언급하였는데, 이들 이외에도 특정 클래스의 인스턴스를 저장하고 있는
배열을 대상으로도 복사를 진행할 수 있도록 copyOf 메소드와 copyOfRange 메소드가
오버로딩 되어 있다.
*/