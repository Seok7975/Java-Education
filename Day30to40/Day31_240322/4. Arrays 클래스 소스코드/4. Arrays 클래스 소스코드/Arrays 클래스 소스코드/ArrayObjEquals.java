import java.util.Arrays;

class INum {
    private int num;
    
    public INum(int num) {
        this.num = num;
    }
}

class ArrayObjEquals {
    public static void main(String[] args) {
        INum[] ar1 = new INum[3];
        INum[] ar2 = new INum[3];
        
        ar1[0] = new INum(1);
        ar2[0] = new INum(1);

        ar1[1] = new INum(2);
        ar2[1] = new INum(2);

        ar1[2] = new INum(3);
        ar2[2] = new INum(3);

        System.out.println(Arrays.equals(ar1, ar2));
    }
}

/*
실행 결과
false
*/

/*
위 예제에서는 두 배열에 동일한 값으로 초기화된 서로 다른 인스턴스를 각각 저장하였다. 그러나
배열의 비교 결과는 false이다. 이유는 Object 클래스에 정의되어 있는 equals 메소드가 다음과
같이 정의되어 있기 때문이다.

public boolean equals(Object obj) {
	if(this==obj)		// 두 인스턴스가 동일 인스턴스이면
		return true;
	else
		return false;
}	// 이렇듯 Object 클래스에 정의된 equals 메소드는 참조 값 비교를 한다.

따라서 배열의 참조 값 비교가 아닌 내용 비교가 목적이라면 equals 메소드를 목적에 맞게
오버라이딩 해야 한다.
*/