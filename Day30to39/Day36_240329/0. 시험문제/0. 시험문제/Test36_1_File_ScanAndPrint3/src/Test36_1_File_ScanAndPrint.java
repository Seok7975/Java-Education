/*
[System.out의 이해와 I/O의 응용]
이번에는 System.out에 대해서 지금까지 몰랐던 내용을 소개하면서,
더불어 I/O의 이해도를 점검하기 위한 문제를 제시하고자 한다.
다음 예제에서는 우리가 지금까지 활용해온 System.out을 대상으로 하는
각종 메소드의 호출방법을 보이고 있다.

class MyInfo
{
	String info;
	public MyInfo(String info) { this.info = info; }
	public String toString() { return info; }
}

class PrintlnPrintf
{
	public static void main(String[] args)
	{
		MyInfo mInfo = new MyInfo("저는 자바 프로그래머입니다.");
		System.out.println("제 소개를 하겠습니다.");
		System.out.println(mInfo);
		System.out.printf("나이 %d, 몸무게 %dkg입니다.", 24, 72);
	}
}

위의 실행결과로 다음의 출력결과를 확인할 수 있다.
제 소개를 하겠습니다.
저는 자바 프로그래머입니다.
나이 24, 몸무게 72kg입니다.

그런데 여기서 사용된 System.out은 System클래스에 다음과 같이 선언되어 있다.
public static final PrintStrem out;
즉 System.out은 PrintStream의 인스턴스를 참조하고 있다. 그런데 PrintStream 클래스가 직간접적으로 상속하는 클래스 둘은 다음과 같다.
java.io.OutputStream;
java.io.FilterOutputStream		// 필터 스트림임을 의미함!

즉 PrintStream도 출력 스트림에 연결할 수 있는 필터 스트림이다.
따라서 System.out은 모니터를 의미하는 출력 스트림에 PrintStream의 필터 스트림이
연결된 형태로 볼 수 있다. 그렇다면 이 필터 스트림은 어떠한 특징을 지니고 있는가?
이미 println, printf 메소드를 사용해 왔기 때문에 대략적인 특징은 알고 있겠지만,
이는 다음과 같이 정리할 수 있다.
 "다양한 형태의 데이터를 문자열의 형태로 출력하거나(println),
문자열의 형태로 조합하여 출력한다(printf)."
이는 정수가, 있는 그대로 출력되는 것이 아니라,
문자열의 형태로 변환이 되어서 출력되는 것이다.
원래 콘솔은 문자열만 출력이 가능하다.
따라서 정수나 실수를 출력하려면 문자열로 변환해야 하는데,
이러한 변환을 PrintStream이 대신해 줬던 것이다. 그럼 문제를 제시하겠다.
위 예제에서 보이는 출력결과가 파일 println.txt에 문자열의 형태로 저장되도록
예제를 변경해 보자. 그리고 문자열의 형태로 저장이 되었다면,
메모장(notepad)을 통해서 확인이 가능하니 반드시 확인하기 바란다.
 */
