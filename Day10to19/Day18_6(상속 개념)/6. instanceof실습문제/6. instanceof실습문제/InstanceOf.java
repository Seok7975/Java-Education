//InstanceOf.java 파일을 instanceof 연산자를 사용하지 않는 형태로 변경하려면, 
//메소드 오버라이딩을 활용하여 각 상자 클래스에서 적절한 wrap 메소드를 정의


class Box
{
	public void wrap()
	{
		simpleWrap();
	}

	public void simpleWrap()
	{
		System.out.println("simple wrap");}
	}
}

class PaperBox extends Box
{
	public void Wrap()
	{	
		paperWrap();
	}
	public void paperWrap()
	{
		System,out.println("paper wrap");
	}
}

class GoldPaperBox extends PaperBox
{
	public void goldWrap() 
	{
		goldWrap();
	}
	public void goldWrap()
	{
		System.out.println("gold wrap");
	}
}

class InstanceOf
{
	public static void wrapBox(Box box)
	{
		box.wrap();
	}
	
	public static void main(String[] args)
	{
		Box box1=new Box();
		PaperBox box2=new PaperBox();
		GoldPaperBox box3=new GoldPaperBox();
		
		wrapBox(box1);
		wrapBox(box2);
		wrapBox(box3);
	}
}