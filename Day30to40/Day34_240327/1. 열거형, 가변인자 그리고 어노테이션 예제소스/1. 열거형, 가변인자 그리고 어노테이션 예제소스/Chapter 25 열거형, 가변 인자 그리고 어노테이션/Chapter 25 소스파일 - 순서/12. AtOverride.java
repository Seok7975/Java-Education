interface Viewable {
    public void showIt(String str);
}

class Viewer implements Viewable {
    @Override
    public void showIt(String str) {
        System.out.println(str);
    }
};

class AtOverride {
    public static void main(String[] args) {
        Viewable view = new Viewer();
        view.showIt("Hello Annotations");
    }
}
/*
Hello Annotations
*/

/*
어노테이션
자바 컴파일러에게 메시지를 전달하는 목적의 메모

어노테이션의 설명 범위
어노테이션은 자바 5에서 소개되었다. 그리고 당시 소개된
'어노테이션 타입(Annotation Types)' 세 가지는 다음과 같다.
(이들을 '어노테이션 타입'이라 한다.)

@Override
@Deprecated
@SuppressWarnings
*/
/*
@Override
"상위 클래스의 메소드 오버라이딩 또는 인터페이스에 선언된 추상 메소드의
구현입니다."
따라서 이에 어긋난 메소드 정의가 이뤄지면 컴파일 오류로 이어져서 우리로
하여금 잘못된 부분을 확인할 수 있게 해준다.
*/