/*
[System.out의 이해와 I/O의 응용]
이번에는 System.out에 대해서 지금까지 몰랐던 내용을 소개하면서,
더불어 I/O의 이해도를 점검하기 위한 문제를 제시하고자 한다.
다음 예제에서는 우리가 지금까지 활용해온 System.out을 대상으로 하는
각종 메소드의 호출방법을 보이고 있다.

class MyInfo
{
	String info;
	public MyInfo(String info) { this.info = info; }
	public String toString() { return info; }
}

class PrintlnPrintf
{
	public static void main(String[] args)
	{
		MyInfo mInfo = new MyInfo("저는 자바 프로그래머입니다.");
		System.out.println("제 소개를 하겠습니다.");
		System.out.println(mInfo);
		System.out.printf("나이 %d, 몸무게 %dkg입니다.", 24, 72);
	}
}

위의 실행결과로 다음의 출력결과를 확인할 수 있다.
제 소개를 하겠습니다.
저는 자바 프로그래머입니다.
나이 24, 몸무게 72kg입니다.

그런데 여기서 사용된 System.out은 System클래스에 다음과 같이 선언되어 있다.
public static final PrintStrem out;
즉 System.out은 PrintStream의 인스턴스를 참조하고 있다. 그런데 PrintStream 클래스가 직간접적으로 상속하는 클래스 둘은 다음과 같다.
java.io.OutputStream;
java.io.FilterOutputStream		// 필터 스트림임을 의미함!

즉 PrintStream도 출력 스트림에 연결할 수 있는 필터 스트림이다.
따라서 System.out은 모니터를 의미하는 출력 스트림에 PrintStream의 필터 스트림이
연결된 형태로 볼 수 있다. 그렇다면 이 필터 스트림은 어떠한 특징을 지니고 있는가?
이미 println, printf 메소드를 사용해 왔기 때문에 대략적인 특징은 알고 있겠지만,
이는 다음과 같이 정리할 수 있다.
 "다양한 형태의 데이터를 문자열의 형태로 출력하거나(println),
문자열의 형태로 조합하여 출력한다(printf)."
이는 정수가, 있는 그대로 출력되는 것이 아니라,
문자열의 형태로 변환이 되어서 출력되는 것이다.
원래 콘솔은 문자열만 출력이 가능하다.
따라서 정수나 실수를 출력하려면 문자열로 변환해야 하는데,
이러한 변환을 PrintStream이 대신해 줬던 것이다. 그럼 문제를 제시하겠다.
위 예제에서 보이는 출력결과가 파일 println.txt에 문자열의 형태로 저장되도록
예제를 변경해 보자. 그리고 문자열의 형태로 저장이 되었다면,
메모장(notepad)을 통해서 확인이 가능하니 반드시 확인하기 바란다.
 */
/*
[System.out의 이해와 I/O의 응용]
이번에는 System.out에 대해서 지금까지 몰랐던 내용을 소개하면서,
더불어 I/O의 이해도를 점검하기 위한 문제를 제시하고자 한다.
다음 예제에서는 우리가 지금까지 활용해온 System.out을 대상으로 하는
각종 메소드의 호출방법을 보이고 있다.

class MyInfo
{
	String info;
	public MyInfo(String info) { this.info = info; }
	public String toString() { return info; }
}

class PrintlnPrintf
{
	public static void main(String[] args)
	{
		MyInfo mInfo = new MyInfo("저는 자바 프로그래머입니다.");
		System.out.println("제 소개를 하겠습니다.");
		System.out.println(mInfo);
		System.out.printf("나이 %d, 몸무게 %dkg입니다.", 24, 72);
	}
}

위의 실행결과로 다음의 출력결과를 확인할 수 있다.
제 소개를 하겠습니다.
저는 자바 프로그래머입니다.
나이 24, 몸무게 72kg입니다.

그런데 여기서 사용된 System.out은 System클래스에 다음과 같이 선언되어 있다.
public static final PrintStrem out;
즉 System.out은 PrintStream의 인스턴스를 참조하고 있다. 그런데 PrintStream 클래스가 직간접적으로 상속하는 클래스 둘은 다음과 같다.
java.io.OutputStream;
java.io.FilterOutputStream		// 필터 스트림임을 의미함!

즉 PrintStream도 출력 스트림에 연결할 수 있는 필터 스트림이다.
따라서 System.out은 모니터를 의미하는 출력 스트림에 PrintStream의 필터 스트림이
연결된 형태로 볼 수 있다. 그렇다면 이 필터 스트림은 어떠한 특징을 지니고 있는가?
이미 println, printf 메소드를 사용해 왔기 때문에 대략적인 특징은 알고 있겠지만,
이는 다음과 같이 정리할 수 있다.
 "다양한 형태의 데이터를 문자열의 형태로 출력하거나(println),
문자열의 형태로 조합하여 출력한다(printf)."
이는 정수가, 있는 그대로 출력되는 것이 아니라,
문자열의 형태로 변환이 되어서 출력되는 것이다.
원래 콘솔은 문자열만 출력이 가능하다.
따라서 정수나 실수를 출력하려면 문자열로 변환해야 하는데,
이러한 변환을 PrintStream이 대신해 줬던 것이다. 그럼 문제를 제시하겠다.
위 예제에서 보이는 출력결과가 파일 println.txt에 문자열의 형태로 저장되도록
예제를 변경해 보자. 그리고 문자열의 형태로 저장이 되었다면,
메모장(notepad)을 통해서 확인이 가능하니 반드시 확인하기 바란다.
 */
