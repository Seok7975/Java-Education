interface Viewable {
    @Deprecated
    public void showIt(String str);
    public void brShowIt(String str);
}

class Viewer implements Viewable {
    @Override 
    public void showIt(String str) {
        System.out.println(str);
    }

    @Override
    public void brShowIt(String str) {
        System.out.println('[' + str + ']');
    }
}

class AtDeprecated {
    public static void main(String[] args) {
        Viewable view = new Viewer();
        view.showIt("Hello Annotations");
        view.brShowIt("Hello Annotations");
    }
}

/*
Hello Annotations
[Hello Annotations]
*/

/*
@Deprecated
문제의 발생 소지가 있거나 개선된 기능의 다른 것으로 대체되어서
더 이상 필요 없게 되었음을 뜻하는 단어가 Deprecated이다.
따라서 아직은 호환성 유지를 위해 존재하지만 이후에 사라질 수
있는 클래스 또는 메소드를 가리켜 Deprecated 되었다고 한다.
그리고 @Deprecated 선언을 통해서 우리가 작성한 코드의
일부에도 Deprecated 선언을 할 수 있다.

위의 컴파일 결과를 보면, 컴파일은 잘 되었으나 컴파일러는 다음
메시지를 전달한다.

Note: AtDeprecated.java uses or overrides a deprecated API.

이는 컴파일 된 코드에 deprecated 된 무언가를 사용했음을 알리는 메시지이다.
구체적으로 어느 부분에서 이러한 일이 발생했는지 확인하려면 위의 컴파일 결과에
나와 있듯이 다음과 같이 옵션을 추가하여 컴파일 하면 된다.(간단히 -Xlint만
추가해도 확인할 수 있다.)

C:\JavaStudy>javac -Xlint:deprecation AtDeprecated.java

그럼 먼저 다음 인터페이스 정의를 보자.

interface Viewable {
    @Deprecated
    public void showIt(String str);
    public void brShowIt(String str);
}

위의 인터페이스에 선언된 showIt 메소드가 Deprecated 되었다. 따라서 컴파일러는
이 메소드를 호출하는 다음 문장을 경고한다.

public static void main(String[] args){
	Viewable view = new Viewer();
	view.showIt("Hello Annotations");		// 컴파일러가 경고하는 문장
	...
}

뿐만 아니라 컴파일러는 Deprecated 된 메소드를 구현하는 다음 부분에
대해서도 경고한다.

class Viewer implements Viewable {
	@Override
	public void showIt(String str){		// 컴파일러가 경고하는 부분
		System.out.println(str);
	}
	...
}

이렇듯 우리가 작성한 코드에서도 일부 내용에 대해 Deprecated 선언을
할 수 있다.
*/