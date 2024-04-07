// Test29_4  Generic_Wildcard
//[와일드카드의 상한과 하한 제한]
//다음 예제에는 프로그래머의 실수가 존재한다. 그러나 컴파일 과정에서는 이 실수가 드러나지 않는다.
//실수가 컴파일 과정에서 발견될 수 있도록 매개변수 선언을 수정하자. 그리고 프로그래머의 실수를 바로잡자.

//Step 1 런타임 에러를 컴파일 에러로
/*class Box<T>
{
    private T ob;
    public void set(T o) { ob = o; }
    public T get() { return ob; }
}

class BoundedWildcardDemo
{
    //public static void addBox(Box<Integer> b1, Box<Integer> b2, Box<Integer> b3)
    public static void addBox(Box<? super Integer> b1, Box<? extends Integer> b2, Box<? extends Integer> b3)
    {
        b3.set(b1.get() + b2.get());	// 프로그래머의 실수가 있는 부분, 제한을 둠으로써 빨간줄 에러가 보인다
    }

    public static void main(String[] args)
    {
        Box<Integer> box1 = new Box<>();
        box1.set(24);
        Box<Integer> box2 = new Box<>();
        box2.set(37);
        Box<Integer> result = new Box<>();
        result.set(0);

        addBox(result, box1, box2);    // result에 24 + 37의 결과 저장
        System.out.println(result.get());    // 61 출력
    }
}*/

//Step 2 컴파일 에러로 확인을 할 수 있게 만들고 에러를 제대로 수정
class Box<T>
{
    private T ob;
    public void set(T o) { ob = o; }
    public T get() { return ob; }
}

class BoundedWildcardDemo
{
    //public static void addBox(Box<Integer> b1, Box<Integer> b2, Box<Integer> b3)
    public static void addBox(Box<? super Integer> b1, Box<? extends Integer> b2, Box<? extends Integer> b3)
    {
        b1.set(b2.get() + b3.get());	// 프로그래머의 실수가 있는 부분, 제한을 둠으로써 빨간줄 에러가 보인다
    }

    public static void main(String[] args)
    {
        Box<Integer> box1 = new Box<>();
        box1.set(24);
        Box<Integer> box2 = new Box<>();
        box2.set(37);
        Box<Integer> result = new Box<>();
        result.set(0);

        addBox(result, box1, box2);    // result에 24 + 37의 결과 저장
        System.out.println(result.get());    // 61 출력
    }
}