/*
[System.out의 이해와 I/O의 응용]
이번에는 System.out에 대해서 지금까지 몰랐던 내용을 소개하면서,
더불어 I/O의 이해도를 점검하기 위한 문제를 제시하고자 한다.
다음 예제에서는 우리가 지금까지 활용해온 System.out을 대상으로 하는
각종 메소드의 호출방법을 보이고 있다.

class MyInfo
{
	String info;
	public MyInfo(String info) { this.info = info; }
	public String toString() { return info; }
}

class PrintlnPrintf
{
	public static void main(String[] args)
	{
		MyInfo mInfo = new MyInfo("저는 자바 프로그래머입니다.");
		System.out.println("제 소개를 하겠습니다.");
		System.out.println(mInfo);
		System.out.printf("나이 %d, 몸무게 %dkg입니다.", 24, 72);
	}
}

위의 실행결과로 다음의 출력결과를 확인할 수 있다.
제 소개를 하겠습니다.
저는 자바 프로그래머입니다.
나이 24, 몸무게 72kg입니다.

그런데 여기서 사용된 System.out은 System클래스에 다음과 같이 선언되어 있다.
public static final PrintStrem out;
즉 System.out은 PrintStream의 인스턴스를 참조하고 있다. 그런데 PrintStream 클래스가 직간접적으로 상속하는 클래스 둘은 다음과 같다.
java.io.OutputStream;
java.io.FilterOutputStream		// 필터 스트림임을 의미함!

즉 PrintStream도 출력 스트림에 연결할 수 있는 필터 스트림이다.
따라서 System.out은 모니터를 의미하는 출력 스트림에 PrintStream의 필터 스트림이
연결된 형태로 볼 수 있다. 그렇다면 이 필터 스트림은 어떠한 특징을 지니고 있는가?
이미 println, printf 메소드를 사용해 왔기 때문에 대략적인 특징은 알고 있겠지만,
이는 다음과 같이 정리할 수 있다.
 "다양한 형태의 데이터를 문자열의 형태로 출력하거나(println),
문자열의 형태로 조합하여 출력한다(printf)."
이는 정수가, 있는 그대로 출력되는 것이 아니라,
문자열의 형태로 변환이 되어서 출력되는 것이다.
원래 콘솔은 문자열만 출력이 가능하다.
따라서 정수나 실수를 출력하려면 문자열로 변환해야 하는데,
이러한 변환을 PrintStream이 대신해 줬던 것이다. 그럼 문제를 제시하겠다.
위 예제에서 보이는 출력결과가 파일 println.txt에 문자열의 형태로 저장되도록
예제를 변경해 보자. 그리고 문자열의 형태로 저장이 되었다면,
메모장(notepad)을 통해서 확인이 가능하니 반드시 확인하기 바란다.
 */
