interface Viewable {
    @Deprecated
    public void showIt(String str);

    public void brShowIt(String str);
}

class Viewer implements Viewable {
    @Override 
    @SuppressWarnings("deprecation")
    public void showIt(String str) {
        System.out.println(str);
    }

    @Override
    public void brShowIt(String str) {
        System.out.println('[' + str + ']');
    }
};

class AtSuppressWarnings {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Viewable view = new Viewer();     
        view.showIt("Hello Annotations");
        view.brShowIt("Hello Annotations");
    }
}

/*
@SuppressWarnings
앞서 예제에서는 인터페이스에 선언된 메소드 하나가 Deprecated 되어서
컴파일 경고가 발생하는 상황을 연출하였다. 그런데 해당 메소드를
대체할 수 있는 상황이 아니어서 당분간 그 메소드를 구현하고 호출해야
하는 상황이라면 @SuppressWarnings 선언을 통해 컴파일러의
경고를 지울 수 있다. 컴파일러가 경고 메시지를 전달하는 특정 상황에
대해서, 경고 메시지를 전달하지 말라고 요청할 때 애너테이션 타입
@SuppressWarnings를 사용한다. 예를 들어서 Deprecated된 메소드의
사용에 대한 경고를 보내지 말라고 요청하려면 다음 선언을 추가하면 된다.

@SuppressWarnings("deprecation")
*/