/*
[System.out의 이해와 I/O의 응용]
이번에는 System.out에 대해서 지금까지 몰랐던 내용을 소개하면서,
더불어 I/O의 이해도를 점검하기 위한 문제를 제시하고자 한다.
다음 예제에서는 우리가 지금까지 활용해온 System.out을 대상으로 하는
각종 메소드의 호출방법을 보이고 있다.

class MyInfo
{
	String info;
	public MyInfo(String info) { this.info = info; }
	public String toString() { return info; }
}

class PrintlnPrintf
{
	public static void main(String[] args)
	{
		MyInfo mInfo = new MyInfo("저는 자바 프로그래머입니다.");
		System.out.println("제 소개를 하겠습니다.");
		System.out.println(mInfo);
		System.out.printf("나이 %d, 몸무게 %dkg입니다.", 24, 72);
	}
}

위의 실행결과로 다음의 출력결과를 확인할 수 있다.
제 소개를 하겠습니다.
저는 자바 프로그래머입니다.
나이 24, 몸무게 72kg입니다.

그런데 여기서 사용된 System.out은 System클래스에 다음과 같이 선언되어 있다.
public static final PrintStrem out;
즉 System.out은 PrintStream의 인스턴스를 참조하고 있다. 그런데 PrintStream 클래스가 직간접적으로 상속하는 클래스 둘은 다음과 같다.
java.io.OutputStream;
java.io.FilterOutputStream		// 필터 스트림임을 의미함!

즉 PrintStream도 출력 스트림에 연결할 수 있는 필터 스트림이다.
따라서 System.out은 모니터를 의미하는 출력 스트림에 PrintStream의 필터 스트림이
연결된 형태로 볼 수 있다. 그렇다면 이 필터 스트림은 어떠한 특징을 지니고 있는가?
이미 println, printf 메소드를 사용해 왔기 때문에 대략적인 특징은 알고 있겠지만,
이는 다음과 같이 정리할 수 있다.
 "다양한 형태의 데이터를 문자열의 형태로 출력하거나(println),
문자열의 형태로 조합하여 출력한다(printf)."
이는 정수가, 있는 그대로 출력되는 것이 아니라,
문자열의 형태로 변환이 되어서 출력되는 것이다.
원래 콘솔은 문자열만 출력이 가능하다.
따라서 정수나 실수를 출력하려면 문자열로 변환해야 하는데,
이러한 변환을 PrintStream이 대신해 줬던 것이다. 그럼 문제를 제시하겠다.
위 예제에서 보이는 출력결과가 파일 println.txt에 문자열의 형태로 저장되도록
예제를 변경해 보자. 그리고 문자열의 형태로 저장이 되었다면,
메모장(notepad)을 통해서 확인이 가능하니 반드시 확인하기 바란다.
 */
/*
[System.out의 이해와 I/O의 응용]
이번에는 System.out에 대해서 지금까지 몰랐던 내용을 소개하면서,
더불어 I/O의 이해도를 점검하기 위한 문제를 제시하고자 한다.
다음 예제에서는 우리가 지금까지 활용해온 System.out을 대상으로 하는
각종 메소드의 호출방법을 보이고 있다.

class MyInfo
{
	String info;
	public MyInfo(String info) { this.info = info; }
	public String toString() { return info; }
}

class PrintlnPrintf
{
	public static void main(String[] args)
	{
		MyInfo mInfo = new MyInfo("저는 자바 프로그래머입니다.");
		System.out.println("제 소개를 하겠습니다.");
		System.out.println(mInfo);
		System.out.printf("나이 %d, 몸무게 %dkg입니다.", 24, 72);
	}
}

위의 실행결과로 다음의 출력결과를 확인할 수 있다.
제 소개를 하겠습니다.
저는 자바 프로그래머입니다.
나이 24, 몸무게 72kg입니다.

그런데 여기서 사용된 System.out은 System클래스에 다음과 같이 선언되어 있다.
public static final PrintStrem out;
즉 System.out은 PrintStream의 인스턴스를 참조하고 있다. 그런데 PrintStream 클래스가 직간접적으로 상속하는 클래스 둘은 다음과 같다.
java.io.OutputStream;
java.io.FilterOutputStream		// 필터 스트림임을 의미함!

즉 PrintStream도 출력 스트림에 연결할 수 있는 필터 스트림이다.
따라서 System.out은 모니터를 의미하는 출력 스트림에 PrintStream의 필터 스트림이
연결된 형태로 볼 수 있다. 그렇다면 이 필터 스트림은 어떠한 특징을 지니고 있는가?
이미 println, printf 메소드를 사용해 왔기 때문에 대략적인 특징은 알고 있겠지만,
이는 다음과 같이 정리할 수 있다.
 "다양한 형태의 데이터를 문자열의 형태로 출력하거나(println),
문자열의 형태로 조합하여 출력한다(printf)."
이는 정수가, 있는 그대로 출력되는 것이 아니라,
문자열의 형태로 변환이 되어서 출력되는 것이다.
원래 콘솔은 문자열만 출력이 가능하다.
따라서 정수나 실수를 출력하려면 문자열로 변환해야 하는데,
이러한 변환을 PrintStream이 대신해 줬던 것이다. 그럼 문제를 제시하겠다.
위 예제에서 보이는 출력결과가 파일 println.txt에 문자열의 형태로 저장되도록
예제를 변경해 보자. 그리고 문자열의 형태로 저장이 되었다면,
메모장(notepad)을 통해서 확인이 가능하니 반드시 확인하기 바란다.
 */
/*
[System.out의 이해와 I/O의 응용]
이번에는 System.out에 대해서 지금까지 몰랐던 내용을 소개하면서,
더불어 I/O의 이해도를 점검하기 위한 문제를 제시하고자 한다.
다음 예제에서는 우리가 지금까지 활용해온 System.out을 대상으로 하는
각종 메소드의 호출방법을 보이고 있다.

class MyInfo
{
	String info;
	public MyInfo(String info) { this.info = info; }
	public String toString() { return info; }
}

class PrintlnPrintf
{
	public static void main(String[] args)
	{
		MyInfo mInfo = new MyInfo("저는 자바 프로그래머입니다.");
		System.out.println("제 소개를 하겠습니다.");
		System.out.println(mInfo);
		System.out.printf("나이 %d, 몸무게 %dkg입니다.", 24, 72);
	}
}

위의 실행결과로 다음의 출력결과를 확인할 수 있다.
제 소개를 하겠습니다.
저는 자바 프로그래머입니다.
나이 24, 몸무게 72kg입니다.

그런데 여기서 사용된 System.out은 System클래스에 다음과 같이 선언되어 있다.
public static final PrintStrem out;
즉 System.out은 PrintStream의 인스턴스를 참조하고 있다. 그런데 PrintStream 클래스가 직간접적으로 상속하는 클래스 둘은 다음과 같다.
java.io.OutputStream;
java.io.FilterOutputStream		// 필터 스트림임을 의미함!

즉 PrintStream도 출력 스트림에 연결할 수 있는 필터 스트림이다.
따라서 System.out은 모니터를 의미하는 출력 스트림에 PrintStream의 필터 스트림이
연결된 형태로 볼 수 있다. 그렇다면 이 필터 스트림은 어떠한 특징을 지니고 있는가?
이미 println, printf 메소드를 사용해 왔기 때문에 대략적인 특징은 알고 있겠지만,
이는 다음과 같이 정리할 수 있다.
 "다양한 형태의 데이터를 문자열의 형태로 출력하거나(println),
문자열의 형태로 조합하여 출력한다(printf)."
이는 정수가, 있는 그대로 출력되는 것이 아니라,
문자열의 형태로 변환이 되어서 출력되는 것이다.
원래 콘솔은 문자열만 출력이 가능하다.
따라서 정수나 실수를 출력하려면 문자열로 변환해야 하는데,
이러한 변환을 PrintStream이 대신해 줬던 것이다. 그럼 문제를 제시하겠다.
위 예제에서 보이는 출력결과가 파일 println.txt에 문자열의 형태로 저장되도록
예제를 변경해 보자. 그리고 문자열의 형태로 저장이 되었다면,
메모장(notepad)을 통해서 확인이 가능하니 반드시 확인하기 바란다.
 */

import java.io.*;

class MyInfo
{
    String info;
    public MyInfo(String info) { this.info = info; }
    public String toString() { return info; }
}

class PrintlnPrintf
{
    public static void main(String[] args)
    {
        try(OutputStream o = new FileOutputStream("println.txt");
        PrintStream out = new PrintStream(o))
        {
            MyInfo mInfo = new MyInfo("저는 자바 프로그래머입니다.");
            out.println("제 소개를 하겠습니다.");
            out.println(mInfo);
            out.printf("나이 %d, 몸무게 %dkg입니다.", 24, 72);
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
